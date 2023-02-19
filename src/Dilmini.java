import java.io.FileNotFoundException;

public class Dilmini {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("_".repeat(10) + "$".repeat(10));
        System.out.println("_".repeat(9) + "$" + "_".repeat(9) + "$$");
        System.out.println("_".repeat(9) + "$_" + "$".repeat(7) + "_$$");
        System.out.println("_".repeat(9) + "$_$" + "_".repeat(5) + "$_$$");
        System.out.println("_".repeat(9) + "$_$" + "_".repeat(5) + "$_$$");
        System.out.println("_".repeat(9) + "$_$" + "_".repeat(5) + "$_$$");
        System.out.println("_".repeat(9) + "$_$" + "_".repeat(5) + "$_$$");
        System.out.println("_".repeat(9) + "$_" + "$".repeat(7) + "_$$");
        System.out.println("_".repeat(9) + "$" + "_".repeat(9) + "$$");
        System.out.println("_".repeat(10) + "$".repeat(10));
        System.out.println("_________$_________$$");
        System.out.println("________$_1__2__3_$$$");
        System.out.println("_______$_4__5__6_$$$");
        System.out.println("______$_7__8__9_$$$");
        System.out.println("_____$_*__0__#_$$$");
        System.out.println("____$_________$$$");
        System.out.println("_____" + "$".repeat(11));
        System.out.println("______" + "$".repeat(9));
    }
}
