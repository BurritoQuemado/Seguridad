package mediomodif;

import java.util.Scanner;

public class mediomod {

    int raiz1;
    int cons;
    int n;
    int aux;
    String p1;
    String p2;
    String fin;
    char[] acara;

    Scanner tec = new Scanner(System.in);

    public void funcion() {
        System.out.println("ingresa la primera raiz");
        raiz1 = tec.nextInt();
        System.out.println("ingresa un numero aca bien mamalon");
        cons = tec.nextInt();
        System.out.println("cuantos numeros quieres?");
        n = tec.nextInt();
        for (int i = 0; i < n; i++) {

            aux = raiz1 * cons;
            String x = Integer.toString(aux);
            acara = x.toCharArray();

            int a = acara.length / 2;
            int b = (acara.length / 2) - 1;

            p1 = String.valueOf(acara[b]);
            p2 = String.valueOf(acara[a]);
            fin = p1 + p2;
            System.out.println((i + 1) + ". " +fin);
            raiz1 = Integer.parseInt(fin);

        }
    }
}
