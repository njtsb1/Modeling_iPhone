Daily Learning

# Modeling iPhone

Project developed during the Santander 2023 Bootcamp - Java Backend, under the guidance of specialist [Gleyson Sampaio](https://github.com/glysns/ "Gleyson Sampaio").
Learning how to design class and interface diagrams, representing iPhone functions such as Music Player, Telephone, and Internet Browser.
After that, create the classes and interfaces in .java file format.

## Diagram

<img width="1536" height="1024" alt="Diagram" src="https://github.com/user-attachments/assets/fbdc6e7a-2d78-424d-a312-7a24ab133975" />

## Architecture

```Markdonw
Modeling_iPhone/
├─ .gitignore
├─ LICENSE
├─ README.md
├─ Intrution.md
├─ pom.xml
├─ docs/
│  └─ diagram.png
├─ .vscode/
│  └─ settings.json
└─ src/
   ├─ main/
   │  └─ java/
   │     └─ com/
   │        └─ example/
   │           └─ iphone/
   │              ├─ Main.java
   │              ├─ interfaces/
   │              │  ├─ IMusicPlayer.java
   │              │  ├─ IPhoneDevice.java
   │              │  └─ IInternetBrowser.java
   │              ├─ devices/
   │              │  ├─ Smartphone.java
   │              │  └─ iPhone.java
   │              └─ model/
   │                 ├─ Song.java
   │                 ├─ Contact.java
   │                 ├─ Favorite.java
   │                 └─ Playlist.java
   └─ test/
      └─ java/
         └─ com/
            └─ example/
               └─ iphone/
                  └─ iPhoneTest.java
```

## Repository layout

- `src/main/java/com/example/iphone/interfaces` — project interfaces.
- `src/main/java/com/example/iphone/devices` — device classes (Smartphone, iPhone).
- `src/main/java/com/example/iphone/model` — model classes (Music, Contact, Favorite, Playlist).
- `src/main/java/com/example/iphone/Main.java` — demonstration entry point.
- `docs/diagram.png` — UML diagram.

## Prerequisites

- Java 11 or newer installed.
- Maven 3.6+ installed.

## Build steps

1. Open a terminal at the project root.
2. Quick Start:

```bash
mvn clean package
```
## Run example

After building, run the demo Main class:

```bash
java -cp target/iphone-uml-1.0.0.jar com.example.iphone.Main
```

## Tests

This project includes basic unit test examples. To run tests:

```bash
mvn test
```

[LICENSE](/LICENSE)
