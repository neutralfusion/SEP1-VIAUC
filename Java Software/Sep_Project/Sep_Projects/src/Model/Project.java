package Model;

public class Project
{
  private int id;
  private int deadLine;
  private TeamMember TeamMember;
  private Requirements RequirementList;
  private Date Date;
  private Tasks TaskList;
  private String Description;

  public Project(int deadline, int id, TeamMember TeamMember,
      Requirements RequirementList, Date Date, Tasks TaskList,String Description)
  {
this.deadLine = deadline;
this.id = id;
this.TeamMember = TeamMember;
this.RequirementList = RequirementList;
this.Date = Date;
this.TaskList = TaskList;
this.Description = Description;
  }

  public String getDescription()
  {
    return Description;
  }

  public void setDescription(String description)
  {
    Description = description;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getDeadLine()
  {
    return deadLine;
  }

  public void setDeadLine(int deadLine)
  {
    this.deadLine = deadLine;
  }

  public TeamMember getTeamMember()
  {
    return TeamMember;
  }

  public void setTeamMember(TeamMember teamMember)
  {
    TeamMember = teamMember;
  }

  public Requirements getRequirementList()
  {
    return RequirementList;
  }

  public void setRequirementList(Requirements requirementList)
  {
    RequirementList = requirementList;
  }

  public Date getDate()
  {
    return Date;
  }

  public void setDate(Date date)
  {
    Date = date;
  }

  public Tasks getTaskList()
  {
    return TaskList;
  }

  public void setTaskList(Tasks taskList)
  {
    TaskList = taskList;
  }
  Projects projects = new Projects();

   public String toString()
  {
    return "Model.Project{}";
  }
}
