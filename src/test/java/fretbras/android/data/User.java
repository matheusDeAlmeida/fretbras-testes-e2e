package fretbras.android.data;

public class User {
    private String userPlate;
    private String password;

    public User(String username, String password) {
        this.userPlate = username;
        this.password = password;
    }

    public String getUserPlate() {
        return userPlate;
    }

    public String getPassword() {
        return password;
    }
}