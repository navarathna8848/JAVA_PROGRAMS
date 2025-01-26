import java.util.Scanner;
class Panagram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string you want to check: ");
        String word = sc.nextLine().toLowerCase();  // Use nextLine() and convert to lowercase

        boolean isPangram = true;

        for (char character = 'a'; character <= 'z'; character++) {
            if (word.indexOf(character) <0) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("is a pangram");
        } else {
            System.out.println("is not a pangram");
        }
    }
}