import javafx.application.Application;
import javafx.stage.Stage;

public class MyApplication extends Application
{
  @Override public void start(Stage primaryStage)
  {
    viewHandler view=new viewHandler();
    view.start(primaryStage);
  }
}