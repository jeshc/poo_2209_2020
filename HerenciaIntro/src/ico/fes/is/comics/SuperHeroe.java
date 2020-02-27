/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.comics;

import ico.fes.is.Persona;

/**
 *
 * @author LABCOM2
 */
public class SuperHeroe extends Persona{
    private String poder;
    private String alias;

    public SuperHeroe() {
    }

    public SuperHeroe(String poder, String alias, String nombre, int edad, float altura) {
        super(nombre, edad, altura);
        this.poder = poder;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
    
    public int salvarVidas(){
        System.out.println(this.alias +" salvando vidas...");
        return 10;
    }

    @Override
    public String toString() {
        String res=super.toString();
        res = res +"Alias:"+this.alias+"\n";
        res = res + "Super poderes:"+this.poder;
        return res;
    }
    
    


    
    
    
    
    
}
