package StoryGame;

public interface Checkpoints {
    public int checkpointNumber = 0;
    abstract void setCheckpointNumber(int newCheckpointNumber);
    abstract int getCheckpointNumber();
}
