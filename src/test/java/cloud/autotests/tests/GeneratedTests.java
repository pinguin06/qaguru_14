package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Tag("telega")
    @Test
    @DisplayName("Проверка открытия правильной страницы")
    void titleTest() {
        step("Open url 'https://www.film.ru'", () ->
                open("https://www.film.ru"));

        step("Page title should have text 'Кинопортал Фильм.ру - все о кино, рецензии, обзоры, новости, премьеры фильмов'", () -> {
            String expectedTitle = "Кинопортал Фильм.ру - все о кино, рецензии, обзоры, новости, премьеры фильмов";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Tag("telega")
    @Test
    @DisplayName("Проверка поиска фильма 'Green Book'")
    void searchFilm() {
        step("Перейти по ссылке 'https://www.film.ru'", () -> {
            open("https://www.film.ru");
        });

        step("Найти фильм по слову 'book'", () -> {
            $("#quick_search_input").setValue("book").pressEnter();
        });

        step("Проверить, что в результатах имеется фильм 'Green Book'", () -> {
            $$("#movies_list").find(text("Green book")).shouldBe(visible);
        });
    }

    @Tag("telega")
    @Test
    @DisplayName("Проверка перехода по ссылке \"афиша\"")
    void checkAfisha() {
        step("Перейти по ссылке 'https://www.film.ru'", () -> {
            open("https://www.film.ru");
        });

        step("Перейти по ссылке 'афиша'", () -> {
            $("#menu > div:nth-child(3) > strong > a").click();
        });

        step("Проверить наличие текста на странице 'афиша'", () -> {
            String expectedText = "Премьеры фильмов. График премьер. Киноафиша. Афиша кинотеатров. Кино на Фильм.Ру";
            String actualText = title();

            assertThat(actualText).isEqualTo(expectedText);
        });
    }

    @Tag("telega")
    @Test
    @DisplayName("Проверка перехода по ссылке \"что посмотреть\"")
    void checkWhatLook() {
        step("Перейти по ссылке 'https://www.film.ru'", () -> {
            open("https://www.film.ru");
        });

        step("Перейти по ссылке 'что посмотреть'", () -> {
            $("#menu > div:nth-child(4) > strong > a").click();
        });

        step("Проверить наличие текста на странице 'что посмотреть'", () -> {
            String expectedText = "Фильмы и сериалы - список лучших";
            String actualText = title();

            assertThat(actualText).isEqualTo(expectedText);
        });
    }


    @Tag("telega")
    @Test
    @DisplayName("Проверка отсутствия ошибок в коде страницы")
    void consoleShouldNotHaveErrorsTest() {
        step("Перейти по ссылке 'https://www.film.ru'", () ->
                open("https://www.film.ru"));

        step("Проверить, что логи не содержат слова 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}