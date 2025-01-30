public class Main {
    public static void main(String[] args) {
        // Задача №1
        byte age = 17;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача №2
        byte temp = 5;
        System.out.print("На улице " + temp + " градусов, ");
        if (temp <= 5) {
            System.out.println("нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("можно идти без шапки");
        }

        // Задача №3
        byte speed = 61;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("можно ездить спокойно");
        }

        // Задача №4
        byte ageHum = 17;
        System.out.print("Если возраст человека равен " + ageHum + ", то ему нужно ходить ");
        if (ageHum > 2 && ageHum <= 6) {
            System.out.println("в детский сад");
        }
        if (ageHum > 6 && ageHum <= 17) {
            System.out.println("в школу");
        }
        if (ageHum > 17 && ageHum <= 24) {
            System.out.println("в университет");
        }
        if (ageHum > 24) {
            System.out.println("на работу");
        }

        // Задача №5
        ageHum = 14;           //Задаём возраст
        boolean adult = false; //Задаём присутствие или отсутствие взрослого
        boolean age5;
        boolean age14;
        age5 = ageHum <= 5;   //Истина, если возраст меньше либо равен 5
        age14 = ageHum <= 14; //Истина, если возраст меньше либо равен 14
        System.out.print("Если возраст ребенка равен " + ageHum + ", то ему ");
        if (age5) {
            System.out.println("нельзя кататься на аттракционе");
        }
        if (!age5 && age14) {
            if (adult) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("нельзя кататься на аттракционе без сопровождения взрослого");
            }
        }
        if (!age14) {
            System.out.println("можно кататься на аттракционе");
        }

        // Задача №6
        byte people = 60; //Задаём количество человек от 0 до 102
        if (people == 102) {
            System.out.println("Вагон заполнен, мест нет");
        } else {
            if (people >= 60 && people < 102) {
                System.out.println("В вагоне есть место стоя");
            } else {
                System.out.println("В вагоне есть место и сидя и стоя");
            }
        }

        // Задача №7
        int one = 1;     // Задать число №1
        int two = 5;     // Задать число №2
        int three = 10;  // Задать число №3
        int maxNumber;
        if (one >= two && one >= three) {
            maxNumber = one;
        } else {
            if (two >= three) {
                maxNumber = two;
            } else {
                maxNumber = three;
            }
        }
        System.out.println("Большее число = " + maxNumber);
    }
}