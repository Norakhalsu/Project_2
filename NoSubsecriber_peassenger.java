import java.util.InputMismatchException;

public class NoSubsecriber_peassenger extends Passenger{

    //gets a 10% discount on the trip cost if they have it.
    private boolean discount_coupon;

    public boolean isDiscount_Coupon() {
        return discount_coupon;
    }

    public void setDiscount_Coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    // constructers
    public NoSubsecriber_peassenger(String name, String id ,  boolean discount_coupon) {
        super(name, id);
        this.discount_coupon=discount_coupon;
    }

    // Methods
    @Override
    public void Revers_Method(Car car) {

        if (car.getMaximum_Capacity() == 0) {
            throw new InputMismatchException(" Maximum capacity of car is 0 ");
        }

        setReversed_Car_Object(car);
        if (discount_coupon){
            setTrip_Cost((car.getFixed_Route().getTrip_price())-car.getFixed_Route().getTrip_price()*0.1); //10%
            car.setMaxCapacity(car.getMaximum_Capacity()-1);
            System.out.println();
            System.out.println("Seats in the car, Remaining capacity: " + car.getMaximum_Capacity());
        }
        else{
            setTrip_Cost(car.getFixed_Route().getTrip_price());
        }
    }

    @Override
    public void display_info() {
        System.out.println(" Display information ");
        System.out.println("{ Name is: "+this.getName());
        System.out.println(" Id: "+getId());
        System.out.println(" Revers Car: "+getReversed_Car_Object().getCode());
        System.out.println(" Trip Cost: "+getTripCost() +" }");
    }



}
