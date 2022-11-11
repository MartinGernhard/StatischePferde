public class Pferd
{
    static String stall;
    String name;
    int hausnummer;

    public Pferd(String name, int hausnummer)
    {
        this.name = name;
        this.hausnummer = hausnummer;
    }

    public void StellDichVor()
    {
        System.out.println("Hallo, ich bin '" + name + "', wohne im Stall '" + stall + "', Hausnummer " + hausnummer + ".");
    }
}
