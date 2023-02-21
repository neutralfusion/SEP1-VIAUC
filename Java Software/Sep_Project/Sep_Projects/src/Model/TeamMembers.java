package Model;

import java.util.ArrayList;

public class TeamMembers
{
  private ArrayList<TeamMember> TeamMemberList;

  public TeamMembers(){
    TeamMemberList = new ArrayList<TeamMember>();
  }
  public void addTeamMember(TeamMember TeamMember){
    TeamMemberList.add(TeamMember);
  }
  public void removeTeamMember(TeamMember TeamMember){
    TeamMemberList.remove(TeamMember);
  }
  public TeamMember getTeamMember(int i){
    return TeamMemberList.get(i);
  }
  public TeamMember getAllTeamMembers(int i){
    for(i = 0; i<TeamMemberList.size(); i++){
      System.out.println("Model.TeamMember " + i + " is :");
      return TeamMemberList.get(i);
    }
    return null;
  }
}
