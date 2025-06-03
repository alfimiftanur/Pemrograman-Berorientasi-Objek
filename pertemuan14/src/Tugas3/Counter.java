package Tugas3;

public class Counter {
    // static -> nilai milik class, bukan objek. Digunakan untuk menghitung jumlah objek
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++; // setiap objek baru akan menambahkan count
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

