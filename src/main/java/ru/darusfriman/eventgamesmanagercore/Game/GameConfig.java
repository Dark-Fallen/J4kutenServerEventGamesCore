package ru.darusfriman.eventgamesmanagercore.Game;

import java.util.HashMap;
import java.util.Map;

public class GameConfig {

    private Map<String, Object> Properties;

    public GameConfig() {
        Properties = new HashMap<>();
    }

    public GameConfig(Map<String, Object> props) {
        Properties = props;
    }

    public Map<String, Object> getProperties() { return Properties; }

    public void setProperties(Map<String, Object> props) { Properties = props; }

    public void UpdateKeyValueProperty(String key, Object value) {
        Properties.put(key, value);
    }

    public void RemoveKeyValueProperty(String key) {
        Properties.remove(key);
    }

    public boolean HasKey(String key) {
        return Properties.containsKey(key);
    }

    public MyPair<String, Object> GetKeyValueProperty(String key) { return new MyPair<String, Object>(key, Properties.get(key)); }

}
