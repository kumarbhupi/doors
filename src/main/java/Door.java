public interface Door {
  void receiveInput(String inputCode);
  String getId();
  void open();
  boolean isOpen();
}
