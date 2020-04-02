/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosintro;

import ico.fes.poo.Computadora;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jeshc
 */
public class ArreglosIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        System.out.println("Elem. 5=" + numeros[4]);

        System.out.println("--------------------------");
        for (int i = 0; i < numeros.length; i++) {
            int x = numeros[i];
            System.out.println(x);
        }
        numeros[0] = 2;
        numeros[1] = 1;
        numeros[2] = 11;
        numeros[3] = -9;
        numeros[4] = 2;
        numeros[5] = 1;
        numeros[6] = 11;
        numeros[7] = 90;
        numeros[8] = 101;
        numeros[9] = 2;

        System.out.println("--------------------------");
        for (int i = 0; i < numeros.length; i++) {
            int x = numeros[i];
            System.out.println(x);
        }
        
        float [] estaturas=new float[5];
        boolean [] flags = new boolean[10];
        flags[0]=true;
        flags[1]=false;
        
        System.out.println("++++++++ Arreglo de la clase Computadora ++++++");
        Computadora[] compus = new Computadora[3];
        
        Computadora c1=new Computadora();
        c1.setMarca("Lenovo");
        c1.setModelo("Z1234");
        c1.setPrecio(11000.0f);
        
        compus[0] = c1;
        compus[1] = new Computadora("HP", "Pavillion 2020", 15000.0f);
        compus[2] = new Computadora("Apple", "MacBook Air", 34500.0f);
        
        for (int i = 0; i < compus.length; i++) {
            Computadora x = compus[i];
            System.out.println("Computadora "+ i +":");
            System.out.println(x);
            //JOptionPane.showMessageDialog(null, x.toString());
        }
        
        System.out.println(" -------- Usando ArrayList ----------- ");
        ArrayList<Computadora> lista=new ArrayList();
        lista.add(new Computadora("Lenovo", "l2345", 11000.0f));
        lista.add( new Computadora("Hp", "Pavillion 2020", 15000.0f) );
        lista.add( new Computadora("Apple", "MacBook Air", 34500.0f));
        
        for (int i = 0; i < compus.length; i++) {
            Computadora x = compus[i];
            System.out.println(x);
        }
        
        
    }
}
