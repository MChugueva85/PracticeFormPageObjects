package HomeTaskPageObject.tests;

import org.junit.jupiter.api.Test;

import java.io.File;


public class RegistrationFormTests extends TestBase {


    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Иван")
                .setLastName("Иванов")
                .setUserEmail("Ivan@ov.ru")
                .setGender("Male")
                .setUserNumber("1233210023")
                .setBirthDay("11", "July", "1982")
                .setSubjects("Maths")
                .setHobbies()
                .setPicture(new File("src/test/resources/Picture.png"))
                .setAddress("Адрес")
                .setState("NCR")
                .setCity("Delhi")
                .Submit();


        resultPageComponent.CheckOut("Student Name", "Иван Иванов");
        resultPageComponent.CheckOut("Student Email", "Ivan@ov.ru");
        resultPageComponent.CheckOut("Gender", "Male");
        resultPageComponent.CheckOut("Mobile", "1233210023");
        resultPageComponent.CheckOut("Date of Birth", "11 July,1982");
        resultPageComponent.CheckOut("Subjects", "Maths");
        resultPageComponent.CheckOut("Hobbies", "Sports");
        resultPageComponent.CheckOut("Picture", "Picture.png");
        resultPageComponent.CheckOut("Address", "Адрес");
        resultPageComponent.CheckOut("State and City", "NCR Delhi");

    }
}
