/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesjava;

import ico.fes.poo.Calculadora;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeshc
 */
public class ExcepcionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 10;
        System.out.print("Ingresa un entero:");
        int y = teclado.nextInt();
        int z = 0;
        int w=0;
        System.out.println("Dividir enteros");
        
        try{
            z = x / y;
            w = 10 / Integer.parseInt("wtrwerewr");
        }
        catch( ArithmeticException e ){
            //JOptionPane.showMessageDialog(null, "No se prmite introducir el numero 0");
            System.out.println("No se permite introducir el numero 0");
            System.out.println("Info del error:" + e.toString());
            e.printStackTrace();
        }
        catch( NumberFormatException e){
            System.out.println("No es un string válido para un numero");
        }
        catch( Exception e){
            System.out.println("Todos los demas errores no identificados");
        }
        finally{
            // tareas de limpieza... 
            //z=-1;
            // desconexion a bd
            y = 0;
        }
        
        System.out.println("Resultado :" + z);
        System.out.println("W = " + w);
        System.out.println("Fin del programa...");
        System.out.println("Si se imprime esta linea, "
                + "quiere decir que todo salió bien");
        
        
        System.out.println("Ejemplo de calculadora");
        Calculadora calc = new Calculadora();
        calc.setOperando1(10.0f);
        calc.setOperando2(3.0f);
        
        try {
            calc.setOperador(5); // division
        } catch (Exception ex) {
            System.out.println("Error:"+ex.getMessage());
            ex.printStackTrace();
        }
        calc.calcular();

    }

}
