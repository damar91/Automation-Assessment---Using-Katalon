@Product @Smoke
Feature: Product 

  @PDT001
  Scenario: PDT001 - User Add Products To The Cart
    Given User already logged in
    When User choose product
    And User click add to cart button
    And User click cart icon
    Then Products should be successfully added to the cart
    
  @PDT002
  Scenario: PDT002 - User Remove Product From The Cart
    Given User already logged in
    When User choose product
    And User click add to cart button
    And User click cart icon
    And User click button remove
    Then Products should be successfully removed from the cart
    
  @PDT003
  Scenario: PDT003 - User Successfully Placed An Order
    Given User already logged in
    When User choose product
    And User click add to cart button
    And User click cart icon
    And User click button checkout
    And User input first name
    And User input last name
    And User input postal code
    And User button continue
    And User button finish 
    Then The order was successfully placed and a notification of order success appeared