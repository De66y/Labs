package javaa.labs7.opdr12;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday();
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders());

        Person t = new Person ("Truus", 130, Gender.FEMALE);
        t.haveBirthday();

        String string1 = "debby";
        String string2 = "debby";
        System.out.println("123" == "123");
        System.out.println(string1.equals(string2));
    }
}
