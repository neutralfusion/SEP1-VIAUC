package controller;

import Model.*;

import java.util.Optional;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

import java.util.Optional;

public class MemberController
{
  @FXML private TextField id;

  @FXML private TableView<TeamMember> MemberView;
  @FXML private TableColumn<TeamMember, Number> Id;
  @FXML private TableColumn<TeamMember, String> MemberName;
  @FXML private TableColumn<TeamMember, String> MemberEmail;
  @FXML private TableColumn<TeamMember, String> MemberStatus;
  @FXML private TableColumn<TeamMember, String> Req;
  private Region root;
  private TeamMembers model;
  private viewHandler viewHandler;
  private TeamMembers viewModel;

  public MemberController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, TeamMembers model, Region root)
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
    viewHandler.openView("Add Team Member");
  }

  @FXML private void Remove()
  {
    try
    {
      TeamMember selectedItem = MemberView.getSelectionModel()
          .getSelectedItem();

      boolean remove = confirmation();
      if (remove)
      {
        TeamMember teamMember = new TeamMember(selectedItem.getId(),selectedItem.getName(),
            null, null);
        model.removeTeamMember(teamMember);
        viewModel.removeTeamMember(teamMember);
        MemberView.getSelectionModel().clearSelection();
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
    int index = MemberView.getSelectionModel().getSelectedIndex();
    TeamMember teamMember = MemberView.getItems().get(index);
    if (index < 0 || index >= MemberView.getItems().size())
    {
      return false;
    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(
        "Removing task {" + MemberView.getItems().sorted()
            .getViewIndex(index) + "");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK));

  }
  @FXML private void back()
  {
    viewHandler.openView("home");
  }

}


