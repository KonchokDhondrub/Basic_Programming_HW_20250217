//  Реализовать (по аналогии кода занятия) MyLinkedList для хранения Person.
//  Попробуйте реализовать метод get(int index)

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

        System.out.printf("\nRemove Individual by index [%d] - [%s]\n", select, myList.get(select));
        myList.remove(select);

        System.out.printf("\nPrint all of: %d persons %n", myList.size());
        myList.print();

    }
}