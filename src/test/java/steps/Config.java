package steps;

public class Config {

    public String url = SetupEnv.getString("url");
    public String user = SetupEnv.getString("user");
    public String password = SetupEnv.getString("password");
    public String jenkinsChromeName = SetupEnv.getString("jenkinsChromeName");
    public String jenkinsChromePath = SetupEnv.getString("jenkinsChromePath");

}
