

// Hotel interface
interface Hotel {
    void serveChickenBiriyani();
    void serveMasalaDosa();
}

// TajHotel class implementing Hotel interface
class TajHotel implements Hotel {
    @Override
    public void serveChickenBiriyani() {
        System.out.println("TajHotel serves Chicken Biriyani.");
    }

    @Override
    public void serveMasalaDosa() {
        System.out.println("TajHotel serves Masala Dosa.");
    }

    // Additional method specific to TajHotel
    public void serveWelcomeDrink() {
        System.out.println("Welcome drink served at TajHotel.");
    }
}

// RoadsideHotel class implementing Hotel interface
class RoadsideHotel implements Hotel {
    @Override
    public void serveChickenBiriyani() {
        System.out.println("RoadsideHotel serves Chicken Biriyani.");
    }

    @Override
    public void serveMasalaDosa() {
        System.out.println("RoadsideHotel serves Masala Dosa.");
    }
}

// Demo class
public class HotelDemo {
    public static void main(String[] args) {
        // Create objects of TajHotel and RoadsideHotel
        TajHotel tajHotel = new TajHotel();
        RoadsideHotel roadsideHotel = new RoadsideHotel();

        // Call methods on TajHotel object
        tajHotel.serveChickenBiriyani();
        tajHotel.serveMasalaDosa();
        tajHotel.serveWelcomeDrink();

        // Call methods on RoadsideHotel object
        roadsideHotel.serveChickenBiriyani();
        roadsideHotel.serveMasalaDosa();
    }
}

Output:

TajHotel serves Chicken Biriyani.
TajHotel serves Masala Dosa.
Welcome drink served at TajHotel.
RoadsideHotel serves Chicken Biriyani.
RoadsideHotel serves Masala Dosa.
