import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        List<Integer> temperature = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int velue = scanner.nextInt();
        int result = scanner.nextInt();

        while (true) {
            temperature.add(velue);//бесконечное считывание

            if (velue == -1) {
                break;
            }
            temperature.add(velue);

        }
        int sum = 0;
        for (int i = 0; i < temperature.size(); i++) {
            sum += temperature.get(i);// средняя температура
        }

        for (int i = 0; i < temperature.size(); i++) {// создание самого элемента
            double number = (velue - 1);
            double diff = velue - number;
        }
        for (int i = 0; i < temperature.size(); i++) {
            sum += temperature.get(i);
            int number = (velue - 1);
            double tenPersent = velue * 0.1;
            double twentyPersent = velue * 0.2;
            double velOftenPersent = tenPersent + velue;
            double velOftwentyPersent = twentyPersent + velue;
            if (sum + temperature.get(i) <= velOftenPersent && number <= velOftwentyPersent) {
                System.out.println("Тревога, превышение температуры");

            }
            //3.1
            for (int j = 0; j < temperature.size(); j++) {
                int size = temperature.size();
                if (size >= 10) {
                    temperature.subList(size - 10, size);//дополнительный метод
                    sum += temperature.size();

                }
                for (int k = 0; k < temperature.size(); k += 100) {
                    System.out.println((k + 1) + ":" + temperature.size());

                }
            }
        }
    }


}


//1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.
//2) После КАЖДОГО введеного числа сообщите пользователю информацию:
//        2.1) Среднее значение температуры ядерного за ВСЕ время
//2.2) Насколько текущая введеная температура отличается от предыдущей
//2.3) Если введеная температура превышает среднюю на 10% и повысилась относительно предыдущего значения более, чем на 20%,
//То напишите на экран собщение "Тревога, превышение температуры"
//
//Усложненное задание:
//        3.1) Рассчитайте также среднюю температуру за 10 последних измерений и среднюю температуру каждого 100ого измерения