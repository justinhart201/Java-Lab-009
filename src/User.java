public class User {
    private String username;
    private String passHash;

    // User constructor
    public User(String username, String passHash) {
        this.username = username;
        this.passHash = passHash;
    }

    // Method to get the username
    public String getUsername() {
        return this.username;
    }

    // Method to get the password hash
    public String getPassHash() {
        return this.passHash;
    }
}

