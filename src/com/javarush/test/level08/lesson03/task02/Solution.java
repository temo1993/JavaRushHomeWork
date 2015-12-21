package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст,
жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> collection = new HashMap<>(); //напишите тут ваш код
        collection.put("арбуз","ягода");
        collection.put("банан","трава");
        collection.put("вишня","ягода");
        collection.put("груша","фрукт");
        collection.put("дыня","овощ");
        collection.put("ежевика","куст");
        collection.put("жень-шень","корень");
        collection.put("земляника","ягода");
        collection.put("ирис","цветок");
        collection.put("картофель","клубень");

        for (Map.Entry<String, String> pair : collection.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }
}
