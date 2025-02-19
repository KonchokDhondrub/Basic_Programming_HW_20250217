//  Реализовать (по аналогии кода занятия) MyLinkedList для хранения Person.
//  Попробуйте реализовать метод get(int index)

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyLinkedList();
        myList.add(new Person("John", 22));
        myList.add(new Person("Jack", 23));
        myList.add(new Person("Jannet", 24));

        int select = 1;
        /*
        System.out.printf("\tPrint Individual by index [%d]%n",select);
        System.out.println(myList.get(select));

        System.out.printf("\tPrint all of: %d persons %n", myList.size());
        myList.print();
        */

//        System.out.printf("\nRemove Individual by index [%d]\n", select);
//        System.out.println(myList.remove(select));
//
//        System.out.printf("\nPrint all of: %d persons %n", myList.size());
//        myList.print();


        Iterator<Person> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------- For each -------");
        for (Person prs : myList){
            System.out.println(prs);
        }
    }
}