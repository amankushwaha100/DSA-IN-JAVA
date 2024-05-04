/**
 * Write a program to find the sum of the given series 1+2+3+ . . . . . .(N
 * terms)
 * Example 1:
 * Input:
 * N = 1
 * Output: 1
 * Explanation: For n = 1, sum will be 1
 */
public class Sum_of_Series {
  public static long seriesSum(int n) {
    long m = 1 * n;
    return (m * (m + 1)) / 2;
  }

  public static void main(String[] args) {
    System.out.println(seriesSum(5));
  }
}

/*
 * This is my first program of gfg platform or other platform , In this question
 * I learn about long keyword The long keyword is a data type that can store whole numbers from -9223372036854775808 to 9223372036854775808.
 * and I am using simple method which is failed for large input. 
 */