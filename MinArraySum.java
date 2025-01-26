import java.util.Scanner;

public class MinArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: size of the array
        int N = scanner.nextInt();
        
        // Input: the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Perform the operations to minimize the sum
        for (int i = 0; i < N - 1; i++) {
            int avg = (arr[i] + arr[i + 1]) / 2;
            
            // Set arr[i] to 0 if it's less than the average
            if (arr[i] < avg) {
                arr[i] = 0;
            }
        }
        
        // Calculate the final sum of the array
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        
        // Output: the minimum possible sum
        System.out.println(sum);
        
        scanner.close();
    }
}
