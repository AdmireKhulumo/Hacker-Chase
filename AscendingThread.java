package HackerChase;


// first hacker -- guesses by iterating in order
public class AscendingThread extends HackerThread{
    // create the thread and suply the vault from main
    public AscendingThread(Vault vault){
        super(vault);
    }

    @Override
    public void run(){
        // iterate from 0 to max and try unlocking the vault
        for (int guess = 0; guess <= Main.MAX_PASSWORD; guess++){
            // check if guess is correct
            if(vault.isCorrectPassword(guess)){
                System.out.println(this.getName() + " guessed the password " + guess);
                // exit when found
                System.exit(0);
            }
        }
    }
}