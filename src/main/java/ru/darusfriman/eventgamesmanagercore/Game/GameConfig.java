package ru.darusfriman.eventgamesmanagercore.Game;

import jdk.internal.net.http.common.Pair;

import java.util.Map;

public class GameConfig {

    private Map<String, Object> Properties;

    public GameConfig() {

    }

    public GameConfig(Map<String, Object> props) {
        Properties = props;
    }

    public void UpdateKeyValueProperty(String key, Object value) {
        Properties.put(key, value);
    }

    public void RemoveKeyValueProperty(String key) {
        Properties.remove(key);
    }

    public Pair<String, Object> GetKeyValueProperty(String key) { return new Pair<String, Object>(key, Properties.get(key)); }

}
