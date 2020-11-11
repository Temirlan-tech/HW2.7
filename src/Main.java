import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
        int A = 0;
        while (A != 5) {
            a.add(scannerA.next());
            A++;
        }
        Iterator<String> iterA = a.iterator();
        while (iterA.hasNext()) {
            System.out.print(iterA.next() + " ");
        }

        Scanner scannerB = new Scanner(System.in);
        ArrayList<String> b = new ArrayList<>();

        int B = 0;
        while (B != 5) {
            b.add(scannerB.next());
            B++;
        }
        Collections.reverse(b);

        Iterator<String> iterB = b.iterator();
        iterA = a.iterator();
        Iterator<String> iterC = c.iterator();

        while (iterA.hasNext() && iterB.hasNext()) {
            c.add(iterA.next());
            c.add(iterB.next());
        }
       iterC = c.iterator();

        while (iterC.hasNext()){
            String q1 = iterC.next();
            System.out.println(q1);
        }

        Comparator<String> comp1 = (o1, o2) -> {
            Integer f1 = o1.length();
            Integer f2 = o2.length();
            return f1.compareTo(f2);
        };
        c.sort(comp1);

    }
}
