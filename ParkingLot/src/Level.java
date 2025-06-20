import java.util.ArrayList;
import java.util.List;

public class Level {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

    public Level(int floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }
    public List<ParkingSpot> getParkingSpots() { return this.parkingSpots; }
    public int getFloorNumber() { return this.floorNumber; }
}
