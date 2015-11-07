package com.javarush.test.level04.lesson02.task03;

/**
 * Created by temo on 11/4/15.
 */
/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;//напишите тут ваш код
    }

    public static void main(String ... args){
        Cat.setCatsCount(15);
    }
}
