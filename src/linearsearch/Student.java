package linearsearch;

/**
 * @author liujl
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student another = (Student) obj;
            return this.name.equals(another.name);
        }
        return false;
    }
}
