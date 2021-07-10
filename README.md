# Changeling add-on template

This is a very basic mod that can be used as a base for creating a Changeling add-on. It is not intended as a modding tutorial.

This branch is for Minecraft version 1.11.2. Please see the other branches for templates for other Minecraft versions.

## Development

If you are using Eclipse, it is recommended that you have this mod code folder inside of another folder. The parent folder can then be used as your Eclipse workspace.

Windows users: If you are using cmd or Powershell as your command line, please use `gradlew` instead of `./gradlew`. This will use the OS-specific `gradlew.bat` file, as opposed to `gradlew`, which is a bash script for unix environments. If you are using the command line that ships with git, then you are using a simplified version of MSYS2, which is a unix environment that can run bash scripts.

### Prerequisites

- Java 8 is installed and is on your PATH when running commands from the command line
- A Forge-compatible IDE is installed
    - Eclipse is recommended
    - You can instead use IntelliJ IDEA if you know what you are doing, however the instructions for developing with IDEA may be incomplete/inaccurate
- Latest "dev" and "sources" jars of [Changeling](https://github.com/asanetargoss/Changeling/releases) and [DominionLib](https://github.com/asanetargoss/DominionLib/releases) have been downloaded for this Minecraft version

### Gradle setup

This setup will allow you to, using your IDE, browse this mod's dependencies (Changeling, Minecraft, etc), make changes to this mod's code, and run/debug Minecraft with the mod.

- Create the `libs/` folder if it does not exist
- Add the "dev" and "sources" jars of Changeling and DominionLib to the `libs/` folder
- Run IDE workspace setup commands
    - Eclipse:
        - Run `./gradlew setupDecompWorkspace eclipse`
        - Start Eclipse
        - Create or open an Eclipse workspace folder (ex: the parent folder), and add this mod code's folder to the Eclipse workspace
    - IntelliJ IDEA (not tested):
        - Start IDEA
        - Import project, selecting the build.gradle file. Wait for importing to finish.
        - Close IDEA
        - Run `./gradlew genIntellijRuns`
- Manually add the "sources" jars of Changeling and DominionLib as source attachments
    - You can find the Changeling and DominionLib jars in the "referenced libraries" section of Eclipse/IDEA

### Compiling

- Run `./gradlew build`. Output files will appear in `build/libs/` if the build is successful.

### Maintenance

If you need to change the mods in `libs/`, update access transformers, or update Forge/MCP mappings, then you will need to do some additional setup:

- Eclipse:
    - Re-run `./gradlew setupDecompWorkspace eclipse`
    - If the project is open in Eclipse, refresh the project
    - Manually re-add the "sources" jars of Changeling and DominionLib as source attachments
- IDEA: Steps unknown
