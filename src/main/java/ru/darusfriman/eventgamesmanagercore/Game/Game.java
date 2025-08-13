package ru.darusfriman.eventgamesmanagercore.Game;

public abstract class Game {
    private GameConfig Config;

    public Game(GameConfig config) {
        this.Config = config;
    }

    public GameConfig GetGameConfig() {
        return this.Config;
    }

    public void Init() {
    }

    public void Configure(GameConfig config) {
    }

    public void Start() {
    }

    public void Stop() {
    }

    public void End() {
    }

    public void Remove() {
    }
}
