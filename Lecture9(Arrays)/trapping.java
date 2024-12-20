import java.util.*;

public class Trapping {
    public static int rain(int height[]) {
        int n = height.length;

        // Edge case: if the array is empty or has only one element, no water can be trapped
        if (n <= 1) return 0;

        // Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Number of elements must be greater than 0.");
            sc.close();
            return;
        }

        int height[] = new int[n];
        System.out.println("Enter the heights of the bars:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Trapped water: " + rain(height));

        sc.close(); // Close the scanner
    }
}
