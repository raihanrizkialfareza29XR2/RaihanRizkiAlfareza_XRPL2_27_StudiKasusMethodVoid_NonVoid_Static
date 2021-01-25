package StudiKasus1; //Membuat Package (package dalam setiap class harus sama)

public class Satu { //Membuat class Satu untuk menampung method main untuk memanggil 3 method yang telah dibuat sebelumnya
    public static void main(String[] args) { //Membuat method main untuk memanggil 3 method yang telah dibuat sebelumnya
        Studi.pembukaan(); //Memanggil method static (pembukaan) untuk ditampilkan
        Kasus program = new Kasus(); //Membuat objek baru untuk method void dan non void
        program.Inputan(); // //Memanggil method void (inputan) untuk ditampilkan
        System.out.println("Pilihan Anda Adalah : " + program.PILIHAN()); //Memanggil method non void (PILIHAN) untuk ditampilkan
        if (program.PILIHAN()==1){ //Menggunakan percabangan if untuk menentukan mana program penghitungan yang akan dieksekusi
            System.out.println(program.JARAK() + " Km");
            System.out.println(program.WAKTU() + " Jam");
            System.out.println(program.HKEC() + " Km/jam"); //Memanggil method non void yang telah dibuat untuk menampilkan hasil penghitungan mencari kecepatan
        }
        else if (program.PILIHAN()==2){
            System.out.println(program.KECEPATAN() + " Km/jam");
            System.out.println(program.JARAK() + " Km");
            System.out.println(program.HWAK() + " Jam"); //Memanggil method non void yang telah dibuat untuk menampilkan hasil penghitungan mencari waktu tempuh
        }
        else if (program.PILIHAN()==3){
            System.out.println(program.KECEPATAN() + " Km/jam");
            System.out.println(program.WAKTU() + " Jam");
            System.out.println(program.HJAR() + " Km"); //Memanggil method non void yang telah dibuat untuk menampilkan hasil penghitungan mencari jarak tempuh
        }
        program.penyelesaian(); //Memanggil method void (penyelesaian) untuk menampilkan cara penyelesaian serta hasil konversi ke dalam satuan lain
    }
}
