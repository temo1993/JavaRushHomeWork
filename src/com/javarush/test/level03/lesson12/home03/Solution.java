package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = reader.readLine();
        int num1 = Integer.parseInt(numb1);
        System.out.println("Я буду зарабатывать $" + num1 + " в час");//напишите тут ваш код
    }
}