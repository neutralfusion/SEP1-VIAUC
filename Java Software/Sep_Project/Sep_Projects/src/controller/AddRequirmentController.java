package controller;

import Model.Requirement;
import Model.Requirements;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

import java.util.ArrayList;

public class AddRequirementController
{
  @FXML private TextField RequirementId;
  @FXML private TextField RequirementName;
  @FXML private TextField story;
  @FXML private TextField RequirementStatus;
  private Region root;
  private Requirements model;
  private viewHandler viewHandler;

  public AddRequirementController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, model Requirements, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    reset();
  }

  public void reset()
  {

    this.RequirementId.setText("");
    this.RequirementName.setText("");
    this.story.setText("");

  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void addRequirementPressed()
  {

    Requirement requirement = new Requirement(
        Integer.parseInt(RequirementId.getText()), RequirementName.getText(),
        story.getText(), -1, -1);
    ArrayList<Requirement> requirementsArrayList = new ArrayList<Requirement>();
    requirementsArrayList.add(requirement);

  }

  @FXML private void backButtonPressed()
  {
    viewHandler.openView("home");
  }

}


}
