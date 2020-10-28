import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FireAlarm extends DoorAccessory{
  private  String fireAlarmCode;
  static Logger logger = LoggerFactory.getLogger(FireAlarm.class);

  public FireAlarm(Door core, String fireAlarmCode) {
    super(core);
    this.fireAlarmCode = fireAlarmCode;

  }
  @Override
  public void receiveInput(String inputCode) {
    if (inputCode.equals(fireAlarmCode)){
      fireAlarm();
      open();
    }
    super.receiveInput(inputCode);
  }

  @Override
  public String getId() {
    return super.getId();
  }

  private void fireAlarm(){
    logger.info("FireAlarm-{} - secretly fire alarm",getId());
  }
}
