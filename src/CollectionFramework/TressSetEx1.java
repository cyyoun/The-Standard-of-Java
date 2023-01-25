package CollectionFramework;

import java.util.TreeSet;

public class TressSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc"); set.add("are"); set.add("Apple3");
        set.add("car"); set.add("air"); set.add("disc");
        set.add("dance"); set.add("dZZZZ"); set.add("dzzz");
        set.add("java"); set.add("elevator"); set.add("ice");
        set.add("flower"); set.add("origin"); set.add("cream");

        System.out.println(set);
        System.out.println("range: " + from + " ~ " + to);
        System.out.println("result1:" + set.subSet(from, to));
        System.out.println("result2:" + set.subSet(from, to+"zzz"));
    }
}
