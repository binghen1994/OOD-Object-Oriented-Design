import java.util.List;

public class ParkingLot {
    private List<Level> levels;
    private int capacity;
    private int spotsAvailable;

    public ParkingLot(List<Level> levels, int capacity, int spotsAvailable) {
        this.levels = levels;
        this.capacity = capacity;
        this.spotsAvailable = spotsAvailable;
    }

    public boolean isFull() {
        return this.spotsAvailable == 0;
    }
    public int getSpotsAvailable(Vehicle vehicle) {
        for (Level level : this.levels) {
            for (ParkingSpot spot : level.getParkingSpots()) {
                if (!spot.getStatus() && spot.getType().equals(vehicle.getType())) {
                    spot.park(vehicle);
                    this.spotsAvailable -= 1;
                    return spot.getSpotNumber();
                }
            }
        }
        return -1;
    }
}
