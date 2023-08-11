package home_task_page_object.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import home_task_page_object.pages.RegistrationPageTests;
import home_task_page_object.pages.components.ResultPageComponent;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("remote")
public class RegistrationWithFakerRemoteTests extends TestBaseRemote {


    ResultPageComponent resultPageComponent = new ResultPageComponent();
    RandomData randomData = new RandomData();
    @Test
    void successfulRegTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        RegistrationPageTests registrationPageTests = new RegistrationPageTests();

        registrationPageTests.openPage()
        .removeFixedbanFooter()
        .setFirstName(randomData.firstName)
        .setLastName(randomData.lastName)
        .setUserEmail(randomData.userEmail)
        .setGender(randomData.gender)
        .setUserNumber(randomData.userNumber)
        .setBirthDay(randomData.day, randomData.month, randomData.year)
        .setSubjects(randomData.subjects)
        .setHobbies(randomData.hobbies)
        .setPicture(randomData.userPic)
        .setAddress(randomData.address)
        .setState(randomData.state)
        .setCity(randomData.city)
        .submit();


        resultPageComponent.checkOut("Student Name", randomData.firstName + " " + randomData.lastName);
        resultPageComponent.checkOut("Student Email", randomData.userEmail);
        resultPageComponent.checkOut("Gender", randomData.gender);
        resultPageComponent.checkOut("Mobile", randomData.userNumber);
        resultPageComponent.checkOut("Dat@e of Birth", randomData.day + " " + randomData.month + "," + randomData.year);
        resultPageComponent.checkOut("Subjects", randomData.subjects);
        resultPageComponent.checkOut("Hobbies", randomData.hobbies);
        resultPageComponent.checkOut("Picture", randomData.userPic);
        resultPageComponent.checkOut("Address", randomData.address);
        resultPageComponent.checkOut("State and City", randomData.state + " " + randomData.city);

    }
}
