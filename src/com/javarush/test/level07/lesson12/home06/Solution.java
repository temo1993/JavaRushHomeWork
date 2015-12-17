package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human dad1 = new Human("Alex",true,77,null,null);//напишите тут ваш код
        Human dad2 = new Human("Alex2",true,76,null,null);//напишите тут ваш код
        Human grand1 = new Human("Olia",false,71,null,null);//напишите тут ваш код
        Human grand2 = new Human("Olia2",false,72,null,null);//напишите тут ваш код

        Human father = new Human("Jack",true,57,dad1,grand1);//напишите тут ваш код
        Human mother = new Human("Emma",false,52,dad2,grand2);//напишите тут ваш код

        Human child1 = new Human("Jimmy",true,35,father,mother);//напишите тут ваш код
        Human child2 = new Human("Denis",true,28,father,mother);//напишите тут ваш код
        Human child3 = new Human("Ivan",true,27,father,mother);//напишите тут ваш код


        System.out.println(dad1.toString());
        System.out.println(dad2.toString());
        System.out.println(grand1.toString());
        System.out.println(grand2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
