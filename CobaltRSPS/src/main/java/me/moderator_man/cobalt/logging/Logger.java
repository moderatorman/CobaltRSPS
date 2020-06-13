package me.moderator_man.cobalt.logging;

public class Logger
{
    public void log(String msg)
    {
        log(LogLevel.INFO, msg);
    }
    
    public void log(LogLevel lvl, String msg)
    {
        String timestamp = "";
        System.out.println((new StringBuilder()).append("[").append(timestamp).append("] [").append(lvl).append("] ").append(msg).toString());
    }
}
