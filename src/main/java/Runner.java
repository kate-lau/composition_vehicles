public class Runner {

    public static void main(String[] args) {

        IEngine hondaEngine = new CombustionEngine(99, "01/01/2023");
        Car jazz = new Car(1100.0f, 160, "hatchback", hondaEngine);

//        System.out.println(jazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(1000, 100);
        jazz.setEngine(electricEngine);

//        System.out.println(jazz.getHorsePower());

        // WATER VEHICLES
//      creating engine and testing Ship objects with it
        IEngine yamahaEngine = new CombustionEngine(100, "19/07/2000");
        CargoShip titanic = new CargoShip(900.0f, 300, 2, yamahaEngine);

//        System.out.println(titanic.getHorsePower());

        IEngine teslaEngine = new ElectricEngine(888, 90);
        titanic.setEngine(teslaEngine);

//        System.out.println(titanic.getHorsePower());

        // AIR VEHICLES

//      creating radar and testing Plane objects with it
        IRadar laserRadar = new LaserRadar(1000);
        IEngine planeEngine = new CombustionEngine(3000, "01/01/24");
        Plane dusty = new Plane(100.0f, 300, 34, "commercial", laserRadar, planeEngine);

//        System.out.println(dusty.getRadarRange());

    }

}