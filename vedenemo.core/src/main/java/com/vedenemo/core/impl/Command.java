/**
 * Model public access point
 */
public interface Command{

    public void execute();
  
    public void undo();
  
}