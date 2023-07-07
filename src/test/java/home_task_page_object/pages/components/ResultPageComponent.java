package home_task_page_object.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultPageComponent {
    SelenideElement
            resultTable = $(".table-responsive");

    public void checkOut (String caption, String value) {
        resultTable.$(byText(caption)).sibling(0).shouldHave(Condition.text(value));
    }
}
