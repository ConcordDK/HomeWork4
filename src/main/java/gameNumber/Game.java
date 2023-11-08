package gameNumber;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(2);
        System.out.println("Данна последовадельность: "+list);
        System.out.println("Колличество очков: "+resultGame(list));
        System.out.println("Оставшиеся последовательность: "+list);
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