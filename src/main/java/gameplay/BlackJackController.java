package gameplay;

public class BlackJackController {
    public boolean validateAction(String action){
        return action!=null && (action.equalsIgnoreCase("hit") || action.equalsIgnoreCase("stand"));
    }
}
