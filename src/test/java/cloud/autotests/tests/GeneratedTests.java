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
    @DisplayName("Проверка ссылки \"Афиша\"")
    void searchFilm() {
        step("Open url 'https://www.film.ru'", () -> {
            open("https://www.film.ru");
        });

        step("Looking for movie 'book'", () -> {
            $("#quick_search_input").setValue("book").pressEnter();
        });

        step("Check that among the found films there is a 'Green Book'", () -> {
            $$("#movies_list").find(text("Green book")).shouldBe(visible);
        });
    }

    @Tag("telega")
    @Test
    @DisplayName("link check \"Афиша\"")
    void checkAfisha() {
        step("Open url 'https://www.film.ru'", () -> {
            open("https://www.film.ru");
        });

        step("Click link ''", () -> {
            $("#menu > div:nth-child(3) > strong > a").click();
        });

        step("link check 'Афиша'", () -> {
            String expectedText = "Премьеры фильмов. График премьер. Киноафиша. Афиша кинотеатров. Кино на Фильм.Ру";
            String actualText = title();

            assertThat(actualText).isEqualTo(expectedText);
        });
    }

    @Tag("telega")
    @Test
    @DisplayName("link check \"Что посмотреть\"")
    void checkWhatLook() {
        step("Open url 'https://www.film.ru'", () -> {
            open("https://www.film.ru");
        });

        step("Click link ''", () -> {
            $("#menu > div:nth-child(4) > strong > a").click();
        });

        step("link check 'Что посмотреть'", () -> {
            String expectedText = "Фильмы и сериалы - список лучших";
            String actualText = title();

            assertThat(actualText).isEqualTo(expectedText);
        });
    }


    @Tag("telega")
    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.film.ru'", () ->
                open("https://www.film.ru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}