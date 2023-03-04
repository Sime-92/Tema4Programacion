import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        final char []LETRAS = {'T','R','W','A','G','M','Y', 'F',
        'P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        Scanner sc = new Scanner(System.in);
        int dni;
        System.out.println("introduzca su DNI número a número sin letra");
        dni= sc.nextInt();
        System.out.println("La letra es: " + LETRAS[dni % 23]);

    }
}
