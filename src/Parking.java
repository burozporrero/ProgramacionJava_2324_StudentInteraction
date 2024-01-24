package ej_parking;

import java.util.Random;

public interface Parking {

    void aparcar();

   default void irse(){
       System.out.print(plazaAsignada() + " ");
   }

   default int plazaAsignada(){
       Random random = new Random();
       int plaza =  random.nextInt(100);
       return plaza;
   }
}
