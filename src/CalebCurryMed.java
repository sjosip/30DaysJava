import java.util.LinkedList;

public class CalebCurryMed {


    public static void main(String[] args)  {


        // Stack examples
        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Cobra");
        names.push("Chuppacabra");

        System.out.println(names.pop());
        System.out.println(names.removeFirst());
        System.out.println(names.remove());

    }
}
