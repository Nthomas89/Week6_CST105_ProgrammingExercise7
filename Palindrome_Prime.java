/*
 * Program: Programming Exercise 7
 * File: Palindrome_Prime.java
 * Summary: Sorts through 100000 integers to find prime and palindrome numbers
 * Author: Nicholas thomas
 * Date: December 24, 2017
 * !This is my own work!
 */


public class Palindrome_Prime {
	
	// prints numbers found both Prime and Palindromic

	public static void main(String[] args) {
		String palindromicPrimes = "";
		int newLineCount = 0;

		for (int i = 1; i <= 10000; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				palindromicPrimes += Integer.toString(i) + "\t";
				newLineCount++;
			}
			if (newLineCount == 4) {
				palindromicPrimes += "\n";
				newLineCount = 0;
			}
		}

		System.out.println(palindromicPrimes);
	}

	// Returns true if the number is Prime
	public static boolean isPrime(int n) {
        
        if (n < 2) {
            return false;
        }
        
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0)
            return false;
 
        for (int i=3; i * i <= n; i += 2){ 
            if(n % i == 0)
                return false;
        }
        return true;    
    }

	// returns if the number is a palindrome
    public static boolean isPalindrome (int n) {
        int palindrome = n;
        int reverse = 0;
                
        while (palindrome != 0) {
            int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
            }
    return false;
    }
}
