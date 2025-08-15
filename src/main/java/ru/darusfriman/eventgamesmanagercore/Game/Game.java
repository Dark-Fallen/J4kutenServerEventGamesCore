package ru.darusfriman.eventgamesmanagercore.Game;

import jdk.internal.joptsimple.util.KeyValuePair;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;

public abstract class Game {

    private GameConfig Config;

    public Game(GameConfig config) {
        Config = config;
    }

    public GameConfig GetGameConfig() { return Config; }


    public ArrayList<Player> GetPlayersList() {
        if (Config.HasKey("PLAYERS_LIST") && Config.GetKeyValueProperty("PLAYERS_LIST").GetValue() instanceof ArrayList)
            return (ArrayList<Player>) Config.GetKeyValueProperty("PLAYERS_LIST").GetValue();
        return null;
    }

    public void Configure(GameConfig config) {
        for (Map.Entry<String, Object> entry: config.getProperties().entrySet())
        {
            Config.UpdateKeyValueProperty(entry.getKey(), entry.getValue());
        }
    }

    public void Init() {}

    public void Start() {}

    public void Stop() {}

    public void End() {}

    public void Remove() {}

}
