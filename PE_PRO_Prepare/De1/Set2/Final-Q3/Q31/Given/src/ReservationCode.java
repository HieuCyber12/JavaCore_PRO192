public class ReservationCode {
    
     private String customerName;
    private String reservationCode;

    public ReservationCode(String customerName, String reservationCode) {
        this.customerName = customerName;
        this.reservationCode = reservationCode;
    }

    public ReservationCode() {
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
        StringBuilder builder = new StringBuilder();
        for (char c : reservationCode.toCharArray()) {
            if (Character.isLetter(c)) {
                char newChar = (char) (c + 1);
                if ((c >= 'a' && c <= 'z' && newChar > 'z') || (c >= 'A' && c <= 'Z' && newChar > 'Z')) {
                    newChar -= 26;
                }
                builder.append(newChar);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
    
    /*add and complete your other methods here (if needed)*/
    
}
