// Nama : Talitha Aurelia Shakira
// NIM  : 11200930000023
// Kelas : 2A


package bank;

public class Bank {
    int saldo;
    public Bank(int saldo){
        this.saldo = saldo;
        System.out.println("Selamat Datang di Bank ABC ");
        System.out.println("Saldo Saat ini : " + this.saldo);
    }
    void simpanUang(int total){ 
        System.out.println("simpan uang : " + total);
        saldo = this.saldo + total;
        System.out.println("Saldo Saat ini : " + saldo);
    }
    void ambilUang(int total){
        System.out.println("ambil uang : " + total);
        saldo = this.saldo - total;
        System.out.println("Saldo Saat ini : " + saldo);
    }
    int getSaldo(){
        return saldo; 
}
}
