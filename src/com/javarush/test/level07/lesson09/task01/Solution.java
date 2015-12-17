package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
 Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> dividesOnThree = new ArrayList<Integer>();
        ArrayList<Integer> dividesOnTwo = new ArrayList<Integer>();
        ArrayList<Integer> othersLeft = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer count :
                list) {
            if (count % 3 == 0)
                dividesOnThree.add(count);
            if (count % 2 == 0) {
                dividesOnTwo.add(count);
            }
            if (count % 3 != 0 && count % 2 != 0) {
                othersLeft.add(count);
            }
            if (count % 3 == 0 && count % 2 == 0) {
                dividesOnThree.add(count);
                dividesOnTwo.add(count);
            }
        }


        printList(list);//напишите тут ваш код
        printList(dividesOnThree);//напишите тут ваш код
        printList(dividesOnTwo);//напишите тут ваш код
        printList(othersLeft);//напишите тут ваш код
    }

    public static void printList(List<Integer> list)
    {
//        for (Integer integers :
//                list) {
//            System.out.println(integers);
//        }
        System.out.println(list);//напишите тут ваш код
    }
}
