// Nama  : Talitha Aurelia Shakira
// NIM   : 11200930000023
// Kelas : 2A 

package Math;
public class MatematikaCanggihBangetBeraksi {
    public static void main (String[]args){
        MatematikaCanggihBanget Math = new MatematikaCanggihBanget();
       Math.setPertambahan(33,55); 
        System.out.println("Ini merupakan pertambahan:" + Math.getPertambahan());
       Math.setPengurangan (25,35);
        System.out.println("Ini merupakan pengurangan:" + Math.getPengurangan());
       Math.setPerkalian(35, 5);
        System.out.println("Ini merupakan perkalian:" + Math.getPerkalian());
       Math.setPembagian(50,5);
        System.out.println("Ini merupakan pembagian:" + Math.getPembagian());
       Math.setModulus(20,200);
        System.out.println("Ini merupakan modulus:" + Math.getModulus());
       Math.setPertambahanTiga(20,10,20);
        System.out.println("Ini merupakan tiga:" + Math.getPertambahanTiga());
        
        
    }    
}

