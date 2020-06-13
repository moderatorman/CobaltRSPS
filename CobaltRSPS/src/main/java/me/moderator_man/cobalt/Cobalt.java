package me.moderator_man.cobalt;

public class Cobalt
{
    private static Cobalt cobalt;
    
    public void start()
    {
        System.out.println("Cobalt has started.");
    }
    
    public static void main(String[] args)
    {
        cobalt = new Cobalt();
        
        cobalt.start();
    }
}
