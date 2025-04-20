package aicoach.user;

public class user {
    private String userId;
    private String name;
    private String email;
    private String password;

    public user(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        System.out.println("User logged in.");
    }

    public void logout() {
        System.out.println("User logged out.");
    }

    public void updateProfile(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Profile updated.");
    }
}
