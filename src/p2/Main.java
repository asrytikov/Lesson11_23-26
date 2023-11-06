package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>(Arrays.asList("Alex", "Ivan"));
        names.ensureCapacity(100);

        Collections.addAll(names, "Sasha", "Katya", "Elena");

        names.add("Alex");
        names.add("Masha");
        names.add("Igor");
        names.add(1, "Tanya");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println(names.get(3));

        names.set(3, "Vlad");

        System.out.println(names.size());

        if (names.contains("Masha2")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        names.remove("Masha");
        names.remove(0);

        for (String name: names){
            System.out.println(name);
        }

        Object[] nameArray = names.toArray();
        for(Object name: nameArray){
            System.out.println(name);
        }

        System.out.println(nameArray);

    }

}
