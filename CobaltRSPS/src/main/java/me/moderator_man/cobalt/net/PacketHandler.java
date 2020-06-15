package me.moderator_man.cobalt.net;

import java.io.DataInputStream;
import java.net.Socket;

public class PacketHandler extends Thread
{
    private Socket socket;
    private DataInputStream dis;
    
    public PacketHandler(Socket socket)
    {
        try
        {
            this.socket = socket;
            dis = new DataInputStream(socket.getInputStream());
            
            start();
        } catch (Exception ex) {
            System.out.println("PacketHandler failed to initialize");
        }
    }
    
    private void readPackets()
    {
        
    }
    
    private void processPacket()
    {
        
    }
    
    public void run()
    {
        while (isAlive())
        {
            readPackets();
        }
    }
}
