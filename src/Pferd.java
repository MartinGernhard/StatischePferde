public class Pferd
{
    public static String stall;
    public String name;
    public int hausnummer;

    public Pferd(String name, int hausnummer, String stall)
    {
        this.name = name;
        this.hausnummer = hausnummer;
        this.stall = stall;
    }

    public void StellDichVor()
    {
        System.out.println("Hallo, ich bin '" + name + "', wohne im Stall '" + stall + "', Hausnummer " + hausnummer + ".");
    }
}
