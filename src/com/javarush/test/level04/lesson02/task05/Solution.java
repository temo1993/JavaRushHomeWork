package com.javarush.test.level04.lesson02.task05;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов
(count) и на экран выдавалось правильно их количество.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count += 1;//напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count += 1;//напишите тут ваш код

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}