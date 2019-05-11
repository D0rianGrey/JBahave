Narrative:
This story covers basic tests of signup

Scenario: Type invalid year
Meta: @skip
Given I open signup page
When I set month "December"
And I set day "15"
And I set year "85"
And I check share
Then I see error "Please enter a valid year."
And I do not see error "When were you born"


Scenario: Type invalid email
Meta: @skip
Given I open signup page
When I type email "test@mail.test"
And I type confirmation email "wrong@mail.test"
And I type name "Testname"
And I click signup
Then I see error "Email address doesn't match."
And I see error "Not exist"

Scenario: Signup with empty password
Meta: @skip
Given I open signup page
When I type email "test@mail.test"
And I type confirmation email "test@mail.test"
And I type name "testname"
And I click signup
Then I see error "Please choose a password."


Scenario: Type invalid values
Meta: @skip
Given I open signup page
When I type email "testmail"
And I type confirmation email "wrong@test.mail"
And I type password "qwerty!123"
And I type name "Name"
And I select sex "Male"
And I uncheck share
And I click signup
Then I see "6" errors
And I see that "3" error has text "Please enter your birth month."

Scenario: Test
Given I open signup page
When I set month "<month>"
And I set day "<day>"
And I set year "<year>"

Examples:
|month|day|year|
|December|10|90|
|October|5|99|
|November|31|2000|

