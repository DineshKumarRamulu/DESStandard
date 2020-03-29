#Author          : DineshKumar Ramulu
#Creation Date   : 04-07-2019
#Test Module     : Content Management
#Total Scenarios : 4
Feature: Regression testing to validate ContentManagement Module

  @Regression_ContentManagement
  Scenario Outline: Validate HTML5 course customease can be done successfully by previewing the course
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the CustomEase Courses link from the LMS Home page
    And Click the Filter button and click the curriculum link
    And Search the Curriculum with "<CurriculumName>" and select the curriculum and click done button
    And Select the Search button and searchBy coursename "<CourseName>"
    And Select the Course from the Customase Courses List
    And Click the open button
    And If BookMark message occurs then click the Course Menu button
    And Click the Start button
    And Click the Customize this storyboard button
    And Click the Preview this storyboard button
    And Click the return button
    And Click the Exit button and Click ok to the Alert

    Examples: 
      | URL                        | UserID | Password | CurriculumName | CourseName   |
      | http://ss50.claritynet.com |   3333 | zzzz     | automation     | Food Safety: |

  @Regression_ContentManagement
  Scenario Outline: Validate ML course customease can be done successfully by previewing the course
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the CustomEase Courses link from the LMS Home page
    And Click the Filter button and click the curriculum link
    And Search the Curriculum with "<CurriculumName>" and select the curriculum and click done button
    And Select the Search button and searchBy coursename "<CourseName>"
    And Select the Course from the Customase Courses List
    And Click the open button
    And If BookMark message occurs then click the Course Menu button
    And Click the Start button
    And Click the Customize this storyboard button
    And Click the Preview this storyboard button
    And Click the return button
    And Click the Exit button and Click ok to the Alert

    Examples: 
      | URL                        | UserID | Password | CurriculumName | CourseName    |
      | http://ss50.claritynet.com |   3333 | zzzz     | automation     | Pausa para el |

  @Regression_ContentManagement
  Scenario Outline: Validate the course can be published successfully in the HTML5 Authoring Tool
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Authoring Tool link from the LMS Home page
    And Click the HTML5/MICROLEARNING Course Type
    And Select the Existing Course "<CourseName>"
    And Search the CourseBy "<CourseName>" and click the Go button
    And select the course from the course list and click the Open button
    And Click the preview button
    And Clicl the Start button
    And click the user icon and click the exit button
    And Click the publish Finish button
    And Click the NO button for the alert Do you want to publish the course with a new CourseID
    Then The Course has been published Successfully alert message should be displayed

    Examples: 
      | URL                        | UserID | Password | CourseName                    |
      | http://ss50.claritynet.com |   3333 | zzzz     | Food Safety: Allergen Control |

  @Regression_ContentManagement
  Scenario Outline: Validate the course can be Imported successfully in the HTML5 Authoring Tool
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Authoring Tool link from the LMS Home page
    And Click the HTML5/MICROLEARNING Course Type
    And Click the Import an Interactive Coruse "<CourseName>"
    And Search the CourseBy "<CourseName>" and click the Go button
    And select the course from the course list and click the Open button
    And Click the Import to Authoring Tool button
    And Click on the Save button in the Course Property Page
    Then The Course has been imported successfully alert message should be displayed

    Examples: 
      | URL                        | UserID | Password | CourseName                    |
      | http://ss50.claritynet.com |   3333 | zzzz     | Food Safety: Allergen Control |
