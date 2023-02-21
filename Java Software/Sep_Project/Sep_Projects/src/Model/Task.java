package Model;

public class Task
{
  private int id;
  private String name;
  private String description;
  private int estimatedTime;
  private int deadline;
  private TeamMember TeamMember;
  private int totalHours;
  private  Status status;



  public Task(int id, String name, String description, int estimatedTime,
      int deadline, TeamMember TeamMember, int totalHours,  Status status)
  {
    this.id = id;
    this.name = name;
    this.description = description;
    this.estimatedTime = estimatedTime;
    this.deadline = deadline;
    this.TeamMember = TeamMember;
    this.totalHours = totalHours;
    this.status = status;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public int getEstimatedTime()
  {
    return estimatedTime;
  }

  public void setEstimatedTime(int estimatedTime)
  {
    this.estimatedTime = estimatedTime;
  }

  public int getDeadline()
  {
    return deadline;
  }

  public void setDeadline(int deadline)
  {
    this.deadline = deadline;
  }

  public TeamMember getTeamMember()
  {
    return TeamMember;
  }

  public void setTeamMember(TeamMember teamMember)
  {
    TeamMember = teamMember;
  }

  public int getTotalHours()
  {
    return totalHours;
  }

  public void setTotalHours(int totalHours)
  {
    this.totalHours = totalHours;
  }

  public Status getStatus()
  {
    return status;
  }

  public void setStatus(Status status)
  {
    this.status = status;
  }
}
