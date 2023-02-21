package Model;

import java.util.ArrayList;

public class Projects
{
  private ArrayList<Project> ProjectList;

  public Projects(){
    ProjectList = new ArrayList<Project>();
  }

  public void addProject(Project Project){
    ProjectList.add(Project);
  }
  public void removeProject(Project Project)
  {
    ProjectList.remove(Project);
  }
  public Project getProject(int i){
    return ProjectList.get(i);
  }
  public Project getAllProjects(int i){
    for(i = 0; i<ProjectList.size(); i++){
      System.out.println("Model.Project nr " + i + ":");
      return ProjectList.get(i);
    }

    return null;
  }

  public String toString()
  {
    return "Model.Projects{" + "ProjectList=" + ProjectList + '}';
  }
}
