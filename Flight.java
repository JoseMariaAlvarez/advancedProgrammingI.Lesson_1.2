public class Flight  {

  static private int nextFlight = 1; // Class Variable
  private String flightReference;    // Instance Variable
   
  static public int newIdentifier() {// Class Method
     int flight = nextFlight;
     nextFlight++;
     return flight;
  }

  public Flight(String airline) {    // Constructor
    flightReference = airline + "_" + newIdentifier();
  }
}

