#Author          : DineshKumar Ramulu
#Creation Date   : 18-07-2019
#Test Module     : Training Management
#Total Scenarios : 4
Feature: Regression testing to validate Training Management Module

  @Regression_TrainingManagement
  Scenario Outline: Validate Curriculum create and assign course and user Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Curriculums link from the LMS Home page
    And Click the Add button
    And Provide the Curriculm ID "<CurriculumID>"
    And Provide the Curriculum Name "<CurriculumName>"
    And Click the Curriculum save button
    And Click the ok button for the message You have chosen to Save. Please click OK to proceed with this action.
    Then The Curriculum should be saved successfully with the message Curriculum has been created successfully.
    And Click the Courses Tab
    And Click the Search Image button and search by Course ID "<CourseID>"
    And Select the first course in the course list
    And Click the save button
    And Click the OK button for the message Are you sure you want to assign courses to the curriculum?
    And Click the course button for the message Should the Course Option Template and Feedback Template match the default set in the Course or in the Curriculum?
    Then The Course should be assigned successfully with the message Courses assignment for Curriculum updated successfully.
    And Click the Assignments Tab
    And Click the Search Image button and search by User ID "<UserID>"
    And Select the user in the userlist
    And Click the userlist Save button
    And Click the Ok button for the message Are you sure you want to assign users to the curriculum?
    Then The user should be saved successfully with the message Curriculum assignment updated successfully.

    Examples: 
      | URL                        | UserID | Password | CurriculumName | CurriculumID | CourseID     | UserID |
      | http://ss50.claritynet.com |   3333 | zzzz     | test053        | test053      | Food Safety: |   3333 |

  @Regression_TrainingManagement
  Scenario Outline: Validate Edit Course and assign user to that course
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Courses link from the LMS Home page
    And Click the Search Image button and search by Course name "<CourseName>"
    And Select the first course in the list
    And Click the edit button in the course list
    And Click the assignments tab
    And Click the Search Image button and search by UserID "<UserID>"
    And Select the first User in the list
    And Click the save button
    And Click the OK button for the message Do you want to assign Users to Course?
    Then The Course Assignemnts should be updated successfully with the message Course Assignments Updated Successfully

    Examples: 
      | URL                        | UserID | Password | CourseName   | UserID |
      | http://ss50.claritynet.com |   3333 | zzzz     | Food Safety: |   3333 |

  @Regression_TrainingManagement
  Scenario Outline: Validate Edit Course Options template and course options template Update success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Courses Options Template link from the LMS Home page
    And Search the template "<TemplateName>"
    And Click the template edit button
    And Click the Mastery Options module
    And Check the Grant Mastery When User Masters All Self-Checks and click Yes button
    And Click the Grant Mastery Save button
    Then The Course Options Template should be updated successfully with the message Course Options Template updated successfully.

    Examples: 
      | URL                        | UserID | Password | TemplateName                   |
      | http://ss50.claritynet.com |   3333 | zzzz     | Default Course Option Template |

  @Regression_TrainingManagement
  Scenario Outline: Validate Classroom handson update success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Classroom & Hands-On Scores link from the LMS Home page
    And Click the Search Image button and search by Course name "<CourseName>" in the Classroom handson page
    And Select the first course in the list in the Classroom handson page
    And Click the Search Image button and search by User ID "<UserID>" in the Classroom handson page
    And Select the first User in the list in the Classroom handson page
    And Select the course status radio button
    And In the Post Test Date field select the calender and click the Today date
    And Select the CourseStatus "<CourseStatus>"
    And Click the save button in the Classroom handson page
    And Again click the save button in the confirmation screen
    Then The Classroom score should be updated successfully with the message Classroom scores updated successfully.

    Examples: 
      | URL                        | UserID | Password | CourseName   | UserID  | CourseStatus |
      | http://ss50.claritynet.com |   3333 | zzzz     | Food Safety: | coastal | Mastered     |
