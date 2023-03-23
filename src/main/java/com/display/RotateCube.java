package com.display;

public class RotateCube{

    static rotateCube(Group[] all_cubes, Color side, double direction) {
        Group[] rotateGroup = new Group[9];
        int top = 1;
        int bottom = 2;
        int backright = 3;
        int backleft = 4;
        int frontleft = 5;
        int frontright = 6;

        if (side == Color.RED) {
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
    }

    // index 1 = top (white)
    // index 2 = bottom (yellow)
    // index 3 = backright (green)
    // index 4 = frontleft (blue)
    // index 5 = frontright (orange)
    // index 6 = backleft (red)

    // Requires side
    if (side == Color.RED){
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
    else if (side == Color.BLUE) {
        rotateGroup[0] = all_cubes[22];
        rotateGroup[1] = all_cubes[13];
        rotateGroup[2] = all_cubes[4];
        rotateGroup[3] = all_cubes[21];
        rotateGroup[4] = all_cubes[12];
        rotateGroup[5] = all_cubes[5];
        rotateGroup[6] = all_cubes[24];
        rotateGroup[7] = all_cubes[15];
        rotateGroup[8] = all_cubes[8];

        for (i=0; i<rotateGroup.length; i++){
            Rectangle rect1 = (Rectangle) rotateGroup[i].getChildren().get(1);
            Rectangle rect2 = (Rectangle) rotateGroup[i].getChildren().get(2);
            Rectangle rect3 = (Rectangle) rotateGroup[i].getChildren().get(5);
            Rectangle rect4 = (Rectangle) rotateGroup[i].getChildren().get(6);

            Color tempColor1 = (Color) rect1.getFill();
            Color tempColor2 = (Color) rect2.getFill();
            Color tempColor3 = (Color) rect3.getFill();
            Color tempColor4 = (Color) rect4.getFill();

            rect1.setFill(tempColor4);
            rect2.setFill(tempColor3);
            rect3.setFill(tempColor1);
            rect4.setFill(tempColor2);
        }


        
    }
    else if (side == Color.ORANGE) {
        rotateGroup[0] = all_cubes[0];
        rotateGroup[1] = all_cubes[1];
        rotateGroup[2] = all_cubes[2];
        rotateGroup[3] = all_cubes[3];
        rotateGroup[4] = all_cubes[4];
        rotateGroup[5] = all_cubes[5];
        rotateGroup[6] = all_cubes[6];
        rotateGroup[7] = all_cubes[7];
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

        refRectangle1 = (Rectangle) rotateGroup[7].getChildren().get(1);
        refRectangle2 = (Rectangle) rotateGroup[7].getChildren().get(3);
        refRectangle3 = (Rectangle) rotateGroup[7].getChildren().get(5);
        refRectangle4 = (Rectangle) rotateGroup[6].getChildren().get(1);
        refRectangle5 = (Rectangle) rotateGroup[6].getChildren().get(5);
        refRectangle6 = (Rectangle) rotateGroup[2].getChildren().get(3);
        refRectangle7 = (Rectangle) rotateGroup[2].getChildren().get(5);
        refRectangle8 = (Rectangle) rotateGroup[8].getChildren().get(5);
        refRectangle9 = (Rectangle) rotateGroup[8].getChildren().get(4);
        refRectangle10 = (Rectangle) rotateGroup[8].getChildren().get(2);
        refRectangle11 = (Rectangle) rotateGroup[3].getChildren().get(5);
        refRectangle12 = (Rectangle) rotateGroup[3].getChildren().get(2);
        refRectangle13 = (Rectangle) rotateGroup[5].getChildren().get(5);
        refRectangle14 = (Rectangle) rotateGroup[5].getChildren().get(4);
        refRectangle15 = (Rectangle) rotateGroup[4].getChildren().get(5);
        refRectangle16 = (Rectangle) rotateGroup[4].getChildren().get(4);
        refRectangle17 = (Rectangle) rotateGroup[4].getChildren().get(1);
        refRectangle18 = (Rectangle) rotateGroup[1].getChildren().get(5);
        refRectangle19 = (Rectangle) rotateGroup[1].getChildren().get(3);
        refRectangle20 = (Rectangle) rotateGroup[1].getChildren().get(2);

        rect1 = (Rectangle) rotateGroup[1].getChildren().get(3);
        rect2 = (Rectangle) rotateGroup[1].getChildren().get(2);
        rect3 = (Rectangle) rotateGroup[1].getChildren().get(5);
        rect4 = (Rectangle) rotateGroup[2].getChildren().get(3);
        rect5 = (Rectangle) rotateGroup[2].getChildren().get(5);
        rect6 = (Rectangle) rotateGroup[3].getChildren().get(2);
        rect7 = (Rectangle) rotateGroup[3].getChildren().get(5);
        rect8 = (Rectangle) rotateGroup[4].getChildren().get(5);
        rect9 = (Rectangle) rotateGroup[4].getChildren().get(1);
        rect10 = (Rectangle) rotateGroup[4].getChildren().get(4);
        rect11 = (Rectangle) rotateGroup[5].getChildren().get(5);
        rect12 = (Rectangle) rotateGroup[5].getChildren().get(4);
        rect13 = (Rectangle) rotateGroup[6].getChildren().get(5);
        rect14 = (Rectangle) rotateGroup[6].getChildren().get(1);
        rect15 = (Rectangle) rotateGroup[7].getChildren().get(5);
        rect16 = (Rectangle) rotateGroup[7].getChildren().get(1);
        rect17 = (Rectangle) rotateGroup[7].getChildren().get(3);
        rect18 = (Rectangle) rotateGroup[8].getChildren().get(5);
        rect19 = (Rectangle) rotateGroup[8].getChildren().get(2);
        rect20 = (Rectangle) rotateGroup[8].getChildren().get(4);

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
    else if (side == Color.GREEN) {
        Rotate rotation = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[1].getTransforms().add(rotation);
        Rotate rotation2 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[2].getTransforms().add(rotation2);
        Rotate rotation3 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[7].getTransforms().add(rotation3);
        Rotate rotation4 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[16].getTransforms().add(rotation4);
        Rotate rotation5 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[9].getTransforms().add(rotation5);
        Rotate rotation6 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[10].getTransforms().add(rotation6);
        Rotate rotation7 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[25].getTransforms().add(rotation7);
        Rotate rotation8 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[18].getTransforms().add(rotation8);
        Rotate rotation9 = new Rotate(direction, Rotate.Z_AXIS);
        all_cubes[19].getTransforms().add(rotation9);
    }
    else if (side == Color.YELLOW) {
        Rotate rotation = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[1].getTransforms().add(rotation);
        Rotate rotation2 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[3].getTransforms().add(rotation2);
        Rotate rotation3 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[8].getTransforms().add(rotation3);
        Rotate rotation4 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[15].getTransforms().add(rotation4);
        Rotate rotation5 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[24].getTransforms().add(rotation5);
        Rotate rotation6 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[11].getTransforms().add(rotation6);
        Rotate rotation7 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[10].getTransforms().add(rotation7);
        Rotate rotation8 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[20].getTransforms().add(rotation8);
        Rotate rotation9 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[19].getTransforms().add(rotation9);
    }
    else if (side == Color.WHITE) {
        Rotate rotation = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[14].getTransforms().add(rotation);
        Rotate rotation2 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[16].getTransforms().add(rotation2);
        Rotate rotation3 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[13].getTransforms().add(rotation3);
        Rotate rotation4 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[6].getTransforms().add(rotation4);
        Rotate rotation5 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[7].getTransforms().add(rotation5);
        Rotate rotation6 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[4].getTransforms().add(rotation6);
        Rotate rotation7 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[22].getTransforms().add(rotation7);
        Rotate rotation8 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[23].getTransforms().add(rotation8);
        Rotate rotation9 = new Rotate(direction, Rotate.Y_AXIS);
        all_cubes[25].getTransforms().add(rotation9);
        }

}
