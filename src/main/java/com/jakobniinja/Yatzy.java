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

  public int twos(int d, int d1, int d2, int d3, int d4) {

    int total = 0;

    if (d == 2) {
      total += 2;
    }
    if (d1 == 2) {
      total += 2;
    }
    if (d2 == 2) {
      total += 2;
    }
    if (d3 == 2) {
      total += 2;
    }

    if (d4 == 2) {
      total += 2;
    }

    return total;
  }

  public int threes(int d, int d1, int d2, int d3, int d4) {
    int total = 0;
    if (d == 3) {
      total += 3;
    }
    if (d1 == 3) {
      total += 3;
    }
    if (d2 == 3) {
      total += 3;
    }
    if (d3 == 3) {
      total += 3;
    }
    if (d4 == 3) {
      total += 3;
    }
    return total;
  }

  public int fours() {

    int sum = 0;
    for (int i = 0; i != 5; i++) {
      if (dices[i] == 4) {
        sum += 4;
      }
    }

    return sum;
  }

  public int fives() {
    int total = 0;

    for (int die : dices) {
      if (die == 5) {
        total += 5;
      }
    }

    return total;
  }

  public int sixes() {
    int total = 0;
    for (int die : dices) {
      if (die == 6) {
        total += 6;
      }
    }

    return total;
  }

  public int scorePair(int d, int d1, int d2, int d3, int d4) {
    int[] counts = countSameDice(d, d1, d2, d3, d4);

    int at;
    for (at = 0; at != 6; at++) {
      if (counts[6 - at - 1] >= 2) {
        return (6 - at) * 2;
      }
    }
    return 0;
  }

  public int scoreTwoPair(int d, int d1, int d2, int d3, int d4) {

    int[] counts = countSameDice(d, d1, d2, d3, d4);

    int n = 0;
    int score = 0;

    for (int i = 0; i < 6; i++) {
      if (counts[6 - i - 1] >= 2) {
        n++;
        score += (6 - i);
      }

    }
    if (n == 2) {
      return score * 2;
    }

    return 0;
  }

  public int fourOfAKind(int d, int d1, int d2, int d3, int d4) {
    int[] counts = countSameDice(d, d1, d2, d3, d4);

    for (int i = 0; i < 6; i++) {
      if (counts[i] >= 4) {
        return (i + 1) * 4;
      }
    }
    return 0;
  }

  public int[] countSameDice(int d, int d1, int d2, int d3, int d4) {
    int[] counts = new int[6];

    counts[d - 1]++;
    counts[d1 - 1]++;
    counts[d2 - 1]++;
    counts[d3 - 1]++;
    counts[d4 - 1]++;

    return counts;
  }

  public int smallStraight(int d, int d1, int d2, int d3, int d4) {
    int[] tallies;
    tallies = new int[6];

    tallies[d - 1] += 1;
    tallies[d1 - 1] += 1;
    tallies[d2 - 1] += 1;
    tallies[d3 - 1] += 1;
    tallies[d4 - 1] += 1;

    if (tallies[0] == 1 && tallies[1] == 1 && tallies[2] == 1 && tallies[3] == 1) {
      return 15;
    }

    return 0;
  }

}
