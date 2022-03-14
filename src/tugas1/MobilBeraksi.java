package tugas1;

/*

@author Fadhillah Fauzan Rachman(2011501703)
        Ilham Zakariya(2011500622)

*/ 

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();

        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;

        System.out.println("Warna:" +mobilku.warna);
        System.out.println("Tahun:" +mobilku.tahunProduksi);
    }
}
