package com.display;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class RotateCube{

    public void rotateCube(Group[] all_cubes, Color side, double direction) {
        Group[] rotateGroup = new Group[9];
        int top = 1;
        int bottom = 2;
        int backright = 3;
        int backleft = 4;
        int frontleft = 5;
        int frontright = 6;

        if (side == Color.RED) {
            rotateGroup[0] = all_cubes[0];
            rotateGroup[1] = all_cubes[4];
            rotateGroup[2] = all_cubes[6];
            rotateGroup[3] = all_cubes[7];
            rotateGroup[4] = all_cubes[5];
            rotateGroup[5] = all_cubes[2];
            rotateGroup[6] = all_cubes[8];
            rotateGroup[7] = all_cubes[3];
            rotateGroup[8] = all_cubes[1];
    
            Rectangle refRectangle1;
            Rectangle refRectangle2;
            Rectangle refRectangle3;
            Rectangle refRectangle4;
            Rectangle refRectangle5;
            Rectangle refRectangle6;
            Rectangle refRectangle7;
            Rectangle refRectangle8;
            Rectangle refRectangle9;
            Rectangle refRectangle10;
            Rectangle refRectangle11;
            Rectangle refRectangle12;
            Rectangle refRectangle13;
            Rectangle refRectangle14;
            Rectangle refRectangle15;
            Rectangle refRectangle16;
            Rectangle refRectangle17;
            Rectangle refRectangle18;
            Rectangle refRectangle19;
            Rectangle refRectangle20;
    
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
    
            Color tempColor1;
            Color tempColor2;
            Color tempColor3;
            Color tempColor4;
            Color tempColor5;
            Color tempColor6;
            Color tempColor7;
            Color tempColor8;
            Color tempColor9;
            Color tempColor10;
            Color tempColor11;
            Color tempColor12;
            Color tempColor13;
            Color tempColor14;
            Color tempColor15;
            Color tempColor16;
            Color tempColor17;
            Color tempColor18;
            Color tempColor19;
            Color tempColor20;
    
            refRectangle1 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            refRectangle2 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            refRectangle3 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            refRectangle4 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            refRectangle5 = (Rectangle) rotateGroup[4].getChildren().get(frontleft);
            refRectangle6 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            refRectangle7 = (Rectangle) rotateGroup[1].getChildren().get(top);
            refRectangle8 = (Rectangle) rotateGroup[1].getChildren().get(frontleft);
            refRectangle9 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            refRectangle10 = (Rectangle) rotateGroup[7].getChildren().get(frontleft);
            refRectangle11 = (Rectangle) rotateGroup[2].getChildren().get(top);
            refRectangle12 = (Rectangle) rotateGroup[2].getChildren().get(frontleft);
            refRectangle13 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            refRectangle14 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            refRectangle15 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);

            refRectangle16 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            refRectangle17 = (Rectangle) rotateGroup[5].getChildren().get(frontleft);

            refRectangle18 = (Rectangle) rotateGroup[3].getChildren().get(top);
            refRectangle19 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            refRectangle20 = (Rectangle) rotateGroup[3].getChildren().get(frontleft);
    
            rect1 = (Rectangle) rotateGroup[1].getChildren().get(top);
            rect2 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            rect3 = (Rectangle) rotateGroup[1].getChildren().get(frontleft);
            rect4 = (Rectangle) rotateGroup[2].getChildren().get(top);
            rect5 = (Rectangle) rotateGroup[2].getChildren().get(frontleft);
            rect6 = (Rectangle) rotateGroup[3].getChildren().get(top);
            rect7 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            rect8 = (Rectangle) rotateGroup[3].getChildren().get(frontleft);
            rect9 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            rect10 = (Rectangle) rotateGroup[4].getChildren().get(frontleft);
            rect11 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            rect12 = (Rectangle) rotateGroup[5].getChildren().get(frontleft);
            rect13 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            rect14 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            rect15 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);

            rect16 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            rect17 = (Rectangle) rotateGroup[7].getChildren().get(frontleft);

            rect18 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            rect19 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            rect20 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
    
            tempColor1 = (Color) refRectangle1.getFill();
            tempColor2 = (Color) refRectangle2.getFill();
            tempColor3 = (Color) refRectangle3.getFill();
            tempColor4 = (Color) refRectangle4.getFill();
            tempColor5 = (Color) refRectangle5.getFill();
            tempColor6 = (Color) refRectangle6.getFill();
            tempColor7 = (Color) refRectangle7.getFill();
            tempColor8 = (Color) refRectangle8.getFill();
            tempColor9 = (Color) refRectangle9.getFill();
            tempColor10 = (Color) refRectangle10.getFill();
            tempColor11 = (Color) refRectangle11.getFill();
            tempColor12 = (Color) refRectangle12.getFill();
            tempColor13 = (Color) refRectangle13.getFill();
            tempColor14 = (Color) refRectangle14.getFill();
            tempColor15 = (Color) refRectangle15.getFill();
            tempColor16 = (Color) refRectangle16.getFill();
            tempColor17 = (Color) refRectangle17.getFill();
            tempColor18 = (Color) refRectangle18.getFill();
            tempColor19 = (Color) refRectangle19.getFill();
            tempColor20 = (Color) refRectangle20.getFill();
    
            rect1.setFill(tempColor1);
            rect2.setFill(tempColor2);
            rect3.setFill(tempColor3);
            rect4.setFill(tempColor4);
            rect5.setFill(tempColor5);
            rect6.setFill(tempColor6);
            rect7.setFill(tempColor7);
            rect8.setFill(tempColor8);
            rect9.setFill(tempColor9);
            rect10.setFill(tempColor10);
            rect11.setFill(tempColor11);
            rect12.setFill(tempColor12);
            rect13.setFill(tempColor13);
            rect14.setFill(tempColor14);
            rect15.setFill(tempColor15);
            rect16.setFill(tempColor16);
            rect17.setFill(tempColor17);
            rect18.setFill(tempColor18);
            rect19.setFill(tempColor19);
            rect20.setFill(tempColor20);
            
        }
            // index 1 = top (white)
            // index 2 = bottom (yellow)
            // index 3 = backright (green)
            // index 4 = frontleft (blue)
            // index 5 = frontright (orange)
            // index 6 = backleft (red)
        if (side == Color.BLUE) {
            rotateGroup[0] = all_cubes[9];
            rotateGroup[1] = all_cubes[7];
            rotateGroup[2] = all_cubes[16];
            rotateGroup[3] = all_cubes[25];
            rotateGroup[4] = all_cubes[2];
            rotateGroup[5] = all_cubes[18];
            rotateGroup[6] = all_cubes[1];
            rotateGroup[7] = all_cubes[10];
            rotateGroup[8] = all_cubes[19];
    
            Rectangle refRectangle1;
            Rectangle refRectangle2;
            Rectangle refRectangle3;
            Rectangle refRectangle4;
            Rectangle refRectangle5;
            Rectangle refRectangle6;
            Rectangle refRectangle7;
            Rectangle refRectangle8;
            Rectangle refRectangle9;
            Rectangle refRectangle10;
            Rectangle refRectangle11;
            Rectangle refRectangle12;
            Rectangle refRectangle13;
            Rectangle refRectangle14;
            Rectangle refRectangle15;
            Rectangle refRectangle16;
            Rectangle refRectangle17;
            Rectangle refRectangle18;
            Rectangle refRectangle19;
            Rectangle refRectangle20;
    
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
    
            Color tempColor1;
            Color tempColor2;
            Color tempColor3;
            Color tempColor4;
            Color tempColor5;
            Color tempColor6;
            Color tempColor7;
            Color tempColor8;
            Color tempColor9;
            Color tempColor10;
            Color tempColor11;
            Color tempColor12;
            Color tempColor13;
            Color tempColor14;
            Color tempColor15;
            Color tempColor16;
            Color tempColor17;
            Color tempColor18;
            Color tempColor19;
            Color tempColor20;
    
            refRectangle1 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            refRectangle2 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            refRectangle3 = (Rectangle) rotateGroup[6].getChildren().get(backright);
            refRectangle4 = (Rectangle) rotateGroup[4].getChildren().get(frontleft);
            refRectangle5 = (Rectangle) rotateGroup[4].getChildren().get(backright);
            refRectangle6 = (Rectangle) rotateGroup[1].getChildren().get(frontleft);
            refRectangle7 = (Rectangle) rotateGroup[1].getChildren().get(top);
            refRectangle8 = (Rectangle) rotateGroup[1].getChildren().get(backright);
            refRectangle9 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            refRectangle10 = (Rectangle) rotateGroup[7].getChildren().get(backright);
            refRectangle11 = (Rectangle) rotateGroup[2].getChildren().get(top);
            refRectangle12 = (Rectangle) rotateGroup[2].getChildren().get(backright);
            refRectangle13 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            refRectangle14 = (Rectangle) rotateGroup[8].getChildren().get(frontright);
            refRectangle15 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            refRectangle16 = (Rectangle) rotateGroup[5].getChildren().get(frontright);
            refRectangle17 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            refRectangle18 = (Rectangle) rotateGroup[3].getChildren().get(top);
            refRectangle19 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            refRectangle20 = (Rectangle) rotateGroup[3].getChildren().get(backright);
    
            rect1 = (Rectangle) rotateGroup[1].getChildren().get(frontleft);
            rect2 = (Rectangle) rotateGroup[1].getChildren().get(top);
            rect3 = (Rectangle) rotateGroup[1].getChildren().get(backright);
            rect4 = (Rectangle) rotateGroup[2].getChildren().get(top);
            rect5 = (Rectangle) rotateGroup[2].getChildren().get(backright);
            rect6 = (Rectangle) rotateGroup[3].getChildren().get(top);
            rect7 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            rect8 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            rect9 = (Rectangle) rotateGroup[4].getChildren().get(frontleft);
            rect10 = (Rectangle) rotateGroup[4].getChildren().get(backright);
            rect11 = (Rectangle) rotateGroup[5].getChildren().get(frontright);
            rect12 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            rect13 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            rect14 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            rect15 = (Rectangle) rotateGroup[6].getChildren().get(backright);
            rect16 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            rect17 = (Rectangle) rotateGroup[7].getChildren().get(backright);
            rect18 = (Rectangle) rotateGroup[8].getChildren().get(frontright);
            rect19 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            rect20 = (Rectangle) rotateGroup[8].getChildren().get(backright);
    
            tempColor1 = (Color) refRectangle1.getFill();
            tempColor2 = (Color) refRectangle2.getFill();
            tempColor3 = (Color) refRectangle3.getFill();
            tempColor4 = (Color) refRectangle4.getFill();
            tempColor5 = (Color) refRectangle5.getFill();
            tempColor6 = (Color) refRectangle6.getFill();
            tempColor7 = (Color) refRectangle7.getFill();
            tempColor8 = (Color) refRectangle8.getFill();
            tempColor9 = (Color) refRectangle9.getFill();
            tempColor10 = (Color) refRectangle10.getFill();
            tempColor11 = (Color) refRectangle11.getFill();
            tempColor12 = (Color) refRectangle12.getFill();
            tempColor13 = (Color) refRectangle13.getFill();
            tempColor14 = (Color) refRectangle14.getFill();
            tempColor15 = (Color) refRectangle15.getFill();
            tempColor16 = (Color) refRectangle16.getFill();
            tempColor17 = (Color) refRectangle17.getFill();
            tempColor18 = (Color) refRectangle18.getFill();
            tempColor19 = (Color) refRectangle19.getFill();
            tempColor20 = (Color) refRectangle20.getFill();
    
            rect1.setFill(tempColor1);
            rect2.setFill(tempColor2);
            rect3.setFill(tempColor3);
            rect4.setFill(tempColor4);
            rect5.setFill(tempColor5);
            rect6.setFill(tempColor6);
            rect7.setFill(tempColor7);
            rect8.setFill(tempColor8);
            rect9.setFill(tempColor9);
            rect10.setFill(tempColor10);
            rect11.setFill(tempColor11);
            rect12.setFill(tempColor12);
            rect13.setFill(tempColor13);
            rect14.setFill(tempColor14);
            rect15.setFill(tempColor15);
            rect16.setFill(tempColor16);
            rect17.setFill(tempColor17);
            rect18.setFill(tempColor18);
            rect19.setFill(tempColor19);
            rect20.setFill(tempColor20);
            
        }
            // index 1 = top (white)
            // index 2 = bottom (yellow)
            // index 3 = backright (green)
            // index 4 = frontleft (blue)
            // index 5 = frontright (orange)
            // index 6 = backleft (red)
        else if (side == Color.ORANGE) {
            rotateGroup[0] = all_cubes[17];
            rotateGroup[1] = all_cubes[22];
            rotateGroup[2] = all_cubes[23];
            rotateGroup[3] = all_cubes[25];
            rotateGroup[4] = all_cubes[21];
            rotateGroup[5] = all_cubes[18];
            rotateGroup[6] = all_cubes[24];
            rotateGroup[7] = all_cubes[20];
            rotateGroup[8] = all_cubes[19];
    
            Rectangle refRectangle1;
            Rectangle refRectangle2;
            Rectangle refRectangle3;
            Rectangle refRectangle4;
            Rectangle refRectangle5;
            Rectangle refRectangle6;
            Rectangle refRectangle7;
            Rectangle refRectangle8;
            Rectangle refRectangle9;
            Rectangle refRectangle10;
            Rectangle refRectangle11;
            Rectangle refRectangle12;
            Rectangle refRectangle13;
            Rectangle refRectangle14;
            Rectangle refRectangle15;
            Rectangle refRectangle16;
            Rectangle refRectangle17;
            Rectangle refRectangle18;
            Rectangle refRectangle19;
            Rectangle refRectangle20;
    
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
    
            Color tempColor1;
            Color tempColor2;
            Color tempColor3;
            Color tempColor4;
            Color tempColor5;
            Color tempColor6;
            Color tempColor7;
            Color tempColor8;
            Color tempColor9;
            Color tempColor10;
            Color tempColor11;
            Color tempColor12;
            Color tempColor13;
            Color tempColor14;
            Color tempColor15;
            Color tempColor16;
            Color tempColor17;
            Color tempColor18;
            Color tempColor19;
            Color tempColor20;
    
            refRectangle1 = (Rectangle) rotateGroup[3].getChildren().get(top);
            refRectangle2 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            refRectangle3 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            refRectangle4 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            refRectangle5 = (Rectangle) rotateGroup[5].getChildren().get(frontright);
            refRectangle6 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            refRectangle7 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            refRectangle8 = (Rectangle) rotateGroup[8].getChildren().get(frontright);
            refRectangle9 = (Rectangle) rotateGroup[2].getChildren().get(top);
            refRectangle10 = (Rectangle) rotateGroup[2].getChildren().get(frontright);
            refRectangle11 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            refRectangle12 = (Rectangle) rotateGroup[7].getChildren().get(frontright);
            refRectangle13 = (Rectangle) rotateGroup[1].getChildren().get(top);
            refRectangle14 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            refRectangle15 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            refRectangle16 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            refRectangle17 = (Rectangle) rotateGroup[4].getChildren().get(frontright);
            refRectangle18 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            refRectangle19 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            refRectangle20 = (Rectangle) rotateGroup[6].getChildren().get(frontright);
    
            rect1 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            rect2 = (Rectangle) rotateGroup[1].getChildren().get(top);
            rect3 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            rect4 = (Rectangle) rotateGroup[2].getChildren().get(top);
            rect5 = (Rectangle) rotateGroup[2].getChildren().get(frontright);
            rect6 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            rect7 = (Rectangle) rotateGroup[3].getChildren().get(top);
            rect8 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            rect9 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            rect10 = (Rectangle) rotateGroup[4].getChildren().get(frontright);
            rect11 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            rect12 = (Rectangle) rotateGroup[5].getChildren().get(frontright);
            rect13 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            rect14 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            rect15 = (Rectangle) rotateGroup[6].getChildren().get(frontright);
            rect16 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            rect17 = (Rectangle) rotateGroup[7].getChildren().get(frontright);
            rect18 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            rect19 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            rect20 = (Rectangle) rotateGroup[8].getChildren().get(frontright);
    
            tempColor1 = (Color) refRectangle1.getFill();
            tempColor2 = (Color) refRectangle2.getFill();
            tempColor3 = (Color) refRectangle3.getFill();
            tempColor4 = (Color) refRectangle4.getFill();
            tempColor5 = (Color) refRectangle5.getFill();
            tempColor6 = (Color) refRectangle6.getFill();
            tempColor7 = (Color) refRectangle7.getFill();
            tempColor8 = (Color) refRectangle8.getFill();
            tempColor9 = (Color) refRectangle9.getFill();
            tempColor10 = (Color) refRectangle10.getFill();
            tempColor11 = (Color) refRectangle11.getFill();
            tempColor12 = (Color) refRectangle12.getFill();
            tempColor13 = (Color) refRectangle13.getFill();
            tempColor14 = (Color) refRectangle14.getFill();
            tempColor15 = (Color) refRectangle15.getFill();
            tempColor16 = (Color) refRectangle16.getFill();
            tempColor17 = (Color) refRectangle17.getFill();
            tempColor18 = (Color) refRectangle18.getFill();
            tempColor19 = (Color) refRectangle19.getFill();
            tempColor20 = (Color) refRectangle20.getFill();
    
            rect1.setFill(tempColor1);
            rect2.setFill(tempColor2);
            rect3.setFill(tempColor3);
            rect4.setFill(tempColor4);
            rect5.setFill(tempColor5);
            rect6.setFill(tempColor6);
            rect7.setFill(tempColor7);
            rect8.setFill(tempColor8);
            rect9.setFill(tempColor9);
            rect10.setFill(tempColor10);
            rect11.setFill(tempColor11);
            rect12.setFill(tempColor12);
            rect13.setFill(tempColor13);
            rect14.setFill(tempColor14);
            rect15.setFill(tempColor15);
            rect16.setFill(tempColor16);
            rect17.setFill(tempColor17);
            rect18.setFill(tempColor18);
            rect19.setFill(tempColor19);
            rect20.setFill(tempColor20);

                
        }
                // index 1 = top (white)
                // index 2 = bottom (yellow)
                // index 3 = backright (green)
                // index 4 = frontleft (blue)
                // index 5 = frontright (orange)
                // index 6 = backleft (red)
        else if (side == Color.GREEN) {
            rotateGroup[0] = all_cubes[12];
            rotateGroup[1] = all_cubes[22];
            rotateGroup[2] = all_cubes[13];
            rotateGroup[3] = all_cubes[4];
            rotateGroup[4] = all_cubes[21];
            rotateGroup[5] = all_cubes[5];
            rotateGroup[6] = all_cubes[24];
            rotateGroup[7] = all_cubes[15];
            rotateGroup[8] = all_cubes[8];
    
            Rectangle refRectangle1;
            Rectangle refRectangle2;
            Rectangle refRectangle3;
            Rectangle refRectangle4;
            Rectangle refRectangle5;
            Rectangle refRectangle6;
            Rectangle refRectangle7;
            Rectangle refRectangle8;
            Rectangle refRectangle9;
            Rectangle refRectangle10;
            Rectangle refRectangle11;
            Rectangle refRectangle12;
            Rectangle refRectangle13;
            Rectangle refRectangle14;
            Rectangle refRectangle15;
            Rectangle refRectangle16;
            Rectangle refRectangle17;
            Rectangle refRectangle18;
            Rectangle refRectangle19;
            Rectangle refRectangle20;
    
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
    
            Color tempColor1;
            Color tempColor2;
            Color tempColor3;
            Color tempColor4;
            Color tempColor5;
            Color tempColor6;
            Color tempColor7;
            Color tempColor8;
            Color tempColor9;
            Color tempColor10;
            Color tempColor11;
            Color tempColor12;
            Color tempColor13;
            Color tempColor14;
            Color tempColor15;
            Color tempColor16;
            Color tempColor17;
            Color tempColor18;
            Color tempColor19;
            Color tempColor20;
    
            refRectangle1 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            refRectangle2 = (Rectangle) rotateGroup[6].getChildren().get(frontright);
            refRectangle3 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            refRectangle4 = (Rectangle) rotateGroup[4].getChildren().get(frontright);
            refRectangle5 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            refRectangle6 = (Rectangle) rotateGroup[1].getChildren().get(top);
            refRectangle7 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            refRectangle8 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            refRectangle9 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            refRectangle10 = (Rectangle) rotateGroup[7].getChildren().get(backleft);
            refRectangle11 = (Rectangle) rotateGroup[2].getChildren().get(top);
            refRectangle12 = (Rectangle) rotateGroup[2].getChildren().get(backleft);
            refRectangle13 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
            refRectangle14 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            refRectangle15 = (Rectangle) rotateGroup[8].getChildren().get(backleft);
            refRectangle16 = (Rectangle) rotateGroup[5].getChildren().get(frontleft);
            refRectangle17 = (Rectangle) rotateGroup[5].getChildren().get(backleft);
            refRectangle18 = (Rectangle) rotateGroup[3].getChildren().get(top);
            refRectangle19 = (Rectangle) rotateGroup[3].getChildren().get(frontleft);
            refRectangle20 = (Rectangle) rotateGroup[3].getChildren().get(backleft);
    
            rect1 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            rect2 = (Rectangle) rotateGroup[1].getChildren().get(top);
            rect3 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            rect4 = (Rectangle) rotateGroup[2].getChildren().get(top);
            rect5 = (Rectangle) rotateGroup[2].getChildren().get(backleft);
            rect6 = (Rectangle) rotateGroup[3].getChildren().get(frontleft);
            rect7 = (Rectangle) rotateGroup[3].getChildren().get(top);
            rect8 = (Rectangle) rotateGroup[3].getChildren().get(backleft);
            rect9 = (Rectangle) rotateGroup[4].getChildren().get(frontright);
            rect10 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            rect11 = (Rectangle) rotateGroup[5].getChildren().get(frontleft);
            rect12 = (Rectangle) rotateGroup[5].getChildren().get(backleft);
            rect13 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            rect14 = (Rectangle) rotateGroup[6].getChildren().get(frontright);
            rect15 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            rect16 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            rect17 = (Rectangle) rotateGroup[7].getChildren().get(backleft);
            rect18 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
            rect19 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            rect20 = (Rectangle) rotateGroup[8].getChildren().get(backleft);
    
            tempColor1 = (Color) refRectangle1.getFill();
            tempColor2 = (Color) refRectangle2.getFill();
            tempColor3 = (Color) refRectangle3.getFill();
            tempColor4 = (Color) refRectangle4.getFill();
            tempColor5 = (Color) refRectangle5.getFill();
            tempColor6 = (Color) refRectangle6.getFill();
            tempColor7 = (Color) refRectangle7.getFill();
            tempColor8 = (Color) refRectangle8.getFill();
            tempColor9 = (Color) refRectangle9.getFill();
            tempColor10 = (Color) refRectangle10.getFill();
            tempColor11 = (Color) refRectangle11.getFill();
            tempColor12 = (Color) refRectangle12.getFill();
            tempColor13 = (Color) refRectangle13.getFill();
            tempColor14 = (Color) refRectangle14.getFill();
            tempColor15 = (Color) refRectangle15.getFill();
            tempColor16 = (Color) refRectangle16.getFill();
            tempColor17 = (Color) refRectangle17.getFill();
            tempColor18 = (Color) refRectangle18.getFill();
            tempColor19 = (Color) refRectangle19.getFill();
            tempColor20 = (Color) refRectangle20.getFill();
    
            rect1.setFill(tempColor1);
            rect2.setFill(tempColor2);
            rect3.setFill(tempColor3);
            rect4.setFill(tempColor4);
            rect5.setFill(tempColor5);
            rect6.setFill(tempColor6);
            rect7.setFill(tempColor7);
            rect8.setFill(tempColor8);
            rect9.setFill(tempColor9);
            rect10.setFill(tempColor10);
            rect11.setFill(tempColor11);
            rect12.setFill(tempColor12);
            rect13.setFill(tempColor13);
            rect14.setFill(tempColor14);
            rect15.setFill(tempColor15);
            rect16.setFill(tempColor16);
            rect17.setFill(tempColor17);
            rect18.setFill(tempColor18);
            rect19.setFill(tempColor19);
            rect20.setFill(tempColor20);



            
            
        }
            // index 1 = top (white)
            // index 2 = bottom (yellow)
            // index 3 = backright (green)
            // index 4 = frontleft (blue)
            // index 5 = frontright (orange)
            // index 6 = backleft (red)
        else if (side == Color.YELLOW) {
            rotateGroup[0] = all_cubes[11];
            rotateGroup[1] = all_cubes[24];
            rotateGroup[2] = all_cubes[20];
            rotateGroup[3] = all_cubes[19];
            rotateGroup[4] = all_cubes[15];
            rotateGroup[5] = all_cubes[10];
            rotateGroup[6] = all_cubes[8];
            rotateGroup[7] = all_cubes[3];
            rotateGroup[8] = all_cubes[1];
    
            Rectangle refRectangle1;
            Rectangle refRectangle2;
            Rectangle refRectangle3;
            Rectangle refRectangle4;
            Rectangle refRectangle5;
            Rectangle refRectangle6;
            Rectangle refRectangle7;
            Rectangle refRectangle8;
            Rectangle refRectangle9;
            Rectangle refRectangle10;
            Rectangle refRectangle11;
            Rectangle refRectangle12;
            Rectangle refRectangle13;
            Rectangle refRectangle14;
            Rectangle refRectangle15;
            Rectangle refRectangle16;
            Rectangle refRectangle17;
            Rectangle refRectangle18;
            Rectangle refRectangle19;
            Rectangle refRectangle20;
    
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
    
            Color tempColor1;
            Color tempColor2;
            Color tempColor3;
            Color tempColor4;
            Color tempColor5;
            Color tempColor6;
            Color tempColor7;
            Color tempColor8;
            Color tempColor9;
            Color tempColor10;
            Color tempColor11;
            Color tempColor12;
            Color tempColor13;
            Color tempColor14;
            Color tempColor15;
            Color tempColor16;
            Color tempColor17;
            Color tempColor18;
            Color tempColor19;
            Color tempColor20;
    
            refRectangle1 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            refRectangle2 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            refRectangle3 = (Rectangle) rotateGroup[3].getChildren().get(bottom);
            refRectangle4 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            refRectangle5 = (Rectangle) rotateGroup[5].getChildren().get(bottom);
            refRectangle6 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            refRectangle7 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
            refRectangle8 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
            refRectangle9 = (Rectangle) rotateGroup[2].getChildren().get(frontright);
            refRectangle10 = (Rectangle) rotateGroup[2].getChildren().get(bottom);
            refRectangle11 = (Rectangle) rotateGroup[7].getChildren().get(frontleft);
            refRectangle12 = (Rectangle) rotateGroup[7].getChildren().get(bottom);
            refRectangle13 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            refRectangle14 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            refRectangle15 = (Rectangle) rotateGroup[1].getChildren().get(bottom);
            refRectangle16 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            refRectangle17 = (Rectangle) rotateGroup[4].getChildren().get(bottom);

            refRectangle18 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            refRectangle19 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            refRectangle20 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
    
            rect1 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            rect2 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            rect3 = (Rectangle) rotateGroup[1].getChildren().get(bottom);
            rect4 = (Rectangle) rotateGroup[2].getChildren().get(frontright);
            rect5 = (Rectangle) rotateGroup[2].getChildren().get(bottom);
            rect6 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            rect7 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            rect8 = (Rectangle) rotateGroup[3].getChildren().get(bottom);
            rect9 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            rect10 = (Rectangle) rotateGroup[4].getChildren().get(bottom);
            rect11 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            rect12 = (Rectangle) rotateGroup[5].getChildren().get(bottom);
            rect13 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            rect14 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            rect15 = (Rectangle) rotateGroup[6].getChildren().get(bottom);
            rect16 = (Rectangle) rotateGroup[7].getChildren().get(frontleft);
            rect17 = (Rectangle) rotateGroup[7].getChildren().get(bottom);

            rect18 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
            rect19 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            rect20 = (Rectangle) rotateGroup[8].getChildren().get(bottom);
    
            tempColor1 = (Color) refRectangle1.getFill();
            tempColor2 = (Color) refRectangle2.getFill();
            tempColor3 = (Color) refRectangle3.getFill();
            tempColor4 = (Color) refRectangle4.getFill();
            tempColor5 = (Color) refRectangle5.getFill();
            tempColor6 = (Color) refRectangle6.getFill();
            tempColor7 = (Color) refRectangle7.getFill();
            tempColor8 = (Color) refRectangle8.getFill();
            tempColor9 = (Color) refRectangle9.getFill();
            tempColor10 = (Color) refRectangle10.getFill();
            tempColor11 = (Color) refRectangle11.getFill();
            tempColor12 = (Color) refRectangle12.getFill();
            tempColor13 = (Color) refRectangle13.getFill();
            tempColor14 = (Color) refRectangle14.getFill();
            tempColor15 = (Color) refRectangle15.getFill();
            tempColor16 = (Color) refRectangle16.getFill();
            tempColor17 = (Color) refRectangle17.getFill();
            tempColor18 = (Color) refRectangle18.getFill();
            tempColor19 = (Color) refRectangle19.getFill();
            tempColor20 = (Color) refRectangle20.getFill();
    
            rect1.setFill(tempColor1);
            rect2.setFill(tempColor2);
            rect3.setFill(tempColor3);
            rect4.setFill(tempColor4);
            rect5.setFill(tempColor5);
            rect6.setFill(tempColor6);
            rect7.setFill(tempColor7);
            rect8.setFill(tempColor8);
            rect9.setFill(tempColor9);
            rect10.setFill(tempColor10);
            rect11.setFill(tempColor11);
            rect12.setFill(tempColor12);
            rect13.setFill(tempColor13);
            rect14.setFill(tempColor14);
            rect15.setFill(tempColor15);
            rect16.setFill(tempColor16);
            rect17.setFill(tempColor17);
            rect18.setFill(tempColor18);
            rect19.setFill(tempColor19);
            rect20.setFill(tempColor20);

            
        }
                // index 1 = top (white)
            // index 2 = bottom (yellow)
            // index 3 = backright (green)
            // index 4 = frontleft (blue)
            // index 5 = frontright (orange)
            // index 6 = backleft (red)
        else if (side == Color.WHITE) {
            rotateGroup[0] = all_cubes[14];
            rotateGroup[1] = all_cubes[22];
            rotateGroup[2] = all_cubes[23];
            rotateGroup[3] = all_cubes[25];
            rotateGroup[4] = all_cubes[13];
            rotateGroup[5] = all_cubes[16];
            rotateGroup[6] = all_cubes[4];
            rotateGroup[7] = all_cubes[6];
            rotateGroup[8] = all_cubes[7];
    
            Rectangle refRectangle1;
            Rectangle refRectangle2;
            Rectangle refRectangle3;
            Rectangle refRectangle4;
            Rectangle refRectangle5;
            Rectangle refRectangle6;
            Rectangle refRectangle7;
            Rectangle refRectangle8;
            Rectangle refRectangle9;
            Rectangle refRectangle10;
            Rectangle refRectangle11;
            Rectangle refRectangle12;
            Rectangle refRectangle13;
            Rectangle refRectangle14;
            Rectangle refRectangle15;
            Rectangle refRectangle16;
            Rectangle refRectangle17;
            Rectangle refRectangle18;
            Rectangle refRectangle19;
            Rectangle refRectangle20;
    
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
    
            Color tempColor1;
            Color tempColor2;
            Color tempColor3;
            Color tempColor4;
            Color tempColor5;
            Color tempColor6;
            Color tempColor7;
            Color tempColor8;
            Color tempColor9;
            Color tempColor10;
            Color tempColor11;
            Color tempColor12;
            Color tempColor13;
            Color tempColor14;
            Color tempColor15;
            Color tempColor16;
            Color tempColor17;
            Color tempColor18;
            Color tempColor19;
            Color tempColor20;
    
            refRectangle1 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            refRectangle2 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            refRectangle3 = (Rectangle) rotateGroup[6].getChildren().get(top);
            refRectangle4 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            refRectangle5 = (Rectangle) rotateGroup[4].getChildren().get(top);
            refRectangle6 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            refRectangle7 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            refRectangle8 = (Rectangle) rotateGroup[1].getChildren().get(top);
            refRectangle9 = (Rectangle) rotateGroup[7].getChildren().get(frontleft);
            refRectangle10 = (Rectangle) rotateGroup[7].getChildren().get(top);
            refRectangle11 = (Rectangle) rotateGroup[2].getChildren().get(frontright);
            refRectangle12 = (Rectangle) rotateGroup[2].getChildren().get(top);
            refRectangle13 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
            refRectangle14 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            refRectangle15 = (Rectangle) rotateGroup[8].getChildren().get(top);
            refRectangle16 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            refRectangle17 = (Rectangle) rotateGroup[5].getChildren().get(top);
            refRectangle18 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            refRectangle19 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            refRectangle20 = (Rectangle) rotateGroup[3].getChildren().get(top);
    
            rect1 = (Rectangle) rotateGroup[1].getChildren().get(frontright);
            rect2 = (Rectangle) rotateGroup[1].getChildren().get(backleft);
            rect3 = (Rectangle) rotateGroup[1].getChildren().get(top);
            rect4 = (Rectangle) rotateGroup[2].getChildren().get(frontright);
            rect5 = (Rectangle) rotateGroup[2].getChildren().get(top);
            rect6 = (Rectangle) rotateGroup[3].getChildren().get(frontright);
            rect7 = (Rectangle) rotateGroup[3].getChildren().get(backright);
            rect8 = (Rectangle) rotateGroup[3].getChildren().get(top);
            rect9 = (Rectangle) rotateGroup[4].getChildren().get(backleft);
            rect10 = (Rectangle) rotateGroup[4].getChildren().get(top);
            rect11 = (Rectangle) rotateGroup[5].getChildren().get(backright);
            rect12 = (Rectangle) rotateGroup[5].getChildren().get(top);
            rect13 = (Rectangle) rotateGroup[6].getChildren().get(backleft);
            rect14 = (Rectangle) rotateGroup[6].getChildren().get(frontleft);
            rect15 = (Rectangle) rotateGroup[6].getChildren().get(top);
            rect16 = (Rectangle) rotateGroup[7].getChildren().get(frontleft);
            rect17 = (Rectangle) rotateGroup[7].getChildren().get(top);
            rect18 = (Rectangle) rotateGroup[8].getChildren().get(frontleft);
            rect19 = (Rectangle) rotateGroup[8].getChildren().get(backright);
            rect20 = (Rectangle) rotateGroup[8].getChildren().get(top);
    
            tempColor1 = (Color) refRectangle1.getFill();
            tempColor2 = (Color) refRectangle2.getFill();
            tempColor3 = (Color) refRectangle3.getFill();
            tempColor4 = (Color) refRectangle4.getFill();
            tempColor5 = (Color) refRectangle5.getFill();
            tempColor6 = (Color) refRectangle6.getFill();
            tempColor7 = (Color) refRectangle7.getFill();
            tempColor8 = (Color) refRectangle8.getFill();
            tempColor9 = (Color) refRectangle9.getFill();
            tempColor10 = (Color) refRectangle10.getFill();
            tempColor11 = (Color) refRectangle11.getFill();
            tempColor12 = (Color) refRectangle12.getFill();
            tempColor13 = (Color) refRectangle13.getFill();
            tempColor14 = (Color) refRectangle14.getFill();
            tempColor15 = (Color) refRectangle15.getFill();
            tempColor16 = (Color) refRectangle16.getFill();
            tempColor17 = (Color) refRectangle17.getFill();
            tempColor18 = (Color) refRectangle18.getFill();
            tempColor19 = (Color) refRectangle19.getFill();
            tempColor20 = (Color) refRectangle20.getFill();
    
            rect1.setFill(tempColor1);
            rect2.setFill(tempColor2);
            rect3.setFill(tempColor3);
            rect4.setFill(tempColor4);
            rect5.setFill(tempColor5);
            rect6.setFill(tempColor6);
            rect7.setFill(tempColor7);
            rect8.setFill(tempColor8);
            rect9.setFill(tempColor9);
            rect10.setFill(tempColor10);
            rect11.setFill(tempColor11);
            rect12.setFill(tempColor12);
            rect13.setFill(tempColor13);
            rect14.setFill(tempColor14);
            rect15.setFill(tempColor15);
            rect16.setFill(tempColor16);
            rect17.setFill(tempColor17);
            rect18.setFill(tempColor18);
            rect19.setFill(tempColor19);
            rect20.setFill(tempColor20);

            
        }
    }

}
