public class Pferd
{
    public String name;
    public int hausnummer;

    public Pferd(String name, int hausnummer, String stallName)
    {
        this.name = name;
        this.hausnummer = hausnummer;
        Stall.name = stallName;
    }

    public void StellDichVor()
    {
        System.out.println("Hallo, ich bin '" + name
                + "', wohne im Stall '" + Stall.name
                + "', Hausnummer " + hausnummer + ".");
    }

    public void ZiehUm(int neueHausnummer)
    {
        hausnummer = neueHausnummer;
    }
}
