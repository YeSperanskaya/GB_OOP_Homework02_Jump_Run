package subjects;

public class Human extends Subject implements Jump, Run{
    public Human(int maxRunDistatnce, int maxJumpDistance) {
        super.maxRunDistatnce = maxRunDistatnce;
        super.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean jump(Wall wall) {
        return false;
    }


    @Override
    public void run(Track track) {

    }
}
