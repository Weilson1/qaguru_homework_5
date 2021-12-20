package mail.ru.galyavievai;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class qaguru_homework_2 {

    @Test
    void succesTest ()  {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("John");
        $("#lastName").setValue("Shepard");
        $("#userEmail").setValue("jshepard@email.net");





    }

}
