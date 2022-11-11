import java.util.ArrayList;

public class Programm {
    public void StellEuchAllVor(ArrayList<Pferd> pferde)
    {
        int i = 0;
        while(i < pferde.size())
        {
            Pferd p = pferde.get(i);
            p.StellDichVor();
            i++;
        }
    }

    public void Start()
    {
        ArrayList<Pferd> allePferde = new ArrayList<>();
        Pferd a = new Pferd("Herbert", 9);
        Pferd b = new Pferd("Monika", 13);
        allePferde.add(a);
        allePferde.add(b);
        Pferd.stall = "Hachinghausen";

        StellEuchAllVor(allePferde);

        a.stall = "Huchbachtal";

        StellEuchAllVor(allePferde);
    }
}
