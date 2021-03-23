package javaa.lab3.opdr6;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        System.out.println("Voor gelijkstellen is de naam van client2: " + client2.getName()); //Zelf toegevoegd
        client2 = client1;
        System.out.println("Voor de bewerking is de naam van client1: " + client1.getName()); //Zelf toegevoegd
        System.out.println("Voor de bewerking is de naam van client2: " + client2.getName()); //Zelf toegevoegd
        //client2.name = "Joris"; Dit stukje code even aangepast.
        client2.setName("Joris");

        System.out.println("Ik denk Joris. En het is: " + client1.getName());
    }
}
