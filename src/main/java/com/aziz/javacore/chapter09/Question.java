package com.aziz.javacore.chapter09;

import java.util.Random;

import static com.aziz.javacore.chapter09.SharedConstants.NO;
import static com.aziz.javacore.chapter09.SharedConstants.YES;
import static com.aziz.javacore.chapter09.SharedConstants.LATER;
import static com.aziz.javacore.chapter09.SharedConstants.SOON;
import static com.aziz.javacore.chapter09.SharedConstants.NEVER;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

public class Question {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30)
            return NO;         // 30%
        else if (prob < 60)
            return YES;        // 30%
        else if (prob < 75)
            return LATER;      // 15%
        else if (prob < 98)
            return SOON;       // 13%
        else
            return NEVER;      // 2%
    }
}

class AskMe implements SharedConstants {
    static void answer(int result) {
        switch(result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}