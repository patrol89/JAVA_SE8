package zajecia3;

/**
 *
 * @author User
 */
public class Car implements Vehicle{
    private String make;
    private String model; 
    private String color;
    private int maxSpeed;
    private int engine;
    private int acceleration;
    private String licencePlate;
    private Person owner;

    
    public Car(String make, String model, String color, int maxSpeed, int engine, int acceleration, String licencePlate, Person owner) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.acceleration = acceleration;
        this.licencePlate = licencePlate;
        this.owner = owner;
    }
    



    
    public Car changeLicencePlate (String newPlate){
        Car carWithNewPlate = new Car(make, model, color, maxSpeed, engine, acceleration, newPlate, owner);
        return carWithNewPlate;
    }

    
    
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + ", engine=" + engine + ", licencePlate=" + licencePlate + ", owner=" + owner + '}';
    }

    @Override
    public void startEngine() {
        System.out.println("starting my " + make);
    }

    @Override
    public void accelerate() {
        System.out.println("acelerating " + make);
    }

    @Override
    public void brake() {
        System.out.println("breaking " + make);
    }
    
    
    
   
    
}
