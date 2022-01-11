package ru.mail.galyavievai.qaguru_homework_5.pages;

import com.codeborne.selenide.SelenideElement;
import ru.mail.galyavievai.qaguru_homework_5.component.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    SelenideElement
            firstNameType = $("#firstName"),
            lastNameType = $("#lastName"),
            userEmailType = $("#userEmail"),
            userNumberType = $("#userNumber"),
    //          Календарь
            subjectType = $("#subjectsInput"),
            hobbiesType = $("#hobbiesWrapper"),
            uploadPictureType = $("#uploadPicture"),
            addressType = $("#currentAddress");
//          Штат
//          Город

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }

    public RegistrationPage inputFirstName(String value) {
        firstNameType.setValue(value);

        return this;
    }

    public RegistrationPage inputLastName(String value) {
        lastNameType.setValue(value);

        return this;
    }

    public RegistrationPage inputUserEmail(String value) {
        userEmailType.setValue(value);

        return this;
    }
    public RegistrationPage inputGenderMale() {
        $("[for=gender-radio-1]").click();

        return this;
    }
    public RegistrationPage inputGenderFemale() {
        $("[for=gender-radio-2]").click();

        return this;
    }
    public RegistrationPage inputGenderOther() {
        $("[for=gender-radio-3]").click();

        return this;
    }
    public RegistrationPage inputUserNumber(String value) {
        userNumberType.setValue(value);

        return this;
    }
    public CalendarComponent calendarComponent = new CalendarComponent();

}
