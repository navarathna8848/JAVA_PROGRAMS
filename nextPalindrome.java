import java.util.Scanner;

public class NextPalindrome
 {

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        int nextPalindrome = findNextPalindrome(num);
        
        System.out.println("Next palindrome after " + num + " is: " + nextPalindrome);
    }
    
    public static int findNextPalindrome(int num) 
    {
         int next = num + 1;
        
        while (!isPalindrome(next))
         {
            next++;
        }
        
        return next;
    }
    
    public static boolean isPalindrome(int num) 
    {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        
        return originalNum == reversedNum;
    }
}
