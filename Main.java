import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Route route1 = new Route(" Address1 ", " Destiinton Address: 1 ", 50.0);
        Route route2 = new Route(" Address2 ", " Destnion Adress: 2 ", 30.0);

        Car car1 = new Car(" A A A  ", route1, 4);
        Car car2 = new Car(" B B B ", route2, 2);


        //Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
        Passenger[] passengers = {new SubsecribePassenger(" Abdullah ", "85-985"),
                new NoSubsecriber_peassenger("Sarah ", "70-987", true)}; // discount_Coupon

        for (Passenger pas_Var : passengers) {
            try {
                if (pas_Var instanceof SubsecribePassenger) {
                    pas_Var.Revers_Method(car1);
                } else {
                    pas_Var.Revers_Method(car2);
                }
                pas_Var.display_info();
            } catch (InputMismatchException e) {
                System.out.println("-------------");
                System.out.println(e.getMessage());
            }
        }
    }
    }
