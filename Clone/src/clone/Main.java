package clone;

/**
 *
 * @author ahmed
 */
public class Main {

    public static void main(String[] args) {

        Ahmed a = new Ahmed(1000, "ahmed", "tarek");

        try {
            Ahmed a2 = (Ahmed) a.clone();

            System.out.println(a2.f_name);

        } catch (CloneNotSupportedException ex) {

        }

    }

}
