package com.lld.blackjack;

import gameplay.BlackJackController;
import gameplay.BlackJackGame;
import gameplay.BlackJackGameView;
import model.Hand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import user.BlackjackPlayer;
import user.Dealer;
import user.Player;

import java.util.Scanner;

@Component
public class BlackJackRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        BlackjackPlayer player = new BlackjackPlayer();
        Dealer dealer = new Dealer();

        BlackJackGame game = new BlackJackGame(player, dealer);
        BlackJackGameView view = new BlackJackGameView();
        BlackJackController controller = new BlackJackController();

        game.start();
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;
        while(isPlaying){
            System.out.println("Enter your action hit/stand");
            String action = scanner.nextLine().trim();

            if(!controller.validateAction(action)){
                System.out.println("Invalid action! Try again");
                continue;
            }

            game.playAction(action, player.getHand());
            view.playAction(action, player.getHand());

            if("stand".equalsIgnoreCase(action)){
                isPlaying = false;
                System.out.println("Game Over. Final Hands shown");
            }

            if(player.getHand().getScores() > 21){
                System.out.println("You exceeded 21");
                isPlaying = false;
            }
        }
        scanner.close();

    }
}
