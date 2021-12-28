Feature: Nopcommerce Registration
  Background:
   Given User open browser And Enter Url

    # Simple data driven without Example Keyword

  Scenario: Nopcommerce Registration Test

    Then User Click on Radio Female button from Gender
    Then User Enter "Aadi" and "Dave" as FirstName and LastName
    Then User Enter "19" for Day
    Then User Enter "October" for Month
    Then User Enter "2014" for Year
    And User Enter "aadi123@gmail.com" as Email
    Then User Enter "Tester" for Company Name
    And User Enter "aadi123" for Password
    When User Enter "aadi123" for Confirm Password field
    And Click on register
    Then User is on HomePage