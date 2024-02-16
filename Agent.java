// Class representing a person in the role of an agent
 class Agent extends PersonRole {
    private String password;
    private int authorizationLevel;

    public Agent(String name, String address, String role, String password, int authorizationLevel) {
        super(name, address, role);
        this.password = password;
        this.authorizationLevel = authorizationLevel;
    }

    // Method to set password
    public void setPassword(String password) {
        this.password = password;
    }

    // Method to set authorization level
    public void setAuthorizationLevel(int authorizationLevel) {
        this.authorizationLevel = authorizationLevel;
    }

    // Method to print agent details
    public void printDetails() {
        System.out.println("Agent Details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Role: " + getRole());
        System.out.println("Authorization Level: " + authorizationLevel);
    }
}