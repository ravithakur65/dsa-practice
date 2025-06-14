package design.patterns.creational.singleton;

public class DBConnection {
    private static DBConnection instance;
    private DBConnection(){}
    public static synchronized DBConnection getInstance(){

        if (instance ==  null){
            instance = new DBConnection();
         }
        return instance;
    }

    public void callDatabase(){
        System.out.println("Database called !!");
    }
}
