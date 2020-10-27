public class Main {
  public static void main(String[] args) {
    /*Door doorAllFunctions = new CodeRecorder(new FireAlarm(new CodeProcessor(new BaseDoor("door01"), "Open", "Unlock"), "FireOFF"));

    doorAllFunctions.receiveInput("try1");
    doorAllFunctions.receiveInput("try1");
    doorAllFunctions.receiveInput("FireOFF");
    System.out.println(doorAllFunctions.isOpen());*/

    //Door doorCodeProcessorANDFireAlarm = new FireAlarm(new CodeProcessor(new BaseDoor("base"),"OPEN", "UNLOCK"),"FIRE");
    Door doorCodeProcessorANDFireAlarm = new CodeProcessor(new FireAlarm(new BaseDoor("base"),"FIRE"),"FIRE", "UNLOCK");

    doorCodeProcessorANDFireAlarm.receiveInput("OPE");
    doorCodeProcessorANDFireAlarm.receiveInput("OPE");
    doorCodeProcessorANDFireAlarm.receiveInput("OPE");
    doorCodeProcessorANDFireAlarm.receiveInput("OPEN");
    doorCodeProcessorANDFireAlarm.receiveInput("UNLOCK");
    doorCodeProcessorANDFireAlarm.receiveInput("OPEN");
    doorCodeProcessorANDFireAlarm.receiveInput("OPE");
    doorCodeProcessorANDFireAlarm.receiveInput("OPE");
    doorCodeProcessorANDFireAlarm.receiveInput("OPE");
    doorCodeProcessorANDFireAlarm.receiveInput("FIRE");




  }
}
