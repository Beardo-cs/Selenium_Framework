
@tag
Feature: Purchase the Order from Ecommerce Website
  I want to use this template for my feature file

   Background: 
   Given I landed on ECommerce Page


  @Regression
  Scenario Outline: Positive Test of Submitting the order
    Given Logged in with UserName <username> and password <password>
    When I add product <productName> to Cart
    And Checkout <productName> and submit the Order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage


    Examples: 
      | username                 |     password        | productName  |
      | mahendiran.msp@gmail.com |     Mahendiran@2000 | ZARA COAT 3  |
