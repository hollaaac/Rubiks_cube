package com.display;
import java.util.*;

public class Block {
    
    //Class Variables
    Cubelet[][][] Block;
    int size;
    boolean even;


    //Default Contructor that builds normal Rubik's cube
    public Block(){

        this(3); //Defaut 3v3 cube
    

    }

    //Constructor for given size
    public Block(int size){

        this.size = size;
        this.Block =  new Cubelet[size][size][size];

        Cubelet cubie = new Cubelet();

        int cordX = 0 - (size/2);
        int cordY = 0 - (size/2);
        int cordZ = 0 - (size/2);

        if((size%2) == 0){
            even = true;
        }

        else{
            even = false;
        }


        for (int x = 0; x < size; ++x){
            
            cordY = 0 - (size/2);

            for (int y = 0; y < size; ++y){

                cordZ = 0 - (size/2);

                for(int z = 0; z < size; ++z){

                    Block[x][y][z] = new Cubelet(new int[] {cordX, cordY, cordZ}, new char[] {cubie.colorFinder('x', cordX, size/2), cubie.colorFinder('y', cordY, size/2), cubie.colorFinder( 'z', cordZ, size/2) } );
                    
                    if(cordZ == -1 & even){
                        ++cordZ;
                    }

                    ++cordZ;

                }

                if(cordY == -1 & even){
                    ++cordY;
                }

                ++cordY;

            }

            if(cordX == -1 & even){
                ++cordX;
            }

            ++cordX;

        }


    }

    //Constructor given already built cube
    public Block(Cubelet[][][] Block){

        this.Block = Block;

    }

    //Puts all the colors and values into one string
    //Used for AStar and user input blocks
    //Follows format of PrintBlock just for each face
    public String BlocktoString(){

        String BlockString = "";

        //White Face
        BlockString = BlockString + Block[0][0][0].colors[1];
        BlockString = BlockString + Block[1][0][0].colors[1];
        BlockString = BlockString + Block[2][0][0].colors[1];
        BlockString = BlockString + Block[0][0][1].colors[1];
        BlockString = BlockString + Block[1][0][1].colors[1];
        BlockString = BlockString + Block[2][0][1].colors[1];
        BlockString = BlockString + Block[0][0][2].colors[1];
        BlockString = BlockString + Block[1][0][2].colors[1];
        BlockString = BlockString + Block[2][0][2].colors[1];

        //Green Face
        BlockString = BlockString + Block[0][0][0].colors[0];
        BlockString = BlockString + Block[0][0][1].colors[0];
        BlockString = BlockString + Block[0][0][2].colors[0];
        BlockString = BlockString + Block[0][1][0].colors[0];
        BlockString = BlockString + Block[0][1][1].colors[0];
        BlockString = BlockString + Block[0][1][2].colors[0];
        BlockString = BlockString + Block[0][2][0].colors[0];
        BlockString = BlockString + Block[0][2][1].colors[0];
        BlockString = BlockString + Block[0][2][2].colors[0];

        //Red Face
        BlockString = BlockString + Block[0][0][2].colors[2];
        BlockString = BlockString + Block[1][0][2].colors[2];
        BlockString = BlockString + Block[2][0][2].colors[2];
        BlockString = BlockString + Block[0][1][2].colors[2];
        BlockString = BlockString + Block[1][1][2].colors[2];
        BlockString = BlockString + Block[2][1][2].colors[2];
        BlockString = BlockString + Block[0][2][2].colors[2];
        BlockString = BlockString + Block[1][2][2].colors[2];
        BlockString = BlockString + Block[2][2][2].colors[2];

        //Blue Face
        BlockString = BlockString + Block[2][0][2].colors[0];
        BlockString = BlockString + Block[2][0][1].colors[0];
        BlockString = BlockString + Block[2][0][0].colors[0];
        BlockString = BlockString + Block[2][0][2].colors[0];
        BlockString = BlockString + Block[2][0][1].colors[0];
        BlockString = BlockString + Block[2][0][0].colors[0];
        BlockString = BlockString + Block[2][0][2].colors[0];
        BlockString = BlockString + Block[2][0][1].colors[0];
        BlockString = BlockString + Block[2][0][0].colors[0];

        //Orange Face
        BlockString = BlockString + Block[2][0][0].colors[2];
        BlockString = BlockString + Block[1][0][0].colors[2];
        BlockString = BlockString + Block[0][0][0].colors[2];
        BlockString = BlockString + Block[2][1][0].colors[2];
        BlockString = BlockString + Block[1][1][0].colors[2];
        BlockString = BlockString + Block[0][1][0].colors[2];
        BlockString = BlockString + Block[2][2][0].colors[2];
        BlockString = BlockString + Block[1][2][0].colors[2];
        BlockString = BlockString + Block[0][2][0].colors[2];

        //Yellow Face
        BlockString = BlockString + Block[0][2][2].colors[1];
        BlockString = BlockString + Block[1][2][2].colors[1];
        BlockString = BlockString + Block[2][2][2].colors[1];
        BlockString = BlockString + Block[0][2][1].colors[1];
        BlockString = BlockString + Block[1][2][1].colors[1];
        BlockString = BlockString + Block[2][2][1].colors[1];
        BlockString = BlockString + Block[0][2][0].colors[1];
        BlockString = BlockString + Block[1][2][0].colors[1];
        BlockString = BlockString + Block[2][2][0].colors[1];

        return BlockString;
    }

    void StringtoBlock(String blockString){

        //White Face
        Block[0][0][0].colors[1] = blockString.charAt(0);
        Block[1][0][0].colors[1] = blockString.charAt(1);
        Block[2][0][0].colors[1] = blockString.charAt(2);
        Block[0][0][1].colors[1] = blockString.charAt(3);
        Block[1][0][1].colors[1] = blockString.charAt(4);
        Block[2][0][1].colors[1] = blockString.charAt(5);
        Block[0][0][2].colors[1] = blockString.charAt(6);
        Block[1][0][2].colors[1] = blockString.charAt(7);
        Block[2][0][2].colors[1] = blockString.charAt(8);

        //Green Face
        Block[0][0][0].colors[0] = blockString.charAt(9);
        Block[0][0][1].colors[0] = blockString.charAt(10);
        Block[0][0][2].colors[0] = blockString.charAt(11);
        Block[0][1][0].colors[0] = blockString.charAt(12);
        Block[0][1][1].colors[0] = blockString.charAt(13);
        Block[0][1][2].colors[0] = blockString.charAt(14);
        Block[0][2][0].colors[0] = blockString.charAt(15);
        Block[0][2][1].colors[0] = blockString.charAt(16);
        Block[0][2][2].colors[0] = blockString.charAt(17);

        //Red Face
        Block[0][0][2].colors[2] = blockString.charAt(18);
        Block[1][0][2].colors[2] = blockString.charAt(19);
        Block[2][0][2].colors[2] = blockString.charAt(20);
        Block[0][1][2].colors[2] = blockString.charAt(21);
        Block[1][1][2].colors[2] = blockString.charAt(22);
        Block[2][1][2].colors[2] = blockString.charAt(23);
        Block[0][2][2].colors[2] = blockString.charAt(24);
        Block[1][2][2].colors[2] = blockString.charAt(25);
        Block[2][2][2].colors[2] = blockString.charAt(26);

        //Blue Face
        Block[2][0][2].colors[0] = blockString.charAt(27);
        Block[2][0][1].colors[0] = blockString.charAt(28);
        Block[2][0][0].colors[0] = blockString.charAt(29);
        Block[2][0][2].colors[0] = blockString.charAt(30);
        Block[2][0][1].colors[0] = blockString.charAt(31);
        Block[2][0][0].colors[0] = blockString.charAt(32);
        Block[2][0][2].colors[0] = blockString.charAt(33);
        Block[2][0][1].colors[0] = blockString.charAt(34);
        Block[2][0][0].colors[0] = blockString.charAt(35);

        //Orange Face
        Block[2][0][0].colors[2] = blockString.charAt(36);
        Block[1][0][0].colors[2] = blockString.charAt(37);
        Block[0][0][0].colors[2] = blockString.charAt(38);
        Block[2][1][0].colors[2] = blockString.charAt(39);
        Block[1][1][0].colors[2] = blockString.charAt(40);
        Block[0][1][0].colors[2] = blockString.charAt(14);
        Block[2][2][0].colors[2] = blockString.charAt(42);
        Block[1][2][0].colors[2] = blockString.charAt(43);
        Block[0][2][0].colors[2] = blockString.charAt(44);

        //Yellow Face
        Block[0][2][2].colors[1] = blockString.charAt(45);
        Block[1][2][2].colors[1] = blockString.charAt(46);
        Block[2][2][2].colors[1] = blockString.charAt(47);
        Block[0][2][1].colors[1] = blockString.charAt(48);
        Block[1][2][1].colors[1] = blockString.charAt(49);
        Block[2][2][1].colors[1] = blockString.charAt(50);
        Block[0][2][0].colors[1] = blockString.charAt(51);
        Block[1][2][0].colors[1] = blockString.charAt(52);
        Block[2][2][0].colors[1] = blockString.charAt(53);

    }

    //prints block info with cords and colors of cubelets
    void printer(){

        int countery = 0;
        int counterz = 0;

        for (int z = 0; z < size; ++z){

            for(int y = 0; y < size; ++y){

                for (int x = 0; x < size; ++x){

                    System.out.print("Array[" + x + "][" + y + "][" + z + "] = [" + Arrays.toString(Block[x][y][z].getCords()) + " [" + Block[x][y][z].getColors()[0]+ " " + Block[x][y][z].getColors()[1] + " " + Block[x][y][z].getColors()[2] + "]]" );
                    System.out.print("\t");
                    
                    ++counterz;
                    if(counterz == size){
                        System.out.println("");
                        counterz = 0;
                    }
                }

                ++countery;
                if(countery == size){
                    System.out.println("");
                    countery = 0;
                }
            }
        }
    }

    //Helper function that changes based on developer needs
    void printerHelp(){

        //char [][] arrayHelper = new char[9][3];
        //
        //for (int y = 0; y < this.size; y++){
        //    for (int z = 0; z < this.size; z++){
        //        System.out.println("Array [" + 2 + "] [" + y + "] [" + z + "] -> " + this.Block[2][y][z].getColors()[0] + ", " + Block[2][y][z].getColors()[1] + ", " + Block[2][y][z].getColors()[2]);
        //        //Block[0][y][z].colorSwap('x');
        //        //System.out.println("Array [" + 0 + "] [" + y + "] [" + z + "] -> " + this.Block[0][y][z].getColors()[0] + ", " + Block[0][y][z].getColors()[1] + ", " + Block[0][y][z].getColors()[2]);
        //    }
        //}

        System.out.println(""); //Space in terminal

        for (int x = 0; x < this.size; x++){
            for (int y = 0; y < this.size; y++){
                System.out.println("Array [" + x + "] [" + y + "] [" + 2 + "] -> " + this.Block[x][y][2].getColors()[0] + ", " + Block[x][y][2].getColors()[1] + ", " + Block[x][y][2].getColors()[2]);
            }
        }

    }

    //Makes the 12 different turns based on the direction given
    void turnNotModular(String direction){
         
        Cubelet tempCubelet;

        if(direction == "L"){ //Left ClockWise

            tempCubelet = Block[0][0][0];
            Block[0][0][0] = Block[0][2][0];
            Block[0][2][0] = Block[0][2][2];
            Block[0][2][2] = Block[0][0][2];
            Block[0][0][2] = tempCubelet;

            tempCubelet = Block[0][0][1];
            Block[0][0][1] = Block[0][1][0];
            Block[0][1][0] = Block[0][2][1];
            Block[0][2][1] = Block[0][1][2];
            Block[0][1][2] = tempCubelet;

            for(int y = 0; y < size; ++y){
                for(int z = 0; z < size; ++z){
                    Block[0][y][z].colorSwap('x');
                }
            }
                
        }

        if(direction == "L'"){ //Left Counter-ClockWise

            tempCubelet = Block[0][0][0];
            Block[0][0][0] = Block[0][0][2];
            Block[0][0][2] = Block[0][2][2];
            Block[0][2][2] = Block[0][2][0];
            Block[0][2][0] = tempCubelet;

            tempCubelet = Block[0][0][1];
            Block[0][0][1] = Block[0][1][2];
            Block[0][1][2] = Block[0][2][1];
            Block[0][2][1] = Block[0][1][0];
            Block[0][1][0] = tempCubelet;

            for(int y = 0; y < size; ++y){
                for(int z = 0; z < size; ++z){
                    Block[0][y][z].colorSwap('x');
                }
            }

        }

        if(direction == "R"){ //Right Clockwise

            tempCubelet = Block[2][0][0];
            Block[2][0][0] = Block[2][0][2];
            Block[2][0][2] = Block[2][2][2];
            Block[2][2][2] = Block[2][2][0];
            Block[2][2][0] = tempCubelet;

            tempCubelet = Block[2][0][1];
            Block[2][0][1] = Block[2][1][2];
            Block[2][1][2] = Block[2][2][1];
            Block[2][2][1] = Block[2][1][0];
            Block[2][1][0] = tempCubelet;

            for(int y = 0; y < size; ++y){
                for(int z = 0; z < size; ++z){
                    Block[2][y][z].colorSwap('x');
                }
            }

        }

        if(direction == "R'"){ //Right Counter-ClockWise

            tempCubelet = Block[2][0][0];
            Block[2][0][0] = Block[2][2][0];
            Block[2][2][0] = Block[2][2][2];
            Block[2][2][2] = Block[2][0][2];
            Block[2][0][2] = tempCubelet;

            tempCubelet = Block[2][0][1];
            Block[2][0][1] = Block[2][1][0];
            Block[2][1][0] = Block[2][2][1];
            Block[2][2][1] = Block[2][1][2];
            Block[2][1][2] = tempCubelet;

            for(int y = 0; y < size; ++y){
                for(int z = 0; z < size; ++z){
                    Block[2][y][z].colorSwap('x');
                }
            }
                
        }

        if(direction == "D"){ //Bottom (Down) ClockWise

            tempCubelet = Block[0][2][0];
            Block[0][2][0] = Block[0][2][2];
            Block[0][2][2] = Block[2][2][2];
            Block[2][2][2] = Block[2][2][0];
            Block[2][2][0] = tempCubelet;

            tempCubelet = Block[1][2][0];
            Block[1][2][0] = Block[0][2][1];
            Block[0][2][1] = Block[1][2][2];
            Block[1][2][2] = Block[2][2][1];
            Block[2][2][1] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int z = 0; z < size; ++z){
                    Block[x][2][z].colorSwap('y');
                }
            }
                
        }

        if(direction == "D'"){ //Bottom (Down) Counter-ClockWise

            tempCubelet = Block[0][2][0];
            Block[0][2][0] = Block[2][2][0];
            Block[2][2][0] = Block[2][2][2];
            Block[2][2][2] = Block[0][2][2];
            Block[0][2][2] = tempCubelet;

            tempCubelet = Block[1][2][0];
            Block[1][2][0] = Block[2][2][1];
            Block[2][2][1] = Block[1][2][2];
            Block[1][2][2] = Block[0][2][1];
            Block[0][2][1] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int z = 0; z < size; ++z){
                    Block[x][2][z].colorSwap('y');
                }
            }
                
        }

        if(direction == "U"){ //Up (Top) ClockWise

            tempCubelet = Block[0][0][0];
            Block[0][0][0] = Block[0][0][2];
            Block[0][0][2] = Block[2][0][2];
            Block[2][0][2] = Block[2][0][0];
            Block[2][0][0] = tempCubelet;

            tempCubelet = Block[1][0][0];
            Block[1][0][0] = Block[0][0][1];
            Block[0][0][1] = Block[1][0][2];
            Block[1][0][2] = Block[2][0][1];
            Block[2][0][1] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int z = 0; z < size; ++z){
                    Block[x][0][z].colorSwap('y');
                }
            }
                
        }

        if(direction == "U'"){ //Up (Top) Counter-ClockWise

            tempCubelet = Block[0][0][0];
            Block[0][0][0] = Block[2][0][0];
            Block[2][0][0] = Block[2][0][2];
            Block[2][0][2] = Block[0][0][2];
            Block[0][0][2] = tempCubelet;

            tempCubelet = Block[1][0][0];
            Block[1][0][0] = Block[2][0][1];
            Block[2][0][1] = Block[1][0][2];
            Block[1][0][2] = Block[0][0][1];
            Block[0][0][1] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int z = 0; z < size; ++z){
                    Block[x][0][z].colorSwap('y');
                }
            }
                
        }
        
        if(direction == "B" ){ //Back Clockwise

            tempCubelet = Block[0][0][0];
            Block[0][0][0] = Block[2][0][0];
            Block[2][0][0] = Block[2][2][0];
            Block[2][2][0] = Block[0][2][0];
            Block[0][2][0] = tempCubelet;

            tempCubelet = Block[1][0][0];
            Block[1][0][0] = Block[2][1][0];
            Block[2][1][0] = Block[1][2][0];
            Block[1][2][0] = Block[0][1][0];
            Block[0][1][0] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int y = 0; y < size; ++y){
                    Block[x][y][0].colorSwap('z');
                }
            }

        }

        if(direction == "B'" ){ //Back Clockwise

            tempCubelet = Block[0][0][0];
            Block[0][0][0] = Block[0][2][0];
            Block[0][2][0] = Block[2][2][0];
            Block[2][2][0] = Block[2][0][0];
            Block[2][0][0] = tempCubelet;

            tempCubelet = Block[1][0][0];
            Block[1][0][0] = Block[0][1][0];
            Block[0][1][0] = Block[1][2][0];
            Block[1][2][0] = Block[2][1][0];
            Block[2][1][0] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int y = 0; y < size; ++y){
                    Block[x][y][0].colorSwap('z');
                }
            }

        }

        if(direction == "F'" ){ //Front Clockwise

            tempCubelet = Block[0][0][2];
            Block[0][0][2] = Block[2][0][2];
            Block[2][0][2] = Block[2][2][2];
            Block[2][2][2] = Block[0][2][2];
            Block[0][2][2] = tempCubelet;

            tempCubelet = Block[1][0][2];
            Block[1][0][2] = Block[2][1][2];
            Block[2][1][2] = Block[1][2][2];
            Block[1][2][2] = Block[0][1][2];
            Block[0][1][2] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int y = 0; y < size; ++y){
                    Block[x][y][2].colorSwap('z');
                }
            }

        }

        if(direction == "F" ){ //Front Clockwise

            tempCubelet = Block[0][0][2];
            Block[0][0][2] = Block[0][2][2];
            Block[0][2][2] = Block[2][2][2];
            Block[2][2][2] = Block[2][0][2];
            Block[2][0][2] = tempCubelet;

            tempCubelet = Block[1][0][2];
            Block[1][0][2] = Block[0][1][2];
            Block[0][1][2] = Block[1][2][2];
            Block[1][2][2] = Block[2][1][2];
            Block[2][1][2] = tempCubelet;

            for(int x = 0; x < size; ++x){
                for(int y = 0; y < size; ++y){
                    Block[x][y][2].colorSwap('z');
                }
            }

        }
        

    }

    //Prints each face individually
    void printFaces (){

        System.out.println("White Face:");
        System.out.println(Block[0][0][0].colors[1] + ", " + Block[1][0][0].colors[1] + ", " + Block[2][0][0].colors[1]);
        System.out.println(Block[0][0][1].colors[1] + ", " + Block[1][0][1].colors[1] + ", " + Block[2][0][1].colors[1]);
        System.out.println(Block[0][0][2].colors[1] + ", " + Block[1][0][2].colors[1] + ", " + Block[2][0][2].colors[1]);

        System.out.println("");

        System.out.println("Yellow Face:");
        System.out.println(Block[0][2][2].colors[1] + ", " + Block[1][2][2].colors[1] + ", " + Block[2][2][2].colors[1]);
        System.out.println(Block[0][2][1].colors[1] + ", " + Block[1][2][1].colors[1] + ", " + Block[2][2][1].colors[1]);
        System.out.println(Block[0][2][0].colors[1] + ", " + Block[1][2][0].colors[1] + ", " + Block[2][2][0].colors[1]);

        System.out.println("");

        System.out.println("Red Face:");
        System.out.println(Block[0][0][2].colors[2] + ", " + Block[1][0][2].colors[2] + ", " + Block[2][0][2].colors[2]);
        System.out.println(Block[0][1][2].colors[2] + ", " + Block[1][1][2].colors[2] + ", " + Block[2][1][2].colors[2]);
        System.out.println(Block[0][2][2].colors[2] + ", " + Block[1][2][2].colors[2] + ", " + Block[2][2][2].colors[2]);

        System.out.println("");

        System.out.println("Orange Face:");
        System.out.println(Block[0][0][0].colors[2] + ", " + Block[1][0][0].colors[2] + ", " + Block[2][0][0].colors[2]);
        System.out.println(Block[0][1][0].colors[2] + ", " + Block[1][1][0].colors[2] + ", " + Block[2][1][0].colors[2]);
        System.out.println(Block[0][2][0].colors[2] + ", " + Block[1][2][0].colors[2] + ", " + Block[2][2][0].colors[2]);

        System.out.println("");

        System.out.println("Green Face:");
        System.out.println(Block[0][0][0].colors[0] + ", " + Block[0][0][1].colors[0] + ", " + Block[0][0][2].colors[0]);
        System.out.println(Block[0][1][0].colors[0] + ", " + Block[0][1][1].colors[0] + ", " + Block[0][1][2].colors[0]);
        System.out.println(Block[0][2][0].colors[0] + ", " + Block[0][2][1].colors[0] + ", " + Block[0][2][2].colors[0]);

        System.out.println("");

        System.out.println("Blue Face:");
        System.out.println(Block[2][0][0].colors[0] + ", " + Block[2][0][1].colors[0] + ", " + Block[2][0][2].colors[0]);
        System.out.println(Block[2][1][0].colors[0] + ", " + Block[2][1][1].colors[0] + ", " + Block[2][1][2].colors[0]);
        System.out.println(Block[2][2][0].colors[0] + ", " + Block[2][2][1].colors[0] + ", " + Block[2][2][2].colors[0]);

    }

    //Prints the block all together in "one 2d array"
    public void printBlock (){
        System.out.println("            " + "[" + Block[0][0][0].colors[1] + "] [" + Block[1][0][0].colors[1] + "] [" + Block[2][0][0].colors[1] + "]");
        System.out.println("            " + "[" + Block[0][0][1].colors[1] + "] [" + Block[1][0][1].colors[1] + "] [" + Block[2][0][1].colors[1] + "]");
        System.out.println("            " + "[" + Block[0][0][2].colors[1] + "] [" + Block[1][0][2].colors[1] + "] [" + Block[2][0][2].colors[1] + "]");
        System.out.println("[" + Block[0][0][0].colors[0] + "] [" + Block[0][0][1].colors[0] + "] [" + Block[0][0][2].colors[0] + "] [" + Block[0][0][2].colors[2] + "] [" + Block[1][0][2].colors[2] + "] [" + Block[2][0][2].colors[2] + "] [" + Block[2][0][2].colors[0] + "] [" + Block[2][0][1].colors[0] + "] [" + Block[2][0][0].colors[0] + "] [" + Block[2][0][0].colors[2] + "] [" + Block[1][0][0].colors[2] + "] [" + Block[0][0][0].colors[2] + "]");
        System.out.println("[" + Block[0][1][0].colors[0] + "] [" + Block[0][1][1].colors[0] + "] [" + Block[0][1][2].colors[0] + "] [" + Block[0][1][2].colors[2] + "] [" + Block[1][1][2].colors[2] + "] [" + Block[2][1][2].colors[2] + "] [" + Block[2][1][2].colors[0] + "] [" + Block[2][1][1].colors[0] + "] [" + Block[2][1][0].colors[0] + "] [" + Block[2][1][0].colors[2] + "] [" + Block[1][1][0].colors[2] + "] [" + Block[0][1][0].colors[2] + "]");
        System.out.println("[" + Block[0][2][0].colors[0] + "] [" + Block[0][2][1].colors[0] + "] [" + Block[0][2][2].colors[0] + "] [" + Block[0][2][2].colors[2] + "] [" + Block[1][2][2].colors[2] + "] [" + Block[2][2][2].colors[2] + "] [" + Block[2][2][2].colors[0] + "] [" + Block[2][2][1].colors[0] + "] [" + Block[2][2][0].colors[0] + "] [" + Block[2][2][0].colors[2] + "] [" + Block[1][2][0].colors[2] + "] [" + Block[0][2][0].colors[2] + "]");
        System.out.println("            " + "[" + Block[0][2][2].colors[1] + "] [" + Block[1][2][2].colors[1] + "] [" + Block[2][2][2].colors[1] + "]");
        System.out.println("            " + "[" + Block[0][2][1].colors[1] + "] [" + Block[1][2][1].colors[1] + "] [" + Block[2][2][1].colors[1] + "]");
        System.out.println("            " + "[" + Block[0][2][0].colors[1] + "] [" + Block[1][2][0].colors[1] + "] [" + Block[2][2][0].colors[1] + "]");
    }
    
    //Randomizes cube with user input on how many random turns it makes.
    //Will sometimes do two turns that equal out, could be fixed
    void randomizeCube(int turns){
        Random rn = new Random();

        int faceTurn;

        for (int i = 0; i < turns; ++i){
            faceTurn = rn.nextInt(11);

            if(faceTurn == 0){
                turnNotModular("F"); 
                //System.out.println("F");  
            }

            if(faceTurn == 1){
                turnNotModular("F'"); 
                //System.out.println("F'");  
            }

            if(faceTurn == 2){
                turnNotModular("B");  
                //System.out.println("B"); 
            }

            if(faceTurn == 3){
                turnNotModular("B'"); 
                //System.out.println("B'");  
            }

            if(faceTurn == 4){
                turnNotModular("R"); 
                //System.out.println("R");  
            }

            if(faceTurn == 5){
                turnNotModular("R'");  
                //System.out.println("R'"); 
            }

            if(faceTurn == 6){
                turnNotModular("L");  
                //System.out.println("L"); 
            }

            if(faceTurn == 7){
                turnNotModular("L'"); 
                //System.out.println("L'");  
            }
            
            if(faceTurn == 8){
                turnNotModular("U");   
                //System.out.println("U");
            }

            if(faceTurn == 9){
                turnNotModular("U'");   
                System.out.println("U'");
            }

            if(faceTurn == 10){
                turnNotModular("D");  
                //System.out.println("D"); 
            }

            if(faceTurn == 11){
                turnNotModular("D'"); 
                //System.out.println("D'");  
            }

            //printBlock();
            //System.out.println();

        }
    }

}

