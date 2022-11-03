public class Song 
{
    private int No;
    private String title;
    private String name;

    public Song (int No, String title, String name)
    {
        this.No = No;
        this.name = name;
        this.title = title;
    }
    public void print()
    {
        System.out.println("No: " + this.No + "Song title: " + this.title + "\tArtist Name:" + this.name );
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
