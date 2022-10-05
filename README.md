# Dependencies
Maven: Install at https://maven.apache.org/install.html

# Build & Run
Run follows: 
```
cd my-game
mvn package
java -cp target/my-game-1.0-SNAPSHOT.jar game.Main
```


# Empty Project Template
Fill in this README while working on your project. 

A text adventure game where the setting is an apocalypse Earth. User will act as the leader of a clan and will start with 3 raiders. User will be given the option 
to send one, two, or all raiders for a raid. There will be an one out of five chance independently for each individual raider to die. In the wild, there are three type of resources. 
Material, Food, and Water. Each material have 1/3 chance to be obtained (During the raid, code while run to where it will spin an imaginary wheel for each respective material to see
if the material is accquired). In the case that a raider dies, Food and Water is required to obtain a new one and resources are needed to expand raider capacity. Rinse and repeat,
creating a positive feedback loop.


Superclass would be consumable and the 3 subclass being extended from that would be MAterial, Food, and Water