package com.jakobniinja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class YatzyTest {

  private Yatzy yatzy;

  @Before
  public void setUp() {
    yatzy = new Yatzy(1, 2, 3, 4, 5);
  }

  @Test
  public void onNoArgs() {
    assertNotNull(new Yatzy());
  }


  @Test
  public void on5ArgsConstructor() {
    assertNotNull(new Yatzy(3, 2, 1, 1, 5));
  }

  @Test
  public void onGameStartDiceIsOfLength5() {
    Yatzy yatzy = new Yatzy(3, 4, 5, 6, 4);

    assertEquals(5, yatzy.getDices());
  }

  @Test
  public void onFirstDiceIsOne() {
    assertEquals(1, yatzy.dices[0]);
  }

  @Test
  public void onSecondDiceIsTwo() {
    assertEquals(2, yatzy.dices[1]);
  }

  @Test
  public void onThirdDiceIsThree() {
    assertEquals(3, yatzy.dices[2]);
  }

  @Test
  public void onFourthDiceIsFour() {
    assertEquals(4, yatzy.dices[3]);
  }

  @Test
  public void onLastDiceIsFive() {
    assertEquals(5, yatzy.dices[4]);
  }

  @Test
  public void onChance() {
    assertEquals(0, yatzy.chance(0, 0, 0, 0, 0));
  }

  @Test
  public void onFirstDiceChance() {
    assertEquals(1, yatzy.chance(1, 0, 0, 0, 0));
  }

  @Test
  public void onSecondDiceChance() {
    assertEquals(3, yatzy.chance(1, 2, 0, 0, 0));
  }

  @Test
  public void onThirdDiceChance() {
    assertEquals(6, yatzy.chance(1, 2, 3, 0, 0));
  }

  @Test
  public void onForthDiceChance() {
    assertEquals(10, yatzy.chance(1, 2, 3, 4, 0));
  }

  @Test
  public void onLastDiceChance() {
    assertEquals(15, yatzy.chance(1, 2, 3, 4, 5));
  }

  @Test
  public void onYatzyScores0() {
    assertEquals(0, Yatzy.yatzy(6, 6, 6, 6, 1));
  }

  @Test
  public void onYatzyScores50() {
    assertEquals(50, Yatzy.yatzy(6, 6, 6, 6, 6));
  }

  @Test
  public void onYatzyCountOnesIsZero() {
    assertEquals(0, yatzy.ones(2, 2, 3, 4, 5));
  }

  @Test
  public void onYatzyCountOnesFoundOne() {
    assertEquals(1, yatzy.ones(1, 2, 3, 4, 5));
  }


  @Test
  public void onYatzyCountOnesFoundTwo() {
    assertEquals(2, yatzy.ones(1, 1, 3, 4, 5));
  }

  @Test
  public void onYatzyCountOnesFoundThree() {
    assertEquals(3, yatzy.ones(1, 1, 1, 4, 5));
  }


  @Test
  public void onYatzyCountOnesFoundFour() {
    assertEquals(4, yatzy.ones(1, 1, 1, 1, 5));
  }

  @Test
  public void onYatzyCountOnesFoundFive() {
    assertEquals(5, yatzy.ones(1, 1, 1, 1, 1));
  }

  @Test
  public void onYatzyCountTwosFoundOne() {
    assertEquals(2, yatzy.twos(2, 3, 3, 3, 3));
  }

  @Test
  public void onYatzyCountTwosFoundTwo() {
    assertEquals(4, yatzy.twos(2, 2, 3, 3, 3));
  }

  @Test
  public void onYatzyCountTwosFoundThree() {
    assertEquals(6, yatzy.twos(2, 2, 2, 3, 3));
  }

  @Test
  public void onYatzyCountTwosFoundFour() {
    assertEquals(8, yatzy.twos(2, 2, 2, 2, 3));
  }

  @Test
  public void onYatzyCountTwosFoundFive() {
    assertEquals(10, yatzy.twos(2, 2, 2, 2, 2));
  }

  @Test
  public void onYatzyCountThreesFoundZero() {
    assertEquals(0, yatzy.threes(1, 2, 2, 4, 5));
  }

  @Test
  public void onYatzyCountThreesFoundOne() {
    assertEquals(3, yatzy.threes(3, 2, 2, 4, 5));
  }

  @Test
  public void onYatzyCountThreesFoundTwo() {
    assertEquals(6, yatzy.threes(3, 3, 2, 4, 5));
  }

  @Test
  public void onYatzyCountThreesFoundThree() {
    assertEquals(9, yatzy.threes(3, 3, 3, 4, 5));
  }

  @Test
  public void onYatzyCountThreesFoundFour() {
    assertEquals(12, yatzy.threes(3, 3, 3, 3, 5));
  }

  @Test
  public void onYatzyCountThreesFoundFive() {
    assertEquals(15, yatzy.threes(3, 3, 3, 3, 3));
  }

  @Test
  public void onNoFoursSumIsZero() {
    yatzy = new Yatzy(1, 2, 3, 3, 5);
    assertEquals(0, yatzy.fours());
  }
}
