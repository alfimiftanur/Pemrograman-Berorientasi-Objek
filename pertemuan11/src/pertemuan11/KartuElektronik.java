package pertemuan11;

public class KartuElektronik implements Kartu{
    private String kodeBank;
    private String pin;

//    construktor
    public KartuElektronik(String kodeBank, String pin){
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }
//    ini merupakan implementasi dari interface Kartu
    @Override
    public boolean otentikasi(String pinInput){
        if(pin.equals(pinInput))
            return true;
        else
            return false;
    }
//    ini merupakan implementasi dari interface Kartu
    @Override
    public String encode(String pin){
        // Melakukan enkripsi inputan PIN
        return null;
    }
}
