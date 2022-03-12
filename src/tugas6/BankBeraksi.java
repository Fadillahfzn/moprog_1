package tugas6;

public class BankBeraksi {
    public static void main(String[] args) {
        Bank money = new Bank();

        money.simpanUang(500000);
        money.ambilUang(150000);
        money.getSaldo();
    }
}
