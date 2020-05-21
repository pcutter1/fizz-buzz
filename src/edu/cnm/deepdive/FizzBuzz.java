package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {

    for (int counter = 1; counter <= 100; counter++) {

      boolean counterIsFizz = (counter % 3 == 0);
      boolean counterIsBuzz = (counter % 5 == 0);

      if (counterIsFizz && counterIsBuzz) {
        System.out.println("Fizz Buzz");
      } else if (counterIsFizz) {
        System.out.println("Fizz");
      } else if (counterIsBuzz) {
        System.out.println("Buzz");
      } else {
        System.out.println(counter);
      }
    }
  }
}


