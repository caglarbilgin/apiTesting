Feature:
  Get operation using REST-assured

  Scenario: Counting posts for user
    Given GET operation for "/posts"
    And GET for the user number "1"
    Then Should see the "uniqueUserId"
