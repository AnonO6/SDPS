 abstract class PersonRole implements Person {
    private String name;
    private String address;
    private String role;

    public PersonRole(String name, String address, String role) {
        this.name = name;
        this.address = address;
        this.role = role;
    }

    // Getter and setter methods to ensure encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /*
     * below is required because subclasses of abstract class PersonRole
     * have to implement all the methods in interface Person, however
     * this Violates Interface Segregation Principle, this can be solved 
     * by dividing Person interface into multiple interfaces.
     */


     // Default implementation of authSet method from Person interface
     @Override
     public void authSet(String password, int authorizationLevel) {
         // Default implementation if needed
     }
 
     // Default implementation of printDetails method from Person interface
     @Override
     public void printDetails() {
         // Default implementation if needed
     }
 
     // Default implementation of verification method from Person interface
     @Override
     public boolean verification(String id) {
         // Default implementation if needed
         return false; // Placeholder return
     }
}
