
import java.util.ArrayList;
public class Main 
{
    public static ArrayList<Song> songslist;
    public static void main(String[] args)
    {    
        System.out.println();
        System.out.println("Munir's CW1");
        System.out.println();
        System.out.println("Welcome to my Spotify clone!");
        System.out.println();

        MainApp();
        showMenu();




    }

    public static void showMenu()
    {
        System.out.println("**********************");
        System.out.println("Menu");
        System.out.println("**********************");
        System.out.println();
        System.out.println("1: Add Song");
        System.out.println("2: remove Song");
        System.out.println("3: print all song list");
        System.out.println("4: play Count");
        System.out.println();

        int choice = InputReader.getInt("Enter menu number: ");
        if(choice == 3)
        {
            print();
        }
        if(choice == 4)
        {
            getCount();
        }
        if(choice == 1)
        {
            getName();
        }
        if (choice == 2)
        {
            getID();
        }


    }

    public static void MainApp()
    {
        Song midnightrain = new Song(1,"midnightrain","Taylor Swift","127444");
        Song Sorry = new Song (2,"Sorry", " Justin Bieber","341245");
        Song monotonia = new Song (3, "monotonia", "Shakria","35633828");
        Song Hello = new Song(4, "Hello", "Adele", "36533443");
        Song Roar = new Song(5,"Roar","Kary Perry", "27398");
        Song Sugar = new Song(6,"Sugar", "Maroon", "4782652");
        Song Rude = new Song (7, "Rude", "Magic!", "67890654");
        Song Burn = new Song(7,"Burn", "Ellie Goulding", "231754");
        Song Diamonds = new Song(8,"Diamonds", "Rihanna", "4323552");
        Song Pillowtalk = new Song(9,"Pillowtalk", "Zayn", "3256388");
        Song Royals = new Song(10, "Royals", "Lorde", "56834262");
        songslist = new ArrayList<Song>();
        songslist.add (midnightrain);
        songslist.add(Sorry);
        songslist.add(monotonia);
        songslist.add(Hello);
        songslist.add(Roar);
        songslist.add(Sugar);
        songslist.add(Rude);
        songslist.add(Burn);
        songslist.add(Diamonds);
        songslist.add(Pillowtalk);
        songslist.add(Royals);
    }

    public static void print()
    {
        for(Song current : songslist)
        {
            current.print();
        }
       
    }
    public static void getCount()
    {
        for(Song getCount : songslist)
        {
            getCount.print();
        }
    }
    

        
public static void getName()

{
    String songname;
    songname = InputReader.getString("Enter Song title: ");
    songname = InputReader.getString("Enter Artist Name: ");
    songname = InputReader.getString("Count Play: ");
    for(Song current : songslist)
    {
        current.print();
 
   }
    System.out.println(songname);


}   
public static void getID()

{
    String remove;
    print();

    remove = InputReader.getString("Enter the number of song from list to remove");  
    System.out.println(remove);
}

}

   

