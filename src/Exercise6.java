import java.util.Arrays;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t[] = new int[10];

        for (int i = 0; i<10; i++){
            System.out.println("introduzca un número");
            t[i]= sc.nextInt();
        }

        for (int i = t.length - 1; i>=0; i--){
            System.out.println(t[i]);

        }
    }
}
