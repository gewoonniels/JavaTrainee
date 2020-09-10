import h3.Client;
import h3.HomeWork;

public class Start {

    public static void main(String[] args) {
        HomeWork h3 = new HomeWork();
        h3.showDifference();
        h3.calculateJ();
        System.out.println(h3.calculateBinary("1010", "100"));
        h3.calculateTime(23, 80);

        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.firstName = "Joris";

        System.out.println(client1.firstName);

    }
}
