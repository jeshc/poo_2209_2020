# Repositorio POO 2209

Repositorio para compartir código

package ico.fes.poo;

/**
 *
 * @author Leo
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
     public void mostrarHora () {
         System.out.println (this.hora + ":" + this.minuto + ":" + this.segundo ":");  
         }
 
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Reloj wacho = new Reloj (12,37,44);
        wacho.mostrarHora();
   
       
       
       
       
       int horas=12, minutos=37,segundos=45;
       
        while (true){
            if(horas <10){
                System.out.print("0");  
               
            }
            System.out.print(horas+":");
           
            if (minutos<10){
                System.out.print("0");
            }
            System.out.print(minutos+":");
           
            if(segundos <10){
                System.out.print("0");  
               
            }
            System.out.println(segundos);
       
            segundos++;
           
            if(segundos==60){
                segundos=0;
                minutos++;
                if(minutos==60){
                    minutos=0;
                    horas++;
                    if(horas==24){
                      horas=0;  
                    }
                           
                }
               
            }
       
       
        }  
       
    }
   
    }
  
