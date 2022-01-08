package projectPack;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Relation relation = new Relation();

        System.out.println("Kişi ekleme hoş geldiniz.");
        person.personAdder();
        person.personAdder();
        relation.relationAdder(person.persons.get(0),person.persons.get(1));
        System.out.println(relation.relations.size());
        System.out.println(person.persons.size());

    }
}
