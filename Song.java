public class Song 
{
    private int No;
    private String title;
    private String name;
    private String Count;

    public Song (int No, String title, String name, String Count)
    {
        this.No = No;
        this.name = name;
        this.title = title;
        this.Count = Count;
        
    }
    public void print()
    {
        System.out.println("No: " + this.No + "\tSong title: " + this.title + "\tArtist Name:" + this.name + "\tCount Play: " + this.Count);
    }
    public int getID()
    {
        return this.No;
    }
    public String getName()
    {
        return this.name;
    }
    public String getCount()
    {
        return this.Count;
    }
   

}
