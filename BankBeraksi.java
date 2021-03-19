// Nama  : Talitha Aurelia Shakira
// NIM   : 11200930000023
// Kelas : 2A


package bank;

public class BankBeraksi {
    public static void main (String[] args){
    Bank thisBank = new Bank(100000);
    
    thisBank.simpanUang(500000);
    thisBank.ambilUang(150000);
    thisBank.getSaldo();
}
}