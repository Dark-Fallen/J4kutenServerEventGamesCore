package ru.darusfriman.eventgamesmanagercore.Game;

import org.bukkit.entity.Player;

public class PlayerGameExpClass {

    private Player player;
    private int Experience;

    public PlayerGameExpClass(Player p) { player = p; }
    public void IncreaseExp(int value) { Experience = Experience + value; }

    public Player getPlayer() { return player; }
    public int getExperience() { return Experience; }

}
