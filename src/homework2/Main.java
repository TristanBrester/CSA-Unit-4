package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");

    }

    public static void vowelCounter(String str) {
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;

        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("""
                Number of a's: %d
                Number of e's: %d
                Number of i's: %d
                Number of o's: %d
                Number of u's: %d
                """,aCount,eCount,iCount,oCount,uCount);
    }

    public static void palindromeChecker(String str) {
        boolean palindrome = true;
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--) {
            Character oppositeLetter = str.charAt(Math.abs(str.length() - i)-1);
            if(!Character.isLetter(str.charAt(i)) || !Character.isLetter(oppositeLetter)) {
                System.out.printf("Error: Invalid character detected in %s",str);
                palindrome = false;
                break;
            }
            if(str.charAt(i) != oppositeLetter) {
                System.out.printf("%s is not a palindrome",str);
                palindrome = false;
                break;
            }
        }
        if(palindrome) {
            System.out.printf("%s is a palindrome",str);
        }
    }
}