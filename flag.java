

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class flag extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        Image img = new Image("image/china.gif");
        Image img1 = new Image("image/fr.png");
        Image img2 = new Image("image/us.gif");
        Image img3 = new Image("image/gm.png");
        ImageView imgView1 = new ImageView(img);
        ImageView imgView2 = new ImageView(img1);
        ImageView imgView3 = new ImageView(img2);
        ImageView imgView4 = new ImageView(img3);

        pane.add(imgView1, 1, 0);
        pane.add(imgView2, 0, 1);
        pane.add(imgView3, 1, 1);
        pane.add(imgView4, 0, 0);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Flag");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}