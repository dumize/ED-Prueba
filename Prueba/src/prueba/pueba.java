package prueba;

import java.util.Scanner;

public class pueba {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        int[] c = new int[casos];
        for (int i = 0; i < casos; i++) {
            String palabras = sc.nextLine();
            char[] p = palabras.toCharArray();
            char[] vocales = {'a', 'e', 'i', 'o', 'u'};
            int[] contar = new int[5];
            boolean verdadero = true;

            for (int j = 0; j < p.length; j++) {
                for (int k = 0; k < vocales.length; k++) {
                    if (p[j] == vocales[k]) {
                        contar[k]++;

                    }
                }
            }
            for (int j = 0; j < 5; j++) {
                if (contar[j] <= 0) {
                    verdadero = false;
                }
            }
            if (verdadero == true) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
        if (true) {
            System.out.println(frase);
        }if(false) {
            System.out.println(frase1);
        }
        System.out.println("hola");
    }
}