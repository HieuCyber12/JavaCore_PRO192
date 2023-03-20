
import java.util.Scanner;

public class ReservationCode {
   

    private String customerName;
    private String reservationCode;

    public ReservationCode() {
    }
    
    public ReservationCode(String customerName, String reservationCode) {
        this.customerName = customerName;
        this.reservationCode = reservationCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public String getCode() {
        String pattern = "(.{3})";
        return reservationCode.replaceAll(pattern, "$1-").replaceAll("-$", "");
    }

    @Override
    public String toString() {
        return String.format("%s     %s", customerName,reservationCode);
    }

 
   

}
