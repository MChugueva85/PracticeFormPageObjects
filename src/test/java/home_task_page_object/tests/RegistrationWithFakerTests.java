package home_task_page_object.tests;

import home_task_page_object.pages.RegistrationPageTests;
import home_task_page_object.pages.components.ResultPageComponent;
import org.junit.jupiter.api.Test;

import java.io.File;



public class RegistrationWithFakerTests extends TestBase {

    RegistrationPageTests RegistrationPageTests = new RegistrationPageTests();
    ResultPageComponent resultPageComponent = new ResultPageComponent();
    RandomData randomData = new RandomData();
    @Test
    void successfulRegistrationTest() {


        RegistrationPageTests.openPage()
                .removeFixedbanFooter()
                .setFirstName(randomData.firstName)
                .setLastName(randomData.lastName)
                .setUserEmail(randomData.userEmail)
                .setGender(randomData.gender)
                .setUserNumber(randomData.UserNumber)
                .setBirthDay(randomData.Day, randomData.Month, randomData.Year)
                .setSubjects(randomData.subjects)
                .setHobbies(randomData.hobbies)
                .setPicture(new File("src/test/resources/Picture.png"))
                .setAddress(randomData.address)
                .setState(randomData.state)
                .setCity(randomData.city)
                .submit();


        resultPageComponent.checkOut("Student Name", randomData.firstName + " " + randomData.lastName);
        resultPageComponent.checkOut("Student Email", randomData.userEmail);
        resultPageComponent.checkOut("Gender", randomData.gender);
        resultPageComponent.checkOut("Mobile", randomData.UserNumber);
        resultPageComponent.checkOut("Date of Birth", randomData.Day + " " + randomData.Month + "," + randomData.Year);
        resultPageComponent.checkOut("Subjects", randomData.subjects);
        resultPageComponent.checkOut("Hobbies", randomData.hobbies);
        resultPageComponent.checkOut("Picture", "Picture.png");
        resultPageComponent.checkOut("Address", randomData.address);
        resultPageComponent.checkOut("State and City", randomData.state + " " + randomData.city);

    }
}
