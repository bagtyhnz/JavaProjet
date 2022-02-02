import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {

        //ArrayList WITHOUT Generics
        ArrayList items = new ArrayList();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//      items.add("apple"); //will give run time error

        printDouble(items);

    }
    private static void printDouble(ArrayList items) {
        for (Object i: items) {
            System.out.println((Integer)i*2); //casting MUST be provided
        }

//__________________________________________________________________
        System.out.println("____________________________");
        //ArrayList WITH Generics
        ArrayList <Integer> gItems = new ArrayList<Integer>();

        gItems.add(1);
        gItems.add(2);
        gItems.add(3);
        gItems.add(4);
//      gItems.add("apple"); //directly gives compiler error

        printGenericDouble(gItems);

    }
    private static void printGenericDouble(ArrayList<Integer> gItems) {
        for (int j: gItems) {
            System.out.println(j * 2); //no need for casting
        }
    }





}
