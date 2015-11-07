package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int mid = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = reader.readLine();
        int num1 = Integer.parseInt(numb1);
        String numb2 = reader.readLine();
        int num2 = Integer.parseInt(numb2);
        String numb3 = reader.readLine();
        int num3 = Integer.parseInt(numb3);
        if(num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3)
            mid = num1;
        else if(num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3)
            mid = num2;
        else if(num3 >= num1 && num3 <= num2 || num3 <= num1 && num3 >= num2)
            mid = num3;
        System.out.println(mid);
    }
}
