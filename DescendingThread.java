package HackerChase;

// tries in descending order
public class DescendingThread extends HackerThread{
    // initialise with vault from main
    public DescendingThread(Vault vault){
        super(vault);
    }

    @Override
    public void run(){
        // try guessing from max to 0
        for (int guess = Main.MAX_PASSWORD; guess >= 0; guess--){
            if(vault.isCorrectPassword(guess)){
                // check if correct
                System.out.println(this.getName() + " guessed the password " + guess);
                // exit when found
                System.exit(0);
            }
        }
    }
}