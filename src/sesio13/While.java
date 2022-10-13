package sesio13;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int numero=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un numero");
        numero=sc.nextInt();
        if (numero>100);
        {
            System.out.println("introdujo un numero superior a 100");
        }
        while(numero<=100)
        {
            System.out.println(numero);
            numero++;
        }

    }
}
