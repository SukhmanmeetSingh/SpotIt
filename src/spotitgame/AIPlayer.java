/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotitgame;

/**
 *
 * @author user
 */
public class AIPlayer extends Player {
    public AIPlayer(String name) {
        super(name);
    }

    @Override
    public Symbol chooseSymbol() {
        
        return null;
    }

    @Override
    public boolean takeTurn(GameCard centralCard) {
        
        return false;
    }
}

