// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    /**
     * Tried to make it shoot
     */
    private void FireProjectile()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            int canonX = getX();
            int canonY = getY();
            int mainAngle = (int)Math.toDegrees(Math.atan2(mouseY - canonY, mouseX - canonX));
            World world = getWorld();
            int i = -1;
            while (i <= 1) {
                CannonBall cannonBall =  new  CannonBall();
                world.addObject(cannonBall, canonX, canonY);
            }
        }
    }
}
