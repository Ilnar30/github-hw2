import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ComplarePlansTest {
    @BeforeAll
    static void conifure() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void prisingHaveComplare() {
        //1. На главной странице GitHub выберите меню Pricing -> Compare Plans с помощью команды hover для Pricing.
        open("https://github.com/");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(".HeaderMenu").$(byText("Compare plans")).click();
        // Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."
        $(".h2-mktg").shouldHave(text("Choose the plan that’s right for you."));
    }
}
