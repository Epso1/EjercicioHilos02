
package ejer02;


public class Tortuga implements Runnable{

    private Carrera carrera;
    private long metros = 1000;

    public Tortuga(Carrera carrera) {
        this.carrera = carrera;
    }
    
     public String toString(){
       return "La tortuga";
    }
    
    @Override
    public void run() {
        for (int i = 0; i < metros; i++) {
            if(i == (metros-1)){
                System.out.println("*****La TORTUGA ha llegado a meta.*****");
            }else{
                carrera.adelantaPosicion(this);
            }
        }
    }
    
}
