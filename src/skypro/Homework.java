package skypro;

public class Homework {
    public static void main(String[] args) {
    // Задание 1

        byte cherry = 120;
        short apples = 25321;
        int kiwi = 158769;
        long skateBoard = 3698521L;
        float salt = 15.850f;
        double sugar = 189.9991;
        char symbol = 21;
        boolean isWeightFructs = 10 > cherry;

        // Задание 2

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        float differenceBetween = weightSecondBoxer - weightFirstBoxer;
        /*
        *Пытался пойти сложным путем как в обучающем ролике
        *вес первого бойца минус второго, потом через переменную overload,
        *но что-то пошло не так. Скорее всего, здесь это нельзя применить т.к.
        *нет дополнительных условий.
         */
        System.out.println("Разница в весе между бойцами " + differenceBetween + "кг");

        // Задание 3

        short bananas = 80;
        double milk = 1.05;
        short iceCream = 100;
        short egg = 70;
        double weight = bananas * 5 + milk * 200 + iceCream * 2 + egg * 4;
        System.out.println("Вес завтрака составляет " + weight + " грамм"); // не смог форматировать вывод в целое число
        System.out.println("вес завтрака составляет " + weight / 1000 + " килограмм");

        // Задание 4

        short weight1 = 7;
        short weight2 = 7 * 1000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        int total1 = weight2 / weightLoss1;
        int total2 = weight2 / weightLoss2;
        System.out.println("При первом варианте потребуется " + total1 + " дней");
        System.out.println("При втором варианте потребуется " + total2 + " дней");
        System.out.println("В среднем потребуется " + (total1 + total2) / 2 + " дней");
        /*
        * Есть ощущение, что что-то сделал не так.... )
        * непонятно в задании про "верное определение остатка".
         */
    }
}
