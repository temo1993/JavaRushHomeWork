package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int int1 = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int int2 = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int int3 = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int int4 = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int int5 = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int[] str = {int1,int2,int3,int4,int5};
        Arrays.sort(str);
        for (int j : str) {
            System.out.println(j);
        }
    }
}
