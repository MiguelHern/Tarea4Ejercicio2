/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4ejercicio2;
import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Tarea4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println("Digite un número");
        int n = 0;
        int media=0;
        for(int i = 0;i<numero;i++){
        n=n+i;
        }
        media =n/numero;
        System.out.println("La media del número es "+ media);
        
    }
    
}
