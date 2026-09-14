package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class FactorizerTest {

  @Test
  void testZero() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();

    assertEquals(expected , factorizer.primeFactors(0));

  }

  @Test
  void testOne() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();

    assertEquals(expected , factorizer.primeFactors(1));

  }

  @Test
  void testNegativeNumber() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();

    assertEquals(expected , factorizer.primeFactors(-10));

  }

  @Test
  void testTwo() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);

    assertEquals(expected , factorizer.primeFactors(2));

  }

  @Test

  void testFour() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(2);

    assertEquals(expected , factorizer.primeFactors(4));

  }

  @Test

  void testTwelve() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(2);
    expected.add(3);

    assertEquals(expected , factorizer.primeFactors(12));

  }

  @Test

  void testEighteen() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(3);
    expected.add(3);

    assertEquals(expected , factorizer.primeFactors(18));

  }

  @Test

  void testPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(97);

    assertEquals(expected , factorizer.primeFactors(97));

  }

}