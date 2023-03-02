package com.display;

import java.time.Duration;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application {

    public static final String PROGRAM_TITLE = "Mooie Kubus Experiment";

    public static Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
    public static double monitorWidth = (primaryScreenBounds.getWidth());
    public static double monitorHeight = (primaryScreenBounds.getHeight());
    public static double sceneWidth = (monitorWidth / 1.5);
    public static double sceneHeight = (monitorHeight / 1.5);
    public static boolean isFullScreen = false;
    public static boolean isConsoleSpamOn = false;

    public static Group group;
    public static Scene scene;
    public static Stage window;

    public static int fps = 60;
    public static int frame = 0;

    public static Camera camera;

    public double mouseX, mouseY, mouseOldX, mouseOldY;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        group = new Group();
        scene = new Scene(group, sceneWidth, sceneHeight, true);
        window = primaryStage;
        window.setScene(scene);
        window.setTitle(PROGRAM_TITLE);
        window.show();

        cube.makeCube();

        cameraStuff();

        scene.setOnMousePressed(event -> {
            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
            mouseOldX = event.getSceneX();
            mouseOldY = event.getSceneY();
        });
        scene.setOnMouseDragged(event -> {
            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
            double rotateX = (mouseX - mouseOldX) * 0.2;
            double rotateY = (mouseY - mouseOldY) * 0.2;
        });
    }

    public static void cameraStuff() {
        camera = new PerspectiveCamera();
        scene.setCamera(camera);
        
    }
}