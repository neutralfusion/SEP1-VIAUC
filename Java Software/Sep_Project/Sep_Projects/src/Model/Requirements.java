package Model;

import javafx.scene.control.TableColumn;

import java.util.ArrayList;

public class Requirements
{
  private Requirement requirement;
  private ArrayList<Requirement> RequirementList;
  public Requirements(Requirement requirement,ArrayList<Requirement> RequirementList){
    this.requirement=requirement;
    RequirementList = new ArrayList<Requirement>[];
  }
public void addRequirement(Requirement requirement){
  RequirementList.add(requirement);
}
public void removeRequirement(Requirement requirement){
  RequirementList.remove(requirement);
}
public Object getRequirement(int i){
 return RequirementList.get(i);
}
public Requirement getAllRequirements(TableColumn<Requirement, Number> i ){
  for(i = 0 ; i < RequirementList.size(); i++){
    System.out.println("Model.Requirement "+ i + "is :");
    return RequirementList.get(i);
  }
  return null;
}
}