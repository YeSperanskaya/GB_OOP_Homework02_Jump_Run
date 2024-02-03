package subjects;

public class Cat extends Subject implements Jump, Run{
    public Cat(int maxRunDistatnce, int maxJumpDistance) {
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
