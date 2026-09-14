package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) { ArrayList<Integer> factors = new ArrayList<Integer>();


    if ( n <= 1) {
        return factors;
  }

  int factor = 2;

  while ( n > 1) {
      if ( n % factor == 0) {
        factors.add(factor);
        n = n / factor;
      }
    else {
          factor = factor + 1;
      }
   }

    return factors;
  }
}