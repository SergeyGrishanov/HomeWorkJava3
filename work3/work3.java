package work3;
// 2) Найти минимальное значение

import java.util.ArrayList;
import java.util.Random;
// import static java.util.Collections.min;

public class work3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(0, 100);
            number.add(num);
        }
        System.out.printf("Список целых чисел: %s \n", number);
        //int mix = mix(number);
        int mixNum = number.get(0);
        for (int item : number) {
            if (item < mixNum) {
                mixNum = item;
            }
        }
        //System.out.printf("Максимальный элемент при помощи max %s\n", mix);
        System.out.printf("Максимальный элемент %s\n", mixNum);
        
    }
}
