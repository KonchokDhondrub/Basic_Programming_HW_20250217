//  Реализовать (по анологии кода занятия) MyLinkedList для хранения Person.
//  Попробуйте реализовать метод get(int index)

public class Main {
    public static void main(String[] args) {
                MyList myList = new MyLinkedList();
                myList.add("str1");
                myList.add("str2");
                myList.add("str3");
                myList.add("str4");

                System.out.println(myList.size());
                //System.out.println(myList.get(0));
                myList.print();

    }
}