import java.util.ArrayList;

public class Programm
{
    ArrayList<Pferd> allePferde = new ArrayList<>();

    public void boxingIntTest(Integer geboxederInt)
    {
        geboxederInt = 12;
    }

    public void machWasMitPferdUndInt(Pferd p, int i)
    {
        p.ZiehUm(101);
        i = 19;
    }

    public void Start1()
    {
        Pferd herbert = new Pferd("Herbert", 9, "Hachinghausen");
        Pferd monika = new Pferd("Monika", 13, "Huchinghausen");
        allePferde.add(herbert);
        allePferde.add(monika);
        StelltEuchAlleVor();
        System.out.println("Die Hausnummer ist: " + monika.hausnummer);
    }

    public void Start2()
    {
        Pferd herbert = new Pferd("Herbert", 9, "Hachinghausen");
        allePferde.add(herbert);
        StelltEuchAlleVor();
        int tollerInt = 3;
        machWasMitPferdUndInt(herbert, tollerInt);
        System.out.println("NACHHER(bert)");
        StelltEuchAlleVor();
        System.out.println("tollerInt = " + tollerInt);

        // WTF. Boxed is immutable.
        int andererInt = 5;
        boxingIntTest(andererInt);
        System.out.println("andererInt = " + andererInt);

        Pferd.StallTuerZu();
        herbert.StallTuerZu();
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
