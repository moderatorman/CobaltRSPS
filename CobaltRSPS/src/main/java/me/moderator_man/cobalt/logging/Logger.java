package me.moderator_man.cobalt.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger
{
    private SimpleDateFormat dateFormat;
    
    public Logger()
    {
        dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    }
    
    public void log(String msg)
    {
        log(LogLevel.INFO, msg);
    }
    
    public void log(LogLevel lvl, String msg)
    {
        String timestamp = dateFormat.format(new Date());
        System.out.println((new StringBuilder()).append("[").append(timestamp).append("] [").append(lvl).append("] ").append(msg).toString());
    }
}
