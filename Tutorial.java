import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    Label controls = new Label("A,D to Move \n W or Space to Jump \n Double tap W to Double Jump \n Q to Side Dash \n M1 to attack \n Press E for Ranged Attack (Mouse Controllable)", 30);
    Label instructions = new Label("Don't let the enemies sneak through to the other side \n Get as many points before you DIE", 40);
    Label menu = new Label("Press M to return", 20);
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Player tutorialKnight = new Player();
        addObject(tutorialKnight, 500, 550);
        addObject(controls,500,100);
        addObject(instructions,500,250);
        addObject(menu, 900,570);
    }
    public void act(){
        if(Greenfoot.isKeyDown("m")){
            Greenfoot.setWorld(new TitleScreen());
        }
    }
}
