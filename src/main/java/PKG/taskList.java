package PKG;

public class taskList {

    private String taskName;
    private String taskDescription;
    private boolean isDone;


    @Override
    public String  toString(){
        return "\nNombre: "+this.getTaskName()+"\nDescripcion: "+this.getTaskDescription()+"\nEstado: "+this.isDone();

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    

}
