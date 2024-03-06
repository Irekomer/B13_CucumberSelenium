@regression
Feature: DevEx Log in Test
  # Agile story: As a user, I should be able to log in, so I can see my dashboard.
 Background:
   Given The user is on the login page

  @teacher  @smoke
  Scenario: Log in as teacher
    #Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  @student  @smoke @sdet
  Scenario: Log in as student
    #Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

  # Create steps to log in as developer
  @developer @smoke
  Scenario: Log in as developer
    #Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login

  @sdet @student @db
  Scenario: Log in as SDET
    #Given The user is on the login page
    When The user enters SDET credentials
    Then The user should be able to login

    # @wip --> work in progress
    # format the page structure
    # win --> ctrl + alt + L
    # mac --> option + command + L
    # to find related syntax or word  or tags --> ctrl + shift + F

    # Class Task
    #-Write scenarios in navigationMenu.feature
    #-Create step definitions
    #-No need to use any JAVA code.
    #-Just implement the step definitions by adding print statement.
    #-Create new class NavigationMenuStepDefs

    #Scenario: Developer page test
    #Login as Teacher
    #At first get the text of welcome
    #Then go to Developers menu and get the text of Developers
    #
    #Scenario: Posts page test
    #Login as Student
    #Get the text of welcome
    #Then go to All Posts menu and get the text of Posts
    #
    #Scenario: Dashboard page test
    #Login as Teacher
    #Get the text of welcome
    #Then go to My Account menu and get the text of Dashboard


