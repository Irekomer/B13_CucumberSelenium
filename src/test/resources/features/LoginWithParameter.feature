Feature: Log in as different user


  Scenario: Log in as Teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"

  Scenario: Log in as Student with parameters
    Given The user is on the login page
    When The user logs in using "sparrowjack@gmail.com" and "sparrow1"
    Then The welcome message contains "Jack"

  Scenario: Log in as Developer with parameters
    Given The user is on the login page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The welcome message contains "Jack Bauer"

     # HOMEWORK
  #Create a new feature file named NavigateMenuWithParameters.feature

  # login as a teacher
  # verify welcome message
  # go to developer page
  # verify "Filter Profiles by Skill or by Location"

  # login as a student
  # verify welcome message
  # go to Post page
  # verify "Post"

   # login as a developer
  # verify welcome message
  # go to Dashboard page
  # verify "Dashboard"