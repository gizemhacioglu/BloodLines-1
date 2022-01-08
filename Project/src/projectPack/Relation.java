package projectPack;

import java.util.ArrayList;

public class Relation {
    Person spouse1;
    Person spouse2;
    static int relCounter = 1;
    int id;

    ArrayList<Relation> relations = new ArrayList<Relation>();
    ArrayList<Person> children = new ArrayList<Person>();


    public Relation(Person spouse1, Person spouse2) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
        id = relCounter;
        relCounter++;
    }
}
