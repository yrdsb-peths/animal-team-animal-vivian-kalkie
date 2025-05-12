import greenfoot.*;  
/**
 * Elephant, our hero.
 * 
 * @author Vivian & Kalkie 
 * @version May 2025
 */
public class Elephant extends Actor
{
    /**
     * elephant eating 
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
    }
}
