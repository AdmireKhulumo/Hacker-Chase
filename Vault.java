package HackerChase;

// vault to be cracked by hacker threads
public class Vault {

    private final int password;
    public Vault(int password){
        this.password = password;
    }

    // for checking if the password supplied is correct
    public boolean isCorrectPassword(int guess){
        // wait a bit before tring again
        try{
            Thread.sleep(5);
        } catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        // compare and return correct or not
        return this.password == guess;
    }
}