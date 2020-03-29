#Author          : DineshKumar Ramulu
#Creation Date   : 17-06-2019
#Test Module     : Report Management
#Total Scenarios : 9
Feature: Regression testing to validate ReportManagement Module

  @Regression_Reports
  Scenario Outline: Validate User Planned Vs Completed Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName                          |
      | http://ss50.claritynet.com   |   3333 | zzzz     | User Planned Vs Completed Report    |

  @Regression_Reports
  Scenario Outline: Validate My Training Status Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName         |
      | http://ss50.claritynet.com   |   3333 | zzzz     | My Training Status |

  @Regression_Reports
  Scenario Outline: Validate User Training Status - Enhanced Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName                      |
      | http://ss50.claritynet.com   |   3333 | zzzz     | User Training Status - Enhanced |

  @Regression_Reports
  Scenario Outline: Validate My Test Scores Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName     |
      | http://ss50.claritynet.com   |   3333 | zzzz     | My Test Scores |

  @Regression_Reports
  Scenario Outline: Validate My Test Scores - Enhanced Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName                |
      | http://ss50.claritynet.com   |   3333 | zzzz     | My Test Scores - Enhanced |

  @Regression_Reports
  Scenario Outline: Validate User Planned Vs Completed Custom Report Create and Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Edit button
    And Click the Save As button in the Report General Page
    And Provide the Report Title as "<Report Title>"
    And Click the Save button
    Then The Report should be saved with the alert message "Template saved successfully."
    And Click the Ok button
    And Click the Reports Link in the Report General page
    And Click the Reports link from the LMS Home page
    And Select the Custom Report in the Report Type Field
    And Search the "<CustomReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<CustomReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName                       | Report Title                                  | CustomReportName                              |
      | http://ss50.claritynet.com   |   3333 | zzzz     | User Planned Vs Completed Report | Automation30_User Planned Vs Completed Report | Automation30_User Planned Vs Completed Report |

  @Regression_Reports
  Scenario Outline: Validate Unformatted User Planned Vs Completed Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Unformatted Data Only Yes Radio button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report
    And The Report heading should be displayed in a single line

    Examples: 
      | URL                          | UserID | Password | ReportName                       |
      | http://ss50.claritynet.com   |   3333 | zzzz     | User Planned Vs Completed Report |

  @Regression_Reports
  Scenario Outline: Validate DB User Course Status Chart Report Process Success
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report

    Examples: 
      | URL                          | UserID | Password | ReportName            |
      | http://ss50.claritynet.com   |   3333 | zzzz     | DB User Course Status |

  @Regression_Reportss
  Scenario Outline: Validate User Planned Vs Completed Report Process Success and records exported to xls,pdf,xlsx,cvs
    Given I am on Login Page "<URL>" of DES UAT Site
    And I Enter the UserID "<UserID>" and password "<Password>"
    And Click on the LoginButton
    And Click the Reports link from the LMS Home page
    And Select the Basic Report in the Report Type Field
    And Search the "<ReportName>" in search field
    And Select the Searched Report in the Report Name List
    And Click the Run Report Button
    And Click the Process Report button in the Report Filter Criteria Page
    Then The "<ReportName>" Should be displayed inside the processed Report
    And Click the ExportTo DropDown and download all the export file formats
    Then All the exported file formats should be downloaded to the default "<DownloadPath>" 

    Examples: 
      | URL                          | UserID | Password | ReportName                       | DownloadPath                 |
      | http://ss50.claritynet.com   |   3333 | zzzz     | User Planned Vs Completed Report | C:\Users\DSS3342\Downloads   |
