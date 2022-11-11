import java.util.ArrayList;

public class Programm
{
    ArrayList<Pferd> allePferde = new ArrayList<>();

    public void Start()
    {
        Pferd herbert = new Pferd("Herbert", 9, "Hachinghausen");
        Pferd monika = new Pferd("Monika", 13, "Huchinghausen");
        allePferde.add(herbert);
        allePferde.add(monika);
        StelltEuchAlleVor();

        // System.out.println("Der Stall ist: " + Pferd.stall);
        System.out.println("Die Hausnummer ist: " + monika.hausnummer);
    }

    public void StelltEuchAlleVor()
    {
        int i = 0;
        while (i < allePferde.size()) {
            Pferd p = allePferde.get(i);
            p.StellDichVor();
            i++;
        }
    }
}
