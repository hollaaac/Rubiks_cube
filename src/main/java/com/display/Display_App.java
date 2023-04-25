package com.display;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
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
    public int randomize_Int;
    public int newValue;
    public boolean validCube = false;

    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static final int GAP = 10;
    private Rectangle selectedRectangle = null;
    private boolean inputCalled = false;

    

    @Override
    public void start(Stage primaryStage){

        Block block = new Block(3);
        randomize_Int = 25;
        

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
        
        Group inputRoot = new Group();
        GridPane[] gridPanes = new GridPane[6];

        for (int i = 0; i < 6; i++) {
            gridPanes[i] = new GridPane();
            gridPanes[i].setHgap(GAP);
            gridPanes[i].setVgap(GAP);
            gridPanes[i].setPadding(new Insets(20));
            gridPanes[i].setAlignment(Pos.CENTER);
            inputRoot.getChildren().add(gridPanes[i]);
        }

        for (int i = 0; i < 6; i++) {
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    if (i == 0 && row == 1 && col == 1){
                        Rectangle red_center_rect = new Rectangle(50, 50, Color.WHITE);
                        red_center_rect.setStroke(Color.BLACK);
                        gridPanes[i].add(red_center_rect, col, row);
                    } else if (i == 1 && row == 1 && col == 1) {
                        Rectangle red_center_rect = new Rectangle(50, 50, Color.GREEN);
                        red_center_rect.setStroke(Color.BLACK);
                        gridPanes[i].add(red_center_rect, col, row);
                    } else if (i == 2 && row == 1 && col == 1) {
                        Rectangle red_center_rect = new Rectangle(50, 50, Color.RED);
                        red_center_rect.setStroke(Color.BLACK);
                        gridPanes[i].add(red_center_rect, col, row);
                    } else if (i == 3 && row == 1 && col == 1) {
                        Rectangle red_center_rect = new Rectangle(50, 50, Color.BLUE);
                        red_center_rect.setStroke(Color.BLACK);
                        gridPanes[i].add(red_center_rect, col, row);
                    } else if (i == 4 && row == 1 && col == 1) {
                        Rectangle red_center_rect = new Rectangle(50, 50, Color.ORANGE);
                        red_center_rect.setStroke(Color.BLACK);
                        gridPanes[i].add(red_center_rect, col, row);
                    } else if (i == 5 && row == 1 && col == 1) {
                        Rectangle red_center_rect = new Rectangle(50, 50, Color.YELLOW);
                        red_center_rect.setStroke(Color.BLACK);
                        gridPanes[i].add(red_center_rect, col, row);
                    } 
                    else {
                        Rectangle rect = new Rectangle(50, 50, Color.WHITE);
                        rect.setStroke(Color.BLACK);
                        rect.setOnMouseEntered(event -> {
                        selectedRectangle = rect;
                        });
                        rect.setOnMouseExited(event -> {
                        selectedRectangle = null;
                        });

                        gridPanes[i].add(rect, col, row);
                    }
                    
                }
            }
        }
        // position the GridPanes
        gridPanes[0].setLayoutX(50 + ROWS * (50 + GAP));
        gridPanes[0].setLayoutY(50);

        gridPanes[1].setLayoutX(50);
        gridPanes[1].setLayoutY(50 + COLS * (50 + GAP));

        gridPanes[2].setLayoutX(50 + ROWS * (50 + GAP));
        gridPanes[2].setLayoutY(50 + COLS * (50 + GAP));

        gridPanes[3].setLayoutX(50 + 2 * ROWS * (50 + GAP));
        gridPanes[3].setLayoutY(50 + COLS * (50 + GAP));

        gridPanes[4].setLayoutX(50 + 3 * ROWS * (50 + GAP));
        gridPanes[4].setLayoutY(50 + COLS * (50 + GAP));

        gridPanes[5].setLayoutX(50 + ROWS * (50 + GAP));
        gridPanes[5].setLayoutY(50 + 2 * COLS * (50 + GAP));

        Button inputButton = new Button("Input");

        //Scene inputScene = new Scene(inputRoot, 4 * ROWS * (50 + GAP) + 50, 3 * COLS * (50 + GAP) +50);
        inputRoot.getChildren().add(inputButton);
        Scene inputScene = new Scene(inputRoot, 850, 650);
        
        // Create help menu scene
        Button backButton = new Button("Back");
        Button updateRandom = new Button("Update randomizer number");
        Label title = new Label("Help Menu");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Label info1 = new Label("Rotate Red: R");
        Label info2 = new Label("Rotate Blue: B");
        Label info3 = new Label("Rotate Green: G");
        Label info4 = new Label("Rotate White: W");
        Label info5 = new Label("Rotate Yellow: Y");
        Label info6 = new Label("Rotate Orange: O");
        Label info_main = new Label("Hold shift to reverse rotation insead of always right 90 degrees");
        Label randomize_Label = new Label("Randomize cube: A");
        Label randomLabel = new Label("Variable: " + randomize_Int);
        info1.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info2.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info3.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info4.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info5.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info6.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        info_main.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        randomize_Label.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Slider slider = new Slider(0, 100, 0);
        VBox menuLayout = new VBox();
        menuLayout.getChildren().add(title);
        menuLayout.getChildren().addAll(info1, info2, info3, info4, info5, info6, info_main, randomize_Label, slider, randomLabel, updateRandom, backButton);
        Scene menuScene = new Scene(menuLayout, 500, 500);

        

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
        RotateCube rotate = new RotateCube();
        InputCube inputCube = new InputCube();
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.H) {
                stage.setScene(menuScene);
            };
            if (event.getCode() == KeyCode.I) {
                stage.setScene(inputScene);
            }
            if (event.getCode() == KeyCode.S) {
                String Start = block.BlocktoString();
                Block endBlock = new Block(3);
                String End = endBlock.BlocktoString();
                String solution = block.BiDiSearch(Start, End);
                System.out.println(solution);
            }
            if (event.getCode() == KeyCode.A) {
                try {
                    randomizeCube(randomize_Int, block, all_cubes);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                block.printBlock();
            }

            if (event.getCode() == KeyCode.R && shiftDown == false) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.RED, 90);
                    block.turnNotModular("F");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.RED, 90);
                    rotate.rotateCube(all_cubes, Color.RED, 90);
                    rotate.rotateCube(all_cubes, Color.RED, 90);
                    block.turnNotModular("F");
                    block.printBlock();
                }
            };
            if (event.getCode() == KeyCode.G && shiftDown == false) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    block.turnNotModular("L");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    block.turnNotModular("L");
                    block.printBlock();
                }
            };
            if (event.getCode() == KeyCode.B && shiftDown == false) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.BLUE, 90);
                    block.turnNotModular("R");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.BLUE, 90);
                    rotate.rotateCube(all_cubes, Color.BLUE, 90);
                    rotate.rotateCube(all_cubes, Color.BLUE, 90);
                    block.turnNotModular("R");
                    block.printBlock();
                }
            };
            if (event.getCode() == KeyCode.Y && shiftDown == false) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.YELLOW, 90);
                    block.turnNotModular("D");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.YELLOW, 90);
                    rotate.rotateCube(all_cubes, Color.YELLOW, 90);
                    rotate.rotateCube(all_cubes, Color.YELLOW, 90);
                    block.turnNotModular("D");
                    block.printBlock();
                }
            };
            if (event.getCode() == KeyCode.W && shiftDown == false) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.WHITE, -90);
                    rotate.rotateCube(all_cubes, Color.WHITE, -90);
                    rotate.rotateCube(all_cubes, Color.WHITE, -90);
                    block.turnNotModular("U'");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.WHITE, -90);
                    block.turnNotModular("U'");
                    block.printBlock();
                }
            };
            if (event.getCode() == KeyCode.O && shiftDown == false) {
                if (inputCalled == false){
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    block.turnNotModular("B");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    block.turnNotModular("B");
                    block.printBlock();
                }
            };


            if (event.getCode() == KeyCode.SHIFT){
                shiftDown = true;
            }
            else if (shiftDown && event.getCode() == KeyCode.R) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.RED, -90);
                    rotate.rotateCube(all_cubes, Color.RED, -90);
                    rotate.rotateCube(all_cubes, Color.RED, -90);
                    block.turnNotModular("F'");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.RED, -90);
                    block.turnNotModular("F'");
                    block.printBlock();
                }

            }
            else if (shiftDown && event.getCode() == KeyCode.G) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    block.turnNotModular("L'");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.GREEN, -90);
                    block.turnNotModular("L'");
                    block.printBlock();
                }
            }
            else if (shiftDown && event.getCode() == KeyCode.B) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.BLUE, -90);
                    rotate.rotateCube(all_cubes, Color.BLUE, -90);
                    rotate.rotateCube(all_cubes, Color.BLUE, -90);
                    block.turnNotModular("R'");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.BLUE, -90);
                    block.turnNotModular("R'");
                    block.printBlock();
                }
            }
            else if (shiftDown && event.getCode() == KeyCode.Y) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.YELLOW, -90);
                    rotate.rotateCube(all_cubes, Color.YELLOW, -90);
                    rotate.rotateCube(all_cubes, Color.YELLOW, -90);
                    block.turnNotModular("D'");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.YELLOW, -90);
                    block.turnNotModular("D'");
                    block.printBlock();
                }
            }
            else if (shiftDown && event.getCode() == KeyCode.W) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.WHITE, -90);
                    block.turnNotModular("U");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.WHITE, -90);
                    block.turnNotModular("U");
                    block.printBlock();
                }
            }
            else if (shiftDown && event.getCode() == KeyCode.O) {
                if (inputCalled == false) {
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    block.turnNotModular("B'");
                    block.printBlock();
                } else {
                    rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                    block.turnNotModular("B'");
                    block.printBlock();
                }
            }
        });
        scene.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.SHIFT) {
                shiftDown = false;
            }
        });
        updateRandom.setOnAction(e -> {
            randomize_Int = (int) slider.getValue();
        });
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            randomize_Int = newValue.intValue();
        });
        
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            randomLabel.setText("Variable: " + newValue.intValue());
        });
        backButton.setOnAction(event -> {
            stage.setScene(scene);
        });
        inputScene.setOnKeyPressed(event -> {
            if(selectedRectangle != null) {
                if(event.getCode() == KeyCode.R) {
                    selectedRectangle.setFill(Color.RED);
                } else if (event.getCode() == KeyCode.G) {
                    selectedRectangle.setFill(Color.GREEN);
                } else if (event.getCode() == KeyCode.B) {
                    selectedRectangle.setFill(Color.BLUE);
                } else if (event.getCode() == KeyCode.W) {
                    selectedRectangle.setFill(Color.WHITE);
                } else if (event.getCode() == KeyCode.O) {
                    selectedRectangle.setFill(Color.ORANGE);
                } else if (event.getCode() == KeyCode.Y) {
                    selectedRectangle.setFill(Color.YELLOW);
                }
            }
            if(event.getCode() == KeyCode.ESCAPE) {
                stage.setScene(scene);
            }
        });
        inputButton.setOnAction(event -> {
            System.out.println("inputing cube");
            validCube = inputCube.inputCube(all_cubes, gridPanes);
            if (validCube == true) {
                stage.setScene(scene);
                inputCalled = true;
            } else {
                System.out.println("Invalid cube");
            }
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
    // Creating top face of cube
    public static Rectangle createTop() {
        Rectangle top = new Rectangle(50, 50);
        top.setFill(Color.WHITE);
        top.setOpacity(1);
        top.getTransforms().add(new Rotate(90, Rotate.X_AXIS));
        top.getTransforms().add(new Translate(-25,-25,26));
        return top;
    }
    // Creating bottom face of cube
    public static Rectangle createBottom() {
        Rectangle bottom = new Rectangle(50, 50);
        bottom.setFill(Color.YELLOW);
        bottom.setOpacity(1);
        bottom.getTransforms().add(new Rotate(90, Rotate.X_AXIS));
        bottom.getTransforms().add(new Translate(-25,-25,-26));
        return bottom;
    }
    // Creating right face of cube
    public static Rectangle createFront() {
        Rectangle front = new Rectangle(50, 50);
        front.setFill(Color.BLUE);
        front.setOpacity(1);
        front.getTransforms().add(new Translate(-25,-25,26));
        return front;
    }
    // Creating left face of cube
    public static Rectangle createBack() {
        Rectangle back = new Rectangle(50, 50);
        back.setFill(Color.GREEN);
        back.setOpacity(1);
        back.getTransforms().add(new Translate(-25,-25,-26));
        return back;
    }
    // Creating front face of cube
    public static Rectangle createLeft() {
        Rectangle left = new Rectangle(50, 50);
        left.setFill(Color.RED);
        left.setOpacity(1);
        left.getTransforms().add(new Rotate(90, Rotate.Y_AXIS));
        left.getTransforms().add(new Translate(-25,-25,26));
        return left;
    }
    // Creating back face of cube
    public static Rectangle createRight() {
        Rectangle right = new Rectangle(50, 50);
        right.setFill(Color.ORANGE);
        right.setOpacity(1);
        right.getTransforms().add(new Rotate(90, Rotate.Y_AXIS));
        right.getTransforms().add(new Translate(-25,-25,-26));
        return right;
    }

    //Randomizes cube with user input on how many random turns it makes.
    //Will sometimes do two turns that equal out, could be fixed
    void randomizeCube(int turns, Block block, Group[] all_cubes) throws InterruptedException{
        Random rn = new Random();
        RotateCube rotate = new RotateCube();
        int faceTurn;

        for (int i = 0; i < turns; ++i){
            faceTurn = rn.nextInt(11);

            if(faceTurn == 0){
                block.turnNotModular("F");
                rotate.rotateCube(all_cubes, Color.RED, 90);
                System.out.println("Red");
            }

            if(faceTurn == 1){
                block.turnNotModular("F'");
                rotate.rotateCube(all_cubes, Color.RED, -90);
                rotate.rotateCube(all_cubes, Color.RED, -90);
                rotate.rotateCube(all_cubes, Color.RED, -90);
                System.out.println("Red inverse");  
            }

            if(faceTurn == 2) {
                block.turnNotModular("B");
                rotate.rotateCube(all_cubes, Color.ORANGE, -90);
                System.out.println("Orange"); 
            }

            if(faceTurn == 3){
                block.turnNotModular("B'");
                rotate.rotateCube(all_cubes, Color.ORANGE, 90);
                rotate.rotateCube(all_cubes, Color.ORANGE, 90);
                rotate.rotateCube(all_cubes, Color.ORANGE, 90);
                System.out.println("Orange inverse");  
            }

            if(faceTurn == 4){
                block.turnNotModular("R");
                rotate.rotateCube(all_cubes, Color.BLUE, 90);
                System.out.println("Blue");  
            }

            if(faceTurn == 5){
                block.turnNotModular("R'");
                rotate.rotateCube(all_cubes, Color.BLUE, -90);
                rotate.rotateCube(all_cubes, Color.BLUE, -90);
                rotate.rotateCube(all_cubes, Color.BLUE, -90);
                System.out.println("Blue inverse"); 
            }

            if(faceTurn == 6){
                block.turnNotModular("L");
                rotate.rotateCube(all_cubes, Color.GREEN, -90);
                System.out.println("Green"); 
            }

            if(faceTurn == 7){
                block.turnNotModular("L'");
                rotate.rotateCube(all_cubes, Color.GREEN, 90);
                rotate.rotateCube(all_cubes, Color.GREEN, 90);
                rotate.rotateCube(all_cubes, Color.GREEN, 90);
                System.out.println("Green inverse");  
            }
            
            if(faceTurn == 8){
                block.turnNotModular("U");
                rotate.rotateCube(all_cubes, Color.WHITE, -90);

                System.out.println("White inverse");
            }

            if(faceTurn == 9){
                block.turnNotModular("U'");
                rotate.rotateCube(all_cubes, Color.WHITE, 90);
                rotate.rotateCube(all_cubes, Color.WHITE, 90); 
                rotate.rotateCube(all_cubes, Color.WHITE, 90);  
                System.out.println("White");
            }

            if(faceTurn == 10){
                block.turnNotModular("D");
                rotate.rotateCube(all_cubes, Color.YELLOW, 90);
                System.out.println("Yellow"); 
            }

            if(faceTurn == 11){
                block.turnNotModular("D'");
                rotate.rotateCube(all_cubes, Color.YELLOW, -90);
                rotate.rotateCube(all_cubes, Color.YELLOW, -90);
                rotate.rotateCube(all_cubes, Color.YELLOW, -90); 
                System.out.println("Yellow inverse");  
            }
            Thread.sleep(5);
            //block.printBlock();
            //System.out.println();

        }
    }

    
    
    

}