public class Config {
    private String appName;
    private String version;
    private int maxConnection;

    public Config(String appName, String version, int maxConnection){
        this.appName = appName;
        this.version = version;
        setMaxConnection(maxConnection);
    }
    public String getAppName(){
        return appName;
    }
    public String getVersion(){
        return version;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public int getMaxConnection(){
        return maxConnection;
    }
    public void setMaxConnection(int maxConnection){
        if (maxConnection >0){
            this.maxConnection = maxConnection;
        }else{
            System.out.println("maxConection phải lớn hơn 0!");
            this.maxConnection = 1;
        }
    }
    public void displayInfo(){
        System.out.println("   Thông tin   ");
        System.out.println("Tên phần mềm: "+ appName);
        System.out.println("version: "+ version);
        System.out.println("maxconnection: "+ maxConnection);
    }

}
