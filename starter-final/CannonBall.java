// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{
    private int speed = 5;
    private int distanceTraveled = 0;
    /* Tracks the distance traveled*/
    private int maxDistance = 300;

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eat();
        move(speed);
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * Chacks if the condition for Game Lost is met
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions over to the GameOverWorld world
     */
    public void transitionToGameOverWorld()
    {
        World Loser =  new  GameLostWorld();
        Greenfoot.setWorld(Loser);
        Greenfoot.playSound("lose.wav");
    }

    /**
     * Helps cannonball do some sort of a collision with the Ladybug
     */
    public void eat()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }
}
