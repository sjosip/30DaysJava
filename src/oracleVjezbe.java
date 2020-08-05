import java.util.Scanner;

public class oracleVjezbe {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Vrijednost a i b");
        double a = input.nextDouble();
        double b = input.nextDouble();
        oracleVjezbaXXX ovkl = new oracleVjezbaXXX(a,b);

        System.out.println(ovkl.zbroj());
        System.out.println(ovkl.oduzmi());
        System.out.println(ovkl.dijeli());
        System.out.println(ovkl.mnozi());




    }
}