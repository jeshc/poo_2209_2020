/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.instrumentos;

/**
 *
 * @author LABCOM2
 */
public class Piano implements Instrumento{
    private int tipoInstrumento;

    public Piano() {
    }

    public Piano(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    @Override
    public boolean afinar() {
      boolean afinado = false;
        System.out.println("Afinando tecla 1, tensionando cuerda 1");
        System.out.println("Comparando sonido con el aparato de afinación");
        System.out.println("Repetir procedieminto hasta la tecla N");
        afinado = true;
      return afinado;
    }

    @Override
    public String emitirSonido() {
        String sonido = "";
        sonido = "Tocar forte!!! blon blonnnn!!!";
        return sonido;
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando teblado");
        System.out.println("Limpiando cuerpo");
    }
    
    
    
    
}
