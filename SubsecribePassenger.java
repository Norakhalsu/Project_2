import java.util.InputMismatchException;

public class SubsecribePassenger extends Passenger{

    //  50% discount on trip cost when they reserve a car .
    public SubsecribePassenger(String name, String id) {
        super(name, id);
    }

    @Override
    public void Revers_Method(Car car) throws InputMismatchException {
        //take 50% discount on trip cost when they reserve a car .
         if (car.getMaximum_Capacity() == 0){
             throw new InputMismatchException(" -- maximum capacity of the car was equal to zero -- ");
         }else
         {
         setReversed_Car_Object(car);
         setTrip_Cost(car.getFixed_Route().getTrip_price()*0.5); //50%
             car.setMaxCapacity(car.getMaximum_Capacity()-1);
             System.out.println();
             System.out.println(" Seats in the car, Remaining capacity: " + car.getMaximum_Capacity());
              }
    }
    @Override
    public void display_info() {
        System.out.println(" Display information: ");
        System.out.println("{ Name is : "+this.getName());
        System.out.println(" Id: "+getId());
        System.out.println(" Revers car to : "+ getReversed_Car_Object().getCode());
        System.out.println(" Trip Cost: "+getTripCost()+" }");
    }
}
