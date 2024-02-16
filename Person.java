// Interface representing a person
interface Person {
    // Method to set authorization information
    void authSet(String password, int authorizationLevel);

    // Method to print person details
    void printDetails();

    // Method to verify person ID
    boolean verification(String id);
}