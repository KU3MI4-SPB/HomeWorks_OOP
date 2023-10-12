package Home_Work_5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onUpdateReservetionTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);
}
