package p3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Alex");
        names.add("Masha");
        names.addFirst("Katya");
        names.addLast("Ivan");

        names.add(1, "Misha");
        for(String name: names){
            System.out.println(name);
        }

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        if (names.contains("Masha")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        names.remove("Ivan");
        names.remove(1);
        names.removeFirst();
        names.removeLast();

        LinkedList<People> peoples = new LinkedList<>();

        Collections.addAll(peoples, new People("Masha"), new People("Alex"), new People("Katya"));

        People people = peoples.get(1);
        System.out.println(people.getName());

        System.out.println(people);

        System.out.println(peoples.remove(new People("Masha")));

        System.out.println("--------------");

        for (People p : peoples){
            System.out.println(p);
        }




    }
}
