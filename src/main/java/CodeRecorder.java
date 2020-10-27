import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CodeRecorder extends DoorAccessory {
  private List<RecorderFormat> recorderFormatList;
  static Logger logger = LoggerFactory.getLogger(CodeRecorder.class);

  public CodeRecorder(Door core) {
    super(core);
    recorderFormatList = new ArrayList<>();
  }

  @Override
  public void receiveInput(String inputCode) {
    RecorderFormat recorderFormat = new RecorderFormat(LocalDateTime.now(), inputCode);
    recorderFormatList.add(recorderFormat);
    logger.info("CodeRecorder new entry recorded -> {}", recorderFormatList.toString());
    super.receiveInput(inputCode);

  }

  private class RecorderFormat {

    private LocalDateTime time;
    private String input;

    public RecorderFormat(LocalDateTime time, String input) {
      this.time = time;
      this.input = input;
    }

    @Override
    public String toString() {
      return "RecorderFormat{" +
          "time=" + time.toString() +
          ", input='" + input + '\'' +
          '}';
    }
  }

  public void printLog() {
    for (RecorderFormat recorderFormat : recorderFormatList) {
      logger.info(recorderFormat.toString());
    }
  }


}
