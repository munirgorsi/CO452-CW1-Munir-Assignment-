public class Song 
{
    private int No;
    private String name;

    public Song (int No, String name)
    {
        this.No = No;
        this.name = name;
    }
    public void print()
    {
        System.out.println("No: " + this.No + "\tSong Name:" + this.name );
    }
    public int getID()
    {
        return this.No;
    }
    public String getName()
    {
        return this.name;
    }

}
