package controller;

import Model.Task;
import Model.Tasks;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

import java.util.ArrayList;
public class addTaskController
{
  @FXML private TextField id;
  @FXML private TextField name;
  @FXML private TextField status;
  @FXML private TextField deadline;
  private Region root;
  private Tasks model;
  private viewHandler viewHandler;

  public addTaskController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, Tasks model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    reset();
  }

  public void reset()
  {

    this.id.setText("");
    this.name.setText("");
    this.status.setText("");
    this.deadline.setText("");
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void addButtonPressed()
  {

    Task task = new Task(
        Integer.parseInt(id.getText()), name.getText(),""
        status.getText(), -1, -1);
    ArrayList<Task> taskArrayList = new ArrayList<Task>();
    taskArrayList.add(task);

  }

  @FXML private void backButtonPressed()
  {
    viewHandler.openView("home");
  }




}


