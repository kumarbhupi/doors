import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseDoor implements Door {
  private final String id;
  private boolean isOpen;

  static Logger logger = LoggerFactory.getLogger(BaseDoor.class);

  public BaseDoor(String id) {
    this.id = id;
  }


  @Override
  public void receiveInput(String inputCode) {
    logger.info("BaseDoor-{} - door received inputCode", id);
  }

  @Override
  public String getId() {
    return id;
  }

  public void open(){
    logger.info("BaseDoor-{} - door is opening", id);
    isOpen = true;
  }

  public boolean isOpen() {
    return isOpen;
  }


}
