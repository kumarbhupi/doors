import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CodeProcessor extends DoorAccessory {
  private final static int MaxNumTrials = 3;
  private String openCode;
  private String unlockCode;
  private boolean locked;
  private int numTrials;
  static Logger logger = LoggerFactory.getLogger(CodeProcessor.class);


  public CodeProcessor(Door core, String openCode, String unlockCode) {
    super(core);
    this.openCode = openCode;
    this.unlockCode = unlockCode;
    locked = false;
    numTrials = 0;
  }

  @Override
  public void receiveInput(String inputCode){
    if (!locked) {
      if (inputCode.equals(openCode)) {
        logger.info("CodeProcessor-{} - door unlocked", getId());
        super.open();
      } else {
        logger.info("CodeProcessor-{} - attempt to open door failed", getId());
        numTrials++;
        if (numTrials == MaxNumTrials) {
          locked = true;
          logger.info("CodeProcessor-{} - door locked", getId());
        }
      }
    } else {
      if (inputCode.equals(unlockCode)) {
        logger.info("CodeProcessor-{} - Correct unlock code & door unlocked",getId());
        locked = false;
        numTrials = 0;
      } else {
        //TODO: Invalid unlock code
        logger.info("CodeProcessor-{} - Invalid unlock code",getId());
      }
    }
    super.receiveInput(inputCode);
  }

  @Override
  public String getId() {
    return super.getId();
  }
}
