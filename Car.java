
public class Car {

    private String code;
    private Route fixed_Route;
    private int maximum_capacity_of_passenger_PerTrip;

    public Car(String code, Route fixed_Route, int max_capacity) {
        this.code = code;
        this.fixed_Route = fixed_Route;
        this.maximum_capacity_of_passenger_PerTrip = max_capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixed_Route() {
        return fixed_Route;
    }

    public void setFixed_Route(Route fixed_Route) {
        this.fixed_Route = fixed_Route;
    }

    public int getMaximum_Capacity() {
        return maximum_capacity_of_passenger_PerTrip;
    }

    public void setMaxCapacity(int max_capacity) {
        this.maximum_capacity_of_passenger_PerTrip = max_capacity;
    }
}
