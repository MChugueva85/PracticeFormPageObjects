package home_task_page_object.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultPageComponent {
    SelenideElement
            resultTable = $(".table-responsive");
    @Step(value = "Проверяем заполнение поля {caption}")
    public void checkOut (String caption, String value) {
        resultTable.$(byText(caption)).sibling(0).shouldHave(Condition.text(value));
    }
}
