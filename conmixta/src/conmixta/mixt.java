package conmixta;

import java.util.Scanner;

public class mixt {

    int raiz;
    int cons;
    int mult;
    int mod;
    int n;
    int aux;

    Scanner tec = new Scanner(System.in);

    public void funcion() {
        System.out.println("ingresa la raiz");
        raiz = tec.nextInt();
        System.out.println("ingresa un numero chido(constante)");
        cons = tec.nextInt();
        System.out.println("ingresa otro numero chido(multiplicador)");
        mult = tec.nextInt();
        System.out.println("ingresa el modulo");
        mod = tec.nextInt();
        System.out.println("cuantos numeros quieres?");
        n = tec.nextInt();
        for (int i = 0; i < n; i++) {

            aux = ((mult * raiz) + cons) % mod;

            System.out.println((i + 1) + ". " +aux);
            raiz = aux;

        }

    }
}
