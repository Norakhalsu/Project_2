
public abstract class Passenger {

    private String name;
    private String id;
    private double trip_Cost;
    private Car reversed_Car_Object;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
//        this.tripCost = tripCost;
//        this.reversCar = reversCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTripCost() {
        return trip_Cost;
    }

    public void setTrip_Cost(double trip_Cost) {
        this.trip_Cost = trip_Cost;
    }

    public Car getReversed_Car_Object() {
        return reversed_Car_Object;
    }

    public void setReversed_Car_Object(Car reversed_Car_Object) {
        this.reversed_Car_Object = reversed_Car_Object;
    }

    //abstract function that takes a car object to reserve it to the passenger
    public abstract void Revers_Method(Car car);
    public abstract void display_info();
}
