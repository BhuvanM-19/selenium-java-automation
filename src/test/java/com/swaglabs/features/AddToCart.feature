Feature: Add to cart functionality

  Scenario: Add product to cart
    Given User is logged in
    When User adds a product to the cart
    Then Product should appear in the cart
