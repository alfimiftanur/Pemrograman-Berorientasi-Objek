package Tugas4;

public class DatabaseConnection {
    public static String connectionString;

    // static block dijalankan sekali saat class pertama kali diload
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block dieksekusi. Koneksi diinisialisasi");
    }
}

