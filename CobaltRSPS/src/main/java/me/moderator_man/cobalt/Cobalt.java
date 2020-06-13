package me.moderator_man.cobalt;

import me.moderator_man.cobalt.logging.Logger;

public class Cobalt
{
    private static Cobalt cobalt;
    
    private Logger logger;
    
    public Cobalt()
    {
        logger = new Logger();
    }
    
    public void start()
    {
        logger.log("Cobalt has started.");
    }
    
    public static void main(String[] args)
    {
        cobalt = new Cobalt();
        
        cobalt.start();
    }
}
