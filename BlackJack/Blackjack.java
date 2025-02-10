import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Cards{
    //define enumerations
    public enum card_suit{
        DIAMOND, SPADE, HEART, CLUB
    }

    public enum card_rank{
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    //Declare objects
    private card_suit Suit;
    private card_rank Rank;
    private int card_value;
    
    //Declare constructor
    public Cards(){
        Random generator = new Random();

        //Generate the suit of card
        int suitofcard = generator.nextInt(1,5);
        if (suitofcard == 1){
            Suit = card_suit.CLUB;
        } else if (suitofcard == 2){
            Suit = card_suit.DIAMOND;
        } else if (suitofcard == 3){
            Suit = card_suit.HEART;
        } else if (suitofcard == 4){
            Suit = card_suit.SPADE;
        }

        //Generate the rank of card and the value
        int rankofcard = generator.nextInt(1,14);
        if (rankofcard == 1){
            Rank = card_rank.ACE;
            card_value = 11;
        }else if (rankofcard == 2){
            Rank = card_rank.TWO;
            card_value = 2;
        }else if (rankofcard == 3){
            Rank = card_rank.THREE;
            card_value = 3;
        }else if (rankofcard == 4){
            Rank = card_rank.FOUR;
            card_value = 4;
        }else if (rankofcard == 5){
            Rank = card_rank.FIVE;
            card_value = 5;
        }else if (rankofcard == 6){
            Rank = card_rank.SIX;
            card_value = 6;
        }else if (rankofcard == 7){
            Rank = card_rank.SEVEN;
            card_value = 7;
        }else if (rankofcard == 8){
            Rank = card_rank.EIGHT;
            card_value = 8;
        }else if (rankofcard == 9){
            Rank = card_rank.NINE;
            card_value = 9;
        }else if (rankofcard == 10){
            Rank = card_rank.TEN;
            card_value = 10;
        }else if (rankofcard == 11){
            Rank = card_rank.JACK;
            card_value = 10;
        }else if (rankofcard == 12){
            Rank = card_rank.QUEEN;
            card_value = 10;
        }else if (rankofcard == 13){
            Rank = card_rank.KING;
            card_value = 10;
        }
    }
    
    //overloaded constructor
    public Cards(String suit_constructor, int rank_constructor){

        //manually assign the suit
        if (suit_constructor == "diamond"){
            Suit = card_suit.DIAMOND;
        } else if (suit_constructor == "spade"){
            Suit = card_suit.SPADE;
        } else if (suit_constructor == "heart"){
            Suit = card_suit.HEART;
        } else if (suit_constructor == "club"){
            Suit = card_suit.CLUB;
        }
        
        //manually assign the rank
        if (rank_constructor == 1){
            Rank = card_rank.ACE;
        } else if (rank_constructor == 2){
            Rank = card_rank.TWO;
        } else if (rank_constructor == 3){
            Rank = card_rank.THREE;
        } else if (rank_constructor == 4){
            Rank = card_rank.FOUR;
        } else if (rank_constructor == 5){
            Rank = card_rank.FIVE;
        } else if (rank_constructor == 6){
            Rank = card_rank.SIX;
        } else if (rank_constructor == 7){
            Rank = card_rank.SEVEN;
        } else if (rank_constructor == 8){
            Rank = card_rank.EIGHT;
        } else if (rank_constructor == 9){
            Rank = card_rank.NINE;
        } else if (rank_constructor == 10){
            Rank = card_rank.TEN;
        } else if (rank_constructor == 11){
            Rank = card_rank.JACK;
        } else if (rank_constructor == 12){
            Rank = card_rank.QUEEN;
        } else if (rank_constructor == 13){
            Rank = card_rank.KING;
        }
    }

    //Methods
    public card_suit getSuit(){
        return Suit;
    }

    public card_rank getRank() {
        return Rank;
    }
    
    public int getValue() {
        return card_value;
    }


    public String getFace(){
        String s;
        String r;

        //Assign the suits 
        if (Suit == card_suit.CLUB){
            s = "\u2663";
        } else if (Suit == card_suit.HEART){
            s = "\u2661";
        } else if (Suit == card_suit.DIAMOND){
            s = "\u2662";
        } else if (Suit == card_suit.SPADE){
            s = "\u2660";
        } else {
            s = "null";
        }

        //Assign the ranks
        if (Rank == card_rank.ACE){
            r = "A";
        } else if (Rank ==card_rank.TWO){
            r = "2";
        } else if (Rank ==card_rank.THREE){
            r = "3";
        } else if (Rank ==card_rank.FOUR){
            r = "4";
        } else if (Rank ==card_rank.FIVE){
            r = "5";
        } else if (Rank ==card_rank.SIX){
            r = "6";
        } else if (Rank ==card_rank.SEVEN){
            r = "7";
        } else if (Rank ==card_rank.EIGHT){
            r = "8";
        } else if (Rank ==card_rank.NINE){
            r = "9";
        } else if (Rank ==card_rank.TEN){
            r = "T";
        } else if (Rank ==card_rank.JACK){
            r = "J";
        } else if (Rank ==card_rank.QUEEN){
            r = "Q";
        } else if (Rank ==card_rank.KING){
            r = "K";
        } else {
            r = null;
        }
        return (s + r);
} 
}
public class Blackjack{
    public static void clearScreen() {
        System.out.flush();
    }
    
    //methods to count the total points in a hand
    public static int countDealer(ArrayList<Cards> Dealer) {
        int DealerScore = 0;
        for (int i = 0; i < Dealer.size(); i++) {
            DealerScore = DealerScore + Dealer.get(i).getValue();
        }

        return DealerScore;
    }

    public static int countPlayer(ArrayList<Cards> Player) {
        int PlayerScore = 0;
        for (int i = 0; i < Player.size(); i++) {
            PlayerScore = PlayerScore + Player.get(i).getValue();
        }

        return PlayerScore;
    }
    

    //Methods to dislay the cards
    public static void displayPlayer(ArrayList<Cards> Player) {
        System.out.print("Player: ");
        for (int i = 0; i < Player.size(); i++) {
            System.out.print(Player.get(i).getFace());
        }
    }

    public static void displayDealer(ArrayList<Cards> Dealer) {
        System.out.print("Dealer: " );
        for (int i = 0; i < Dealer.size(); i++) {
            System.out.print(Dealer.get(i).getFace());
        }
    }

    public static void main(String[] args) {
    System.out.println("Welcome to the BlackJack table");
    Scanner game = new Scanner(System.in);
    System.out.println("I would like to gamble, affirm? (enter q to quit or other key to continue)");
    if (game.hasNext("q")){
        System.out.println("You don't want to gamble? What a shame. It's the fastest way to generational wealth pluh");
        System.out.println("You are no longer welcomed to the Blackjack table because you hate gambling... womp womp");
    } else {
        System.out.println("Sweet, let's get started");

        //initialize dealer and player card points
        int dealer_score = 0;
        int player_score = 0;

        //create arrays for dealer and player deck
        ArrayList<Cards> dealer = new ArrayList<Cards>();
        ArrayList<Cards> player = new ArrayList<Cards>();

        //initialize position in the arrays
        int dealer_pos = 1;
        int player_pos = 1;

        //deal and display one dealer card and two player cards
        dealer.add(new Cards());
        dealer.add(new Cards());
        player.add(new Cards());
        player.add(new Cards());
            

        //display the hands and points
        System.out.println("Dealer:" + dealer.get(0).getFace() + "??");
        displayPlayer(player);
        
        dealer_score = dealer_score + countDealer(dealer);
        player_score = player_score + countPlayer(player);

        System.out.println("");
        System.out.println("Player Score: " + player_score);

        //check for 21s
        if (player_score == 21 && dealer_score != 21) {
            clearScreen();
            System.out.print("BLACKJACK: Player Wins!");
            return;
        }

        if (player_score == 21 && dealer_score == 21) {
            clearScreen();
            System.out.print("PUSH: The game is tied");
            return;
            
        }

        if (player_score != 21 && dealer_score == 21) {
            clearScreen();
            System.out.print("BLACKJACK: Dealer Wins!");
            return;
        }
        

        //boolean variable to check if player wants to play another hand
        boolean continue_ = true;

        while (true) {
            System.out.println("Enter H to hit or S to stand");
            String input = game.nextLine().toLowerCase();
            if (input.equals("h")) {
                game.next();
                player.add(new Cards());
                player_score = countPlayer(player);
                clearScreen();
                System.out.println("Dealer: " + dealer.get(0).getFace() + "??");
                displayPlayer(player);
                System.out.println();
                player_score = countPlayer(player);
                System.out.println("Player Score: " + player_score);
                if (player_score == 21 && dealer_score != 21) {
                    System.out.print("BLACKJACK: Player Wins!");
                    break;
                }
                if (player_score == 21 && dealer_score == 21) {
                    System.out.print("PUSH: The game is tied");
                    break;
                }
                if (player_score != 21 && dealer_score == 21) {
                    System.out.print("BLACKJACK: Dealer Wins!");
                    break;
                }
                if (player_score > 21) {
                    System.out.print("BUST: Dealer Wins!");
                    break;
                }
            } else if (input.equals("s")) {
                game.next();
                break;
            }
        }
        
        while (true) {
            if (dealer_score > 16) {
                break;
            } else if (dealer_score < 17) {
                dealer.add(new Cards());
            }
        }

        clearScreen();
        displayDealer(dealer);
        displayPlayer(player);

        }   
        }
}
