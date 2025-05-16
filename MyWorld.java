import greenfoot.*;
 
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld() 
    {
        super(600, 400, 1);
        
        // Create the elephant object 
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 250);
        
        // Create a label 
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40, 40);
        
        createApple();
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
         
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * End the game and draw game over
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, getWidth()/2, 200);
    }
    
    /** 
     * Create a new apple at a random location at the top of the screen 
     */
    public void createApple()
    {
        Apple apple = new Apple();
        //apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(500);
        int y = 0;
        addObject(apple, x, y);
    }
}
