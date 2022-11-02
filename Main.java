public class Main {
    public static void main(String[] args)
    {
        System.out.println("Munir's CW1");
        printHeading();
        executeMenuChoice();

    }
    private static void executeMenuChoice ()
    {
        boolean appIsRunning = true;
        while(appIsRunning == true)
        {
            int choice = getMenuChoice();
            switch(choice)
            {
                case 1: addSong();break; 
                case 2: deleteSong ();break;
                case 3: printAllSongs();break;
                case 4:appIsRunning = false;break;
            }
        }

        
    }
    private static int getMenuChoice()
    {
        printTitle("Top 10 Songs App");
        int choice = 0;
        boolean isValid = false;
        while(isValid==false)
        {
            System.out.println("1 Add Song");
            System.out.println("2 Delete Song");
            System.out.println("3 Print all songs");
            System.out.println("4 Print popular songs");
            System.out.println("5 Quit");
            choice = InpurReader.getInt("\n please enter your choice(1 to 5)>");
            if (choice < 1|| choice > 5)
            { 
                System.out.println("\n invalid choice");

            }
            else isValid = true;
        }
        return choice;
    }
}