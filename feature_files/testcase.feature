Feature: Title of your feature
  I want to use this template for my feature file

@tsgT
  Scenario Outline: Title of your scenario
    Given I want to write a step with precondition
    #And some other precondition "testdata"
    #When I complete action
    #|FirstName | LastName |
    #|roshan | zameer |
    #|naseem | banu |
    And some other action "<Data1>" and "<Data2>"
    
    Examples: 
|Data1 | Data2|
|223| 3434|
|3444| 655|




