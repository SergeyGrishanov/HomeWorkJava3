// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class work1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(0, 100);
            number.add(num);
        }
        System.out.printf("Список целых чисел: %s \n", number);
        int i = 0;
        while (i < number.size()) {
            if (number.get(i) % 2 == 0) {
                number.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами: %s", number);
        
    }
}
