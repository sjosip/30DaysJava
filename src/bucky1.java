import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bucky1 {


    public static void main(String[] args) {

      /* String s = "buckyrobertsthenewboston";
       String a = "Bacon ";
       String b = "Monster";
       System.out.println(a.concat(b));
       System.out.println(a.replace('B', 'F'));
       System.out.println(s.indexOf("rob", 17));
       System.out.println(factorial(5));*/
        //collections();
        // printMe

        // LinkedList
// List string formating
        /*
        String[] things = {"apples", "noobs", "pwenge", "bacon", "goAAts"};
        List<String> list1 = new LinkedList<String>();
        for (String x : things)
            list1.add(x);

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for (String y : things2)
            list2.add(y);

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);

    }

    private static void printMe(List<String> l) {
        for (String b : l)
            System.out.printf("%s ", b);
        System.out.println();*/
//Array converted to list for making methods
    /*    String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumpklin");
        thelist.addFirst("firstthings");
        thelist.addLast("kokoska");

        // convert back to an array
        stuff = thelist.toArray(new String[thelist.size()]);

        for(String x : stuff)
            System.out.printf("%s ", x);*/

        //Collection methods sort
       /* String[] crap = {"apples", "lemons", "geeeses", "bacon", "youtube"};
        List<String > l1 = Arrays.asList(crap);

        Collections.sort(l1);
        System.out.printf("%s\n ", l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n ", l1);*/

        //methods collection reversae and copy

        //creat  an array and converte to list
        Character[] ray = {'p', 'a', 'w', 'n'};
        List<Character> lis = Arrays.asList(ray);
        System.out.println("List is : ");
        output(lis);

        Collections.reverse(lis);
        System.out.println("After reverse : ");;
        output(lis);

        //create a new array and anew list
        Character[] newRay = new Character[4];
        List<Character> listCopy = Arrays.asList(newRay);

        //copy content of list into listcopy
        Collections.copy(listCopy, lis);
        System.out.println("Copy of list : ");
        output(listCopy);

        // fill collection with crap
        Collections.fill(lis, 'x');
        System.out.println("After filling the list : ");
        output(lis);

    }

    //removeStuff
   /* private static void removeStuff(List<String> l, int from, int to) {
        l.subList(from, to).clear();
    }

    //reverseMe
    private static void reverseMe(List<String> l) {
        ListIterator<String> bobby = l.listIterator(l.size());
        while (bobby.hasPrevious())
            System.out.printf("%s ", bobby.previous());
    }

    /*
    public static long factorial(long n) { // recursion
        if (n <= 1)
            return 1;
        else
            return  n * factorial(n-1);
    }
    public static void collections() {
        String [] things = {"eggs", "lasers", "hats", "bacon", "pie"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list
        for(String x: things)
            list1.add(x);

        String [] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();
        for (String y: moreThings)
            list2.add(y);
        // prinz out list 1
        for(int i = 0; i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));
        }
        editList(list1, list2);
        System.out.println();

        for(int i = 0;i < list1.size(); i ++){
            System.out.printf("%s ", list1.get(i));
        }

    }
    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            if(l2.contains(it.next()))
                it.remove();
        }
    }
*/

    //new output method
private static void output(List<Character> thelist ) {

    for(Character thing : thelist)
        System.out.printf("%s ", thing );
    System.out.println();


}



}

