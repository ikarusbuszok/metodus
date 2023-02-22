
package method;

import java.io.PrintStream;


public class Method {

    
    public static void main(String[] args) {

    }
    private static int elso10szamosszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++){
            osszeg += i;
            
        }       
       kiir("Az első 10 szám összege: "+ osszeg);
    
    return osszeg;
    }
       
    private static int osszead(int a, int b) {
        return a+b;
    }
   
    private static void kiir(String szoveg){
     System.out.println(szoveg);
    }
}
    
        
    
   
        
    
    

