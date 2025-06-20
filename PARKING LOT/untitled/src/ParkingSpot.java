
public class ParkingSpot {
    private Vehicle.VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;
    private int spotNumber;

    public ParkingSpot(Vehicle.VehicleType type, int spotNumber) {
        this.type = type;
        this.isOccupied = false;
        this.vehicle = null;
        this.spotNumber = spotNumber;
    }

    public boolean getStatus() {
        return this.isOccupied;
    }

    public Vehicle.VehicleType getType() {
        return this.type;
    }

    public int getSpotNumber() {
        return this.spotNumber;
    }

    public void park(Vehicle vehicle) {
        this.isOccupied = true;
        this.vehicle = vehicle;
    }

    public void leave() {
        this.isOccupied = false;
        this.vehicle = null;
    }
}
