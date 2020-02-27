/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaintro;

import ico.fes.is.comics.SuperHeroe;

/**
 *
 * @author LABCOM2
 */
public class HerenciaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperHeroe flash=new SuperHeroe();
        flash.setNombre("Barry Allen");
        flash.setEdad(24);
        flash.setAltura(1.80f);
        flash.setAlias("Flash");
        flash.setPoder("Super velocidad y comer mucho");
        System.out.println(flash);
        flash.caminar();
        flash.salvarVidas();
        
        SuperHeroe spiderMan=new SuperHeroe("Sentido arácnido, trepa paredes,"
                + " agilidad y super fuerza", "Amazing Spider-Man",
                "Peter Parker", 15, 1.78f);
        System.out.println(spiderMan);
        
        
    }
    
}
