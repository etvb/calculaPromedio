/*
 Ejercicio 7: Pedir Números hasta que se introduzca uno negativo y calcular 
 la media.
 */
package pats.pkg33.pkg7.calcularmedia;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS337CalcularMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 0, contador = 0, suma = 0;
        float promedio;
        
        do{
           suma += numero;
           numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
           contador ++;
        }while(numero > 0);
        
        promedio = suma / (contador - 1); //-1 Por que entra el do while toma uno de mas al momento que entra.
        
        JOptionPane.showMessageDialog(null, "El Promedio es: " + promedio);
        
        
    }
    
}
