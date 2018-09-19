Feature: When Lucy goes to Sean's cafe

 Background: stating preps
   Given I have some setUp before the test

  Scenario Outline: Lucy walks to Sean's cafe
    Given Lucy is in <distance> m from Sean
    When "<name>" shouts 'Free bagel!'
    Then Lucy hears Sean
    Examples:
      |distance  |name|
    |15        |Sean|
    |10        |Sean|
    |5         |Mary|

  Scenario: Lucy doesn't walk to Sean's cafe
      Given Lucy is in 100 m from Sean
      When Sean shouts 'Free bagel!'
      Then Lucy doesn't hear Sean

    Scenario Outline: Someone hears shout from cafe is it's closer then 20 meters

      Given "<person>" is in <number> meters from the cafe
      When Sean shouts 'Free bagel!'
      Then "<person>" hears the shout
      Examples:
        | person |number|
      |Mary    |5     |
      |Kevin   |18    |


  Scenario Outline: Someone not hears shout from cafe is it's far then 20 meters

    Given "<person>" is in <number> meters from the cafe
    When Sean shouts 'Free bagel!'
    Then "<person>" not hears the shout
    Examples:
      | person |number|
      |Mary    |25     |
      |Kevin   |48    |




