/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clases.abstractas;

/**
 *
 * @author jeshc
 */
public class Guitarra extends Instrumento{
    private int numeroCuerdas;

    public Guitarra() {
    }

    public Guitarra(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public Guitarra(int numeroCuerdas, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void afinar() {
        System.out.println("Presionando el traste 2 cuerda 6");
        System.out.println("Tocando cuerda 5");
        System.out.println("Ajustar hasta que ambas cuerdas suenen igual");
        System.out.println("Repetir operacions hasta a cuerda 1");
    }

    @Override
    public void tocar() {
        System.out.println("Tara.. Taraaa... La guitarra !!!");
    }    
}
