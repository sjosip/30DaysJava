import java.util.LinkedList;
import java.util.ListIterator;

public class CalebCurryMed {


    public static void main(String[] args)  {


        // Iterator
        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Cobra");
        names.push("Doris");

        //Iterator <String> iterator = names.iterator();
        ListIterator <String> iterator = names.listIterator();
       /* System.out.println(iterator.next());// last
        System.out.println(iterator.next());// second
        System.out.println(iterator.next());//first*/

       iterator.next();
       iterator.next();
       iterator.add("Jerry");

        names.add(2, "Lenny");

       /* while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        //OR ova ili ona petlja rade isto

        // for each element in the array
        for (String s: names) {
            System.out.println(s);
        }

    }
}
