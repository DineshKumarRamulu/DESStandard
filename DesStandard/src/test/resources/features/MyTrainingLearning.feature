#Author          : DineshKumar Ramulu
#Creation Date   : 21-06-2019
#Test Module     : MyTraining_LearningCourses And Curriculum Courses And Remote Launch
#Total Scenarios : 10
Feature: Regression testing to validate MyTraining Module and Remote Launch Success

  @Regression_Learning
  Scenario Outline: Validate HTML5 Additional Learning Course Launch Successful
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Search the Course with the courseName "<CourseName>"
    And Click the Course link "<CourseName>" in the Learning Tab
    And Click the Course Launch button
    And Switch to the "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the User Icon inside the HTML5 Course
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message
    And Search the Course with the courseName "<CourseName>"
    Then The Course "<CourseName>" Status should be changed from Not Started to Started in the Course Listing Page

    Examples: 
      | URL                        | UserID     | Password    | CourseName       | CourseTitle           |
      | http://ss50.claritynet.com | automation | automation1 | BBP044HMLENG0000 | Bloodborne Pathogens: |

  @Regression_Learning
  Scenario Outline: Validate ML Additional Learning Course Launch Successful
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Search the Course with the courseName "<CourseName>"
    And Click the Course link "<CourseName>" in the Learning Tab
    And Click the Course Launch button
    And Switch to the "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the User Icon inside the HTML5 Course
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message
    And Search the Course with the courseName "<CourseName>"
    Then The Course "<CourseName>" Status should be changed from Not Started to Started in the Course Listing Page

    Examples: 
      | URL                        | UserID     | Password    | CourseName       | CourseTitle            |
      | http://ss50.claritynet.com | automation | automation1 | MLBA01HMLENG0000 | Pause for Performance: |

  @Regression_Learning
  Scenario Outline: Validate HTML5 Curriculum Course Launch Successful
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Search the Course with the courseName "<CourseName>"
    And Click the Course link "<CourseName>" in the Learning Tab
    And Click the Course Launch button
    And Switch to the "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the User Icon inside the HTML5 Course
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message
    And Search the Course with the courseName "<CourseName>"
    Then The Course "<CourseName>" Status should be changed from Not Started to Started in the Course Listing Page

    Examples: 
      | URL                        | UserID     | Password    | CourseName       | CourseTitle  |
      | http://ss50.claritynet.com | automation | automation1 | FOOD01HMLENG0000 | Food Safety: |

  @Regression_Learning
  Scenario Outline: Validate ML Curriculum Course Launch Successful
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Search the Course with the courseName "<CourseName>"
    And Click the Course link "<CourseName>" in the Learning Tab
    And Click the Course Launch button
    And Switch to the "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the User Icon inside the HTML5 Course
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message
    And Search the Course with the courseName "<CourseName>"
    Then The Course "<CourseName>" Status should be changed from Not Started to Started in the Course Listing Page

    Examples: 
      | URL                        | UserID     | Password    | CourseName       | CourseTitle                |
      | http://ss50.claritynet.com | automation | automation1 | MLZK01HMLSPN0000 | Pausa para el Rendimiento: |

  @Regression_Learning
  Scenario Outline: Validate HTML5 Remote Course Launch Successful for the HTTP Site with Preview Mode Zero
    Given I Launch the Remote URL "<URL>"
    And Click the Launch Course link
    And Switch to the Remote "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message

    Examples: 
      | URL                                                                                                                                                   | CourseTitle          |
      | http://ss50.claritynet.com/ASP/LAUNCHPAD/usrcrsstandalone.asp?vUserID=kk0&SessionID=0&strCompID=SS50&vPrvDeMode=0&vSiteID=&vCourseID=DIV023HMLENG0000 | A Seat At the Table: |

  @Regression_Learning
  Scenario Outline: Validate ML Remote Course Launch Successful for the HTTP Site with Preview Mode Zero
    Given I Launch the Remote URL "<URL>"
    And Click the Launch Course link
    And Switch to the Remote "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message

    Examples: 
      | URL                                                                                                                                                   | CourseTitle            |
      | http://ss50.claritynet.com/ASP/LAUNCHPAD/usrcrsstandalone.asp?vUserID=kk0&SessionID=0&strCompID=SS50&vPrvDeMode=0&vSiteID=&vCourseID=MLBA01HMLENG0000 | Pause for Performance: |

  @Regression_Learning
  Scenario Outline: Validate HTML5 Remote Course Launch Successful for the HTTP Site with Preview Mode One
    Given I Launch the Remote URL "<URL>"
    And Click the Launch Course link
    And Switch to the Remote "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message

    Examples: 
      | URL                                                                                                                                                   | CourseTitle          |
      | http://ss50.claritynet.com/ASP/LAUNCHPAD/usrcrsstandalone.asp?vUserID=kk0&SessionID=0&strCompID=SS50&vPrvDeMode=1&vSiteID=&vCourseID=DIV023HMLENG0000 | A Seat At the Table: |

  @Regression_Learning
  Scenario Outline: Validate HTML5 Remote Course Launch Successful for the HTTPS Site with Preview Mode Zero
    Given I Launch the Remote URL "<URL>"
    And Click the Launch Course link
    And Switch to the Remote "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message

    Examples: 
      | URL                                                                                                                                                                  | CourseTitle      |
      | https://testfullssl.claritynet.com/ASP/LAUNCHPAD/usrcrsstandalone.asp?vUserID=0000&SessionID=0&strCompID=TESTFULSSL&vPrvDeMode=0&vSiteID=&vCourseID=CHE009HMLENG0000 | Chemical Safety: |

  @Regression_Learning
  Scenario Outline: Validate ML Remote Course Launch Successful for the HTTPS Site with Preview Mode Zero
    Given I Launch the Remote URL "<URL>"
    And Click the Launch Course link
    And Switch to the Remote "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message

    Examples: 
      | URL                                                                                                                                                                  | CourseTitle            |
      | https://testfullssl.claritynet.com/ASP/LAUNCHPAD/usrcrsstandalone.asp?vUserID=0000&SessionID=0&strCompID=TESTFULSSL&vPrvDeMode=0&vSiteID=&vCourseID=MLSL01HMLENG0000 | Pause for Performance: |

  @Regression_Learning
  Scenario Outline: Validate HTML5 Remote Course Launch Successful for the HTTPS Site with Preview Mode One
    Given I Launch the Remote URL "<URL>"
    And Click the Launch Course link
    And Switch to the Remote "<CourseTitle>" Menu Page
    And Click the Course Start button
    And Click the Course Exit button
    And Click the Yes button in the confirmation Alert message

    Examples: 
      | URL                                                                                                                                                                  | CourseTitle      |
      | https://testfullssl.claritynet.com/ASP/LAUNCHPAD/usrcrsstandalone.asp?vUserID=0000&SessionID=0&strCompID=TESTFULSSL&vPrvDeMode=1&vSiteID=&vCourseID=CHE009HMLENG0000 | Chemical Safety: |
