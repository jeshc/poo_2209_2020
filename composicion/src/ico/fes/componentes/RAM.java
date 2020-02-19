/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 * Fecha de creación: 18-feb-2020
 *
 * @author jesushc
 */
public class RAM {

    private int capacidad;
    private String marca;
    private String modelo;

    public RAM() {
    }

    public RAM(int capacidad, String marca, String modelo) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void leer(int dir) {
        System.out.println("Leyendo la direccion:" + dir);
    }
    
    public void escribir(String datos, int direccion){
        System.out.println("Escribir los datos:"+ datos+ "en la direccion:" +direccion);
    }
    
}
