package subjects;

public class Robot extends Subject implements Jump, Run{
    public Robot (int maxRunDistatnce, int maxJumpDistance) {
        super.maxRunDistatnce = maxRunDistatnce;
        super.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}
