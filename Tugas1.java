import java.util.Scanner;

class perhitungan {
    double Celcius;

    public perhitungan(double Celcius) {
        this.Celcius = Celcius;
    }

    double Fahrenheit() {
        return (Celcius * 1.8 + 32);
    }

    double Reamur() {
        return (Celcius * 0.8);
    }

    double Kelvin() {
        return (Celcius + 273.15);
    }

    String kondisiair() {
        if (Celcius <= 0) {
            return "Beku";
        } else if (Celcius >= 100) {
            return "Mendidih";
        } else {
            return "Normal";
        }
    }
}

public class Tugas1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opsi;
        double suhuAwal;
        System.out.println("=============================");
        System.out.println("| Program konversi Suhu Air |");
        System.out.println("=============================");
        System.out.println("Input Data");
        System.out.println("------------");
        System.out.print("Suhu Dalam Celcius : ");
        suhuAwal = input.nextInt();
        do {
            perhitungan suhuAkhir = new perhitungan(suhuAwal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("------------");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            opsi = input.nextInt();
            if (opsi == 1) {
                System.out.println("");
                System.out.println("Suhu dalam Celcius  : " + suhuAwal + "°C");
                System.out.println("Dalam Fahrenheit    : " + suhuAkhir.Fahrenheit() + "°F");
                System.out.println("Dalam Reamur        : " + suhuAkhir.Reamur() + "°R");
                System.out.println("Dalam Kelvin        : " + suhuAkhir.Kelvin() + "K");
                System.out.println("Kondisi Air Saat ini " + suhuAkhir.kondisiair());
            } else if (opsi == 2) {
                System.out.println("Input Data");
                System.out.println("------------");
                System.out.print("Suhu Dalam Celcius    : ");
                suhuAwal = input.nextInt();
            } else if (opsi > 3 || opsi < 1) {
                System.out.println("Opsi tidak ada.Masukkan opsi dengan benar!");
            }
        } while (opsi != 3);

    }
}