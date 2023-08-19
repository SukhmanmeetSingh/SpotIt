/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotitgame;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GameDeck {
    private List<GameCard> cards;

    public GameDeck(List<GameCard> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public GameCard drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null; 
    }
}
