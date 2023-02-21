package view;

import Model.GUIMODEL;
import controller.AddRequirementController;
import controller.ManageProjectController;
import controller.MemberController;
import controller.manageTaskController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class ViewHandler
{
  private Scene currentScene;
  private Stage primaryStage;
  private GUIMODEL model;
  private ManageProjectController manageProjectController;
  private AddRequirementController addRequirementController;
  private manageTaskController manageTasksController;
  private MemberController memberController;
  private addProjectController addProjectController;

  public ViewHandler(GUIMODEL model)
  {
    this.model = model;
    currentScene = new Scene(new Region());
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("home");
  }

  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "ScrumMaster":
        root = loadGradeListView("Gui.Scrum_Master.fxml");
        break;
      case "projectCreator":
        root = loadAddGradeView("Project_Creator.fxml");
        break;
      case "ProductOwner":
        root = loadDetailsView("view_Search.fxml");
      case "Member":
        root = loadDetailsView("Team_Member.fxml");
        break;
    }
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null)
    {
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  public void closeView()
  {
    primaryStage.close();
  }

  private Region loadGradeListView(String fxmlFile)
  {
    if (GUIMODEL == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        fxmlFile = loader.getController();
       .init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }





}

