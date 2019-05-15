Feature:
  Get operation using REST-assured

  Scenario: Unique id per post
    Given GET for the id is unique "https://jsonplaceholder.typicode.com/posts"


  Scenario: Counting posts for user
    Given GET post for user "https://jsonplaceholder.typicode.com/posts"
