package Model.entities;
import java.sql.Time;
import java.text.SimpleDateFormat;
import  java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation (Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckIn() {
        return checkIn; }

        public Date getCheckOut() {
        return checkOut;}

        // calcula a duracao em dias entre o check-in e o check-out, ele calcula em milissegundos e converte para dias
        public long duration() {
            long diff = checkOut.getTime() - checkIn.getTime();
            return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        }

        public void updateDates(Date checkIn, Date checkOut) {
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }
        // subEscreve a string de saida do objeto reserva
        @Override
        public String toString() {
            return "Room " + roomNumber
            + ", check-in: " + checkIn
            + ", check-out: " + checkOut
                    + sdf.format(checkIn) +
                    ", check-out: " + sdf.format(checkOut) +
                    ", " + duration() + " nights";



}}

