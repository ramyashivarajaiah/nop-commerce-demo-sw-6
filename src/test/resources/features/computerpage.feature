#Inside computerpage.feature create following scenarios
#1. verifyUserShouldNavigateToComputerPageSuccessfully
#Click on Computer tab
#Verify "Computer" text
#2. verifyUserShouldNavigateToDesktopsPageSuccessfully
#Click on Computer tab
#Click on Desktops link
#Verify "Desktops" text
#3. verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
#Click on Computer tab
#Click on Desktops link
#Click on product name "Build your own computer"
#Select processor "processor"
#Select RAM "ram"
#Select HDD "hdd"
#Select OS "os"
#Select Software "software"
#Click on "ADD TO CART" Button
#Verify message "The product has been added to your shopping cart"
#DATA SET
#| processor | ram | hdd | os | software |
#| 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB | Vista Home [+$50.00] |
#Microsoft Office [+$50.00] |
#| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] |
#Vista Premium [+$60.00] | Acrobat Reader [+$10.00] |
#| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB | Vista
#Home [+$50.00] | Total Commander [+$5.00] |

Feature: Computer Test
  As a use I want to go on computer page

  @author_Manini @sanity @smoke @regression
  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on computer tab
    Then I should navigate to computer page successfully

  @author_Manini  @smoke @regression
  Scenario: User should navigate to desktop page successfully
    Given I am on homepage
    When I click on computer tab
    And I click on deskTop tab
    Then I should navigate to desktop page successfully

  @author_Manini23  @regression
  Scenario Outline: User should build their on computer and add them to cart successfully
    Given I am on homepage
    When I click on computer tab
    And I click on deskTop tab
    And I click on build your own computer product
    And I select "<processor>" processor
    And I select "<ram>" ram
    And I select "<hdd>" hdd
    And I select "<os>" os
    And I select "<software>" software
    And I click on add to cart buttone
    Then I see message The product has been added to your shopping cart
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |