package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        long z = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            Long y = Long.parseLong(in.readLine());
            z = z + y;
        if(y == -1){
            System.out.println(z);
            break;
        }
    }
        //напишите тут ваш код
    }
}
