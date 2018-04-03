package ru.nmago.algorithms.p657;

/** #657
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
 * judge if this robot makes a circle, which means it moves back to the original place.
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 * Example: "UD", Result: true
 *
 * Source: https://leetcode.com/problems/judge-route-circle
 *
 *
 */

public class Solution {

    public boolean judgeCircle(String moves) {
        if(moves == null) return true;
        int x = 0, y = 0;
        for(char move: moves.toCharArray()){
            switch(move){
                case 'U': y++; break;
                case 'D': y--; break;
                case 'R': x++; break;
                case 'L': x--; break;
                default:
                    System.out.println("Invalid move: " + move);
            }
        }
        return x == 0 && y == 0;
    }

}
