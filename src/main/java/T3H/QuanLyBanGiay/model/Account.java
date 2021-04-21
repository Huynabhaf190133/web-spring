package T3H.QuanLyBanGiay.model;

public class Account {
    private String userID;
    private String FullName;
    private String userName;
    private String password;
    private String role;

    public Account(){}

    public Account(String userID, String FullName, String userName, String password, String role) {
        this.userID = userID;
        this.FullName = FullName;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
