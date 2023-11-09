package gameNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(randomNumber.nextInt(10));
        }
        System.out.println("Данна последовадельность: " + list);
        System.out.println("Колличество очков: " + resultGame(list));
        System.out.println("Оставшиеся последовательность: " + list);
    }

    public static int resultGame(List<Integer> list) {
        int point = 0;
        for (int i = 0; i < list.size(); ) {
            if (i == list.size() - 1) {
                break;
            }
            if (list.get(i) == list.get(i + 1) || list.get(i) + list.get(i + 1) == 9) {
                list.remove(i);
                list.remove(i);
                point++;
                if (i != 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return point;
    }
}