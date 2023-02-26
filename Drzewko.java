package aplikacja;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE); // szerokość, wysokość
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Drzewko");
        text.setX(200);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.GREEN);

//        Line line = new Line();
//        line.setStartX(200);
//        line.setStartY(200);
//        line.setEndX(500);
//        line.setEndY(200);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.RED);
//        line.setOpacity(0.1);
//        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(350);
        rectangle.setWidth(90);
        rectangle.setHeight(200);
        rectangle.setFill(Color.BURLYWOOD);

        Circle circle = new Circle();
        circle.setCenterX(90);
        circle.setCenterY(340);
        circle.setRadius(70);
        circle.setFill(Color.LIME);

        Circle circle1 = new Circle();
        circle1.setCenterY(340);
        circle1.setCenterX(200);
        circle1.setRadius(70);
        circle1.setFill(Color.LIME);

        Circle circle2 = new Circle();
        circle2.setCenterX(150);
        circle2.setCenterY(260);
        circle2.setRadius(70);
        circle2.setFill(Color.LIME);

//        Rectangle rectangle1 = new Rectangle();
//        rectangle1.setX(400);
//        rectangle1.setY(100);
//        rectangle1.setHeight(50);
//        rectangle1.setWidth(50);
//        rectangle1.setFill(Color.CYAN);
//        rectangle1.setStrokeWidth(3);
//        rectangle1.setStroke(Color.RED);
//
//        Polygon triangle = new Polygon();
//        triangle.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
//        triangle.setFill(Color.YELLOW);

//        Circle circle = new Circle();
//        circle.setCenterX(350);
//        circle.setCenterY(350);
//        circle.setRadius(50);
//        circle.setFill(Color.ORANGE);

        Image image = new Image("pobrane.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(120);
        imageView.setY(290);
        imageView.setFitWidth(60);
        imageView.setFitHeight(60);
        imageView.setOpacity(0.3);


        root.getChildren().add(text);
//        root.getChildren().add(line);
        root.getChildren().add(rectangle);
//        root.getChildren().add(rectangle1);
//        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(circle1);
        root.getChildren().add(circle2);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }
}
