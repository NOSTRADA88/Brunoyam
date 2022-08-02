package lesson.seven;

import java.util.Random;
import java.util.Scanner;

public class Easy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(wayCounter(n));
    }
    public static int wayCounter(int n){
        int massive[][] = new int[n][n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massive[i][j] = r.nextInt(2);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (massive[i][j] != massive[j][i]) {
                        massive[i][j] = 0;
                    }
                }
            }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((massive[i][j] == massive[j][i]) && (massive[j][i] > 0) && (massive[i][j] > 0)){
                    count++;
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("");
//            for (int j = 0; j < n; j++) {
//                System.out.print(massive[i][j] + " ");
//                }
//            }
        return count;
    }
}
