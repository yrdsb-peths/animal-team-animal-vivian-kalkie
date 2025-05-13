import greenfoot.*;
 
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        // Create the elephant object 
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 250);
    }
}
