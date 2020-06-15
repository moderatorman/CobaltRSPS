package me.moderator_man.cobalt.net;

import java.net.ServerSocket;
import java.util.ArrayList;

import me.moderator_man.cobalt.game.Player;
import me.moderator_man.cobalt.logging.Logger;

public class Server extends Thread
{
    private final Logger logger = new Logger();
    
    private ServerSocket serverSocket;
    private int port;
    private boolean running;
    
    private ArrayList<Player> players;
    
    public Server(int port)
    {
        try { serverSocket = new ServerSocket(port); }
        catch (Exception ex) { System.out.println("Failed to start server"); }
        this.port = port;
        running = false;
        
        players = new ArrayList<Player>();
    }
    
    public void playerJoined(Player player)
    {
        players.add(player);
        logger.log(new StringBuilder().append(player.username).append(" has joined the game.").toString());
    }
    
    public void run()
    {
        try
        {
            if (serverSocket == null)
                serverSocket = new ServerSocket(port);
            running = true;
            while (running)
                players.add(new Player(new PacketHandler(serverSocket.accept())));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
