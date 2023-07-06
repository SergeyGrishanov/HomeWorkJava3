package work4;
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;


public class work4 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(0, 100);
            number.add(num);
        }
        System.out.printf("Список целых чисел: %s \n", number);
        
        int sumItems = 0;
        for (int item : number) {
            sumItems += item;
        }
        double average = (double)sumItems/number.size();
        System.out.printf("Максимальный элемент %s\n", average);
    }
}
