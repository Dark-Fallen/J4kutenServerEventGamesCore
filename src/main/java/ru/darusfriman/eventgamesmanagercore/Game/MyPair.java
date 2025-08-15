package ru.darusfriman.eventgamesmanagercore.Game;

public class MyPair <K, V>
{
    private final K Key;
    private final V Value;
    public MyPair(K key, V value)
    {
        Key = key;
        Value = value;
    }

    public K GetKey() { return Key; }
    public V GetValue() { return Value; }
}