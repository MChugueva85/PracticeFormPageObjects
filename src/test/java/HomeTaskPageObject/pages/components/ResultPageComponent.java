package HomeTaskPageObject.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultPageComponent {
    SelenideElement
            ResultTable = $(".table-responsive");

    public void CheckOut (String caption, String value) {
        ResultTable.$(byText(caption)).sibling(0).shouldHave(Condition.text(value));
    }
}
