package com.aziz.javacore.chapter09;

public interface MyIF {
    // Это объявление обычного метода в интерфейси.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

        // А это объявление метода с реализацией по умолчанию.
        // Обратите внимание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
