package com.aziz.javacore.chapter09;

// Реализовать интерфейс MyIF
public class MyIFImp implements MyIF {
    // В этом классе должен быть реализовн только метод GetNumber(),
    // определнный в интерфейсе MyIF
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}

