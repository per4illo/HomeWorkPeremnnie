public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte a = 120;
        short b = 300;
        int c = 400;
        long d = 500;
        float f = 3.55f;
        double g = 30.33;
        char h = 33;
        boolean k = a >= 120;
       //System.out.println(h);

         // Задание 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double WeightAllBoxer = firstBoxerWeight + secondBoxerWeight;
        // System.out.println("Общий вес боксеров " + WeightAllBoxer + " кг");
        double raznicaWeightBoxer = secondBoxerWeight - firstBoxerWeight;
        // System.out.println("Разница в весе боксеров " + raznicaWeightBoxer + " кг");

        //Задание 3

        byte banan = 80;
        short milkGramm = 105;
        byte plombir = 100;
        byte egg = 70;
        int shaike = banan * 5 + milkGramm * 2 + plombir * 2 + egg * 4;
        // System.out.println("Общий вес коктейля " + shaike + " грамм");
        double shaikeKG = shaike;
        // System.out.println("Общий вес коктейля " + (shaikeKG / 1000) + " килограмм");

        // Задание 4

        short weightForCondition = 7;
        int grammDay250 = weightForCondition * 1000 / 250;
        // System.out.println("при сбросе в день по 250грамм веса понадобиться " + grammDay250 + " дней для сброса " + weightForCondition + " кг");
        int grammDay500 = weightForCondition * 1000 / 500;
        // System.out.println("при сбросе в день по 250грамм веса понадобиться " + grammDay500 + " дней для сброса " + weightForCondition + " кг");
        int midDay = (grammDay250 + grammDay500) / 2;
        // System.out.println("Среднее количество дней для похудения " + midDay);

        // Задание 5

        double maria = 67760;
        double denis = 83690;
        double kristina = 76230;

        double mariaYears = maria * 12;
        double mariaMonthNew = maria / 100 * 10 + maria;
        double mariaYearsNew = mariaMonthNew * 12;
        double denisYears = denis * 12;
        double denisMonthNew = denis / 100 * 10 + denis;
        double denisYearsNew = denisMonthNew * 12;
        double kristinaYears = kristina * 12;
        double  kristinaMonthNew = kristina / 100 * 10 + kristina;
        double kristinaYearsNew = kristinaMonthNew * 12;


        System.out.println("Маша теперь получает " + mariaMonthNew + " рублей. " + "Годовой доход вырос на " + ( mariaYearsNew - mariaYears) + " рублей."  );
        System.out.println("Денис теперь получает " + denisMonthNew + " рублей" + "Годовой доход вырос на " + ( denisYearsNew - denisYears) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaMonthNew + " рублей" + "Годовой доход вырос на " + ( kristinaYearsNew - kristinaYears) + " рублей.");



    }
}