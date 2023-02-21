package controller;

import Model.*;

import java.util.Optional;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

import java.util.Optional;

public class manageTaskController
{
  @FXML private TextField id;

  @FXML private TableView<Task> tasksView;
  @FXML private TableColumn<Task, Number> taskId;
  @FXML private TableColumn<Task, String> status;
  @FXML private TableColumn<Task, String> name;


  private Region root;
  private Tasks model;
  private viewHandler viewHandler;
  private Tasks viewModel;

  public manageTaskController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, Tasks model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new



  }

  public void reset()
  {

    viewModel.update();
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void add()
  {
    viewHandler.openView("Add Task");
  }

  @FXML private void Remove()
  {
    try
    {
      Task selectedItem = tasksView.getSelectionModel()
          .getSelectedItem();

      boolean remove = confirmation();
      if (remove)
      {
        Task task = new Task(selectedItem.getId(),selectedItem.getName(),
            null, null, -1,null,-1,selectedItem.getStatus());
        model.removeTask(task);
        viewModel.removeTask(task);
        tasksView.getSelectionModel().clearSelection();
      }
    }
    catch (Exception e)
    {

    }
  }

  @FXML private void editButtonPressed()
  {
    viewHandler.openView("edit");
  }

  private boolean confirmation()
  {
    int index = tasksView.getSelectionModel().getSelectedIndex();
    Task task = tasksView.getItems().get(index);
    if (index < 0 || index >= tasksView.getItems().size())
    {
      return false;
    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(
        "Removing task {" + tasksView.getItems().sorted()
            .getViewIndex(index) + "");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK));

  }
  @FXML private void back()
  {
    viewHandler.openView("home");
  }

}


