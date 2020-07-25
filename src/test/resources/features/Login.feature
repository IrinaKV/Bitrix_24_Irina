@login
Feature: Login feature
 US_001 : As a user, I should be able to login with correct credentials

  Background: User is on the login page
    Given User is on the login page

  Scenario Outline: User login scenario

    When User log in with  "<login>" and "<password>"
    Then User should see the title
    Then User login out from Page


    Examples:
      |login                        |password|
      |helpdesk1@cybertekschool.com|UserUser|
      |helpdesk2@cybertekschool.com|UserUser|
      #|marketing1@cybertekschool.com|UserUser|
      #|marketing2@cybertekschool.com|UserUser|
      #|hr1@cybertekschool.com|UserUser|
      #|hr2@cybertekschool.com|UserUser|




