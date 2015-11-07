package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = reader.readLine();
        int num1 = Integer.parseInt(numb1);
        String numb2 = reader.readLine();
        int num2 = Integer.parseInt(numb2);
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(8);
            }
            System.out.println();
        }//напишите тут ваш код

    }
}
