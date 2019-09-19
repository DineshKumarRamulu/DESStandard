#Creation Date   : 25-07-2019
#Test Module     : Setting and Configurations Management
#Total Scenarios : 1
Feature: Regression testing to validate Setting and Configurations Management Module

  @Regression_SettingandConfigurationsManagement
  Scenario Outline: Validate Global Options Edit and Save Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Global Options link from the LMS Home page 
    And Click the Course Login Settings module  
    And Provide the Logout Time Minutes "<LogoutTime>"	
    And Click the Global options Save button
    And Click the Ok button for the message You have chosen to Save. Please click OK to proceed with this action 
    Then The Global Options should be saved successfully with the message Global Options saved successfully. 

    Examples:  
      | URL                          | UserID | Password |LogoutTime|
      | http://ss50.claritynet.com   |   3333 | c04st4l  |90        |
      
      

  
      