import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner th = new Scanner(System.in);
        int n = th.nextInt();
        int x[] = new int[n];
        int max = 0,pro1=0,pro2=0;
        for (int i = 0; i < n; i++) {
            x[i] = th.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        pro1=x[n-1]-1;
        pro2=x[n-2]-1;
        System.out.print("Maximum product of two elements in an array is "+pro1*pro2);
    }
}
