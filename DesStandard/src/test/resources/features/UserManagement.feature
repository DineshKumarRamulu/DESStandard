#Author          : DineshKumar Ramulu
#Creation Date   : 31-05-2019
#Test Module     : User Management
#Total Scenarios : 6
Feature: Regression testing to validate UserMangement Module

  @Regression_UserManagements
  Scenario Outline: Validate Add User
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the User link from the LMS Home page
    And Click the Add User button from the User List page
    And Provide the UserID "<NewUserID>" ,LastName "<LastName>" ,FirstName "<FirstName>" ,EmailID "<EmailID>" and ConfirmEmailID "<ConfirmEmailID>" in the User General Identification Module
    And Provide the Password "<Password>" and ConfirmPassword "<ConfirmPassword>" in the Authentication module
    And select all the Roles and assign Default Role as "<RoleName>" in the Roles module
    And click the save button
    Then The user should be saved successfully with the message "User information inserted successfully."

    Examples: 
      | URL                        | UserID | Password | NewUserID | LastName | FirstName | EmailID            | ConfirmEmailID     | Password | ConfirmPassword | RoleName      |
      | http://ss50.claritynet.com |   3333 | c04st4l  | Din50     | kumar    | Dinesh    | dinesh@coastal.com | dinesh@coastal.com | c04st4l  | c04st4l         | Administrator |

  @Regression_UserManagement
  Scenario Outline: Validate Existing User by update and save
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the User link from the LMS Home page
    And Select the Search Image button
    And Select the UserID radio button
    And provid the Search UserID "<SearchUserID>" and click the search icon
    And Select the Searched user from the user list
    And Click the edit button
    And Select the User Preference and change the "<language>"
    And click the save button
    Then The user should be Updated successfully with the message "User information updated successfully."

    Examples: 
      | URL                        | UserID | Password | SearchUserID | language |
      | http://ss50.claritynet.com |   3333 | c04st4l  | Din48        | English  |

  @Regression_UserManagement
  Scenario Outline: Validate Add NewGroup
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Groups link from the LMS Home page
    And Click the Add button
    And I Enter the Group Value as "<GroupValue>"
    And I Click the SaveButton
    Then The Group should be saved successfully with the message "- Inserted Successfully!!!"

    Examples: 
      | URL                        | UserID | Password | GroupValue         |
      | http://ss50.claritynet.com |   3333 | c04st4l  | AutomationRegion48 |

  @Regression_UserManagement
  Scenario Outline: Validate Add NewRole
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Role link from the LMS Home page
    And Select the Administrator in the Role List
    And Click the Roles Add button
    And I Enter the Role Name as "<RoleName>"
    And Select the Roles Security as Administrator
    And I Click the Roles SaveButton
    Then The Role should be saved successfully with the message "Role created successfully."

    Examples: 
      | URL                        | UserID | Password | RoleName         |
      | http://ss50.claritynet.com |   3333 | c04st4l  | AutomationRole48 |

  @Regression_UserManagement
  Scenario Outline: Validate Existing User by Navigating multiple tabs and Update and Save
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the User link from the LMS Home page
    And Select the Search Image button
    And Select the UserID radio button
    And provid the Search UserID "<SearchUserID>" and click the search icon
    And Select the Searched user from the user list
    And Click the edit button
    And Select the Permissions Tab
    And Select the Access Boundaries Tab
    And Select the Training Assignments Tab
    And Select the General Tab
    And Click the Group Assignments Module
    And Click the Region Group Link
    And Search the Region with Search Value "<SearchValue>"
    And Click the Search result radio button
    And Click the Done button
    And click the save button
    Then The user should be Updated successfully with the message "User information updated successfully."

    Examples: 
      | URL                        | UserID | Password | SearchUserID | SearchValue        |
      | http://ss50.claritynet.com |   3333 | c04st4l  | Din48        | AutomationRegion48 |

  @Regression_UserManagement
  Scenario Outline: Validate Add New Custom Tab
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Custom Tabs link from the LMS Home page
    And Click the Tab List Add button
    And I Enter the Tab Name as "<TabName>"
    And I Click the Tab SaveButton
    Then The Tab should be saved successfully with the message "Tab inserted successfully."
    And Click the Content Tab
    And Click the Content Add Image Button
    And Provide the Content Editor text as "<ContentText>"
    And click the Content Save button
    Then The Tab should be Updated successfully with the message "Tab contents updated successfully."

    Examples: 
      | URL                        | UserID | Password | TabName             | ContentText       |
      | http://ss50.claritynet.com |   3333 | c04st4l  | AutomationRoleTab48 | AutomationTesting |
