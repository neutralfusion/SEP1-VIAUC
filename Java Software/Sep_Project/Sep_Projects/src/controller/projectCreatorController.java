package controller;

import Model.GUIMODEL;
import Model.Projects;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class projectCreatorController
{

  private Region root;
  private Projects model;
  private viewHandler viewHandler;
  @FXML private void backButtonPressed()
  {
    viewHandler.openView("home");
  }
  public Region getRoot()
  {
    return root;
  }
  public projectCreatorController()
  {
    // Called by FXMLLoader
  }

  public void init(viewHandler viewHandler, GUIMODEL Model, Region root)
  {
    this.Model = Model;
    this.viewHandler = viewHandler;
    this.root = root;

  }

  @FXML private void ManageProject()
  {
    viewHandler.openView("Manage Project");
  }
  @FXML private void ManageTask()
  {
    viewHandler.openView("Manage Task");
  }
}
