import subjects.Track;
import subjects.Wall;
import subjects.Cat;
import subjects.Human;
import subjects.Robot;
import subjects.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Домашнее задание на закрепление :
 *
 * 1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель.
 * Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
 * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 * (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 * этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 * списку он препятствий не идет.
 */


public class MyProgram {
    public static void main(String[] args) {
        Subject man = new Human(100, 50);
        Subject cat = new Cat(25, 70);
        Subject robot = new Robot(3, 23);
        List<Subject> personsArray = new ArrayList(Arrays.asList(man, cat, robot));
        Wall wall50 = new Wall(50);
        Track track25 = new Track(25);
        List obstructions = new ArrayList<>(Arrays.asList(wall50, track25));



    }
}
