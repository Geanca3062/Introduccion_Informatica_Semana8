/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana8;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Semana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int edad[] = new int[3];
        int Total = 0;
        for (int i = 0; i < edad.length; i++) {
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        }
        for (int i = 0; i < edad.length; i++) {
            JOptionPane.showMessageDialog(null, "La edad #" + (i+1) + " es: " + edad[i]);
        }
        
        
        int Tam = Integer.parseInt(JOptionPane.showInputDialog("Datos a ingresar: "));
        String Array[] = new String[Tam];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = JOptionPane.showInputDialog("Digite algo: ");
        }
        for (int i = 0; i < Array.length; i++) {
            JOptionPane.showMessageDialog(null, "El dato #" + (i+1) + " es: " + Array[i]);
        }
        String Dato = JOptionPane.showInputDialog("Dato a buscar: ");
        boolean existe = false;
        for (int i = 0; i < Array.length; i++) {
            if (Dato.equals(Array[i])){
                JOptionPane.showMessageDialog(null, "El dato se encontro en la posicion " + (i+1));
                existe = true;
            }else{
                if (i ==  (Array.length - 1) && existe == false){
                    JOptionPane.showMessageDialog(null, "No se encontro " + Dato);
                }
            }
        }
         */

        int matriz[][] = new int[10][10];
        String show = "";
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int)Math.round(Math.random()*9);
                show += matriz[x][y] + " ";
                
            }
            show += "\n";
        }
        JOptionPane.showMessageDialog(null, show);
    }

}
