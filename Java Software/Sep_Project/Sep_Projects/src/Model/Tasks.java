package Model;

import java.util.ArrayList;

public class Tasks
{ private ArrayList<Task> TaskList;
public Tasks(){
  TaskList =  new ArrayList<Task>();
}
public void addTask(Task Task){
  TaskList.add(Task);
}
public void removeTask(Task Task){
  TaskList.remove(Task);
}
public Task getTask(int i){
return TaskList.get(i);
}

public Task getAllTasks(int i){
  for(i = 0; i<TaskList.size(); i++){
    System.out.println("Model.Task " + i + " is :");
    return TaskList.get(i);
  }
  return null;
}
}
