# J4kutenServerEventGamesCore

Плагин для управления работой системы сервера. Для добавления миниигр использовать его как основу для наследования.

Основные классы:
- [EventGamesManagerCore](https://github.com/Dark-Fallen/J4kutenServerEventGamesCore/blob/main/src/main/java/ru/darusfriman/eventgamesmanagercore/EventGamesManagerCore.java) для работы плагина
- [Game](https://github.com/Dark-Fallen/J4kutenServerEventGamesCore/blob/main/src/main/java/ru/darusfriman/eventgamesmanagercore/Game/Game.java) для реализации класса миниигры
- [GameConfig](https://github.com/Dark-Fallen/J4kutenServerEventGamesCore/blob/main/src/main/java/ru/darusfriman/eventgamesmanagercore/Game/GameConfig.java) для реализации конфигурации миниигры
- [GameManager](https://github.com/Dark-Fallen/J4kutenServerEventGamesCore/blob/main/src/main/java/ru/darusfriman/eventgamesmanagercore/Game/GameManager.java) для универсальных функий управления экземплярами игр

Зависимости для сборки:
- [org:spigotmc:spigot-api:1.21-R0.1-SNAPSHOT](https://getbukkit.org/download/spigot)
- [net.md-5:bungeecord-chat:1.20-R0.2](https://mvnrepository.com/artifact/net.md-5/bungeecord-chat)
- [org.yaml:snakeyaml:2.2](https://mvnrepository.com/artifact/org.yaml/snakeyaml)
- [com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.15.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-yaml)
- [com.fasterxml.jackson.core:jackson-core:2.15.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core)
- [com.fasterxml.jackson.core:jackson-databind:2.15.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
- [com.fasterxml.jackson.core:jackson-annotations:2.15.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations)
