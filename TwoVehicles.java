class Vehicle {
  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon
}

class TwoVehicles {
  public static void main(String[] args) {
    Vehicle minivan = new Vehicle ();
    Vehicle sportscar = new Vehicle();
    
    int range1, range2;
    
    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;
    
    sportscar.passengers = 2;
    sportscar.fuelcap = 14;
    sportscar.mpg = 12;
    
    range1 = minivan.fuelcap * minivan.mpg;
    range2 = sportscar.fuelcap * sportscar.mpg;
    
    System.out.println("Minivan can carry " + minivan.passengers + 
                        " with a range of " + range1);
    
    System.out.println("Sportscar can carry " + sportscar.passengers +
                        "with a range of " + range2);
  }
}