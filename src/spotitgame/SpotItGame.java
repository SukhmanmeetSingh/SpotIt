/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotitgame;

/**
 *
 * @author user
 */
public class SpotItGame {
    public static void main(String[] args) {
       
        Player humanPlayer = new HumanPlayer("Human");
        Player aiPlayer = new AIPlayer("AI");
        
        System.out.println("Final Scores:");
        System.out.println(humanPlayer.getName() + ": " + humanPlayer.getScore());
        System.out.println(aiPlayer.getName() + ": " + aiPlayer.getScore());
    }
}

