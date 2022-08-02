package lesson.six;

import java.util.Scanner;

public class Easy6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter massive a size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Massive element #" + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter massive b size: ");
        int k = sc.nextInt();
        int[] b = new int[k];
        for (int i = 0; i < b.length; i++) {
            System.out.print("Massive element #" + (i+1) + ": ");
            b[i] = sc.nextInt();
            seeBcontainsInA(a, b[i]);
        }
    }
    public static void seeBcontainsInA(int[] a, int elementFromB) {
        boolean needIteration = true;
        int indexFirst = 0;
        int indexLast = a.length - 1;
        int indexMiddle = 0;
        while (needIteration) {
            if (indexLast < indexFirst) {
                System.out.println("NO");
                needIteration = false;
            } else {
                indexMiddle = (indexFirst + indexLast) / 2;
            }
            if (a[indexMiddle] > elementFromB) {
                indexLast = indexMiddle - 1;
            } else if(a[indexMiddle] < elementFromB) {
                indexFirst = indexMiddle + 1;
            } else {
                System.out.println("YES");
                needIteration = false;
            }
        }

    }
}
