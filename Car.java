import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Car extends Actor
{
    public void act()
    {
       move (-20);
       
       if (getX() <= 0){
           resetCar();
       }
    }
    
    public void resetCar() {
        int num = Greenfoot.getRandomNumber(2);
        int x = 600;
        int y;
        
        if (num == 0) {
            y = 100;
        } else {
            y = 300;
        }
        
        setLocation(x, y); // Set location to random position
        }
        
}
