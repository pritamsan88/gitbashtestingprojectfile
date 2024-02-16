@smoketest
Feature: To check search functionality of Aardea website & filter section

  @smoketest
  Scenario Outline: To check search functionality and filter section
    Given open a browser
    And Go to Aardea website
    When users enters <product>
    And click on search button
    And Check the sortby functionality
    Then Search result should come according product name 

    Examples: 
      | product           |
      | Amalfi            |
      | Refined Flatstone |
      | #$%^%^&&@         |
      | Charcuterie Board |
