abstract class DoorAccessory implements Door {
  private Door core;

  public DoorAccessory(Door core) {
    this.core = core;
  }

  @Override
  public void receiveInput(String inputCode) {
    core.receiveInput(inputCode);
  }

  @Override
  public void open() {
    core.open();
  }

  @Override
  public String getId() {
    return core.getId();
  }

  @Override
  public boolean isOpen() {
    return core.isOpen();
  }
}
