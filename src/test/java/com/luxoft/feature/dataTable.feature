Feature: try dataTable

  Scenario: some scenario
    Given Lucy is far from smb
    |distance|person|
    |100   |Sean  |
    |190  | Sean |
    When Sean shouts 'Free bagel!'
    Then Lucy doesn't hear Sean

  Scenario: some scenario 1
    Given Lucy is far from smb from class
      |distance|person|
      |100   |Sean  |
      |190  | Sean |
    When Sean shouts 'Free bagel!'
    Then Lucy doesn't hear Sean