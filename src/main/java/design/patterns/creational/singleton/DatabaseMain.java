package design.patterns.creational.singleton;

import java.util.Arrays;

public class DatabaseMain {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        System.out.println(Arrays.toString(DBConnection.class.getMethods()));
        System.out.println(connection.hashCode());
        System.out.println(connection1.hashCode());
        System.out.println(connection2.hashCode());
//        connection.callDatabase();
    }
}
