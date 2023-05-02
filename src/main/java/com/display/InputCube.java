package com.display;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class InputCube {

    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static final short top = 1;
    private static final short bottom = 2;
    private static final short right = 3;
    private static final short left = 4;
    private static final short front = 5;
    private static final short back = 6;
    private int red_counter = 0;
    private int blue_counter = 0;
    private int green_counter = 0;
    private int orange_counter = 0;
    private int white_counter = 0;
    private int yellow_counter = 0;
    private List<Color> colorList = new ArrayList<Color>();

    public boolean inputCube(Group[] all_cubes, GridPane[] gridPanes, Block block){

        // Red = Front
        // Orange = Back
        // Green = Left
        // Blue = Right
        // White = top
        // Yellow = Bottom

        Color[][][] colors = new Color[6][ROWS][COLS];
        Rectangle rect1;
        Rectangle rect2;
        Rectangle rect3;
        Rectangle rect4;
        Rectangle rect5;
        Rectangle rect6;
        Rectangle rect7;
        Rectangle rect8;
        Rectangle rect9;
        Rectangle rect10;
        Rectangle rect11;
        Rectangle rect12;
        Rectangle rect13;
        Rectangle rect14;
        Rectangle rect15;
        Rectangle rect16;
        Rectangle rect17;
        Rectangle rect18;
        Rectangle rect19;
        Rectangle rect20;
        Rectangle rect21;
        Rectangle rect22;
        Rectangle rect23;
        Rectangle rect24;
        Rectangle rect25;
        Rectangle rect26;
        Rectangle rect27;
        Rectangle rect28;
        Rectangle rect29;
        Rectangle rect30;
        Rectangle rect31;
        Rectangle rect32;
        Rectangle rect33;
        Rectangle rect34;
        Rectangle rect35;
        Rectangle rect36;
        Rectangle rect37;
        Rectangle rect38;
        Rectangle rect39;
        Rectangle rect40;
        Rectangle rect41;
        Rectangle rect42;
        Rectangle rect43;
        Rectangle rect44;
        Rectangle rect45;
        Rectangle rect46;
        Rectangle rect47;
        Rectangle rect48;
        Rectangle rect49;
        Rectangle rect50;
        Rectangle rect51;
        Rectangle rect52;
        Rectangle rect53;
        Rectangle rect54;
        for (int i = 0; i < 6; i++) {
            GridPane gridPane = gridPanes[i];
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    Rectangle input_rect = (Rectangle) gridPane.getChildren().get(row * COLS + col);
                    colors[i][row][col] = (Color) input_rect.getFill();
                    
                }
            }
                    
            if (i == 0) {
                // top side
                System.out.println("Top Side");
                rect1 = (Rectangle) all_cubes[22].getChildren().get(top);
                rect2 = (Rectangle) all_cubes[23].getChildren().get(top);
                rect3 = (Rectangle) all_cubes[25].getChildren().get(top);
                rect4 = (Rectangle) all_cubes[13].getChildren().get(top);
                rect5 = (Rectangle) all_cubes[14].getChildren().get(top);
                rect6 = (Rectangle) all_cubes[16].getChildren().get(top);
                rect7 = (Rectangle) all_cubes[4].getChildren().get(top);
                rect8 = (Rectangle) all_cubes[6].getChildren().get(top);
                rect9 = (Rectangle) all_cubes[7].getChildren().get(top);
                rect1.setFill(colors[i][0][0]);
                rect2.setFill(colors[i][0][1]);
                rect3.setFill(colors[i][0][2]);
                rect4.setFill(colors[i][1][0]);
                rect5.setFill(colors[i][1][1]);
                rect6.setFill(colors[i][1][2]);
                rect7.setFill(colors[i][2][0]);
                rect8.setFill(colors[i][2][1]);
                rect9.setFill(colors[i][2][2]);
                colorList.add((Color) rect1.getFill());
                colorList.add((Color) rect2.getFill()); 
                colorList.add((Color) rect3.getFill());
                colorList.add((Color) rect4.getFill());
                colorList.add((Color) rect5.getFill());
                colorList.add((Color) rect6.getFill());
                colorList.add((Color) rect7.getFill());
                colorList.add((Color) rect8.getFill());
                colorList.add((Color) rect9.getFill());
                
                // This works for white side.                
            } else if (i == 1) {
                // left side 
                //System.out.println(input_rect.getFill());
                System.out.println("Left Side");
                rect10 = (Rectangle) all_cubes[22].getChildren().get(left);
                rect11 = (Rectangle) all_cubes[13].getChildren().get(left);
                rect12 = (Rectangle) all_cubes[4].getChildren().get(left);
                rect13 = (Rectangle) all_cubes[21].getChildren().get(left);
                rect14 = (Rectangle) all_cubes[12].getChildren().get(left);
                rect15 = (Rectangle) all_cubes[5].getChildren().get(left);
                rect16 = (Rectangle) all_cubes[24].getChildren().get(left);
                rect17 = (Rectangle) all_cubes[15].getChildren().get(left);
                rect18 = (Rectangle) all_cubes[8].getChildren().get(left);
                rect10.setFill(colors[i][0][0]);
                rect11.setFill(colors[i][0][1]);
                rect12.setFill(colors[i][0][2]);
                rect13.setFill(colors[i][1][0]);
                rect14.setFill(colors[i][1][1]);
                rect15.setFill(colors[i][1][2]);
                rect16.setFill(colors[i][2][0]);
                rect17.setFill(colors[i][2][1]);
                rect18.setFill(colors[i][2][2]);
                colorList.add((Color) rect10.getFill());
                colorList.add((Color) rect11.getFill());
                colorList.add((Color) rect12.getFill());
                colorList.add((Color) rect13.getFill());
                colorList.add((Color) rect14.getFill());
                colorList.add((Color) rect15.getFill());
                colorList.add((Color) rect16.getFill());
                colorList.add((Color) rect17.getFill());
                colorList.add((Color) rect18.getFill());
                

            } else if (i == 2) {
                // front side
                //System.out.println(input_rect.getFill());
                System.out.println("Front Side");
                rect19 = (Rectangle) all_cubes[4].getChildren().get(front);
                rect20 = (Rectangle) all_cubes[6].getChildren().get(front);
                rect21 = (Rectangle) all_cubes[7].getChildren().get(front);
                rect22 = (Rectangle) all_cubes[5].getChildren().get(front);
                rect23 = (Rectangle) all_cubes[0].getChildren().get(front);
                rect24 = (Rectangle) all_cubes[2].getChildren().get(front);
                rect25 = (Rectangle) all_cubes[8].getChildren().get(front);
                rect26 = (Rectangle) all_cubes[3].getChildren().get(front);
                rect27 = (Rectangle) all_cubes[1].getChildren().get(front);
                rect19.setFill(colors[i][0][0]);
                rect20.setFill(colors[i][0][1]);
                rect21.setFill(colors[i][0][2]);
                rect22.setFill(colors[i][1][0]);
                rect23.setFill(colors[i][1][1]);
                rect24.setFill(colors[i][1][2]);
                rect25.setFill(colors[i][2][0]);
                rect26.setFill(colors[i][2][1]);
                rect27.setFill(colors[i][2][2]);
                colorList.add((Color) rect19.getFill());
                colorList.add((Color) rect20.getFill());
                colorList.add((Color) rect21.getFill());
                colorList.add((Color) rect22.getFill());
                colorList.add((Color) rect23.getFill());
                colorList.add((Color) rect24.getFill());
                colorList.add((Color) rect25.getFill());
                colorList.add((Color) rect26.getFill());
                colorList.add((Color) rect27.getFill());
                
            } else if (i == 3) {
                // right side
                //System.out.println(input_rect.getFill());
                System.out.println("Right Side");
                rect28 = (Rectangle) all_cubes[7].getChildren().get(right);
                rect29 = (Rectangle) all_cubes[16].getChildren().get(right);
                rect30 = (Rectangle) all_cubes[25].getChildren().get(right);
                rect31 = (Rectangle) all_cubes[2].getChildren().get(right);
                rect32 = (Rectangle) all_cubes[9].getChildren().get(right);
                rect33 = (Rectangle) all_cubes[18].getChildren().get(right);
                rect34 = (Rectangle) all_cubes[1].getChildren().get(right);
                rect35 = (Rectangle) all_cubes[10].getChildren().get(right);
                rect36 = (Rectangle) all_cubes[19].getChildren().get(right);
                rect28.setFill(colors[i][0][0]);
                rect29.setFill(colors[i][0][1]);
                rect30.setFill(colors[i][0][2]);
                rect31.setFill(colors[i][1][0]);
                rect32.setFill(colors[i][1][1]);
                rect33.setFill(colors[i][1][2]);
                rect34.setFill(colors[i][2][0]);
                rect35.setFill(colors[i][2][1]);
                rect36.setFill(colors[i][2][2]);
                colorList.add((Color) rect28.getFill());
                colorList.add((Color) rect29.getFill());
                colorList.add((Color) rect30.getFill());
                colorList.add((Color) rect31.getFill());
                colorList.add((Color) rect32.getFill());
                colorList.add((Color) rect33.getFill());
                colorList.add((Color) rect34.getFill());
                colorList.add((Color) rect35.getFill());
                colorList.add((Color) rect36.getFill());
            } else if (i == 4) {
                // back side
                //System.out.println(input_rect.getFill());
                System.out.println("Back Side");
                rect37 = (Rectangle) all_cubes[25].getChildren().get(back);
                rect38 = (Rectangle) all_cubes[23].getChildren().get(back);
                rect39 = (Rectangle) all_cubes[22].getChildren().get(back);
                rect40 = (Rectangle) all_cubes[18].getChildren().get(back);
                rect41 = (Rectangle) all_cubes[17].getChildren().get(back);
                rect42 = (Rectangle) all_cubes[21].getChildren().get(back);
                rect43 = (Rectangle) all_cubes[19].getChildren().get(back);
                rect44 = (Rectangle) all_cubes[20].getChildren().get(back);
                rect45 = (Rectangle) all_cubes[24].getChildren().get(back);
                rect37.setFill(colors[i][0][0]);
                rect38.setFill(colors[i][0][1]);
                rect39.setFill(colors[i][0][2]);
                rect40.setFill(colors[i][1][0]);
                rect41.setFill(colors[i][1][1]);
                rect42.setFill(colors[i][1][2]);
                rect43.setFill(colors[i][2][0]);
                rect44.setFill(colors[i][2][1]);
                rect45.setFill(colors[i][2][2]);
                colorList.add((Color) rect37.getFill());
                colorList.add((Color) rect38.getFill());
                colorList.add((Color) rect39.getFill());
                colorList.add((Color) rect40.getFill());
                colorList.add((Color) rect41.getFill());
                colorList.add((Color) rect42.getFill());
                colorList.add((Color) rect43.getFill());
                colorList.add((Color) rect44.getFill());
                colorList.add((Color) rect45.getFill());
            } else if (i == 5) {
                // bottom side
                //System.out.println(input_rect.getFill());
                System.out.println("Bottom Side");
                rect46 = (Rectangle) all_cubes[8].getChildren().get(bottom);
                rect47 = (Rectangle) all_cubes[3].getChildren().get(bottom);
                rect48 = (Rectangle) all_cubes[1].getChildren().get(bottom);
                rect49 = (Rectangle) all_cubes[15].getChildren().get(bottom);
                rect50 = (Rectangle) all_cubes[11].getChildren().get(bottom);
                rect51 = (Rectangle) all_cubes[10].getChildren().get(bottom);
                rect52 = (Rectangle) all_cubes[24].getChildren().get(bottom);
                rect53 = (Rectangle) all_cubes[20].getChildren().get(bottom);
                rect54 = (Rectangle) all_cubes[19].getChildren().get(bottom);
                rect46.setFill(colors[i][0][0]);
                rect47.setFill(colors[i][0][1]);
                rect48.setFill(colors[i][0][2]);
                rect49.setFill(colors[i][1][0]);
                rect50.setFill(colors[i][1][1]);
                rect51.setFill(colors[i][1][2]);
                rect52.setFill(colors[i][2][0]);
                rect53.setFill(colors[i][2][1]);
                rect54.setFill(colors[i][2][2]);
                colorList.add((Color) rect46.getFill());
                colorList.add((Color) rect47.getFill());
                colorList.add((Color) rect48.getFill());
                colorList.add((Color) rect49.getFill());
                colorList.add((Color) rect50.getFill());
                colorList.add((Color) rect51.getFill());
                colorList.add((Color) rect52.getFill());
                colorList.add((Color) rect53.getFill());
                colorList.add((Color) rect54.getFill());
                
            }
        
        }
        red_counter = Collections.frequency(colorList, Color.RED);
        blue_counter = Collections.frequency(colorList, Color.BLUE);
        green_counter = Collections.frequency(colorList, Color.GREEN);
        orange_counter = Collections.frequency(colorList, Color.ORANGE);
        white_counter = Collections.frequency(colorList, Color.WHITE);
        yellow_counter = Collections.frequency(colorList, Color.YELLOW);

        String InputCube_String = BlockToString();
        Block inputBlock = new Block(3);
        inputBlock.StringtoBlock(InputCube_String);

        
        if (red_counter == 9 && blue_counter == 9 && green_counter == 9 && orange_counter == 9 && white_counter == 9 && yellow_counter == 9) {
            block.updateCube(colors);
            return true;
        } else { return false; }
        
    }
    private String BlockToString() {
        String BlockString = "";
        for (Color colorI : colorList) {
            if (colorI == Color.WHITE){
                BlockString = BlockString + "W";
            }
            else if (colorI == Color.GREEN) {
                BlockString = BlockString + "G";
            }
            else if (colorI == Color.RED) {
                BlockString = BlockString + "R";
            }
            else if (colorI == Color.BLUE) {
                BlockString = BlockString + "B";
            }
            else if (colorI == Color.ORANGE) {
                BlockString = BlockString + "O";
            }
            else if (colorI == Color.YELLOW) {
                BlockString = BlockString + "Y";
            }
            else {
                System.out.println("Invalid color during input!!");
            }            
        }
        return BlockString;
    }
    public GridPane[] initColors(Color[][][] colors){
        GridPane[] gridPanes = new GridPane[6];
        colors[0][0][0] = Color.WHITE;
        colors[0][0][1] = Color.WHITE;
        colors[0][0][2] = Color.WHITE;
        colors[0][1][0] = Color.WHITE;
        colors[0][1][1] = Color.WHITE;
        colors[0][1][2] = Color.WHITE;
        colors[0][2][0] = Color.WHITE;
        colors[0][2][1] = Color.WHITE;
        colors[0][2][1] = Color.WHITE;

        colors[1][0][0] = Color.GREEN;
        colors[1][0][1] = Color.GREEN;
        colors[1][0][2] = Color.GREEN;
        colors[1][1][0] = Color.GREEN;
        colors[1][1][1] = Color.GREEN;
        colors[1][1][2] = Color.GREEN;
        colors[1][2][0] = Color.GREEN;
        colors[1][2][1] = Color.GREEN;
        colors[1][2][2] = Color.GREEN;

        colors[2][0][0] = Color.RED;
        colors[2][0][1] = Color.RED;
        colors[2][0][2] = Color.RED;
        colors[2][1][0] = Color.RED;
        colors[2][1][1] = Color.RED;
        colors[2][1][2] = Color.RED;
        colors[2][2][0] = Color.RED;
        colors[2][2][1] = Color.RED;
        colors[2][2][2] = Color.RED;

        colors[3][0][0] = Color.BLUE;
        colors[3][0][1] = Color.BLUE;
        colors[3][0][2] = Color.BLUE;
        colors[3][1][0] = Color.BLUE;
        colors[3][1][1] = Color.BLUE;
        colors[3][1][2] = Color.BLUE;
        colors[3][2][0] = Color.BLUE;
        colors[3][2][1] = Color.BLUE;
        colors[3][2][2] = Color.BLUE;

        colors[4][0][0] = Color.ORANGE;
        colors[4][0][1] = Color.ORANGE;
        colors[4][0][2] = Color.ORANGE;
        colors[4][1][0] = Color.ORANGE;
        colors[4][1][1] = Color.ORANGE;
        colors[4][1][2] = Color.ORANGE;
        colors[4][2][0] = Color.ORANGE;
        colors[4][2][1] = Color.ORANGE;
        colors[4][2][2] = Color.ORANGE;

        colors[5][0][0] = Color.YELLOW;
        colors[5][0][1] = Color.YELLOW;
        colors[5][0][2] = Color.YELLOW;
        colors[5][1][0] = Color.YELLOW;
        colors[5][1][1] = Color.YELLOW;
        colors[5][1][2] = Color.YELLOW;
        colors[5][2][0] = Color.YELLOW;
        colors[5][2][1] = Color.YELLOW;
        colors[5][2][2] = Color.YELLOW;

        return gridPanes;
    }
}
