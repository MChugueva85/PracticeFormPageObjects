package home_task_page_object.tests;

import com.codeborne.selenide.Configuration;
import home_task_page_object.pages.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBaseRemote {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = System.getProperty("BASE_URL","https://demoqa.com");
        Configuration.browserSize = System.getProperty("browserSize","1920x1080");
        Configuration.pageLoadStrategy = "eager";

        Configuration.remote = System.getProperty("remoteDriverUrl");
        Configuration.browser = System.getProperty("browser", "opera");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

        @AfterEach
        void addAttachments() {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();

            closeWebDriver();

        }

    }
