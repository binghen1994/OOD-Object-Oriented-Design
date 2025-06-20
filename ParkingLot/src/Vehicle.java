public class Vehicle {
    private String plateNumber;
    private VehicleType type;

    public enum VehicleType {
        CAR, TRUCK, MOTORCYCLE
    }

    public Vehicle(String plateNumber, VehicleType type) {
        this.plateNumber = plateNumber;
        this.type = type;
    }
    public VehicleType getType() {
        return this.type;
    }
    public String getPlateNumber() {
        return this.plateNumber;
    }
}
