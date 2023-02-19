import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ",то он не достиг совершеннолетия, нужно немного подождать");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature <= 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 24;
        if (age >= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
        else {
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            } else {
                if (age >= 7 && age <= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
                } else {
                    if (age > 18 && age < 24) {
                        System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
                    }
                }
            }
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе.");
        }
        else {
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            }
            else {
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int passangers =  102;
        boolean standingPlaces = passangers <= 101 && passangers >= 60;
        boolean capacity = passangers >= 102 ;
        if (capacity) {
            System.out.println("Вагон полностью забит");
        }
        else {
            if (standingPlaces){
                int standing = 102 - passangers;
                System.out.println("В вагоне нет сидячих мест и " + standing + " стоячих мест");
            }
            else {
                int freePlaces = 60 - passangers;
                int standing = 102 - freePlaces - passangers;
                System.out.println("В вагоне " + freePlaces + " сидячих мест и " + standing + " стоячих мест");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 101;
        int two = 150;
        int three = 151;
        if (one > two && one > three) {
            System.out.println(one + " > " + two + " и " + one + " > " + three);
        } else {
            if (two > one && two > three) {
                System.out.println(two + " > " + one + " и " + two + " > " + three);
            } else {
                if (three > one && three > two) {
                    System.out.println(three + " > " + one + " и " + three + " > " + two);
                }
            }
        }
    }
}