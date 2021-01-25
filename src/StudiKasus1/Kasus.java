package StudiKasus1; //Membuat Package (package dalam setiap class harus sama)

import java.util.Scanner; //Berfungsi untuk memasukkan paket Scanner

public class Kasus { //Membuat class Kasus untuk menampung method void dan non void
    int pilihan; //Membuat variabel baru
    double hkec,  kecepatan, jarak,  waktu,  hwak,   hjar;
    String mengulang;
    boolean running = true;
    void Inputan (){ // Membuat method void sebagai tempat user untuk memasukkan inputan pada program
        while (running){ //Menggunakan perulangan while loop untuk menu "mengulang lagi atau tidak?" pada input program oleh user
            Scanner input = new Scanner(System.in); //Membuat Scanner
            System.out.print("Silakan Masukkan Program Pilihan Anda : ");
            pilihan = input.nextInt(); // Variabel tempat menginputkan pilihan
            if (pilihan == 1){ //Penghitungan untuk mencari kecepatan menggunakan percabangan if
                System.out.println("");
                System.out.println("|                    Anda Memilih Program Menghitung Kecepatan                   |");
                System.out.println("|--------------------------------------------------------------------------------|");
                System.out.print("|Masukkan Jarak Yang Akan Ditempuh! (Satuannya KM dan Tulis Angkanya Saja) : ");
                jarak = input.nextDouble();
                System.out.print("|Masukkan Waktu Yang Akan Ditempuh! (Satuannya otomatis akan menjadi Jam) : ");
                waktu = input.nextDouble();
            }
            else if (pilihan == 2){ //Penghitungan untuk mencari waktu tempuh menggunakan percabangan if
                System.out.println("");
                System.out.println("|                  Anda Memilih Program Menghitung Waktu Tempuh                  |");
                System.out.println("|--------------------------------------------------------------------------------|");
                System.out.print("|Masukkan Kecepatan Yang Akan Ditempuh (Satuannya KM/jam dan Tulis Angkanya Saja) : ");
                kecepatan = input.nextDouble();
                System.out.print("|Masukkan Jarak Yang Akan Ditempuh (Satuannya otomatis akan menjadi KM) : ");
                jarak = input.nextDouble();
            }
            else if (pilihan == 3){ //Penghitungan untuk mencari jarak tempuh menggunakan percabangan if
                System.out.println("");
                System.out.println("|                  Anda Memilih Program Menghitung Jarak Tempuh                  |");
                System.out.println("|--------------------------------------------------------------------------------|");
                System.out.print("|Masukkan Kecepatan Yang Akan Ditempuh (Satuannya Km/jam dan Tulis Angkanya Saja) : ");
                kecepatan = input.nextDouble();
                System.out.print("|Masukkan Waktu Yang Akan Ditempuh (Satuannya otomatis akan menjadi Jam) : ");
                waktu = input.nextDouble();
            }
            Scanner darurat = new Scanner(System.in); //Membuat scanner baru karena jika menggunakan scanner sebelumnya tidak terbaca
            System.out.println("");
            System.out.print("Anda Ingin Mengulang? (Y/T) : ");
            mengulang = darurat.nextLine(); //Disamping itu saya juga agak malas mengurutkan tipe data nya satu per satu. Jadi membuat Scanner baru
            System.out.println("");
            if(mengulang.equalsIgnoreCase("T")){
                running = false; //Jika user menginputkan Y maka program akan mengulang. Sebaliknya jika user menginputkan T, maka program akan berlanjut
            }
        }
    }
    int PILIHAN(){ //Membuat method non void untuk menampilkan hasil perhitungan dari program diatas
        return pilihan;
    }
    double JARAK(){
        System.out.print("Input Jarak : "); //Menampilkan jarak yang telah dimasukkan oleh user
        return jarak;
    }
    double WAKTU(){
        System.out.print("Input Waktu : "); //Menampilkan waktu yang telah dimasukkan oleh user
        return waktu;
    }
    double KECEPATAN(){
        System.out.print("Input Kecepatan : "); //Menampilkan kecepatan yang telah dimasukkan oleh user
        return kecepatan;
    }
    double HKEC(){
        System.out.print("Jadi, Kecepatan = "); //Menampilkan hasil dari perhitungan mencari kecepatan
        return (jarak/waktu);
    }
    double HWAK(){
        System.out.print("Jadi, Waktu = "); //Menampilkan hasil dari perhitungan mencari waktu tempuh
        return (jarak/kecepatan);
    }
    double HJAR(){
        System.out.print("Jadi, Jarak = "); //Menampilkan hasil dari perhitungan mencari jarak tempuh
        return (waktu*kecepatan);
    }
    double HKECCLONE(){
        return (jarak/waktu); //Membuat method non void baru untuk dimasukkan kedalam rumus agar system.out nya tidak ikut ditampilkan
    }
    double HWAKCLONE(){
        return (jarak/kecepatan); //Membuat method non void baru untuk dimasukkan kedalam rumus agar system.out nya tidak ikut ditampilkan
    }
    double HJARCLONE(){
        return (waktu*kecepatan); //Membuat method non void baru untuk dimasukkan kedalam rumus agar system.out nya tidak ikut ditampilkan
    }
    double LAIN1(){
        System.out.print("Atau Bisa Juga : ("); //Membuat method non void baru untuk dimasukkan kedalam rumus dan output dari konversi hasil
        return (jarak/waktu);
    }
    double LAIN2(){
        System.out.print("Atau Bisa Juga : ("); //Membuat method non void baru untuk dimasukkan kedalam rumus dan output dari konversi hasil
        return (jarak/kecepatan);
    }
    double LAIN3(){
        System.out.print("Atau Bisa Juga : ("); //Membuat method non void baru untuk dimasukkan kedalam rumus dan output dari konversi hasil
        return (waktu*kecepatan);
    }

    void penyelesaian(){ //Membuat satu lagi method void untuk menampilkan penyelesaian dan konversi hasil ke dalam bentuk lain.
        if (pilihan==1){ //Konversi dari Km/jam ke m/detik serta penyelesaian
            System.out.println(jarak + " : " + waktu + " = " + HKEC() + " Km/jam (Penyelesaian)");
            double kkec =((HKECCLONE()*1000)/3600);
            System.out.println("========================================================");
            System.out.println(LAIN1() + " x 1000) : 3600 = " + kkec + " m/detik");
        }
        else if (pilihan==2){ //Konversi dari jam ke menit serta penyelesaian
            System.out.println(jarak + " : " + kecepatan + " = " + HWAK() + " Jam (Penyelesaian)");
            double khwak = (HWAKCLONE()*60);
            System.out.println("========================================================");
            System.out.println(LAIN2() + " x 60) = " + khwak + " menit");
        }
        else if (pilihan==3){ //Konversi dari Km ke m serta penyelesaian
            System.out.println(waktu + " x " + kecepatan + " = " + HJAR() + " Km (Penyelesaian)");
            double khjar = (HJARCLONE()*1000);
            System.out.println("========================================================");
            System.out.println(LAIN3() + " x " + 1000 + " ) = " + khjar + " m");
        }
    }
}
