package subjects;

public class Human extends Subject implements Jump, Run{
    public Human(int maxRunDistatnce, int maxJumpDistance) {
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
