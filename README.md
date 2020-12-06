# Серверная часть приложения на React JS вывода геолокаций на Яндекс.Карты

Spring boot app.

## Available Scripts

Для запуска проекта на локальной машине 

1. Соберите Jar файл и запустите spring boot app
### `mvn clean package`

## Сборка docker образа
Для сборки контейнера перейдите в дирректорию проекта
### `docker build -t CONTAINER_NAME ./`

## Запуск docker контейнера
(Порты возможно определить любыe)
### `docker run -p 8080:8080 CONTAINER_NAME`

## Отправка в docker hub
### `docker tag CONTAINER_ID DOCKER_REPO_USER/REPO_CONTAINER_NAME`

## Получение из docker hub
### `docker pull DOCKER_REPO_USER/REPO_CONTAINER_NAME`
