package sample.ideaprojects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn1 = new Button("Boton1");
        Button btn2 = new Button("Boton2");
        Button btn3 = new Button("Boton3");

        Button btn4 = new Button("Boton4");
        Button btn5 = new Button("Boton5");
        Button btn6 = new Button("Boton6");

        //Caracteristicas flow pane Horizontal
        FlowPane fluidoH = new FlowPane();
        fluidoH.getChildren().addAll(new Button("Boton 7"), new Button("Boton 8"), new Button("Boton 9"));


        //Caracteristicas flow pane Vertical
        FlowPane fluidoV = new FlowPane(Orientation.VERTICAL);
        fluidoV.getChildren().addAll(new Button("Boton 10"), new Button("Boton 11"), new Button("Boton 12"));


        //Caracterusticas de la border Pane
        BorderPane borde = new BorderPane();
        Label stiketa = new Label("Esta es una etiqueta");
        borde.setTop(stiketa);


        //Caracteristicas de la caja horizontal
        HBox HorizontalB = new HBox();
        HorizontalB.getChildren().addAll(btn1,btn2,btn3, borde);
        HorizontalB.setSpacing(10);
        HorizontalB.setPadding(new Insets(20));


        //Caracteristicas de la caja vertical
        VBox VerticalB = new VBox();
        VerticalB.getChildren().addAll(btn4,btn5,btn6, borde);
        VerticalB.setSpacing(10);
        VerticalB.setPadding(new Insets(20));

        //Caracteristicas GridPane
        GridPane Matriz = new GridPane();
        Matriz.add(new Button("Posicion 0,0"),0,0);
        Matriz.add(new Button("Posicion 1,0"),1,0);
        Matriz.add(new Button("Posicion 0,1"),0,1);
        Matriz.add(new Button("Posicion 0,2"),1,3);
        Matriz.add(new Button("Columna 2 Fila 2"),2,2);

        //Caracteristicas AnchorPane
        AnchorPane anchor = new AnchorPane();
        Button btn13 = new Button("Boton 1");
        Button btn14 = new Button("Boton 2");

        AnchorPane.setTopAnchor(btn13,15.0);
        AnchorPane.setRightAnchor(btn13,15.0);
        AnchorPane.setBottomAnchor(btn14,30.0);
        AnchorPane.setLeftAnchor(btn14,100.0);
        anchor.getChildren().addAll(btn13,btn14,new Button("Boton 3"));

        //Caracteristicas StackPane
        StackPane span = new StackPane();
        Button b1 = new Button("Boton 1");
        Button b2 = new Button("Boton 2");
        Button b3 = new Button("Boton 3");

        StackPane.setAlignment(b1, Pos.CENTER);
        StackPane.setAlignment(b2, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(b3, Pos.TOP_RIGHT);
        span.getChildren().addAll(b1, b2, b3);

        //Caracteristicas TalePane Horizontal
        TilePane tileH = new TilePane();
        tileH.setPrefColumns(6);
        tileH.setPrefRows(4);
        for(int i = 0; i < 20; i++) {
            tileH.getChildren().add(new Button("Boton "+ i));
        }

        //Caracteristicas TilePane Vertical
        TilePane tileV = new TilePane(Orientation.VERTICAL);
        tileV.setPrefColumns(6);
        tileV.setPrefRows(4);
        for(int i = 0; i < 20; i++) {
            tileV.getChildren().add(new Button("Boton "+ i));
        }


       // Scene sceneH = new Scene(HorizontalB, 400,70); //Tamaño de la ventana horizontal
       // Scene sceneV = new Scene(VerticalB,70,400); //Tamaño de la ventana vertical
       // Scene sceneFH = new Scene(fluidoH,400,70); //Tamaño de la ventana flowpane horizontal
       // Scene sceneFV = new Scene(fluidoV,70,400); //Tamaño de la ventana flowpane vertical
        //Scene sceneG = new Scene(Matriz, 400,400); // Tamaño de la ventana panel GridPane
       // Scene sceneAnc = new Scene(anchor,400,300); //Tamaño de la ventana de AnchorPane
       // Scene sceneSP = new Scene(span,600,600); //Tamaño de la ventana StackPane
        //Scene sceneTH = new Scene(span,600,600); //Tamaño de la ventana TilePane Horizontal
        Scene sceneTV = new Scene(span,600,600); //Tamaño de la ventana TilePane Vertical

        stage.setTitle("Topicos avanzados de programacion");//titulo de la ventana
        stage.setScene(sceneTV);//Se cambiara la escena para mostar el panel
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}