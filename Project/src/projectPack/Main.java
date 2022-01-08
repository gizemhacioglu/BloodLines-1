package projectPack;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Relation relation = new Relation();

        System.out.println("Kişi ekleme hoş geldiniz.");
        person.personAdder();//ilk kisi eklendi
        person.personAdder();//es eklendi
        relation.relationAdder(person.persons.get(0),person.persons.get(1));//relation yaratildi (spouse1 ve spouse 2)

        person.personAdder();//cocuk yaratildi
        person.childrenAdder(relation,0,2);//cocuk relationa eklendi

        person.persons.get(2).viewPersonInfo();
        /*
        person.personAdder();//dede yaratildi
        person.personAdder();//babaanne yaratildi
        relation.relationAdder(person.persons.get(3),person.persons.get(4));
        person.childrenAdder(relation,1,0);

        person.personAdder();//dede yaratildi
        person.personAdder();//anneanne yaratildi
        relation.relationAdder(person.persons.get(5),person.persons.get(6));
        person.childrenAdder(relation,2,1);
        person.persons.get(2).viewPersonInfo();//cocuk icin bilgileri bastirir
        */

    }
}
