package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.util.Arrays;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String arr[] = new String[10];//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < arr.length; i++){
            arr[i] = reader.readLine();
        }
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}