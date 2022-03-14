package tugas6;

/* @author Fadhillah Fauzan Rachman(2011501703)
        Ilham Zakariya(2011500622)

*/ 

public class BankBeraksi {
    public static void main(String[] args) {
        Bank money = new Bank();

        money.simpanUang(500000);
        money.ambilUang(150000);
        money.getSaldo();
    }
}
