//  Реализовать (по аналогии кода занятия) MyLinkedList для хранения Person.
//  Попробуйте реализовать метод get(int index)

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyLinkedList();
        myList.add(new Person("John", 22));
        myList.add(new Person("Jack", 23));
        myList.add(new Person("Jannet", 24));

        int select = 0;
        System.out.printf("--- Print Individual [%d]---%n",select);
        System.out.println(myList.get(select));

        System.out.printf("--- Print All --- of: %d persons %n", myList.size());
        myList.print();
//        System.out.println(myList);
    }
}