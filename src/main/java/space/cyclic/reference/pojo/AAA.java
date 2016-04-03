package space.cyclic.reference.pojo;

public class AAA extends Battery {

    public AAA(String brand, String type, double charge, double voltage) {
        super(brand, type, charge, voltage);
    }

    @Override
    public double getCharge() {
        return this.charge--;
    }
}
