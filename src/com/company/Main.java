package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle v =  new Car("toyota",1920,TypeOfEngine.FUEL);
        Vehicle v2 = new Truck("ford",2002,TypeOfEngine.FUEL);
        Vehicle v3 = new Car("tesla",2028,TypeOfEngine.ELECTROMOBILE);
        Vehicle v4 = new Truck("volvo",2018,TypeOfEngine.HYBRID);


        Vehicle[] vehicles = {v,v2,v3,v4};
        for (Vehicle vehicle : vehicles) {
            try {
                if (vehicle.getYearOfIssue() < 1922 || vehicle.getYearOfIssue() > 2022) {
                    throw new InvalidIssueYear(vehicle.getModel() +"  "+  vehicle.getYearOfIssue() + " has an invalid year of issue");
                }
            }catch (InvalidIssueYear issueYear){
                System.err.println(issueYear.getMessage());
            }
        }

        Vehicle[] vehicleByTypeOgEngineFuel = findVehicleByTypeOgEngine(vehicles, TypeOfEngine.FUEL );
        for (Vehicle vehicle : vehicleByTypeOgEngineFuel) {
            System.out.println(vehicle);
        }

//        Vehicle[] vehicleByTypeOgEngineElectromobile = findVehicleByTypeOgEngine(vehicles, TypeOfEngine.ELECTROMOBILE );
//        for (Vehicle vehicle : vehicleByTypeOgEngineElectromobile) {
//            System.out.println(vehicle);
//        }
//
//        Vehicle[] vehicleByTypeOgEngineHybrid = findVehicleByTypeOgEngine(vehicles, TypeOfEngine.HYBRID );
//        for (Vehicle vehicle : vehicleByTypeOgEngineHybrid) {
//            System.out.println(vehicle);
//        }
    }



    static Vehicle[] findVehicleByTypeOgEngine(Vehicle[] array,TypeOfEngine type) {
        Vehicle[] newArray = new Vehicle[getQuantityOfVehiclesByTypeOfEngine(array, type)];
        int counterForNewArray = 0;
        for (Vehicle element : array) {
            if (element.getTypeOfEngine().equals(type)) {
                newArray[counterForNewArray] = element;
                counterForNewArray++;
            }
        }
        return newArray;
    }

    static int  getQuantityOfVehiclesByTypeOfEngine(Vehicle[] array,TypeOfEngine type) {
        int quantity = 0;
        for (Vehicle i : array) {
            if (i.getTypeOfEngine().equals(type)) {
                quantity++;
            }
        }
        return quantity;
    }
}
