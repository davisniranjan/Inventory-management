import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;
 
public class Main extends Application 
{ 
  @Override
  public void start(Stage primaryStage) {
    
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    pane.add(new Label("ITEM NAME : "),0,0);
    pane.add(new TextField(),1,0);
    pane.add(new Label("ITEM CATEGORY : "),0,2);
    pane.add(new TextField(),1,2);
    pane.add(new Label("WORKER ID : "),0,4);
    pane.add(new TextField(),1,4);
    pane.add(new Label("CREATE ITEM ID : "),0,6);
    pane.add(new TextField(),1,6);
    Button btAdd = new Button("REGISTER");
    pane.add(btAdd,0,8);
    Button btnAdd = new Button("LOGIN");
    pane.add(btnAdd,1,8);
    GridPane.setHalignment(btAdd,HPos.RIGHT);
    Scene scene=new Scene(pane);
    primaryStage.setTitle("INVENTORY MANAGEMENT SYSTEM");
    primaryStage.setScene(scene);
    primaryStage.show();
  }  
  public static void main(String[] args) {
    launch(args);
  }
} 
