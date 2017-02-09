
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
public class Example_1 {

    /**
     * @param args the command line arguments
     */
    public static void A1Q1(String[] args) {
        //creating new city called Kitchener
    City kitchener = new City();
        Wall wall = new Wall(kitchener, 1, 1, Direction.NORTH);
        Wall wall1 = new Wall(kitchener, 1, 2, Direction.NORTH);
        Wall wall2 = new Wall(kitchener, 1, 2, Direction.EAST);
        Wall wall3 = new Wall(kitchener, 2, 2, Direction.EAST);
        Wall wall4 = new Wall(kitchener, 2, 2, Direction.SOUTH);
        Wall wall5 = new Wall(kitchener, 2, 1, Direction.SOUTH);
        Wall wall6 = new Wall(kitchener, 2, 1, Direction.WEST);
        Wall wall7 = new Wall(kitchener, 1, 1, Direction.WEST);

        
    //creating a robot
    Robot charlie = new Robot(kitchener, 0, 0, Direction.SOUTH);
    charlie.move();
    charlie.move();
    charlie.move();
    charlie.turnLeft();
    charlie.move();
    charlie.move();
    charlie.move();
    charlie.turnLeft();
    charlie.move();
    charlie.move();
    charlie.move();
    charlie.turnLeft();
    charlie.move();
    charlie.move();
    charlie.move();
    charlie.turnLeft();
    }

   
}
