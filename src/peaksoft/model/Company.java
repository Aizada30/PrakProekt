package peaksoft.model;

import java.util.Arrays;

public class Company {

    private Long id;
    private String name;
    private String country;
    private String adress;
    private Group[] groups;
    private Instructor[] instructors;
    private Students[] students;

    public Company(Long id, String name, String country, String adress) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.adress = adress;
    }

    public Company(Long id, String name, String country, String adress, Group[] groups, Instructor[] instructors, Students[] students) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.adress = adress;
        this.groups = groups;
        this.instructors = instructors;
        this.students = students;
    }

    public Company(String name, String country, String adress, Group[] groups, Instructor[] instructors, Students[] students) {
        this.name = name;
        this.country = country;
        this.adress = adress;
        this.groups = groups;
        this.instructors = instructors;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\n~~~Company~~~ " +
                "\nid: " + id +
                "\nname: " + name +
                "\ncountry: " + country +
                "\nadress: " + adress +
                "\ngroups: " + Arrays.toString(groups) +
                "\ninstructors: " + Arrays.toString(instructors) +
                "\nstudents: " + Arrays.toString(students);
    }
}
