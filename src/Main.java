public class Main {
    public static void main(String[] args) {
        //task 1
        int age;
        age = 17;
        if (age >= 18) {
            System.out.println("Ты совершенолетний");
        } else {
            System.out.println("Ты не совершенолетний. Придётся немного подождать.");
        }

        //task 2
        int temperature = 4;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        //task 2
        int spid = 57;
        if (spid > 60) {
            System.out.println("Если скорость " + spid + ", то придется заплатить штраф");
        }
        if (spid < 60) {
            System.out.println("Если скорость " + spid + ", то можно ездить спокойно");
        }

        //task 4
        int ageMan = 17;
        if (ageMan <= 6 && ageMan >= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад.");
        }
        if (ageMan <= 18 && ageMan >= 7) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу.");
        }
        if (ageMan <= 24 && ageMan >= 18) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в Университет.");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить на работу.");
        }

        //task 5
        int ageMan2 = 9;
        if (ageMan2 < 5) {
            System.out.println("Если возраст ребенка равен " + ageMan2 + ", то нельзя кататься на аттракционе.");
        }
        if (ageMan2 <= 14 && ageMan2 >= 5) {
            System.out.println("Если возраст ребенка равен " + ageMan2 + ", то можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageMan2 >= 14) {
            System.out.println("Если возраст ребенка равен " + ageMan2 + ", то можно кататься на аттракционе ,без сопровождении взрослого.");
        }

        //task 6

        int sedentary = 60;
        int standing = 42;

        int sedentary2 = sedentary - 60;
        int standing2 = standing - 42;
        int summ = sedentary2 + standing2;

        if (sedentary2 < 60) {
            System.out.println("В вагоне есть " + summ + " свободных мест. Из них " + sedentary2 + " Сидячих и " + standing2 + " стоячих.");
        }
        else if (standing2 < 42) {
            System.out.println("В вагоне есть " + summ + " свободных мест. Из них " + sedentary2 + " Сидячих и " + standing2 + " стоячих.");
        }else if (summ >= 102){
            System.out.println("В вагоне свободных мест нет.");
        }

        // task 7
        int one = 1;
        int two = 2;
        int thriee = 3;

        if (one < two && two < thriee) {
            System.out.println("Из трёх числе большее " + thriee);
        }




        }


    }
