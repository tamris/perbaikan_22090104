package pertemuan8;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Koneksi {
    public static Connection sambung_ke_db() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("mahasiswa");
            m.setServerName("localhost");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");

            Connection c = m.getConnection();
            System.out.println("Sukses terhubung ke database");
            return c;
            
        } catch (SQLException e) {
            // Penanganan eror
            System.err.println("Gagal terhubung ke database");
            System.err.println("Eror: " + e.getMessage());
        }
        return null;
    }
}
