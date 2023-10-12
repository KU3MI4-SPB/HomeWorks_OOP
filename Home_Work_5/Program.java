package Home_Work_5;

import Home_Work_5.models.TableModel;
import Home_Work_5.presenters.BookingPresenter;
import Home_Work_5.presenters.Model;
import Home_Work_5.presenters.View;
import Home_Work_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Станислав");
        view.changeReservationTable(1001, new Date(), 3, "Станислав");
    }

}
