package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Model.Requirement;
import Model.Requirements;

import java.util.ArrayList;

public class requirementViewModel
{
  private ObservableList<Requirements> list;
  private Requirements model;

  public requirementViewModel(Requirements model)
  {
    this.model = model;
    this.list = FXCollections.observableArrayList();

  }



  public ObservableList<Requirements> getList()
  {
    return list;
  }


}
