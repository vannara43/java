package assignments.program6;

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    // random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

    private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
    private int currentCard = 0; // index of next Card to be dealt (0-51)

    private static final String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    // constructor fills deck of Cards
    public DeckOfCards() {

        // populate deck with Card objects
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;

        // for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // deal one Card
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length) {
            return deck[currentCard++]; // return current Card in array
        } else {
            return null; // return null to indicate that all Cards were dealt
        }
    }

    public int[] totalHand(Card hand[]) {
        int[] numbers = new int[faces.length];

        for (int i = 0; i < 13; i++) {
            numbers[i] = 0;
        }

        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < 13; j++) {
                if (hand[i].getFace() == faces[j]) {
                    numbers[j]++;
                }
            }
        }

        return numbers;
    }

    public int pairs(Card hand[]) {
        int count = 0;
        int[] numbers = totalHand(hand);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                System.out.printf("Pair of %s\n", faces[i]);
                count++;
            }
        }

        return count;
    }

    public int threeOfAKind(Card hand[]) {
        int count = 0;
        int[] numbers = totalHand(hand);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                System.out.printf("Three of %s\n", faces[i]);
                count++;
            }
        }

        return count;
    }

    public int fourOfAKind(Card hand[]) {
        int count = 0;
        int[] numbers = totalHand(hand);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                System.out.printf("Four of %s\n", faces[i]);
                count++;
            }
        }

        return count;
    }

    public void flush(Card hand[]) {
        String suit = hand[0].getSuit(); // get the first card's suit to compare against all other cards
        boolean isFlush = true;

        for (int i = 1; i < hand.length; i++) {
            if (suit != (hand[i].getSuit())) {
                isFlush = false;
            }
        }

        if (isFlush) {
            System.out.println("This hand is a Flush");
        }
    }

    public void fullHouse(int two, int three) {
        if (two == 2 && three == 3) {
            System.out.println("The Hand has a Full House!");
        }
    }
}
