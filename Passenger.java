// Class representing a person in the role of a passenger
abstract class Passenger extends PersonRole {
    private String frequentFlyerID;
    private String reservation;

    public Passenger(String name, String address, String role, String frequentFlyerID, String reservation) {
        super(name, address, role);
        this.frequentFlyerID = frequentFlyerID;
        this.reservation = reservation;
    }

    // Getter and setter methods for FrequentFlyerID
    public String getFrequentFlyerID() {
        return frequentFlyerID;
    }

    public void setFrequentFlyerID(String frequentFlyerID) {
        this.frequentFlyerID = frequentFlyerID;
    }

    // Getter and setter methods for reservation
    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    // Method to verify passenger ID
    public boolean verification(String id) {
        // Add verification logic here
        return false; // Placeholder return
    }
}
