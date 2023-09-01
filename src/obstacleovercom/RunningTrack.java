package obstacleovercom;

public class RunningTrack extends Obstacle {

    public RunningTrack(String type, int size) {
        super(type, size);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxRun() >= getSize();
    }
}
