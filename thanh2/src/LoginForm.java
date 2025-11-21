public class LoginForm {
    private String userName;
    private String password;

    public LoginForm(String userName, String password){
        this.userName =userName;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public boolean checkPassword(String input){
        return this.password.equals(input);

    }
    public void displayInfo(){
        System.out.println("Tên người dùng: "+ userName);
    }
}
