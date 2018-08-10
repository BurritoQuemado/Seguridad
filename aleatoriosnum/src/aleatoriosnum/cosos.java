package aleatoriosnum;

import java.util.Scanner;

public class cosos {

    int raiz;
    int n;
    int aux;
    char[] acara;

    String fin;
    String p1;
    String p2;
    String p3;
    String p4;
    Scanner scan = new Scanner(System.in);

    public void funcion() {

        System.out.println("Da un numero(raiz)");
        raiz = scan.nextInt();
        System.out.println("cuantos numeros quieres?");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {

            aux = (int) Math.pow(raiz, 2);
            String x = Integer.toString(aux);
            acara = x.toCharArray();

            int a = acara.length / 2;
            int b = (acara.length / 2) + 1;
            int c = (acara.length / 2) - 1;
            int d = (acara.length / 2) - 2;

            p1 = String.valueOf(acara[d]);
            p2 = String.valueOf(acara[c]);
            p3 = String.valueOf(acara[a]);
            p4 = String.valueOf(acara[b]);

            fin = p1 + p2 + p3 + p4;
            System.out.println((i + 1) + ". " +fin);
            raiz = Integer.parseInt(fin);
        }
    }
}
