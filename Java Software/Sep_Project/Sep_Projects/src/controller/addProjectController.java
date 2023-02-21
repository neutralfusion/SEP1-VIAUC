package controller;

import Model.Project;
import Model.Projects;
import Model.TeamMember;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

import java.util.ArrayList;

public class addProjectController
{
  @FXML private TextField ProjectId;
  @FXML private TextField name;
  @FXML private TextField status;
  @FXML private TextField deadline;
  private Region root;
  private Projects model;
  private viewHandler viewHandler;

  public addProjectController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, model Projects, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    reset();
  }

  public void reset()
  {

    this.ProjectId.setText("");
    this.name.setText("");
    this.status.setText("");
    this.deadline.setText("");
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void add()
  {

    Project project = new Project(
        Integer.parseInt(deadline.getText()),Integer.parseInt(ProjectId.getText()),null,null,null ,null,"");
    ArrayList<Project> projectArrayList = new ArrayList<Project>();
    projectArrayList.add(project);

  }

  @FXML private void backButtonPressed()
  {
    viewHandler.openView("home");
  }

}


}

