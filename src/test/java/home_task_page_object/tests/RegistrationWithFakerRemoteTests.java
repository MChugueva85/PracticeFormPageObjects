package home_task_page_object.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import home_task_page_object.pages.RegistrationPageTests;
import home_task_page_object.pages.components.ResultPageComponent;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class RegistrationWithFakerRemoteTests extends TestBaseRemote {


    ResultPageComponent resultPageComponent = new ResultPageComponent();
    RandomData randomData = new RandomData();
    @Test
    void successfulRegTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        RegistrationPageTests registrationPageTests = new RegistrationPageTests();

        registrationPageTests.openPage();
        registrationPageTests.removeFixedbanFooter();
        registrationPageTests.setFirstName(randomData.firstName);
        registrationPageTests.setLastName(randomData.lastName);
        registrationPageTests.setUserEmail(randomData.userEmail);
        registrationPageTests.setGender(randomData.gender);
        registrationPageTests.setUserNumber(randomData.userNumber);
        registrationPageTests.setBirthDay(randomData.day, randomData.month, randomData.year);
        registrationPageTests.setSubjects(randomData.subjects);
        registrationPageTests.setHobbies(randomData.hobbies);
        registrationPageTests.setPicture(randomData.userPic);
        registrationPageTests.setAddress(randomData.address);
        registrationPageTests.setState(randomData.state);
        registrationPageTests.setCity(randomData.city);
        registrationPageTests.submit();


        resultPageComponent.checkOut("Student Name", randomData.firstName + " " + randomData.lastName);
        resultPageComponent.checkOut("Student Email", randomData.userEmail);
        resultPageComponent.checkOut("Gender", randomData.gender);
        resultPageComponent.checkOut("Mobile", randomData.userNumber);
        resultPageComponent.checkOut("Date of Birth", randomData.day + " " + randomData.month + "," + randomData.year);
        resultPageComponent.checkOut("Subjects", randomData.subjects);
        resultPageComponent.checkOut("Hobbies", randomData.hobbies);
        resultPageComponent.checkOut("Picture", randomData.userPic);
        resultPageComponent.checkOut("Address", randomData.address);
        resultPageComponent.checkOut("State and City", randomData.state + " " + randomData.city);

    }
}
