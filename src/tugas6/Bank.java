package tugas6;

/* @author Fadhillah Fauzan Rachman(2011501703)
        Ilham Zakariya(2011500622)

*/ 

public class Bank {
    public int saldo;

    public Bank() {
        System.out.println("Selamat Datang di Bank ABC");
        saldo = 100000;
        System.out.println("Saldo saat ini: Rp."+saldo);
    }

    public void simpanUang(int x) {
        System.out.println("Simpan uang: Rp." +x);
        saldo = saldo + x;
        System.out.println("Saldo anda saat ini: Rp." +saldo);
    }

    public void ambilUang(int y) {
        System.out.println("Ambil uang: Rp." +y);
        saldo = saldo - y;
        
    }

    public void getSaldo() {
        System.out.println("Saldo anda saat ini: Rp." +saldo);
    }
}
