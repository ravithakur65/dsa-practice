package testI;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Reservation {
    String reservationId;
    //ReservationDetails details;
}

public class ReservationManager {

    //Stores all reservation objects
    List reservationList = new CopyOnWriteArrayList<>();

    //New reservation. Adds to the reserve List
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }


    public void cancelLastReservation() {
        reservationList.remove(reservationList.size()-1);
    }

    //New reservation. Adds to the reserve List
    public void cancelReservation(String reservationId)
    {
//        reservationList.stream().filter(id -> )
//        reservationList.remove(reservationId);

        Iterator it = reservationList.iterator();
        while(it.hasNext()){
            Reservation tempRev = (Reservation)it.next();
            if(tempRev.reservationId.equals(reservationId)){
                reservationList.remove(tempRev);
            }
        }

    }

}
