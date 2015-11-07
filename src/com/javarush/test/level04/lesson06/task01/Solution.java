package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = reader.readLine();
        int num1 = Integer.parseInt(numb1);
        String numb2 = reader.readLine();
        int num2 = Integer.parseInt(numb2);
        if(num1 < num2)
            System.out.println(num1);
        else
            System.out.println(num2);
        //напишите тут ваш код
        System.gc();
    }
}