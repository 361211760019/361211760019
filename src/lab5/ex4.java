package lab5;

import java.util.ArrayList;

public class ex4 {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        myList.add("Ben");
        myList.add("Som");
        myList.add("Jan");
        myList.add("Nan");
        myList.add("May");

        System.out.println(myList);

        myList.add(2,"ji");
        System.out.println(myList);

        myList.remove("Jan");
        System.out.println(myList);
        System.out.println(myList.indexOf("Mays"));
    }

}
