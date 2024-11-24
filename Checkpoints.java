
public interface Checkpoints {
    public boolean firstTime = true;
    public int checkpointNumber = 0;
    abstract void setCheckpointNumber();
    abstract void setFirstTimeStatusToFalse();
}
