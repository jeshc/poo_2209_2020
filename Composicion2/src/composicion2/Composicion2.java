/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2;

import ico.fes.organos.Cerebro;
import ico.fes.organos.Corazon;
import ico.fes.organos.Estomago;
import ico.fes.organos.Pulmon;

/**
 *
 * @author LABCOM2
 */
public class Composicion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuerpoHumano cuerpoJuan=new CuerpoHumano(1.56f, 68.9f, "Moreno claro", 
                new Pulmon(0.6f, "Obtener Oxigeno", true), new Pulmon(0.59f,
                        "Obtener Oxigeno ...", false), 
                new Corazon("Grande", "Bombear sangre", 80), 
                new Estomago("Grande", "Digeriri alimentos", 2.2f), 
                new Cerebro(0.8f, "Cognitiva", "Grande"));
        System.out.println(cuerpoJuan.toString());
        System.out.println("Pasan 6 meses y juan no deja de fumar...");
        cuerpoJuan.getPulmonDerecho().setSaludable(false);
        System.out.println(cuerpoJuan.toString());
        cuerpoJuan.setPeso(45.5f);
        System.out.println(cuerpoJuan.toString());
        
        
        
        
    }
    
}
