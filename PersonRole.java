abstract class PersonRole implements Person {
    private String name;
    private String address;
    private String role;

    // Constructor
    public PersonRole(String name, String address, String role) {
        this.name = name;
        this.address = address;
        this.role = role;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter methods for role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
