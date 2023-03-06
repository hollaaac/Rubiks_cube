package com.display;
import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class App extends Application {
    public static int x;
    public static int y;
    public static int z;
    public int i,j,k;
    @Override
    public void start(Stage primaryStage) throws Exception {
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

        Group all_cubes = new Group();
        all_cubes.getChildren().addAll(PX_center, PX_PY_PZ, PX_ZY_PZ,
                                       PX_PY_ZZ, PX_NY_NZ, PX_ZY_NZ,
                                       PX_NY_ZZ, PX_NY_PZ, PX_PY_NZ,
                                       ZX_ZY_PZ, ZX_PY_PZ, ZX_PY_ZZ, 
                                       ZX_ZY_NZ, ZX_NY_NZ, ZX_NY_ZZ,
                                       ZX_PY_NZ, ZX_NY_PZ, NX_center, 
                                       NX_ZY_PZ, NX_PY_PZ, NX_PY_ZZ, 
                                       NX_ZY_NZ, NX_NY_NZ, NX_NY_ZZ, 
                                       NX_PY_NZ, NX_NY_PZ);

        // Create a scene and add the group to it
        Scene scene = new Scene(group_center, 500, 500, true, SceneAntialiasing.BALANCED);
        
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
        camera.setTranslateZ(-350);
        camera.setFarClip(1000);
        scene.setCamera(camera);

        // Display the scene on a stage
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        // rotation method
        // rotateCube(PX_center, Color.RED);

    }
    public static void main(String[] args) {
        launch(args);
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
                new Rotate(angleY, Rotate.Y_AXIS),
                new Translate(0, 0, 0)
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
    public void rotateCube(Group PX_center, Color side) {
        // Requires side
        if (side == Color.RED){
            System.out.println(PX_center.getTranslateX());
        }
    }
    

}