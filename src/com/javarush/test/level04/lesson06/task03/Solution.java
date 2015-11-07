package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = reader.readLine();
        int num1 = Integer.parseInt(numb1);

        String numb2 = reader.readLine();
        int num2 = Integer.parseInt(numb2);

        String numb3 = reader.readLine();
        int num3 = Integer.parseInt(numb3);


        int max=0,mid=0,min=0;
        if(num1 >= num2 && num1 >= num3)
            max = num1;
        else if(num2 >= num1 && num2 >= num3)
            max = num2;
        else if(num3 >= num1 && num3 >= num2)
            max = num3;

        if(num1 <= num2 && num1 <= num3)
            min = num1;
        else if(num2 <= num1 && num2 <= num3)
            min = num2;
        else if(num3 <= num1 && num3 <= num2)
            min = num3;

        if(num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3)
            mid = num1;
        else if(num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3)
            mid = num2;
        else if(num3 >= num1 && num3 <= num2 || num3 <= num1 && num3 >= num2)
            mid = num3;


        System.out.println(max + " " + mid + " " + min);//напишите тут ваш код

    }
}
