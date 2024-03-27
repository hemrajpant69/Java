import javax.sql.*;
import javax.sql.rowset.*;
public class RowSet1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        RowSet rw = RowSetProvider.newFactory().createJdbcRowSet();
        rw.setUrl("jdbc:mysql://localhost:3306/ncit");
        rw.setUsername("root");
        rw.setPassword("admin");
        rw.setCommand("SELECT * FROM Student");
        rw.execute();

        while (rw.next()) {
            System.out.println(rw.getInt(1) + " " + rw.getString(2) + " " + rw.getString(3));
        }

        rw.close(); // Close the RowSet when done
    }
}
