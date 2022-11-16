package linearsearch;

/**
 * @author liujl
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Alice"), new Student("Bob"), new Student("Charlie")};
        Student bob = new Student("Bob");
        int res = LinearSearch.search(students, bob);
        System.out.println(res);
    }
}
