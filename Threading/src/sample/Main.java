package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application {
    private String text = "";

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane pane = new StackPane();
        Label lblText = new Label("Programming is fun");
        pane.getChildren().add(lblText);

        new Thread(() -> {
            try{
                while (true){
                    if (lblText.getText().trim().length() == 0)
                        text = "Welcome";
                    else
                        text = "";

                    Platform.runLater(() -> lblText.setText(text));
                    Thread.sleep(1500);
                }
            }
            catch (InterruptedException ex){

            }
        }).start();

        Scene scene = new Scene(pane, 200,50);
        primaryStage.setTitle("FalshText");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
