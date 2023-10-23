
package ejer02;

public class Perro implements Runnable{
    private Carrera carrera;
    private int metros = 1000;

    public Perro(Carrera carrera) {
        this.carrera = carrera;
    }
     public String toString(){
       return "El perro";
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i < metros; i++) {
            if(i == (metros-1)){
                System.out.println("*****El PERRO ha llegado a meta.*****");
            }else{
                carrera.adelantaPosicion(this);
            }
        }
    }
}
