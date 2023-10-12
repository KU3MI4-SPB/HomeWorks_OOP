package Home_Work_5.presenters;

import Home_Work_5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    private Collection<Table> loadTables(){
        return model.loadTables();
    }

    /**
     * Отобразить список столиков
     */
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    /**
     * Отобразить результат бронирования столика
     * @param reservationNo номер бронирования
     */
    public void updateUIShowReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    public void updateUIShowshowСhangeReservationTable(int reservationNo, int numberTable) {
        view.showСhangeReservationTable(reservationNo, numberTable);
    }
    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationTableResult(-1);
        }
    }

    @Override
    public void onUpdateReservetionTable(int oldReservation, Date reservationDate, int tableNumber,
            String nameClients) {
        try {
            int newReservationNumber = model.changeReservationTable(oldReservation, reservationDate, tableNumber,
                    nameClients);
            updateUIShowshowСhangeReservationTable(newReservationNumber, tableNumber);
        } catch (RuntimeException e) {
            updateUIShowshowСhangeReservationTable(-1, -1);
        }

    }

}
