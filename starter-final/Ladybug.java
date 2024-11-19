// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * Chacks if the conditions for the Game won are met
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to GameLostWorld and plays the winning sound
     */
    public void transitionToGameWonWorld()
    {
        World Winner =  new  GameWonWorld();
        Greenfoot.setWorld(Winner);
        Greenfoot.playSound("win.wav");
    }

    /**
     * Sets up the LadyBug's movements
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
            move(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
            move(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(3);
        }
    }

    /**
     * Sets up some sort of a collision with the FinishTarget
     */
    public void eat()
    {
        Actor FinishLocation = getOneIntersectingObject(FinishLocation.class);
        if (FinishLocation != null) {
            World world = getWorld();
            world.removeObject(FinishLocation);
            Greenfoot.playSound("eating.wav");
        }
    }
}
