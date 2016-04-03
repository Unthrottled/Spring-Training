package space.cyclic.reference.pojo;

public abstract class Battery {
    String brand;
    String type;
    double charge;
    double voltage;

    public Battery(String brand, String type, double charge, double voltage) {
        this.brand = brand;
        this.type = type;
        this.charge = charge;
        this.voltage = voltage;
    }

    public Battery() {
        this.brand = "";
        this.type = "";
        this.charge = 0d;
        this.voltage = 0d;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public abstract double getCharge();

    public double getVoltage() {
        return voltage;
    }
}
