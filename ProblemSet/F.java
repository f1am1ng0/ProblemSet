import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class F {
    private ArrayList<Integer> arr = new ArrayList<>();
    private Map<Integer,Integer> mp = new HashMap<>();

    public boolean insert(int element) {
        if (mp.containsKey(element)) {
            return false;
        }
        mp.put(element,arr.size());
        arr.add(element);
        return true;
    }

    public boolean remove(int element) {
        if (!mp.containsKey(element)) {
            return false;
        }

        int index = mp.get(element);
        int last = arr.get(arr.size() - 1);
        arr.set(index,last);
        mp.put(last,index);
        mp.remove(element);
        arr.remove(arr.size() - 1);
        return true;
    }

    public void display(){
        for (Integer x : arr) {
            System.out.println(x);
        }
    }
}

class Check {
    public static void main(String[] args) {
        F f = new F();
        f.insert(10);
        f.insert(15);
        f.insert(20);
        f.insert(25);
        f.display();
        System.out.println();
        f.remove(25);
        f.remove(20);
        f.display();
    }
}