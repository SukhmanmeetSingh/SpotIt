/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotitgame;

/**
 *
 * @author user
 */
public abstract class Player {
    protected String name;
    protected int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public abstract Symbol chooseSymbol();

    public abstract boolean takeTurn(GameCard centralCard);

    public void keepScore(boolean isMatch) {
        if (isMatch) {
            score++;
        }
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
   
}

