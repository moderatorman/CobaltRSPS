package me.moderator_man.cobalt.net;

import java.net.ServerSocket;

public class ClientAcceptThread extends Thread
{
    private ServerSocket serverSocket;
    private int port;
    private boolean running;
    
    public ClientAcceptThread(int port)
    {
        this.port = port;
        running = false;
    }
    
    public void run()
    {
        try
        {
            if (serverSocket == null)
                serverSocket = new ServerSocket(port);
            running = true;
            while (running)
            {
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
