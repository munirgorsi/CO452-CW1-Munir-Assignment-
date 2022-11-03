import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Munir's CW1");
        System.out.println("Welcome to my Spotify clone!");

        Song midnight rain = new Song(1,"Taylor swift");
        Song bad Habit = new Song (2,"steve Lacy");
        ArrayList<Song> songslist = new ArrayList<Song>();
        songslist.add (midnight rain);
        songslist.add(bad Habit);
        for(Song current : songslist)
        {
            current.print();
        }

    }

}
