package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class YandexTests {
    @Test
    void selenideSearchTest() {
        // Открыть Yandex
        open("https://yandex.ru");

        // Ввести Selenide в поиск
        $("#text").val("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("ru.selenide.org"));
    }

}
