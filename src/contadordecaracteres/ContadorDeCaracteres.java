/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordecaracteres;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ContadorDeCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char [] Captura;
        String Texto ;
        Texto=JOptionPane.showInputDialog(null, "Por favor ingrese un texto con caracteres ");
        int Contador=0;
        Captura=Texto.toCharArray();
        for (int i = 0; i < Captura.length; i++)
        {
            System.out.println(Captura[i]);
            if(Captura[i]=='(')
            {
                Contador=Contador+1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El caracter ( se encuentra repetido estas veces:"+Contador);
        
    }
    
}
