package entities;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reservation {
    public Integer roomNumber;
    public Date checkIn;
    public Date checkOut;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return this.checkIn;
    }

    public Date getCheckOut() {
        return this.checkOut;
    }

    public void update(Date checkIn, Date checkOut){
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new IllegalArgumentException("erro na reserva");
        }if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Data invalida(Data do check-in deve ser antes do check-out)");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "Reserva: " +
            "Numero do Quarto: " + getRoomNumber() + ", " +
            "CheckIn: " + sdf.format(getCheckIn()) + ", " +
            "CheckOut: " + sdf.format(getCheckOut()) + ", " +
            "Duracao da estadia: " + duration() + ", " +
            "Noites";
    }

}
