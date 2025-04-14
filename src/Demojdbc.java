import java.sql.*;

public class Demojdbc {
    public static void main(String[] args) throws Exception {
        /*
        * import package
        * load and register
        * create connection
        * create statement
        * execute state,ent
        * process and results
        * close
         */

        String url="jdbc:postgresql://localhost:5432/demo"; //default portno of postgres  is 5432.
        String Uname="postgres";
        String pass="Asdf@1234";

        Class.forName("org.postgresql.Driver"); //optional part form java 6 onwards. we can comment it out.
        Connection con=DriverManager.getConnection(url,Uname,pass);

        System.out.println("Connection Established");

    }
}
