# Используем официальный образ OpenJDK 23
FROM openjdk:23-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем файл сборки (JAR) в контейнер
COPY build/libs/intr_pr5-0.0.1-SNAPSHOT-plain.jar app.jar

# Указываем команду для запуска приложения
CMD ["java", "-jar", "app.jar"]
