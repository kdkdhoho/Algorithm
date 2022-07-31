// https://school.programmers.co.kr/learn/courses/30/lessons/67256

import java.util.*;

class Solution {
    
    StringBuilder sb = new StringBuilder();
    int[][] keypad = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1} };
    Point currentLeft = new Point(3, 0);
    Point currentRight = new Point(3, 2);
    
    public String solution(int[] numbers, String hand) {
        for(int number : numbers) {
            if(isLeft(number))
                defineLeft(number);
            else if(isRight(number))
                defineRight(number);
            else {
                Point target = updatePosition(number);
                
                double distanceLeft = getDistance(currentLeft, target);
                double distanceRight = getDistance(currentRight, target);
                
                if(distanceLeft < distanceRight)
                    defineLeft(number);
                else if(distanceRight < distanceLeft)
                    defineRight(number);
                else {
                    if(hand.equals("left"))
                        defineLeft(number);
                    else
                        defineRight(number);
                }
            }
        }
        
        return sb.substring(0);
    }
    
    public boolean isLeft(int number) {
        if(number == 1 || number == 4 || number == 7)
            return true;
        return false;
    }
    
    public boolean isRight(int number) {
        if(number == 3 || number == 6 || number == 9)
            return true;
        return false;
    }
    
    public void defineLeft(int number) {
        sb.append("L");
        currentLeft = updatePosition(number);
    }
    
    public void defineRight(int number) {
        sb.append("R");
        currentRight = updatePosition(number);
    }
    
    public Point updatePosition(int number) {
        for(int row = 0; row < keypad.length; row++)
            for(int col = 0; col < keypad[row].length; col++)
                if(keypad[row][col] == number)
                    return new Point(row, col);
        
        return null;
    }
    
    public int getDistance(Point a, Point b) {
        return (Math.abs(a.row - b.row) + Math.abs(a.col - b.col));
    }
}

class Point {
    int row, col;
    
    Point(int row, int col) {
        this.row = row;
        this.col = col;
    }
}