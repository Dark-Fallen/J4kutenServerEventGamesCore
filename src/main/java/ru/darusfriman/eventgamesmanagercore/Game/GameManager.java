package ru.darusfriman.eventgamesmanagercore.Game;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class GameManager {

    static ObjectMapper Mapper = new ObjectMapper(new YAMLFactory());

    public static String GenerateMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            // Add leading zeros to make it 32 characters long
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T1 extends JavaPlugin, T2 extends Game> void WriteGameConfigFile(T1 plugin, T2 game) throws IOException, RuntimeException {

        File gameFile = new File(plugin.getDataFolder(), "\\rankSystem\\games\\" + GenerateMD5(game.GetGameConfig().GetKeyValueProperty("ID").GetValue().toString()) + ".yml");
        try
        {
            //Mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            gameFile.createNewFile();
            YamlConfiguration gameData = new YamlConfiguration();
            gameData.loadFromString(Mapper.writeValueAsString(game.GetGameConfig()));
            gameData.save(gameFile);
        }
        catch (IOException e)
        {
            throw new IOException(e);
        }
        catch (InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T extends Game> T CreateGameInstance(Class<T> gameClass, GameConfig conf) {
        try {
            Constructor<T> constructor = gameClass.getDeclaredConstructor(GameConfig.class);
            return constructor.newInstance(conf);
        }
        catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Класс " + gameClass.toString() + " не наследует класс Game!");
        }
        catch (Exception e) {
            throw new RuntimeException("Ошибка создания экземпляра игры: ", e);
        }
    }

    public static GameConfig ReadGameConfigFromFile(File file) throws IOException, InvalidConfigurationException {
        return Mapper.readValue(file, GameConfig.class);
    }

    public static <T extends Game> void CalculateGameResults(T endedGame) {

    }

}
