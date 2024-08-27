public class Main {
    public static void main(String[] args) {
        //Задача №1
        int ageA = 4;
        if (ageA >= 18) {
            System.out.println("Если возраст человека равен " + ageA + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageA + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        //Задача №2
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();

        //Задача №3
        int speed = 61;
        boolean isTheSpeedExceeded = speed > 60;
        if (isTheSpeedExceeded) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ехать спокойно.");
        }
        System.out.println();

        //Задача №4
        int ageB = 68;
        if (ageB > 0 && ageB >= 2 && ageB <= 6) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить в детский сад.");
        }
        if (ageB >= 7 && ageB <= 17) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить в школу.");
        }
        if (ageB >= 18 && ageB <= 24) {
            System.out.println("Если возраст человека равен " + ageB + ", то его место в университете.");
        }
        if (ageB > 24) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему пора на работу.");
        }
        System.out.println();

        //Задача №5
        int ageC = 16;
        if (ageC > 0 && ageC < 5) {
            System.out.println("Если возраст ребенка равен " + ageC + ", то ему нельзя кататься на аттракционе.");
        } else {
            if (ageC >= 5 && ageC < 14) {
                System.out.println("Если возраст ребенка равен " + ageC + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + ageC + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
        System.out.println();

        //Задача №6
        int passengers = 102;
        int vanCapacity = 102;
        int seating = 60;
        if (passengers < seating) {
            System.out.println("В вагоне есть сидячие места.");
        } else {
            if (passengers >= seating && passengers < vanCapacity) {
                System.out.println("В вагоне остались стоячие места.");
            } else {
                System.out.println("В вагоне больше нет мест.");
            }
        }
        System.out.println();

        //Задача №7
        int one = 6;
        int two = 8;
        int three = 6;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число.");
        } else {
            if (two > one && two > three) {
                System.out.println(two + " самое большое число.");
            } else {
                System.out.println( three + " самое большое число.");
            }
        }







    }


}