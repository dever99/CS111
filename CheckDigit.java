package test;
import java.util.*; 
public class CheckDigit {
    public static void main(String[] args) {
        long num = 9780470454310L;
        int leftSum = 0;
        int rightSum = 0;
        long temp =  num;
        int counter = 0;
        long digit = 0;
        while (num > 0) {
            num = num / 10;
            counter++;

        }
        while (temp > 0) {
            digit = temp % 10;
            counter--;

            if (counter % 2 != 0) {
                rightSum += digit;
            } else {
                leftSum += digit;
            }
            System.out.println("at pos " + counter + "the digit is " + digit);
            temp = temp / 10;
        }
        System.out.println("left sum total: " + leftSum);
        System.out.println("right sum total: " + rightSum);
        int lSum1 = leftSum % 10;
        System.out.println(lSum1);
        int rSum1 = rightSum % 10;
        System.out.println(rSum1);
        int rSum2 = rSum1 * 3;
        System.out.println(rSum2);
        int rSum3 = rSum2 % 10;
        System.out.println(rSum3);
        int finSum = (lSum1 + rSum3)%10;
        System.out.println(finSum);
    }
}