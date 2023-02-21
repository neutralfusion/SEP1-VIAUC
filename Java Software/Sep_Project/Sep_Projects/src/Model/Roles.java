package Model;

public class Roles
{
  private TeamMember teammember;
  private String ScrumMaster;
  private String ProductOwner;

  public Roles(TeamMember teammember, String scrumMaster, String productOwner)
  {
    TeamMember = teammember;
    ScrumMaster = scrumMaster;
    ProductOwner = productOwner;
  }

  public TeamMember getTeammember()
  {
    return teammember;
  }

  public String getScrumMaster()
  {
    return ScrumMaster;
  }

  public String getProductOwner()
  {
    return ProductOwner;
  }

  public void setTeammember(TeamMember teammember)
  {
    TeamMember = teammember;
  }
}
