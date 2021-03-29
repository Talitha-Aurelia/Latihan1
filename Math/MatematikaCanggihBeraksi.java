// Nama  : Talitha Aurelia Shakira
// NIM   : 11200930000023
// Kelas : 2A

package Math;
public class MatematikaCanggihBeraksi {
    public static void main (String []args ){
        MatematikaCanggih Math = new MatematikaCanggih();
            
       Math.setPertambahan(10,20); 
        System.out.println("Ini merupakan pertambahan:" + Math.getPertambahan());
       Math.setPengurangan (15,5);
        System.out.println("Ini merupakan pengurangan:" + Math.getPengurangan());
       Math.setPerkalian(45, 15);
        System.out.println("Ini merupakan perkalian:" + Math.getPerkalian());
       Math.setPembagian(20,10);
        System.out.println("Ini merupakan pembagian:" + Math.getPembagian());
       Math.setModulus(10,200);
        System.out.println("Ini merupakan modulus:" + Math.getModulus());
    }
}