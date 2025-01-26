import java.util.Scanner;

class NextPalindromeFinder {
    public static void main(String[] args) {
        System.out.println("Enter the number you want: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int nextPalindrome = findNextPalindrome(num);
        System.out.println("The next palindrome number is " + nextPalindrome);
    }

    public static int findNextPalindrome(int num) {
        while (true) {
            num++;
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int last = temp % 10;
                rev = (rev * 10) + last;
                temp = temp / 10;
            }

            if (rev == num) {
                return num;
            }
        }
    }
}
