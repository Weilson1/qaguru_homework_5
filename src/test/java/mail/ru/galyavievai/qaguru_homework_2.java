package mail.ru.galyavievai;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class qaguru_homework_2 {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void succesTest () {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("John");
        $("#lastName").setValue("Shepard");
        $("#userEmail").setValue("jshepard@email.net");
        $(".custom-control-label").click();
        $("#userNumber").setValue("1111111111");
        $("#currentAddress").setValue("My address is not a house and not the street, my address is the Soviet Union");
        $(". css-yk16xz-control").selectOptionByValue("NCR");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1999");
        $(".react-datepicker__month-select").selectOptionByValue("2");
        $(".react-datepicker__day").selectOptionByValue("009");











    }

}
