package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import testpackage.steps.serenity.SignUpSteps;

public class SignUpPageSteps {

    @Steps
    SignUpSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("I open signup page")
    public void openPage(){
        steps.open_signup_page();
    }

    @When("I set month \"$month\"")
    public void setMonth(String month){
        steps.set_month(month);
    }

    @When("I set day \"$day\"")
    public void setDay(String day){
        steps.set_day(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year){
        steps.set_day(year);
    }

    @When("I check share")
    public void checkShare(){
        steps.set_share(true);
    }

    @When("I uncheck share")
    public void uncheckShare(){
        steps.set_share(false);
    }

    @When("I type email \"$mail\"")
    public void typeEmail(String mail){
        steps.type_email(mail);
    }

    @When("I type confirmation email \"$mail\"")
    public void typeConfirmationEmail(String mail){
        steps.type_confirmation_email(mail);
    }

    @When("I type name \"$name\"")
    public void typeName(String name){
        steps.type_name(name);
    }

    @When("I click signup")
    public void clickSignUp(){
        steps.click_signup();
    }

    @When("I type password \"$password\"")
    public void typePassword(String password){
        steps.type_password(password);
    }

    @When("I select sex \"$sex\"")
    public void selectSex(String sex){
        steps.select_sex(sex);
    }

    @Then("I see error \"$message\"")
    public void shouldSeeErrorByText(String text){
        steps.should_see_error(text);
    }

    @Then("I do not see error \"$message\"")
    public void shouldNotSeeErrorByText(String text){
        steps.should_not_see_error(text);
    }

    @Then("I see \"$number\" errors")
    public void shouldSeeNumberOfErrors(int number){
        steps.should_see_errors_count(number);
    }

    @Then("I see that \"$number\" error has text \"$message\"")
    public void shouldSeeErrorByNumber(int number, String message){
        steps.should_see_error_by_number(number,message);
    }

}
