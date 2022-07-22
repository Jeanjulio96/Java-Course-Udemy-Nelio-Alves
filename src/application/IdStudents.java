package application;

public class IdStudents implements Comparable{

    private Integer id;

    public IdStudents(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @java.lang.Override
    public int compareTo(Object other) {
        return id;
    }
}
