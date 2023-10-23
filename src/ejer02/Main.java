package ejer02;

public class Main {

    public static void main(String[] args) {

        Carrera carrera = new Carrera();
        Thread caballo = new Thread(new Caballo(carrera));
        Thread perro = new Thread(new Perro(carrera));
        Thread liebre = new Thread(new Liebre(carrera));
        Thread tortuga = new Thread(new Tortuga(carrera));

        caballo.setPriority(10);
        perro.setPriority(6);
        liebre.setPriority(5);
        tortuga.setPriority(1);

        caballo.start();
        perro.start();
        liebre.start();
        tortuga.start();
        
        
        try {
            caballo.join();
            perro.join();
            liebre.join();
            tortuga.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("\n***** FINAL DE LA CARRERA.\n");

    }
}
