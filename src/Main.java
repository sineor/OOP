import javax.swing.*;
import javax.swing.GroupLayout.Group;
import java.time.LocalDate;

import static java.time.LocalDate.of;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task3.Создайте класс Phone с полями(
        //brand, version, screen, memory,
        //price) создайте getter and setter и
        //конструктор с 3-мя аргументами,
        //создайте 2 объекта этого класса,
        //дайте значения 3-м полям класса
        //через конструктор, а двум через
        //getter

        //task2Напишите логику которая
        //посчитает сколько лет студенту
        //сейчас (подсказка: используйте
        //class Period и его методы)
// Создание объектов с использованием конструктора

       /* LocalDate birthDate = LocalDate.of(2000, 4, 15);

        LocalDate currentDate = LocalDate.now(); // Текущая дата

        // Вычисляем разницу между датами
        Period period = Period.between(birthDate, currentDate);

        int years = period.getYears(); // Получаем количество лет

        System.out.println("Студенту сейчас " + years + " лет.");*/
//task1 Создайте класс Student с полями
//(name, date of birth(LocalDate), phone
//number, nationality) создайте
//конструктор по умолчанию и еще
//один с аргументами. В main
//создайте 5 объектов Student  дайте
//значение полям через конструктор.
//Теперь эти объекты положите в
//массив и выведите на консоль.
       /* Student[] students = new Student[5];

        students[0] = new Student("Akjol mahmudov", LocalDate.of(1999, 6, 15), "123-456-7890", "KGZ");
        students[1] = new Student("Jone biden", LocalDate.of(1959, 9, 25), "987-654-3210", "USA");
        students[2] = new Student("Roman Vlasov", LocalDate.of(1985, 3, 8), "555-123-4567", "RUS");
        students[3] = new Student("Mihito chabano", LocalDate.of(1977, 7, 12), "111-222-3333", "Arm");
        students[4] = new Student("Jimo Hiko", LocalDate.of(1997, 12, 1), "444-555-6666", "Japon");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }*/
        //Task Гүл деген класс түзүңүз. Полелери
        //(flowerName, freshness, price)
        // Мейнден Анын бир нече
        //объекттерин түзүңүз, маанилерин
        //бериниз.
        // Гүлдүн массивин түзобуз, гулдорду
        //ошол массивке салыбыз. Метод
        //тузунуз, параметрине гулдолдун
        //массивин алсын, анан метод эн
        //кымбат гулдун баасын кайтарсын.
        //мейнден ошол методду чакырыныз
        // Гүлдү анын жаңылыгына (свежесть)
        //карата сорттойбуз. Гүлдү атына
        //жараша сорттойбуз
        /*  Flower[] flowers = new Flower[]{
                new Flower("Rose", 90, 10.99),
                new Flower("Tulip", 85, 5.99),
                new Flower("Lily", 95, 15.99),
                new Flower("Peony", 80, 12.99)
        };

        System.out.println("Highest price: " + Flower.findHighestPrice(flowers));
        System.out.println("Sort by freshness:");
        Flower.sortByFreshness(flowers);
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println("Sort by name:");
        Flower.sortByName(flowers);
        for (Flower flower : flowers) {
            System.out.println(flower);
        }*/
        //"Person" деген классын түзүңүз.
        //Полелери: (fullname, age ,
        //gender) болсун.
        // 2. Person-дун 5 обьектисин
        //тузуп, полелерине маани
        //бериниз.
        //3. Бардык адамдарды бир
        //массивге сал.
        //4. Адамдардын ичинен эн
        //жашы чон жана эн жашы
        //кичине адамды кайтаруучу эки
        //метод тузунуз

        /*Person person1 = new Person("Nurles Subanbaev",20,"man");
        Person person2 = new Person("jandar Taalaibekov",22,"man");
        Person person3 = new Person("Erkin Toigonbaev ",21,"man");
        Person person4 = new Person("Akjol Mahmudov",24,"man");
        Person person5 = new Person("jolaman Sharshenbekov",23,"man");
        Person[] massive = {person1,person2,person3,person4,person5};
        Person oldest = findOldestPerson(massive);
        Person youngest = findYoungestPerson(massive);

        System.out.println("En jashy chon adam: " + oldest.getName() + ", lash: " + oldest.getAge());
        System.out.println("En jashy kichine adam: " + youngest.getName() + ", jash: " + youngest.getAge());
    }

   public static Person findOldestPerson(Person[]people){
       Person oldestPerson = people[0];
        for (Person person : people) {
           if (person.getAge() > oldestPerson.getAge()){
               oldestPerson = person;
           }
        }
        return oldestPerson;
    }

   public static Person findYoungestPerson(Person[]people) {
        Person yongestPerson = people[0];
       for (Person person :people) {
           if (person.getAge() < yongestPerson.getAge()){
               yongestPerson = person;
           }
       }
       return yongestPerson;*/
        //Task  Cоздайте класс Reader с полями (full
        //name, library card number, faculty, date of
        //birth, phone number).
        //   Методы takeBook(), returnBook().
        //- takeBook, будет принимать в качестве
        //параметра количество взятых книг.
        //Выводит на консоль сообщение "Петров
        //В. В. взял 3 книги".
        //   Mетод returnBook(). Выводит на
        //консоль сообщение   "Петров В. В.
        //вернул 3 книги".

       /*Reader reader = new Reader("K.karachaev",8947,"Informatika",2387,98268);
    reader.takeBook(3);
    reader.returnBook(3);*/


    }}