
public class Route {

    private String start_Address;
    private String destnion_Adress;
    private double trip_price;

    public Route(String start_Address, String destnion_Adress,  double trip_price) {
        this.start_Address = destnion_Adress;
        this.destnion_Adress = start_Address;
        this.trip_price = trip_price;
    }

    public String getStart_Address() {
        return start_Address;
    }

    public void setStart_Address(String start_Address) {
        this.start_Address = start_Address;
    }

    public String getDestnion_Adress() {
        return destnion_Adress;
    }

    public void setDestnion_Adress(String destnion_Adress) {
        this.destnion_Adress = destnion_Adress;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setPrice(double trip_price) {
        this.trip_price = trip_price;
    }
}
