package obstacleovercom;

public class Cat extends Participant {

    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void run(Obstacle obstacle) {
        super.run(obstacle);
    }

    @Override
    public void jump(Obstacle obstacle) {
        super.jump(obstacle);
    }
}
