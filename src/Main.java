class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhsBaru = new Mahasiswa("Budi", 20, "Informatika");
    }
}