/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CECyT9
 */
public class NewClass {
    public static void main(String[]args){
        int al=0;
        String num="10011011";
        String aux;
        int par=128;
                 for(int i=0;i<8;i++){
                        aux=num.substring(i,i+1);
                        if(aux.equalsIgnoreCase("1")){
                            al=al+par;
                        }
                        par=par/2;
                }
                System.out.println(al);
    }
}
