import java.util.ArrayList;

public class ListExceptions {
    public ListExceptions(){
    }
    public void castInt() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(24);
        myList.add("Ninja");
        myList.add(15);
        myList.add("World");
        myList.add(10);
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            }
            catch (ClassCastException e) {
                System.out.println(e);
            }
        }
    }
}
