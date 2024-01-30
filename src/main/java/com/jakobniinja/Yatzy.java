package com.jakobniinja;

public class Yatzy {

    public Yatzy() {
        //
    }

    int[] dices;

    public Yatzy(int d0, int d1, int d2, int d3, int d4) {
        dices = new int[5];

        dices[0] = d0;
        dices[1] = d1;
        dices[2] = d2;
        dices[3] = d3;
        dices[4] = d4;
    }

    public static int yatzy(int... dice) {
        int[] counts = new int[6];

        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int i = 0; i != 6; i++) {
            if (counts[i] == 5) {
                return 50;
            }
        }

        return 0;
    }

    public int getDices() {
        return dices.length;
    }

    public int chance(int d0, int d1, int d2, int d3, int d4) {
        int total = 0;
        total += d0;
        total += d1;
        total += d2;
        total += d3;
        total += d4;

        return total;
    }


    public static int ones(int d, int d1, int d2, int d3, int d4) {
        int total = 0;
        if (d == 1) {
            total++;
        }
        if (d1 == 1) {
            total++;
        }
        if (d2 == 1) {
            total++;
        }
        if (d3 == 1) {
            total++;
        }
        if (d4 == 1) {
            total++;
        }

        return total;
    }
}
