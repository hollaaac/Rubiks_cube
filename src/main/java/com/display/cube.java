package com.display;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class cube extends App {

    public static Rectangle rect[];

    public static void makeCube() {

        rect = new Rectangle[6];

        rect[0] = new Rectangle(0, 0, 200, 200);
        rect[0].setFill(Color.CORAL);
        rect[0].setTranslateZ(-100);
        rect[0].setRotationAxis(new Point3D(0.0, 0.0, 0.0));
        rect[0].setRotate(0);
        group.getChildren().add(rect[0]);

        rect[1] = new Rectangle(0, 0, 200, 200);
        rect[1].setFill(Color.DARKGREEN);
        rect[1].setTranslateZ(100);
        rect[1].setRotationAxis(new Point3D(0.0, 0.0, 0.0));
        rect[1].setRotate(0);
        group.getChildren().add(rect[1]);

        rect[2] = new Rectangle(100, 0, 200, 200);
        rect[2].setFill(Color.YELLOW);
        rect[2].setTranslateZ(0);
        rect[2].setRotationAxis(new Point3D(0.0, 1.0, 0.0));
        rect[2].setRotate(90);
        group.getChildren().add(rect[2]);

        rect[3] = new Rectangle(-100, 0, 200, 200);
        rect[3].setFill(Color.DARKRED);
        rect[3].setTranslateZ(0);
        rect[3].setRotationAxis(new Point3D(0.0, 1.0, 0.0));
        rect[3].setRotate(90);
        group.getChildren().add(rect[3]);

        rect[4] = new Rectangle(0, 100, 200, 200);
        rect[4].setFill(Color.BLUE);
        rect[4].setTranslateZ(0);
        rect[4].setRotationAxis(new Point3D(1.0, 0.0, 0.0));
        rect[4].setRotate(90);
        group.getChildren().add(rect[4]);

        rect[5] = new Rectangle(0, -100, 200, 200);
        rect[5].setFill(Color.BLUEVIOLET);
        rect[5].setTranslateZ(0);
        rect[5].setRotationAxis(new Point3D(1.0, 0.0, 0.0));
        rect[5].setRotate(90);
        group.getChildren().add(rect[5]);
        
        group.setTranslateX(300);
        group.setTranslateY(300);
        group.setTranslateZ(0);

    }
}
