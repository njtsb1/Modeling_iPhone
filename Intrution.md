# Intrution.md

This file provides quick instructions to set up, build, and run the project.

## Architecture

Modeling_iPhone/
├─ .gitignore
├─ LICENSE
├─ README.md
├─ Intrution.md
├─ pom.xml
├─ docs/
│  └─ diagram.png
└─ src/
   └─ main/
      └─ java/
         └─ com/
            └─ example/
               └─ iphone/
                  ├─ Main.java
                  ├─ interfaces/
                  │  ├─ IMusicPlayer.java
                  │  ├─ IPhoneDevice.java
                  │  └─ IInternetBrowser.java
                  ├─ devices/
                  │  ├─ Smartphone.java
                  │  └─ iPhone.java
                  └─ model/
                     ├─ Song.java
                     ├─ Contact.java
                     ├─ Favorite.java
                     └─ Playlist.java

## Repository layout

- `src/main/java/com/example/iphone/interfaces` — project interfaces.
- `src/main/java/com/example/iphone/devices` — device classes (Smartphone, iPhone).
- `src/main/java/com/example/iphone/model` — model classes (Music, Contact, Favorite, Playlist).
- `src/main/java/com/example/iphone/Main.java` — demonstration entry point.
- `docs/diagram.png` — UML diagram (optional).

## Prerequisites

- Java 11 or newer installed.
- Maven 3.6+ installed.

## Build steps

1. Open a terminal at the project root.
2. Run:

```bash
mvn clean package
