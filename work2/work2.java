package work2;
// 3) Найти максимальное значение

import java.util.ArrayList;
import java.util.Random;
//import static java.util.Collections.max;

public class work2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(0, 100);
            number.add(num);
        }
        System.out.printf("Список целых чисел: %s \n", number);
        //int max = max(number);
        int maxNum = number.get(0);
        for (int item : number) {
            if (item > maxNum) {
                maxNum = item;
            }
        }
        //System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxNum);
        
    }
}
