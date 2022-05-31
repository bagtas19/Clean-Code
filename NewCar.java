public class NewCar {
    private String color;
    private String model;
    private double engine;
    private int doors;

    public NewCar(String color, String model, Double engine, int doors) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }

    public NewCar() {
        this("bigi yok", "bilgi yok", 0.0, 0);
    }

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

    public void start() {
        System.out.println("araba calıstı...");
    }

    public void stop() {
        System.out.println("araba durdu...");
    }

    public void göster() {
        System.out.println("arabanin rengi:" + this.color);
        System.out.println("arabanin modeli:" + this.model);
        System.out.println("arabanin kapi sayisi:" + this.doors);
        System.out.println("arabanin motor hacmi:" + this.engine);
    }

}
