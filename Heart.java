import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage heartImg = new GreenfootImage("images/heart.png");
    public Heart(){
        heartImg.scale(50,50);
        setImage(heartImg);
    }
    public void act()
    {
        // Add your action code here.
    }
}
