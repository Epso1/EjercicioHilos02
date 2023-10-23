
package ejer02;


public class Liebre implements Runnable{

    private Carrera carrera;
    private long metros = 1000;

    public Liebre(Carrera carrera) {
        this.carrera = carrera;
    }
     public String toString(){
       return "La liebre";
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i < metros; i++) {
            if(i == (metros-1)){
                System.out.println("*****La LIEBRE ha llegado a meta.*****");
            }else{
                carrera.adelantaPosicion(this);
            }
        }
    }
    
}
