# Rubik's cube

This is a project for CS 4620: Intelligent Systems

## Description

This project uses Javafx to display a gui of a Rubik's cube. This Rubik's cube can be manipulated by the user. This project can attempt to solve a randomized rubik's cube or a user inputed cube using an A* search tree.

## Installation instructions

1. Make sure you have Java installed on your computer. 
    2. Open a command line and typing this command:  

```
C:\Users\alexh\Desktop>java -version
java version "17.0.6" 2023-01-17 LTS
Java(TM) SE Runtime Environment (build 17.0.6+9-LTS-190)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.6+9-LTS-190, mixed mode, sharing)
```
2. If you see a version of java you can proceed with the next steps.
3. Download the git repository from [Rubik's cube download](https://github.com/hollaaac/Rubiks_cube/tree/Alex)
4. Extract the folder.
5. Right click on the folder and select "copy as path"
4. Open another command line and type this command:
```
cd Ctrl+V  # To paste the location of the folder.
cd Rubik_cube-Alex # A second time to get into the correct folder.
```
5. Finally type:
```
java -jar Rubiks_cube.jar
```
## To use the application
* Press "H" to bring up the help menu
* Press "I" to bring up the input menu
* Escape will return you to the rubik's cube
* Click and drag on the cube to turn and change which face is facing you.
* To rotate cube, follow instructions in help menu "H".
    * Each side rotates acording to the key
    * Red side = R  --- this will rotate the cube's red side clockwise.


## To implement own ideas in code

1. Follow installation instructions above
2. import maven project into your IDE
3. update your pom.xml to acomodate any changes in versions.
