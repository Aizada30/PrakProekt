package peaksoft.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {

    private Long id;
    private String name;
    private LocalDate crearedAt;
    private Students[] students;

    public Group(Long id, String name, LocalDate crearedAt) {
        this.id = id;
        this.name = name;
        this.crearedAt = crearedAt;
    }

    public Group(Long id, String name, LocalDate crearedAt, Students[] students) {
        this.id = id;
        this.name = name;
        this.crearedAt = crearedAt;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCrearedAt() {
        return crearedAt;
    }

    public void setCrearedAt(LocalDate crearedAt) {
        this.crearedAt = crearedAt;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group: " +
                "\nid: " + id +
                "\nname: " + name +
                "\ncrearedAt: " + crearedAt +
                "\nstudents: " + Arrays.toString(students) ;
    }
}
