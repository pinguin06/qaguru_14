# Автоматизированное тестирование на примере работы с сайтом 'https://www.film.ru'
## :bookmark_tabs: Содержание:
:radio_button: [***Используемые технологии***](#computer-brain-Используемые-технологии)

:radio_button: [***Список проверок***](#heavy_check_mark-Список-проверок)

:radio_button: [***Команда запуска тестов удаленно в Jenkins***](#heavy_check_mark-Команда-запуска-тестов-удаленно-в-Jenkins)

:radio_button: [***Сборка в Jenkins***](#heavy_check_mark-Сборка-в-Jenkins-с-параметрами)

:radio_button: [***Allure отчет***](#heavy_check_mark-Allure-отчет)

:radio_button: [***Allure TestOps отчет***](#chart_with_upwards_trend-allure-testOps-отчет)

:radio_button: [***Отчет о прохождении тестов в Telegram***](#heavy_check_mark-Отчет-о-прохождении-тестов-в-Telegram)

:radio_button: [***Интеграция Allure TestOps с Ticket Tracking Tool Jira***](#link-интеграция-allure-testOps-с-ticket-tracking-tool-jira)

:radio_button: [***Видео прохождения тестов***](#heavy_check_mark-Видео-прохождения-тестов)



## :computer: :brain: **Используемые технологии**

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="src/attachments/IntelliJ.svg" width="50"/></a>
<a href="https://www.java.com/"><img alt="Java" height="50" src="src/attachments/Java.svg" width="50"/></a>
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="src/attachments/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="src/attachments/Selenide.svg" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="src/attachments/Selenoid.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="src/attachments/Gradle.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="src/attachments/Jenkins.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="src/attachments/AllureReport.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="src/attachments/github.svg" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="src/attachments/Telegram.svg" width="50"/></a>
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



## :heavy_check_mark: **Сборка в Jenkins с параметрами**
<p> Сборка в <a target="_blank" href="https://jenkins.autotests.cloud/job/ORomanshchak-qa_guru_13_14/">Jenkins</a>
</p>

<p align="center">  <img src="src/attachments/jenkins.JPG" width="800"> </p>

<p align="center">
  <img src="src/attachments/parameters.JPG" width="800">
</p>


## :heavy_check_mark: **Allure отчет**

<p> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/ORomanshchak-qa_guru_13_14/allure/">Allure</a>
</p>

<p align="center">
  <img src="src/attachments/allureReport.JPG" width="800">
</p>

<p align="center">
  <img src="src/attachments/tests.JPG" width="800">
</p>

<p align="center">
  <img src="src/attachments/graphs.JPG" width="800">
</p>



## :heavy_check_mark: **Отчет о прохождении тестов в Telegram**
<p align="center">
  <img src="src/attachments/telega.JPG" width="600">
</p>



## :heavy_check_mark: **Видео прохождения тестов**
<p> Видео прохождения теста в <a target="_blank" href="https://jenkins.autotests.cloud/job/ORomanshchak-qa_guru_13_14/allure/data/attachments/1ab037f83eb2b89f.mp4">Selenoid</a></p>

