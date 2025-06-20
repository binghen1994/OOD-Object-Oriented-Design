public class Ticket {
    private String ticketId;
    private String vehicleType;
    private String vehiclePlateNumber;
    private int entryTime;
    private int exitTime;

    public Ticket(String ticketId, String vehicleType, String vehiclePlateNumber, int entryTime, int exitTime) {
        this.ticketId = ticketId;
        this.vehicleType = vehicleType;
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public int getDuration() {
        return exitTime - entryTime;
    }

}
