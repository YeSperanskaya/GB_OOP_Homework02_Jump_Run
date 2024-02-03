package subjects;

public abstract class Subject implements Jump, Run{
    /**
     * @param maxRunDistatnce Максимальная дистанция в беге измеряется в метрах
     */
    int maxRunDistatnce;
    /**
     * @param maxJumpDistance Максимальная дистанция в прыжках измеряется в сантиметрах
     */
    int maxJumpDistance;

    public int getMaxRunDistatnce() {
        return maxRunDistatnce;
    }

    public int getMaxJumpDistance() {
        return maxJumpDistance;
    }
}
