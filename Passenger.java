// Class representing a person in the role of a passenger
 class Passenger extends PersonRole {
    private String frequentFlyerID;
    private String reservation;

    public Passenger(String name, String address, String role, String frequentFlyerID, String reservation) {
        super(name, address, role);
        this.frequentFlyerID = frequentFlyerID;
        this.reservation = reservation;
    }

    // Getter and setter methods to ensure encapsulation
    public String getFrequentFlyerID() {
        return frequentFlyerID;
    }

    public void setFrequentFlyerID(String frequentFlyerID) {
        this.frequentFlyerID = frequentFlyerID;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public boolean verification(String id) {
        // Verification logic here
        return false; // Placeholder return
    }
}
