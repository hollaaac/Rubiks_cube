package com.display;
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

    public void inputCube(Group[] all_cubes, GridPane[] gridPanes){
        Group[] inputGroup = new Group[9];
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
        int counter = 0;
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
                
            }



                    
                    


            
            
        }
    }
}
