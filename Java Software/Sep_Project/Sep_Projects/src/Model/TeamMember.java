package Model;

public class TeamMember
{
  private int id;
  private String name;
  private long phone;
  private String role;

  public TeamMember(int id, String name, long phone, String role)
  {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.role = role;
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

  public long getPhone()
  {
    return phone;
  }

  public void setPhone(long phone)
  {
    this.phone = phone;
  }

  public String getRole()
  {
    return role;
  }

  public void setRole(String role)
  {
    this.role = role;
  }
  public TeamMember copy()
  {
    TeamMember other;
    other = new TeamMember(1,"Boris", 399923, "ScrumMaster");
    return other;
  }

}
