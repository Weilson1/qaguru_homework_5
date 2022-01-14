package ru.mail.galyavievai.qaguru_homework_5.test;
import com.github.javafaker.Faker;



public class TestDate{
    Faker faker = new Faker();
    String randomFirstName = faker.name().firstName();
    String randomLastName = faker.name().lastName();
    String randomEmail = faker.internet().emailAddress();
    String randomAddress = faker.address().fullAddress();
    String randomPhoneNumber = faker.phoneNumber().subscriberNumber(10);

}
