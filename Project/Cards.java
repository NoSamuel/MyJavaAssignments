import java.util.Random;
public class Cards{
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

        //Generate the rank of card
        int rankofcard = generator.nextInt(1,14);
        if (rankofcard == 1){
            Rank = card_rank.ACE;
        }else if (rankofcard == 2){
            Rank = card_rank.TWO;
        }else if (rankofcard == 3){
            Rank = card_rank.THREE;
        }else if (rankofcard == 4){
            Rank = card_rank.FOUR;
        }else if (rankofcard == 5){
            Rank = card_rank.FIVE;
        }else if (rankofcard == 6){
            Rank = card_rank.SIX;
        }else if (rankofcard == 7){
            Rank = card_rank.SEVEN;
        }else if (rankofcard == 8){
            Rank = card_rank.EIGHT;
        }else if (rankofcard == 9){
            Rank = card_rank.NINE;
        }else if (rankofcard == 10){
            Rank = card_rank.TEN;
        }else if (rankofcard == 11){
            Rank = card_rank.JACK;
        }else if (rankofcard == 12){
            Rank = card_rank.QUEEN;
        }else if (rankofcard == 13){
            Rank = card_rank.KING;
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

    public card_rank getRank(){
        return Rank;
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

    public static void main(String[] args) {
        Cards Queen_of_heart = new Cards("heart", 12 );

        System.out.println("The following card should be the queen of hearts,");
        System.out.println(Queen_of_heart.getFace());

        System.out.println("10 Random cards....");
        Cards card_1 = new Cards();
        System.out.println(card_1.getFace());
        Cards card_2 = new Cards();
        System.out.println(card_2.getFace());
        Cards card_3 = new Cards();
        System.out.println(card_3.getFace());
        Cards card_4 = new Cards();
        System.out.println(card_4.getFace());
        Cards card_5 = new Cards();
        System.out.println(card_5.getFace());
        Cards card_6 = new Cards();
        System.out.println(card_6.getFace());
        Cards card_7 = new Cards();
        System.out.println(card_7.getFace());
        Cards card_8 = new Cards();
        System.out.println(card_8.getFace());
        Cards card_9 = new Cards();
        System.out.println(card_9.getFace());
        Cards card_10 = new Cards();
        System.out.println(card_10.getFace());

    }
}

