package controller;

import Model.*;

import java.util.Optional;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

import java.util.Optional;

public class manageRequirementsController
{
  @FXML private TextField RequirementId;

  @FXML private TableView<Requirement> viewRequirements;
  @FXML private TableColumn<Requirement, Number> id;
  @FXML private TableColumn<Requirement, String> status;
  @FXML private TableColumn<Requirement, String> project;
  @FXML private TableColumn<Requirement, Number> deadline;

  private Region root;
  private Requirements model;
  private viewHandler viewHandler;
  private Requirements viewModel;

  public manageRequirementsController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, Requirements model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new


        id.setCellValueFactory(
        cellData -> cellData.getValue().getid());
    Status status1=new Status();
    status.setCellValueFactory(
        cellData -> cellData.getValue().get());

    gradeListTable.setItems(viewModel.getList());

  }

  public void reset()
  {

    viewModel.update();
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void addButtonPressed()
  {
    viewHandler.openView("add Requirements");
  }

  @FXML private void RemoveButtonPressed()
  {
    try
    {
      Requirement selectedItem = viewRequirements.getSelectionModel()
          .getSelectedItem();

      boolean remove = confirmation();
      if (remove)
      {
        Requirement requirement = new Requirement(selectedItem.getId(), null,
            null, null, selectedItem.getDeadLine());
        model.removeRequirement(requirement);
        viewModel.removeRequirement(requirement);
        viewRequirements.getSelectionModel().clearSelection();
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
    int index = viewRequirements.getSelectionModel().getSelectedIndex();
    Requirement requirement = viewRequirements.getItems().get(index);
    if (index < 0 || index >= viewRequirements.getItems().size())
    {
      return false;
    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(
        "Removing Requirement {" + viewRequirements.getItems().sorted()
            .getViewIndex(index) + "");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK));

  }

}

