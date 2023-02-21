package controller;

import Model.*;

import java.util.Optional;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

import java.util.Optional;

public class ManageProjectController
{
  @FXML private TextField id;

  @FXML private TableView<Project> projectView;
  @FXML private TableColumn<Project, Number> projectId;
  @FXML private TableColumn<Project, String> status;
  @FXML private TableColumn<Project, String> name;

  private Region root;
  private Projects model;
  private viewHandler viewHandler;
  private Projects viewModel;

  public ManageProjectController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, Projects model, Region root)
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
    viewHandler.openView("Add Project");
  }

  @FXML private void Remove()
  {
    try
    {
      Project selectedItem = projectView.getSelectionModel().getSelectedItem();

      boolean remove = confirmation();
      if (remove)
      {
        Project project = new Project(selectedItem.getId(),
            selectedItem.getDeadLine(), selectedItem.getTeamMember(),
            selectedItem.getRequirementList(), null, null, "");
        model.removeProject(project);
        viewModel.removeProject(project);
        projectView.getSelectionModel().clearSelection();
      }
    }
    catch (Exception e)
    {

    }
  }

  @FXML private void edit()
  {
    viewHandler.openView("edit");
  }

  private boolean confirmation()
  {
    int index = projectView.getSelectionModel().getSelectedIndex();
    Project project = projectView.getItems().get(index);
    if (index < 0 || index >= projectView.getItems().size())
    {
      return false;
    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(
        "Removing task {" + projectView.getItems().sorted().getViewIndex(index)
            + "");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK));

  }

  @FXML private void back()
  {
    viewHandler.openView("home");
  }

}



