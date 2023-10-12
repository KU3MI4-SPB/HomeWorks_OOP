package Home_Work_5.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;
    private Date date;

    private String name;

    public Reservation(Table table, Date date, String name, Reservation reservation) {
          
    }

    public Reservation(Date reservationDate, Table table2, String name2) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setTable(Table table) {
    }


    {
        id = ++counter;
    }


}
