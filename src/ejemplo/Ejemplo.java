/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author manue
 */
public class Ejemplo {
public static int multiplicacion (int a, int b){
if(a>1){
    System.out.println("a ="+a+" b = "+b);
    System.out.println();
    return multiplicacion(a-1,b)+b;
}else{
    System.out.println("a ="+a+" b = "+b);
    System.out.println();
    return b;
}

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[]barbacoas) {
        // TODO code application logic here
        System.out.println(multiplicacion(4,3));
    }
    
}
