import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BarChart extends Application
{
    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;
    private static final double LIMITHEIGHT = (HEIGHT / 2);
    private static double[] percent = new double[]{0.2, 0.1, 0.30, 0.4};
    private static String[] title = new String[]
            {
                    "Project -- " + String.format("%d%s", (int)(100 * percent[0]), "%"),
                    "Quizzes -- " + String.format("%d%s", (int)(100 * percent[1]), "%"),
                    "Midterm -- " + String.format("%d%s", (int)(100 * percent[2]), "%"),
                    "Final -- "+ String.format("%d%s", (int)(100 * percent[3]), "%")
            };
    private static Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
    @Override
    public void start(Stage primaryStage)
    {
        Pane mypane = new Pane();
        mypane.setPadding(new Insets(5, 10, 0, 10));
        Rectangle[] mybars = new Rectangle[4];
        for (int inc = 0; inc < mybars.length; inc++)
        {
            mybars[inc] = new Rectangle(5 + (100 * inc),
                    LIMITHEIGHT - (HEIGHT * percent[inc]),
                    WIDTH / mybars.length - 5,
                    HEIGHT * percent[inc]);
            mybars[inc].setFill(colors[inc]);
            Text mytext = new Text(5 + (100 * inc),LIMITHEIGHT - (HEIGHT * percent[inc]) - 5,title[inc]);
            mypane.getChildren().addAll(mytext, mybars[inc]);
        }
        primaryStage.setScene(new Scene(mypane, WIDTH + 20, LIMITHEIGHT));
        primaryStage.setTitle("Bar graph");
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}