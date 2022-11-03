import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Munir's CW1");
        System.out.println("Welcome to my Spotify clone!");

        Song midnightrain = new Song(1,"Taylor swift");
        Song badHabit = new Song (2,"steve Lacy");
        ArrayList<Song> songslist = new ArrayList<Song>();
        songslist.add (midnightrain);
        songslist.add(badHabit);
        for(Song current : songslist)
        {
            current.print();
        }

    }

}
