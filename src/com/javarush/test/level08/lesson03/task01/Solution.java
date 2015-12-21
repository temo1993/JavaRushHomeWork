package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<>();
        set.add("арбуз");//напишите тут ваш код                     4
        set.add("банан");//напишите тут ваш код                     3
        set.add("вишня");//напишите тут ваш код                     9
        set.add("груша");//напишите тут ваш код                     5
        set.add("дыня");//напишите тут ваш код                      1
        set.add("ежевика");//напишите тут ваш код                   2
        set.add("жень-шень");//напишите тут ваш код                 10
        set.add("земляника");//напишите тут ваш код                 7
        set.add("ирис");//напишите тут ваш код                      8
        set.add("картофель");//                                     6

        for (String str :
                set) {
            System.out.println(str);
        }//напишите тут ваш код

    }
}
