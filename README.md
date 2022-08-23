# Автоматизированное тестирование на примере работы с сайтом 'https://www.film.ru'
## :bookmark_tabs: Основной контент:
> :radio_button: [***Используемые технологии***](#computer-mag_right-используемые-технологии)
>
> :radio_button: [***Реализация проверок***](#ballot_box_with_check-реализация-проверок)
>
> :radio_button: [***Команда запуска тестов локально в IntelliJ в терминале***](#arrow_forward-команда-запуска-тестов-локально-в-IntelliJ-в-терминале)
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

## :computer: :brain: _Используемые технологии_
<p align="center">
<img width="6%" title="IntelliJ" src="attachments/IntelliJ.svg">
<img width="6%" title="Java" src="attachments/Java.svg">
<img width="6%" title="Gradle" src="attachments/Gradle.svg">
<img width="6%" title="JUnit5" src="attachments/JUnit5.svg">
<img width="6%" title="Selenide" src="attachments/Selenide.svg">
<img width="6%" title="GitHub" src="attachments/github.svg">
<img width="6%" title="Jenkins" src="attachments/Jenkins.svg">
<img width="6%" title="Allure TestOps" src="attachments/AllureTestOps.svg">
<img width="6%" title="Allure Report" src="attachments/AllureReport.svg">
<img width="6%" title="Jira Cloud" src="attachments/Jira.svg">
<img width="6%" title="Telegram" src="attachments/Telegram.svg">
<img width="6%" title="Selenoid" src="attachments/Selenoid.svg">
</p>

<a target="_blank" href="https://allure.autotests.cloud/project/%s">allure.autotests.cloud/project/%s</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
