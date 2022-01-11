package ru.mail.galyavievai.qaguru_homework_5.Test;

import org.junit.jupiter.api.Test;
import ru.mail.galyavievai.qaguru_homework_5.pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormWithPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void succesTest() {
        registrationPage
                .openPage()
                .inputFirstName("John")
                .inputLastName("Shepard")
                .inputUserEmail("jshepard@email.net")
                .inputGenderMale()
                .inputUserNumber("89123456789")
                .calendarComponent.setDate("9", "Marth", "1994");

        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#subjectsInput").setValue("Economics").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue(
                "My address is not a house and not the street, my address is the Soviet Union").scrollTo();
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();
// Проверка теста
        $(byText("Thanks for submitting the form")).shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("John Shepard"), text("jshepard@email.net"), text("Male"), text("1111111111"),
                text("09 March,1994"), text("Maths, Economics"), text("Sports"), text("1.png"),
                text("My address is not a house and not the street, my address is the Soviet Union"),
                text("NCR Delhi"));
    }
}
