/* Nama kelompok :
    1. Moohamad Faiz Ramdhani 
    2. Wina Tri Asih
    3. Edgina Rangga Arkananta 
    4.Amanda Titania Putri
    5. Annastasya Nabila Elsa W
    6. Setiawan
    7. Annisya 
    */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.pkg3;

// Kelas Medicine dengan atribut dan metode
class Medicine {

    private String obat; // Atribut untuk menyimpan nama obat

    // Konstruktor untuk menginisialisasi nama obat
    public Medicine(String obat) {
        this.obat = obat; // Mengatur nama obat
    }

    // Metode untuk menggunakan obat tanpa harga
    public void use() {
        System.out.println(obat + " sedang digunakan."); // Menampilkan pesan penggunaan obat
    }

    // Metode overload untuk menggunakan obat dengan harga
    public void use(int harga) {
        System.out.println(obat + " sedang digunakan, harga: " + harga); // Menampilkan pesan penggunaan obat beserta harga
    }
}

class Pill extends Medicine {

    // Konstruktor untuk menginisialisasi superclass
    public Pill() {
        super("Pil"); // Mengatur nama obat menjadi "Pil"
    }

    @Override
    public void use() {
        System.out.println("Pil ini sedang ditelan."); // Menampilkan pesan penggunaan pil
    }

    @Override
    public void use(int harga) {
        System.out.println("Pil ini sedang ditelan, harga: " + harga); // Menampilkan pesan penggunaan pil beserta harga
    }
}

class Syrup extends Medicine {

    // Konstruktor untuk menginisialisasi superclass
    public Syrup() {
        super("Sirup"); // Mengatur nama obat menjadi "Sirup"
    }

    @Override
    public void use() {
        System.out.println("Sirup ini sedang diminum."); // Menampilkan pesan penggunaan sirup
    }

    @Override
    public void use(int harga) {
        System.out.println("Sirup ini sedang diminum, harga nya: " + harga); // Menampilkan pesan penggunaan sirup beserta harga
    }
}

class Tablet extends Medicine {

    // Konstruktor untuk menginisialisasi superclass
    public Tablet() {
        super("Tablet"); // Mengatur nama obat menjadi "Tablet"
    }

    @Override
    public void use() {
        System.out.println("Tablet ini untuk ditelan."); // Menampilkan pesan penggunaan tablet
    }

    @Override
    public void use(int harga) {
        System.out.println("Tablet ini untuk ditelan, harga: " + harga); // Menampilkan pesan penggunaan tablet beserta harga
    }
}

public class Latihan3 {

     public static void main(String[] args) {

        // Membuat objek dari subclass Pill
        Medicine myPill = new Pill(); // Menginisialisasi objek myPill sebagai instansi dari Pill
        myPill.use();  // Output: Pil ini sedang ditelan.
        myPill.use(15000);  // Output: Pil ini sedang ditelan, harga: 15000

        // Membuat objek dari subclass Tablet
        Medicine myTablet = new Tablet(); // Menginisialisasi objek myTablet sebagai instansi dari Tablet
        myTablet.use();  // Output: Tablet ini untuk ditelan.
        myTablet.use(20000);  // Output: Tablet ini untuk ditelan, harga: 20000

        // Membuat objek dari subclass Syrup
        Medicine mySyrup = new Syrup(); // Menginisialisasi objek mySyrup sebagai instansi dari Syrup
        mySyrup.use();  // Output: Sirup ini sedang diminum.
        mySyrup.use(12000);  // Output: Sirup ini sedang diminum, harga: 12000
     }
}
