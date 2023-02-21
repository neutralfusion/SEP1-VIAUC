package Model;

public class Requirement
{
  private int id;
  private String name;
  private String story;
  private int estimatedTime;
  private int deadLine;



  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Requirement(int id, String name,String story, int estimatedTime, int deadLine
    )
  {
this.id = id;
this.name=name;
this.story = story;
this.estimatedTime= estimatedTime;
this.deadLine = deadLine;


  }



  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getStory()
  {
    return story;
  }

  public void setStory(String story)
  {
    this.story = story;
  }

  public int getEstimatedTime()
  {
    return estimatedTime;
  }

  public void setEstimatedTime(int estimatedTime)
  {
    this.estimatedTime = estimatedTime;
  }

  public int getDeadLine()
  {
    return deadLine;
  }

  public void setDeadLine(int deadLine)
  {
    this.deadLine = deadLine;
  }



  @Override public String toString()
  {
    return "Model.Requirement{}";
  }
}

