package sesio13;

import java.util.Scanner;

public class ForIncrementalDecremental {
    public static void main(String[] args) {
        int NUM = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        NUM = sc.nextInt();

        for (int b = 0; b <= NUM; b++) {
            System.out.println(b);
        }
        for (int c=NUM;c>=0;c--)
        {
            System.out.println(c);
        }
    }
}
