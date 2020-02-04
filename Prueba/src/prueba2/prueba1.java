package prueba2;

import java.util.Scanner;

public class prueba1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "si";
        String frase1 = "no";
        System.out.println("introduce un número entero");
        String n = sc.nextLine();
        boolean bien;
        String s[] = n.split("");
        for (int i = 0; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            if (num % 2 == 0) {
                bien = true;

            } else {
                bien = false;
            }
        }
        if (false) {
            System.out.println(frase);
        }if(false) {
            System.out.println(frase1);
        }
        System.out.println("hola");
    }
}

