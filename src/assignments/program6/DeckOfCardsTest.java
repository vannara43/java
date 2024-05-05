/*
Programmer Name: Vannara Thong
Assignment Start: 5:00pm
Assignment Completion: 10:00pm
Total Hours for Assignment: 5hr
Comments: I couldn't figure out how to make straight function work
*/

package Assignments.program6;

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
      myDeckOfCards.fullHouse(two, three);
   }
}