/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosrandom;

/**
 *
 * @author Diego
 */

import java.util.Scanner;
public class NumerosRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int semilla = 0;
        int veces = 0;
        int random = 0;
        int aux = 0;
        String aux2 = " ";
        String aux3 = " ";
        int aux4;
        char[] c;
        StringBuilder coso = new StringBuilder();
        System.out.println("Cuantos numeros random quieres?");
        veces = scan.nextInt();
        System.out.println("Da una semilla de 3 digitos");
        semilla = scan.nextInt();
        for (int i = 0; i < veces; i++) {
            aux = semilla * semilla;
            aux2 = Integer.toString(aux);
            c = aux2.toCharArray();
            aux4 = c.length / 2;            
                coso.append(c[aux4 - 1]);
                coso.append(c[aux4]);
                coso.append(c[aux4 + 1]);
            aux3 = coso.toString();
            random = Integer.parseInt(aux3);
            System.out.println((i + 1) + ". " + random);
            semilla = random;
            random = 0;
            aux = 0;
            coso.setLength(0);
                
        }
        
        
    }
    
}
