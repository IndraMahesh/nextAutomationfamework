Feature: Menu Test

  As a user
  I should redirected appropriately when I choose menu and submenu options

  @menu
  Scenario Outline: Validate menu and submenu options redirection

    Given I'm on home page "https://www.next.co.uk"
    When  I click "<menu>"
    And I click on "<submenu>"
    And I click for "<option>"
    Then I should get redirected to the appropriate specific product page with title as "<resultTitle>"

    Examples:

      | menu  | submenu  | option            | resultTitle         |

      | WOMEN | Dresses  | Shirts Dresses    | Shirt Dresses       |
      | HOME  | Lighting | Light Bulbs       | Light Bulbs         |
      | MEN   | Shirts   | Casual Shirts     | Men's Casual Shirts |
      | BOYS  | Jeans    | Regular Fit Jeans | Boys Regular Jeans  |
      | GIRLS | Footwear | School Shoes      | Girls School Shoes  |
      | BABY  | Clothing | Accessories       | Baby Accessories    |
