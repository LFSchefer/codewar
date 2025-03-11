package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greed {
    public static int greedy(int[] dice) {
        int score = 0;
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        List<Integer> trees = new ArrayList<>();
        List<Integer> fours = new ArrayList<>();
        List<Integer> fives = new ArrayList<>();
        List<Integer> sixes = new ArrayList<>();
        Arrays.stream(dice).forEach(d -> {
            switch (d) {
                case 1 -> ones.add(d);
                case 2 -> twos.add(d);
                case 3 -> trees.add(d);
                case 4 -> fours.add(d);
                case 5 -> fives.add(d);
                case 6 -> sixes.add(d);
                default -> {
                }
            }
        });
        while (ones.size() >= 3 || sixes.size() >= 3 || fives.size() >= 3 || fours.size() >= 3 || trees.size() >= 3 || twos.size() >= 3 || !ones.isEmpty() || !fives.isEmpty()) {

            if (ones.size() >= 3) {
                ones.remove(0);
                ones.remove(0);
                ones.remove(0);
                score += 1000;
            }
            if (sixes.size() >= 3) {
                sixes.remove(0);
                sixes.remove(0);
                sixes.remove(0);
                score += 600;
            }
            if (fives.size() >= 3) {
                fives.remove(0);
                fives.remove(0);
                fives.remove(0);
                score += 500;
            }
            if (fours.size() >= 3) {
                fours.remove(0);
                fours.remove(0);
                fours.remove(0);
                score += 400;
            }
            if (trees.size() >= 3) {
                trees.remove(0);
                trees.remove(0);
                trees.remove(0);
                score += 300;
            }
            if (twos.size() >= 3) {
                twos.remove(0);
                twos.remove(0);
                twos.remove(0);
                score += 200;
            }
            if (!ones.isEmpty()) {
                ones.remove(0);
                score += 100;
            }
            if (!fives.isEmpty()) {
                fives.remove(0);
                score += 50;
            }

        }
        return score;
    }
}