public interface MyList extends Iterable<Person> {

    void add(Person element);
    int size();
    Person get(int index);
    String remove(int index);

    void print();
}
