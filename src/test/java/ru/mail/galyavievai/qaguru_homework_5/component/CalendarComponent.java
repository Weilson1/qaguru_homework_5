package ru.mail.galyavievai.qaguru_homework_5.component;

import ru.mail.galyavievai.qaguru_homework_5.pages.RegistrationPage;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public RegistrationPage setDate (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__month-select").selectOptionByValue(month);
        $(".react-datepicker__day--0" + day +
                ":not(.react-datapicker__day--outside-month)").click();
        return new RegistrationPage();
    }
}
