package HomeTaskPageObject.tests;

import HomeTaskPageObject.pages.RegistrationPageTests;
import HomeTaskPageObject.pages.components.ResultPageComponent;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    RegistrationPageTests registrationPage = new RegistrationPageTests();
    ResultPageComponent resultPageComponent = new ResultPageComponent();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

    }
}
