package javaa.lab11;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Jane", 30);
        p.addHistory("test1");
        p.addHistory("test2");
        p.printHistory();
        System.out.println(p.createSubHuman().greet());
    }

}
