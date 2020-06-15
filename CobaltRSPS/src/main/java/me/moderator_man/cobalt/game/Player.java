package me.moderator_man.cobalt.game;

import me.moderator_man.cobalt.net.PacketHandler;

public class Player
{
    private PacketHandler packetHandler;
    
    public String username;
    
    public Player(PacketHandler packetHandler)
    {
        this.packetHandler = packetHandler;
    }
}
