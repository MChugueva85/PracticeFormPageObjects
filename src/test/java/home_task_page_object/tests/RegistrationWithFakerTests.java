package home_task_page_object.tests;

import home_task_page_object.pages.RegistrationPageTests;
import home_task_page_object.pages.components.ResultPageComponent;
import org.junit.jupiter.api.Test;

public class RegistrationWithFakerTests extends TestBase {

    RegistrationPageTests registrationPageTests = new RegistrationPageTests();
    ResultPageComponent resultPageComponent = new ResultPageComponent();
    RandomData randomData = new RandomData();
    @Test
    void successfulRegistrationTest() {

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
        resultPageComponent.checkOut("Date of Birth", randomData.day + " " + randomData.month + "," + randomData.year);
        resultPageComponent.checkOut("Subjects", randomData.subjects);
        resultPageComponent.checkOut("Hobbies", randomData.hobbies);
        resultPageComponent.checkOut("Picture", randomData.userPic);
        resultPageComponent.checkOut("Address", randomData.address);
        resultPageComponent.checkOut("State and City", randomData.state + " " + randomData.city);

    }
}
