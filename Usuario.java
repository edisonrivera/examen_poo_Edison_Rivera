package Examen;

public class Usuario {
    private String userName;
    private String userLastN;
    private String numberPhone;
    private String direction;
    private String password;

    public Usuario(String userName , String userLastN, String numberPhone, String direction, String password){
        this.userName = userName;
        this.userLastN = userLastN;
        this.numberPhone = numberPhone;
        this.direction = direction;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastN() {
        return userLastN;
    }

    public void setUserLastN(String userLastN) {
        this.userLastN = userLastN;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}