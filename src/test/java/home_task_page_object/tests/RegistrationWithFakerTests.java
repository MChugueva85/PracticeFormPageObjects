package home_task_page_object.tests;

import home_task_page_object.pages.RegistrationPageTests;
import home_task_page_object.pages.components.ResultPageComponent;
import org.junit.jupiter.api.Test;

import java.io.File;

import static home_task_page_object.utils.RandomUtils.*;


public class RegistrationWithFakerTests extends TestBase {

    RegistrationPageTests RegistrationPageTests = new RegistrationPageTests();
    ResultPageComponent resultPageComponent = new ResultPageComponent();

    @Test
    void successfulRegistrationTest() {


        String firstName = getRandomFirstName(),
                lastName = getRandomLastName(),
                userEmail = getRandomUserEmail(),
                gender = getRandomGender(),
                UserNumber = getRandomPhone(),
                Day = getDayOfBirth(),
                Month = getMonthOfBirth(),
                Year = String.valueOf(getYearOfBirth()),
                subjects = getSubjects(),
                hobbies = getHobbies(),
                address = String.valueOf(getAddress()),
                state = getState(),
                city = getCity(state);

        RegistrationPageTests.openPage()
                .removeFixedbanFooter()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserNumber(UserNumber)
                .setBirthDay(Day, Month, Year)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setPicture(new File("src/test/resources/Picture.png"))
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .submit();


        resultPageComponent.checkOut("Student Name", firstName + " " + lastName);
        resultPageComponent.checkOut("Student Email", userEmail);
        resultPageComponent.checkOut("Gender", gender);
        resultPageComponent.checkOut("Mobile", UserNumber);
        resultPageComponent.checkOut("Date of Birth", Day + " " + Month + "," + Year);
        resultPageComponent.checkOut("Subjects", subjects);
        resultPageComponent.checkOut("Hobbies", hobbies);
        resultPageComponent.checkOut("Picture", "Picture.png");
        resultPageComponent.checkOut("Address", address);
        resultPageComponent.checkOut("State and City", state + " " + city);

    }
}
