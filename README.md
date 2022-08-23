# Автоматизированное тестирование на примере работы с сайтом 'https://www.film.ru'
## :bookmark_tabs: Основной контент:
> :radio_button: [***Используемые технологии***](#computer-mag_right-используемые-технологии)
>
> :radio_button: [***Реализация проверок***](#ballot_box_with_check-реализация-проверок)
>
> :radio_button: [***Команда запуска тестов удаленно в Jenkins***](#repeat_one-команда-запуска-тестов-удаленно-в-Jenkins)
>
> :radio_button: [***Сборка в Jenkins***](#package-сборка-в-jenkins)
>
> :radio_button: [***Allure отчет***](#bar_chart-allure-отчет)
>
> :radio_button: [***Allure TestOps отчет***](#chart_with_upwards_trend-allure-testOps-отчет)
>
> :radio_button: [***Отчет о прохождении тестов в Telegram***](#envelope-отчет-о-прохождении-тестов-в-telegram)
>
> :radio_button: [***Интеграция Allure TestOps с Ticket Tracking Tool Jira***](#link-интеграция-allure-testOps-с-ticket-tracking-tool-jira)
>
> :radio_button: [***Видео прохождения тестов***](#clapper-видео-прохождения-тестов)
>

## :computer: :brain: **Используемые технологии**

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="attachments/IntelliJ.svg" width="50"/></a>
<a href="https://www.java.com/"><img alt="Java" height="50" src="attachments/Java.svg" width="50"/></a>
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="attachments/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="attachments/Selenide.svg" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="attachments/Selenoid.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="attachments/Gradle.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="attachments/Jenkins.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="attachments/AllureReport.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="attachments/github.svg" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="attachments/Telegram.svg" width="50"/></a>
</div>


## :heavy_check_mark: **Список проверок**
* ### Проверка перехода на заданную страницу
* ### Проверка поиска заданного фильма
* ### Проверка перехода по ссылке "афиша"
* ### Проверка перехода по ссылке "что посмотреть"
* ### Проверка наличия ошибок в консоли

## :heavy_check_mark: **Команда запуска тестов удаленно в Jenkins**

Для запуска тестов удаленным путем используются настраиваемые параметры в Jenkins:
```bash
clean 
telega
-DremoteURL=${REMOTE_URL}
-Dbrowser=${Browser}
-DbrowserVersion=${Browser_version}
-DbrowserSize=${Browser_size}
-DremoteDriverUrl=https://user1:1234@${REMOTE_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_URL}/video/
-Dthreads=${threads}
```

## :heavy_check_mark: _Сборка в Jenkins с параметрами_
<p></a> Сборка в <a target="_blank" href="https://jenkins.autotests.cloud/job/ORomanshchak-qa_guru_13_14/">Jenkins</a><p>

<p align="center">
  <img src="attachments/jenkins.jpg" width="800">
</p>