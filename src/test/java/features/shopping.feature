Feature: Product search and add to cart

  Scenario: user adds a product and logout
    Given user login with valid username and password
    When user search for a product and add a product to the cart
    Then user go to the cart verify the product is added
    And logout from the application
