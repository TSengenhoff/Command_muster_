public interface ActionListenerCommand {
    void execute();
    boolean undo();
}
