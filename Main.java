public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Gumus");
        car1.setDoors(4);
        car1.setEngine(1.6);
        car1.setModel("Renault Megane");
        System.out.println("arabanın rengi" + car1.getColor());
        System.out.println("arabanın modeli" + car1.getModel());
        System.out.println("arabanın kapı sayısı" + car1.getDoors());
        System.out.println("arabanın motor hacmi" + car1.getEngine());

        car1.start();
        car1.stop();


    }
}
