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

## :heavy_check_mark: _Список проверок_
### Проверка перехода на заданную страницу
### Проверка поиска заданного фильма
### Проверка перехода по ссылке "афиша"
### Проверка перехода по ссылке "что посмотреть"
### Проверка наличия ошибок в консоли

## :heavy_check_mark: _Команда запуска тестов удаленно в Jenkins_

> _Для Запуска тестов удаленным путем используется настраиваемые параметры в Jenkins:_
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
<p></a> Сборка <a target="_blank" href="https://jenkins.autotests.cloud/job/ORomanshchak-qa_guru_13_14/">Jenkins</a><p>

<p align="center">
  <img src="images/screens/JenkinsJob.jpg" alt="job" width="800">
</p>