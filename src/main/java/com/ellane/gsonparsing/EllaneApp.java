package com.ellane.gsonparsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class EllaneApp {
    private int roundCount = 50;
    Boolean gameEnds = false;


    Scanner scan = new Scanner(System.in);

    public void initialize() throws InterruptedException {
        gameWelcomeMessage();
        promptToStartGame();
    }

    private void gameWelcomeMessage() {

        String banner = null;
        if (Files.exists(Path.of("com.ellane.app/resources/gameArt.txt"))) {
            try {
                banner = Files.readString(Path.of("com.ellane.app/resources/gameArt.txt"));
                System.out.println(banner);
                System.out.println("\n");
                System.out.println("Ellane Needs your Help!");
                System.out.println("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("file wasn't found");
        }
    }

    private void promptToStartGame() throws InterruptedException {
        System.out.println("Do you wish to play? type 'yes' or type 'quit game'");
        String userInput = scan.nextLine().toLowerCase();
        System.out.println("user input: " + userInput);

        if(userInput.equals("quit game")) {
            System.out.println("...Thanks for playing! Goodbye!");
        }

        if(userInput.equals("yes")) {
            System.out.println("Let's Play!");
            startGame();
        } else {
            System.out.println("INVALID INPUT");
        }
    }

    private void startGame() throws InterruptedException {
        displayGameInfo();
    }

    private void displayGameInfo() throws InterruptedException {
        System.out.println("The chaos spreads & the bombs keep exploding around the city");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The fire is spreading from building to building & most signs of life as gone!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("you get stuck inside of a building, but it can collapse at any minute & fire is spreading");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Luckily there id a helicopter on the roof evacuating the survivors that made it to the roof");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Unfortunately, you have been wounded & are losing blood as more time passes");
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Time is ticking & you don't have much time!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("A dying woman tells you her sick daughter Ellane is stuck somewhere inside & asked you to save & escape together");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The objectives you have are simple:");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("- collect the 3 items needed for a cure to save Ellane");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("- Find Ellane");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("- Safely make it to the roof to escape by helicopter before 50 turns pass");
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        Player player = new Player();
        player.makeDecision();

    }
}


