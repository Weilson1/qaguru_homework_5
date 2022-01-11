package ru.mail.galyavievai.qaguru_homework_5.component;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(".react-datepicker__month-select").selectOptionByValue("2");
        $(".react-datepicker__day--0:not" + day +
                "(.react-datapicker__day--outside-month)").click();
    }
}
