package home_task_page_object.tests;

import home_task_page_object.pages.RegistrationPageTests;
import home_task_page_object.pages.components.ResultPageComponent;
import org.junit.jupiter.api.Test;

import java.io.File;


public class RegistrationFormTests extends TestBase {

    RegistrationPageTests registrationPage = new RegistrationPageTests();
    ResultPageComponent resultPageComponent = new ResultPageComponent();
    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .removeFixedbanFooter()
                .setFirstName("Иван")
                .setLastName("Иванов")
                .setUserEmail("Ivan@ov.ru")
                .setGender("Male")
                .setUserNumber("1233210023")
                .setBirthDay("11", "July", "1982")
                .setSubjects("Maths")
                .setHobbies("Sport")
                .setPicture(new File("src/test/resources/Picture.png"))
                .setAddress("Адрес")
                .setState("NCR")
                .setCity("Delhi")
                .submit();


        resultPageComponent.checkOut("Student Name", "Иван Иванов");
        resultPageComponent.checkOut("Student Email", "Ivan@ov.ru");
        resultPageComponent.checkOut("Gender", "Male");
        resultPageComponent.checkOut("Mobile", "1233210023");
        resultPageComponent.checkOut("Date of Birth", "11 July,1982");
        resultPageComponent.checkOut("Subjects", "Maths");
        resultPageComponent.checkOut("Hobbies", "Sports");
        resultPageComponent.checkOut("Picture", "Picture.png");
        resultPageComponent.checkOut("Address", "Адрес");
        resultPageComponent.checkOut("State and City", "NCR Delhi");

    }
}
