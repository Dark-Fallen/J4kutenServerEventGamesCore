package ru.darusfriman.eventgamesmanagercore.Game;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public static void WriteGameConfigFile(Game game) throws IOException, RuntimeException {

        File gameFile = new File(GenerateMD5(game.GetGameConfig().GetKeyValueProperty("ID").second.toString()));

        try
        {
            gameFile.createNewFile();

            YamlConfiguration gameData = new YamlConfiguration();
            gameData.loadFromString(Mapper.writeValueAsString(game));
            gameData.save(gameFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static Game CreateGameInstance(GameConfig conf) {
        return null;
    }

}
