package HomeTaskPageObject.pages;

import HomeTaskPageObject.pages.components.CalendarComponent;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPageTests {

    CalendarComponent calendarComponent = new CalendarComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            HobbiesInput = $(byText("Sports")),
            PictureInput = $(by("type", "file")),
            AddressInput = $("#currentAddress"),
            stateInput = $("#state"),
            stateList = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            cityList = $("#stateCity-wrapper"),
            submit = $("#submit");

    public RegistrationPageTests openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPageTests setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPageTests setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPageTests setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPageTests setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPageTests setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPageTests setBirthDay(String day, String month, String year) {
        birthDayInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPageTests setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPageTests setHobbies() {
        HobbiesInput.click();

        return this;
    }

    public RegistrationPageTests setPicture(File file) {
        PictureInput.uploadFile(file);

        return this;
    }

    public RegistrationPageTests setAddress(String value) {
        AddressInput.setValue(value);

        return this;
    }

    public RegistrationPageTests setState(String value) {
        stateInput.click();
        stateList.$(byText(value)).click();
        return this;
    }

    public RegistrationPageTests setCity(String value) {
        cityInput.click();
        cityList.$(byText(value)).click();
        return this;
    }

    public void Submit() {
        submit.click();

    }
}
