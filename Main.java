import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Munir's CW1");
        System.out.println("Welcome to my Spotify clone!");
        System.out.println("1:Add Song");
        System.out.println("2: remove Song");
        System.out.println("3: print all song list");
        System.out.println("4: play Count");

        Song midnightrain = new Song(1,"song name","Taylor Swift");
        Song badHabit = new Song (2, "song name", "steve Lacy");
        Song monotonia = new Song (3, "song name ", "Shakria");
        ArrayList<Song> songslist = new ArrayList<Song>();
        songslist.add (midnightrain);
        songslist.add(badHabit);
        songslist.add(monotonia);
        for(Song current : songslist)
        {
            current.print();
        }

    }

}
