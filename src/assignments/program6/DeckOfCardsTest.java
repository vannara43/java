/*
(Card Shuffling and Dealing) Modify Fig. 7.13 to deal a five-card
poker hand. 
Then modify class DeckOfCards of Fig. 7.12 to include
methods that determine whether a hand contains
1. a pair
2. two pairs
3. three of a kind (e.g., three jacks)
4. four of a kind (e.g., four aces)
5. a flush (i.e., all five cards of the same suit)
6. a straight (i.e., five cards of consecutive face values)
7. a full house (i.e., two cards of one face value and three cards of
another face value)
[Hint: Add methods getFace and getSuit to class Card of Fig. 7.11.]
*/

package assignments.program6;

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order

      Card[] hand = new Card[5];

      System.out.println("This is your hand: \n");

      // print 5 Cards in the order in which they are dealt
      for (int i = 0; i < 5; i++) {
         // deal and display a Card
         hand[i] = myDeckOfCards.dealCard();
         System.out.printf("%-19s", hand[i]);
      }

      // Display what type of hand you have
      System.out.println("\n\nHand contains:\n");
      int two = myDeckOfCards.pairs(hand);
      int three = myDeckOfCards.threeOfAKind(hand);
      myDeckOfCards.fourOfAKind(hand);
      myDeckOfCards.flush(hand);
      // myDeckOfCards.straight(hand);
   }
}