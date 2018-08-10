/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmult;

/**
 *
 * @author Aldo
 */
import java.util.Scanner;
        
public class ConMult {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int cons = 0;
    int modulo = 0;
    int raiz = 0;
    int aux = 0;
    int cant = 0;
        System.out.println("Cuantos numeros quieres?");
        cant = scan.nextInt();
        System.out.println("Da un numero constante");
        cons = scan.nextInt();
        System.out.println("Da una raiz");
        raiz = scan.nextInt();
        System.out.println("Da un modulo");
        modulo = scan.nextInt();
        for (int i = 0; i < cant; i++) {
            aux = (raiz + cons) % modulo;
            System.out.println((i + 1) + ". " + aux);
            raiz = aux;
        }
    }
    
}
