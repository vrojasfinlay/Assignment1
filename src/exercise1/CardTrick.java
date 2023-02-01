package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * editing for push trial purposes
 * Date updated: February 1, 2023
 * Update by: Victoria Rojas - 991700683
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        
        //card.setValue and card.setSuit
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(randomNumber.nextInt(13) + 1);
            card.setSuit(Card.SUITS[randomNumber.nextInt(4)]);
            hand[i] = card;
        }  
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        System.out.print("Enter a card value between 1-12. \n" +
                          "(1-9 or 10 for jack, 11 for queen, 12 for king):");
        int value = input.nextInt();
        System.out.print("Enter a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String suit = input.next();
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        // Then loop through the cards in the array to see if there's a match.
        boolean cardMatch = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit() == userCard.getSuit()) {
                cardMatch = true;
                break;
            }
        }
        // If the guess is successful, invoke the printInfo() method below.
         if (cardMatch == true) {
            System.out.println("Your card was found in the hand!");
            printInfo();
        } else {
            System.out.println("The card you chose was not found in the hand");

        }
    }

    
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     *updated by Victoria Rojas on Feb 1, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Victoria, but you can call me Vic or V!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Successfully complete my program and get a good job in the industry");
        System.out.println("Gain hands on experience and increase my knowledge wherever I can");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Cooking new recipes");
        System.out.println("Watching HGTV and Food Network");
        System.out.println("Spending time with my husband");
        System.out.println("Playing with my two cats");

        System.out.println();
        
    
    }

}

