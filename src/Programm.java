import java.util.ArrayList;

public class Programm
{
    ArrayList<Pferd> allePferde = new ArrayList<>();

    public void Start()
    {
        Pferd herbert = new Pferd("Herbert", 9);
        Pferd monika = new Pferd("Monika", 13);
        allePferde.add(herbert);
        allePferde.add(monika);
        Pferd.stall = "Hachinghausen";

        StelltEuchAlleVor();

        Pferd.stall = "Huchbachtal";

        StelltEuchAlleVor();
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
