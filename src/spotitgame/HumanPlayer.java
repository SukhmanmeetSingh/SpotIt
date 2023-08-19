/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotitgame;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in);
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
