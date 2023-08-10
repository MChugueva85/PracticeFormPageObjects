package home_task_page_object.pages;

import home_task_page_object.pages.components.CalendarComponent;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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
            pictureInput = $(by("type", "file")),
            addressInput = $("#currentAddress"),
            stateInput = $("#state"),
            stateList = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            cityList = $("#stateCity-wrapper"),
            submit = $("#submit");
    @Step("Открываем страницу регистрации")
        public RegistrationPageTests openPage() {
        open("/automation-practice-form");

        return this;
    }
    @Step()
    public RegistrationPageTests removeFixedbanFooter() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }
    @Step("Заполняем имя")
    public RegistrationPageTests setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }
    @Step("Заполняем фамилию")
    public RegistrationPageTests setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }
    @Step("Указываем почту")
    public RegistrationPageTests setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }
    @Step("Указываем пол")
    public RegistrationPageTests setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }
    @Step("Указываем номер телефона")
    public RegistrationPageTests setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }
    @Step("Указываем дату рождения")
    public RegistrationPageTests setBirthDay(String day, String month, String year) {
        birthDayInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }
    @Step("Выбираем предмет")
    public RegistrationPageTests setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }
    @Step("Выбираем хобби")
    public RegistrationPageTests setHobbies(String value) {
       $(byText(value)).click();

        return this;
    }
    @Step("Подгружаем картинку")
    public RegistrationPageTests setPicture(String value) {
        pictureInput.uploadFromClasspath(value);
        return this;
    }
    @Step("Указываем адрес")
    public RegistrationPageTests setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }
    @Step("Указываем штат")
    public RegistrationPageTests setState(String value) {
        stateInput.click();
        stateList.$(byText(value)).click();
        return this;
    }
    @Step("Указываем город")
    public RegistrationPageTests setCity(String value) {
        cityInput.click();
        cityList.$(byText(value)).click();
        return this;
    }
    @Step("Нажимаем Submit")
    public void submit() {
        submit.click();

    }
}
