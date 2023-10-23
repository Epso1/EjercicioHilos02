package ejer02;

import java.util.Random;

public class Carrera {

    public Carrera() {
       
    }

    public synchronized void adelantaPosicion(Runnable animalName) {
        Random r = new Random();
        int randomNumber = r.ints(0, 11).findFirst().getAsInt();

        if (animalName.toString().equalsIgnoreCase("La tortuga")
                && randomNumber == 10) {
            try {
                System.out.println(animalName + " ha resbalado.");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else if (animalName.toString().equalsIgnoreCase("La liebre")
                && randomNumber >= 9) {
            try {
                System.out.println(animalName + " ha resbalado.");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else if (animalName.toString().equalsIgnoreCase("El perro")
                && randomNumber >= 8) {
            try {
                System.out.println(animalName + " ha resbalado.");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else if (animalName.toString().equalsIgnoreCase("El caballo")
                && randomNumber >= 7) {
            try {
                System.out.println(animalName + " ha resbalado.");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else {
            if (animalName.toString().equalsIgnoreCase("La tortuga")) {
                System.out.println("La TORTUGA ha adelantado.");
                notifyAll();
            } else if (animalName.toString().equalsIgnoreCase("La liebre")) {
                System.out.println("La LIEBRE ha adelantado.");
                notifyAll();
            } else if (animalName.toString().equalsIgnoreCase("El perro")) {
                System.out.println("El PERRO ha adelantado.");
                notifyAll();
            } else if (animalName.toString().equalsIgnoreCase("El caballo")) {
                System.out.println("El CABALLO ha adelantado.");
                notifyAll();
            } else {
                System.out.println("El animal no existe.");
                notifyAll();
            }
        }
    }
}
