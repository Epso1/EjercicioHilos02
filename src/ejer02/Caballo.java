
package ejer02;

/**
 *
 * @author cesar
 */
public class Caballo implements Runnable{

    private Carrera carrera;
    private long metros = 1000;

    public Caballo(Carrera carrera) {
        this.carrera = carrera;
    }

    public String toString(){
       return "El caballo";
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i < metros; i++) {
            if(i == (metros-1)){
                System.out.println("*****El CABALLO ha llegado a meta.*****");
            }else{
                carrera.adelantaPosicion(this);
            }
        }
    }
    
}
