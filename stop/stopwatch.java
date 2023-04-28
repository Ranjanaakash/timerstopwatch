import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalTime = 0;
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        if (n % 2 != 0) {
            System.out.println("still running");
        } else {
            for (int i = 0; i < n; i = i + 2) {

                totalTime = totalTime + (times[i + 1] - times[i]);
            }

            System.out.println(totalTime);
        }
    }
}