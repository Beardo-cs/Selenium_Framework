@tag
Feature: Error Validation by Login using Wrong Password
  I want to use this template for my feature file


  @ErrorValidation
  Scenario Outline: Negative Test for Login
    Given I landed on ECommerce Page
    When  Logged in with UserName <username> and password <password>
    Then "Incorrect email or password." message is displayed
    
    Examples: 
      | username                 |     password        | 
      | mahendiran.msp@gmail.com |     Mahendiran@200 |