package Tugas1;

public class TestAppConfig {
    public static void main(String[] args) {
        // Akses variabel static langsung melalui nama class tanpa membuat objek
        System.out.println("Base URL: " + AppConfig.BASE_URL);
        System.out.println("App Version: " + AppConfig.APP_VERSION);
        System.out.println("Default Timeout: " + AppConfig.DEFAULT_TIMEOUT + " ms");
    }
}
