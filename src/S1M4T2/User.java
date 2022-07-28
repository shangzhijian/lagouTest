package S1M4T2;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 2791089904898769402L;

    private String userName;
    private String password;
    private /*transient*/ String phoneNum;  //加上transient,不参与序列化，该字段输入流和输出流不参与

    public User() {
    }

    public User(String userName, String password, String phoneNum) {
        setUserName(userName);
        setPassword(password);
        setPhoneNum(phoneNum);
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
