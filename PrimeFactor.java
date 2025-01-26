import java.util.Scanner;

public class PrimeFactor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        int sumResult = 0;

        for (int i = 2; i <= n; i++) 
        {
            if (isPrime(i)) 
            {
                int count = 0;
                while (num % i == 0) 
                {
                    count++;
                    num /= i;
                }
                if (count > 0 && i < arr.length) 
                {
                    sumResult += count * arr[i];
                }
            }
        }

        System.out.println("The result is: " + sumResult);
    }

    public static boolean isPrime(int n) 
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
