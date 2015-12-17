package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

            for (int i = 0; i < 2; i++) {
                input.add(Integer.parseInt(reader.readLine()));
            }
            for (int i = 0; i < input.get(0); i++) {
                result.add(Integer.parseInt(reader.readLine()));
            }
            for (int i = 0; i < input.get(1); i++) {
                result.add(result.get(i));
            }


        for (int i = 0; i < input.get(1); i++) {
            result.remove(result.get(0));
        }


        for (int elements :
                result) {
            System.out.println(elements);
        }//напишите тут ваш код

    }
}
