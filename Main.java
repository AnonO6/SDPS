
// Main class to demonstrate the usage of the classes
public class Main {
    public static void main(String[] args) {
        // Sample data input below
        Passenger passenger = new Passenger("John Doe", "123 Main St", "Passenger", "FF123", "123456");
        Agent agent = new Agent("Alice Smith", "456 Elm St", "Agent", "password123", 5);
        // Now we can call any methods inside Agent or Passenger using thier objects
        agent.printDetails();
    }
}