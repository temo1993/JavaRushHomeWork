package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            arrayList.add(read.readLine());
        }
        String shortest = arrayList.get(0);
        for (String anArrayList : arrayList) {
            if (anArrayList.length() < shortest.length()) {
                shortest = anArrayList;
            }
        }
        for (String anArrayList : arrayList) {
            if (anArrayList.length() == shortest.length()) {
                shortest = anArrayList;
                System.out.println(shortest);
            }
        }//напишите тут ваш код

    }
}
