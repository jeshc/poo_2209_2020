/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ico.fes.equipo;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.RAM;

/**
 * Fecha de creación: 18-feb-2020
 * @author jesushc
 */
public class Computadora {
    private String marca;
    private String modelo;
    private String color;
    private CPU procesador;
    private RAM memoria;
    private Monitor mon1;
    private Monitor mon2;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String color, CPU procesador, RAM memoria, Monitor mon1, Monitor mon2) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.procesador = procesador;
        this.memoria = memoria;
        this.mon1 = mon1;
        this.mon2 = mon2;
    }


    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    public void encender(){
        System.out.println("Encnendiendo la computadora marca:"+this.marca);
    }
    
    public void apagar(){
        System.out.println("Apagando la computadora marca:"+this.marca);
    }

    public CPU getProcesador() {
        return procesador;
    }

    public void setProcesador(CPU procesador) {
        this.procesador = procesador;
    }

    public RAM getMemoria() {
        return memoria;
    }

    public void setMemoria(RAM memoria) {
        this.memoria = memoria;
    }

    public Monitor getMon1() {
        return mon1;
    }

    public void setMon1(Monitor mon1) {
        this.mon1 = mon1;
    }

    public Monitor getMon2() {
        return mon2;
    }

    public void setMon2(Monitor mon2) {
        this.mon2 = mon2;
    }

}
