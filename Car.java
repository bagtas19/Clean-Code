public class Car {
    private String color;
    private String model;
    private double engine;
    private int doors;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void start(){
        System.out.println("araba calıstı...");
    }
    public void stop(){
        System.out.println("araba durdu...");
    }
}
