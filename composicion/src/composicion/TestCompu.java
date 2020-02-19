/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.componentes.CPU;
import ico.fes.equipo.Computadora;

/**
 *
 * @author jesushc
 */
public class TestCompu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora compu1= new Computadora();
        compu1.setMarca("HP");
        compu1.setProcesador(new CPU(2.3f,"Intel","i7"));
        
        // Cambiar la velocidad del procesador
        compu1.getProcesador().setVelocidad(3.1f);
        System.out.println("Velocidad del procesador:"+compu1.getProcesador().getVelocidad());
    }
    
}
