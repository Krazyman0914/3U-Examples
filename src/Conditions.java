
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bisef5371
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City wien = new City();
    
    Robot krazy = new Robot(wien, 1, 1, Direction.EAST);
    //build a wall
    Wall wall = new Wall(wien, 1, 5, Direction.EAST);
    
    //infanite loop
    while(krazy.frontIsClear()){
        krazy.turnLeft();
        
        }
    }
}