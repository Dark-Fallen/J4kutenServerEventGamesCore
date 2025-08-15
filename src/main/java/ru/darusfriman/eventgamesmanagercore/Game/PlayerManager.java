package ru.darusfriman.eventgamesmanagercore.Game;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class PlayerManager {

    public static void InitPlayer(Player player) {
        player.getPersistentDataContainer().set(new NamespacedKey("j4kuten", "rank"), PersistentDataType.STRING, "Beginner");
        player.getPersistentDataContainer().set(new NamespacedKey("j4kuten", "exp"), PersistentDataType.INTEGER, 0);
        player.getPersistentDataContainer().set(new NamespacedKey("j4kuten", "money"), PersistentDataType.INTEGER, 0);
    }

    public static <T extends JavaPlugin> void IncreasePlayerExperience(T plugin, PlayerGameExpClass gameResults) throws IOException, InvalidConfigurationException {

        YamlConfiguration ranksConfig = new YamlConfiguration();
        ranksConfig.load(new File(plugin.getDataFolder(), "rankSystem/ranks.yml"));


    }

}
