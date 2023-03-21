package com.display;
import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Display_App extends Application{
    public static int x;
    public static int y;
    public static int z;
    public boolean shiftDown;
    public int i,j,k;

    @Override
    public void start(Stage primaryStage){

        Block block = new Block(3);

        Group group_center = makeCube_center();
        //Group[] all_cubes = new Group[25];
        // Creating each cube on x = 1 axis
        Group PX_center = makeCube(1, 0, 0);
        Group PX_PY_PZ = makeCube(1, 1, 1);
        Group PX_ZY_PZ = makeCube(1, 0, 1);
        Group PX_PY_ZZ = makeCube(1, 1, 0);
        Group PX_NY_NZ = makeCube(1, -1, -1);
        Group PX_ZY_NZ = makeCube(1, 0, -1);
        Group PX_NY_ZZ = makeCube(1, -1, 0);
        Group PX_NY_PZ = makeCube(1, -1, 1);
        Group PX_PY_NZ = makeCube(1, 1, -1);

        // Create each cube on x = 0 axis ( not including center piece )
        Group ZX_ZY_PZ = makeCube(0, 0, 1);
        Group ZX_PY_PZ = makeCube(0, 1, 1);
        Group ZX_PY_ZZ = makeCube(0, 1, 0);
        Group ZX_ZY_NZ = makeCube(0, 0, -1);
        Group ZX_NY_NZ = makeCube(0, -1, -1);
        Group ZX_NY_ZZ = makeCube(0, -1, 0);
        Group ZX_PY_NZ = makeCube(0, 1, -1);
        Group ZX_NY_PZ = makeCube(0, -1, 1);

        // Create each cube on x = 0 axis ( not including center piece )
        Group NX_center = makeCube(-1,0,0);
        Group NX_ZY_PZ = makeCube(-1, 0, 1);
        Group NX_PY_PZ = makeCube(-1, 1, 1);
        Group NX_PY_ZZ = makeCube(-1, 1, 0);
        Group NX_ZY_NZ = makeCube(-1, 0, -1);
        Group NX_NY_NZ = makeCube(-1, -1, -1);
        Group NX_NY_ZZ = makeCube(-1, -1, 0);
        Group NX_PY_NZ = makeCube(-1, 1, -1);
        Group NX_NY_PZ = makeCube(-1, -1, 1);

        Group[] all_cubes = new Group[26];
        all_cubes[0] = PX_center;
        all_cubes[1] = PX_PY_PZ;
        all_cubes[2] = PX_ZY_PZ;
        all_cubes[3] = PX_PY_ZZ;
        all_cubes[4] = PX_NY_NZ;
        all_cubes[5] = PX_ZY_NZ;
        all_cubes[6] = PX_NY_ZZ;
        all_cubes[7] = PX_NY_PZ;
        all_cubes[8] = PX_PY_NZ;
        all_cubes[9] = ZX_ZY_PZ;
        all_cubes[10] = ZX_PY_PZ;
        all_cubes[11] = ZX_PY_ZZ;
        all_cubes[12] = ZX_ZY_NZ;
        all_cubes[13] = ZX_NY_NZ;
        all_cubes[14] = ZX_NY_ZZ;
        all_cubes[15] = ZX_PY_NZ;
        all_cubes[16] = ZX_NY_PZ;
        all_cubes[17] = NX_center;
        all_cubes[18] = NX_ZY_PZ;
        all_cubes[19] = NX_PY_PZ;
        all_cubes[20] = NX_PY_ZZ;
        all_cubes[21] = NX_ZY_NZ;
        all_cubes[22] = NX_NY_NZ;
        all_cubes[23] = NX_NY_ZZ;
        all_cubes[24] = NX_PY_NZ;
        all_cubes[25] = NX_NY_PZ;

        // Create rubik's cube scene and add the group to it
        Scene scene = new Scene(group_center, 500, 500, true, SceneAntialiasing.BALANCED);
        


        // Create help menu scene
        Button backButton = new Button("Back");
        Label title = new Label("Help Menu");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label info1 = new Label("Rotate Red: R");
        Label info2 = new Label("Rotate Blue: B");
        Label info3 = new Label("Rotate Green: G");
        Label info4 = new Label("Rotate White: W");
        Label info5 = new Label("Rotate Yellow: Y");
        Label info6 = new Label("Rotate Orange: O");
        Label info_main = new Label("Hold shift to reverse rotation insead of always right 90 degrees");
        info1.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info2.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info3.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info4.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info5.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info6.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info_main.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        VBox menuLayout = new VBox();
        menuLayout.getChildren().add(title);
        menuLayout.getChildren().addAll(info1, info2, info3, info4, info5, info6, info_main, backButton);
        Scene menuScene = new Scene(menuLayout, 400, 400);



        // Add all cubes on x = 1 to the scene
        group_center.getChildren().add(PX_center);
        group_center.getChildren().add(PX_PY_PZ);
        group_center.getChildren().add(PX_ZY_PZ);
        group_center.getChildren().add(PX_PY_ZZ);
        group_center.getChildren().add(PX_NY_NZ);
        group_center.getChildren().add(PX_ZY_NZ);
        group_center.getChildren().add(PX_NY_ZZ);
        group_center.getChildren().add(PX_NY_PZ);
        group_center.getChildren().add(PX_PY_NZ);

        // Add all cubes on x = 0 ( not including center piece ) to the scene
        group_center.getChildren().add(ZX_ZY_PZ);
        group_center.getChildren().add(ZX_PY_PZ);
        group_center.getChildren().add(ZX_PY_ZZ);
        group_center.getChildren().add(ZX_ZY_NZ);
        group_center.getChildren().add(ZX_NY_NZ);
        group_center.getChildren().add(ZX_NY_ZZ);
        group_center.getChildren().add(ZX_PY_NZ);
        group_center.getChildren().add(ZX_NY_PZ);

        // Add all cubes on x = 0 ( not including center piece ) to the scene
        group_center.getChildren().add(NX_center);
        group_center.getChildren().add(NX_ZY_PZ);
        group_center.getChildren().add(NX_PY_PZ);
        group_center.getChildren().add(NX_PY_ZZ);
        group_center.getChildren().add(NX_ZY_NZ);
        group_center.getChildren().add(NX_NY_NZ);
        group_center.getChildren().add(NX_NY_ZZ);
        group_center.getChildren().add(NX_PY_NZ);
        group_center.getChildren().add(NX_NY_PZ);

        Camera camera = new PerspectiveCamera(true);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(-550);
        camera.setFarClip(1000);
        scene.setCamera(camera);

        

        // Display the scene on a stage
        Stage stage = new Stage();
        // Create menu key listener and bind to H
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.H) {
                stage.setScene(menuScene);
            };

            if (event.getCode() == KeyCode.R && shiftDown == false) {
                rotateCube(all_cubes, Color.RED, 90);
                block.turnNotModular("F");
                block.printBlock();
            };
            if (event.getCode() == KeyCode.G && shiftDown == false) {
                rotateCube(all_cubes, Color.GREEN, -90);
                block.turnNotModular("L");
                block.printBlock();
            };
            if (event.getCode() == KeyCode.B && shiftDown == false) {
                rotateCube(all_cubes, Color.BLUE, 90);
                block.turnNotModular("R");
                block.printBlock();
            };
            if (event.getCode() == KeyCode.Y && shiftDown == false) {
                rotateCube(all_cubes, Color.YELLOW, 90);
                block.turnNotModular("D");
                block.printBlock();
            };
            if (event.getCode() == KeyCode.W && shiftDown == false) {
                rotateCube(all_cubes, Color.WHITE, -90);
                block.turnNotModular("U'");
                block.printBlock();
            };
            if (event.getCode() == KeyCode.O && shiftDown == false) {
                rotateCube(all_cubes, Color.ORANGE, -90);
                block.turnNotModular("B");
                block.printBlock();
            };


            if (event.getCode() == KeyCode.SHIFT){
                shiftDown = true;
            }
            else if (shiftDown && event.getCode() == KeyCode.R) {
                rotateCube(all_cubes, Color.RED, -90);
                block.turnNotModular("F'");
                block.printBlock();
            }
            else if (shiftDown && event.getCode() == KeyCode.G) {
                rotateCube(all_cubes, Color.GREEN, 90);
                block.turnNotModular("L'");
                block.printBlock();
            }
            else if (shiftDown && event.getCode() == KeyCode.B) {
                rotateCube(all_cubes, Color.BLUE, -90);
                block.turnNotModular("R'");
                block.printBlock();
            }
            else if (shiftDown && event.getCode() == KeyCode.Y) {
                rotateCube(all_cubes, Color.YELLOW, -90);
                block.turnNotModular("D'");
                block.printBlock();
            }
            else if (shiftDown && event.getCode() == KeyCode.W) {
                rotateCube(all_cubes, Color.WHITE, 90);
                block.turnNotModular("U");
                block.printBlock();
            }
            else if (shiftDown && event.getCode() == KeyCode.O) {
                rotateCube(all_cubes, Color.ORANGE, 90);
                block.turnNotModular("B'");
                block.printBlock();
            }
        });
        scene.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.SHIFT) {
                shiftDown = false;
            }
        });
        
        backButton.setOnAction(event -> {
            stage.setScene(scene);
        });
        stage.setScene(scene);
        stage.show();

        
        // rotation method
        //rotateCube(all_cubes, Color.RED);
        //rotateCube(all_cubes, Color.BLUE);
        //rotateCube(all_cubes, Color.ORANGE);
        //rotateCube(all_cubes, Color.GREEN);
        //rotateCube(all_cubes, Color.YELLOW);
        //rotateCube(all_cubes, Color.WHITE);

    }

    public static Group makeCube_center() {
        Box boxCenter = new Box(145, 145, 145);
        // Apply a random color to each face of the cube

        PhongMaterial centerMaterial = new PhongMaterial();
        centerMaterial.setDiffuseColor(Color.rgb(255, 255, 255));
        boxCenter.setMaterial(centerMaterial);


        Group group_center = new Group(boxCenter);

        // Set the pivot point of the group to the center of the cube
        group_center.getTransforms().add(new Translate(0, 0, 0));

        // Add a mouse event handler to rotate the group
        group_center.setOnMouseDragged(event -> {
            double angleX = event.getSceneY() * 0.25;
            double angleY = event.getSceneX() * 0.25;
            group_center.getTransforms().setAll(
                new Rotate(angleX, Rotate.X_AXIS),
                new Rotate(angleY, Rotate.Y_AXIS)
            );
        });

        // Set the initial rotation of the group
        group_center.getTransforms().setAll(
            new Rotate(45, Rotate.X_AXIS),
            new Rotate(45, Rotate.Y_AXIS),
            new Translate(0, 0, 0)
        );

        
        return group_center;

    }

    public static Group makeCube(int i, int j, int k) {
        Box box = new Box(50, 50, 50);
        // Apply a random color to each face of the cube
        if (i == 1){
            x = 51;
        }
        else if (i == 0){
            x = 0;
        }
        else if (i == -1){
            x = -51;
        }
        if (j == 1){
            y = 51;
        }
        else if (j == 0){
            y = 0;
        }
        else if (j == -1){
            y = -51;
        }
        if (k == 1){
            z = 51;
        }
        else if (k == 0){
            z = 0;
        }
        else if (k ==-1){
            z = -51;
        }

        
        PhongMaterial rightMaterial = new PhongMaterial();
        rightMaterial.setDiffuseColor(Color.rgb(255, 255, 255));
        box.setMaterial(rightMaterial);

        Rectangle top = createTop();
        Rectangle bottom = createBottom();
        Rectangle front = createFront();
        Rectangle back = createBack();
        Rectangle left = createLeft();
        Rectangle right = createRight();

        Group group = new Group(box, top, bottom, front, back, left, right);

        // Set the pivot point of the group to the center of the cube
        group.getTransforms().add(new Translate(x, y, z));
        return group;
    }
    
    public static Rectangle createTop() {
        Rectangle top = new Rectangle(50, 50);
        top.setFill(Color.WHITE);
        top.setOpacity(1);
        top.getTransforms().add(new Rotate(90, Rotate.X_AXIS));
        top.getTransforms().add(new Translate(-25,-25,26));
        return top;
    }
    public static Rectangle createBottom() {
        Rectangle bottom = new Rectangle(50, 50);
        bottom.setFill(Color.YELLOW);
        bottom.setOpacity(1);
        bottom.getTransforms().add(new Rotate(90, Rotate.X_AXIS));
        bottom.getTransforms().add(new Translate(-25,-25,-26));
        return bottom;
    }
    public static Rectangle createFront() {
        Rectangle front = new Rectangle(50, 50);
        front.setFill(Color.GREEN);
        front.setOpacity(1);
        front.getTransforms().add(new Translate(-25,-25,26));
        return front;
    }
    public static Rectangle createBack() {
        Rectangle back = new Rectangle(50, 50);
        back.setFill(Color.BLUE);
        back.setOpacity(1);
        back.getTransforms().add(new Translate(-25,-25,-26));
        return back;
    }
    public static Rectangle createLeft() {
        Rectangle left = new Rectangle(50, 50);
        left.setFill(Color.ORANGE);
        left.setOpacity(1);
        left.getTransforms().add(new Rotate(90, Rotate.Y_AXIS));
        left.getTransforms().add(new Translate(-25,-25,26));
        return left;
    }
    public static Rectangle createRight() {
        Rectangle right = new Rectangle(50, 50);
        right.setFill(Color.RED);
        right.setOpacity(1);
        right.getTransforms().add(new Rotate(90, Rotate.Y_AXIS));
        right.getTransforms().add(new Translate(-25,-25,-26));
        return right;
    }
    
    public void rotateCube(Group[] all_cubes, Color side, double direction) {
        // Requires side
        if (side == Color.RED){
            Rotate rotation = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[17].getTransforms().add(rotation);
            Rotate rotation2 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[18].getTransforms().add(rotation2);
            Rotate rotation3 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[19].getTransforms().add(rotation3);
            Rotate rotation4 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[20].getTransforms().add(rotation4);
            Rotate rotation5 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[21].getTransforms().add(rotation5);
            Rotate rotation6 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[22].getTransforms().add(rotation6);
            Rotate rotation7 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[23].getTransforms().add(rotation7);
            Rotate rotation8 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[24].getTransforms().add(rotation8);
            Rotate rotation9 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[25].getTransforms().add(rotation9);

        }
        else if (side == Color.BLUE) {
            Rotate rotation = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[5].getTransforms().add(rotation);
            Rotate rotation2 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[13].getTransforms().add(rotation2);
            Rotate rotation3 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[21].getTransforms().add(rotation3);
            Rotate rotation4 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[15].getTransforms().add(rotation4);
            Rotate rotation5 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[8].getTransforms().add(rotation5);
            Rotate rotation6 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[4].getTransforms().add(rotation6);
            Rotate rotation7 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[12].getTransforms().add(rotation7);
            Rotate rotation8 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[24].getTransforms().add(rotation8);
            Rotate rotation9 = new Rotate(direction, Rotate.Z_AXIS);
            all_cubes[22].getTransforms().add(rotation9);
        }
        else if (side == Color.ORANGE) {
            Rotate rotation = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[0].getTransforms().add(rotation);
            Rotate rotation2 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[1].getTransforms().add(rotation2);
            Rotate rotation3 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[2].getTransforms().add(rotation3);
            Rotate rotation4 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[3].getTransforms().add(rotation4);
            Rotate rotation5 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[4].getTransforms().add(rotation5);
            Rotate rotation6 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[5].getTransforms().add(rotation6);
            Rotate rotation7 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[6].getTransforms().add(rotation7);
            Rotate rotation8 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[7].getTransforms().add(rotation8);
            Rotate rotation9 = new Rotate(direction, Rotate.X_AXIS);
            all_cubes[8].getTransforms().add(rotation9);
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
    

}