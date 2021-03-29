// Nama  : Talitha Aurelia Shakira
// NIM   : 11200930000023
// Kelas : 2A 

package Math;
public class MatematikaCanggih extends Matematika {
    private int Modulus, a, b;
            int Modulus1; 
            double Modulus2;
            
    void setModulus(int a, int b){
        Modulus = a%b;
    }
    int getModulus(){
        return Modulus;
    }
    public void Modulus(int a, int b){
        Modulus1 = a%b;
        System.out.println("Modulus1:" + a + "%" + b + "=" + Modulus1 );
    }
    public void Modulus(double a, double b, double c){
        Modulus2 = a%b%c;
        System.out.println("Modulus2:"+ a + "%" + b + "%" + c + "=" + Modulus2 );
    }
}