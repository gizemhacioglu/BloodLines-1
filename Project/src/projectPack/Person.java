package projectPack;

import java.util.ArrayList;

public class Person {
    static int personCounter = 0;
    int id;
    Relation parents;
    String name;
    String surname;
    String birthday;
    Boolean gender;

    ArrayList<Person> persons = new ArrayList<Person>();



    public Person(projectPack.Relation parents, String name, String surname, String birthday, Boolean gender){
        this.parents = parents;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        id = personCounter;
        personCounter++;
    }


    public Relation getParents() {
        return parents;
    }

    public void setParents(Relation parents) {
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }


}
