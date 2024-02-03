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
        Subject man = new Human("Вася",100, 50);
        Subject cat = new Cat("Барсик",25, 30);
        Subject robot = new Robot("Десиптикон", 1000, 100);
        List<Subject> personsArray = new ArrayList(Arrays.asList(man, cat, robot));
        Wall wall = new Wall(80);
        Track track = new Track(500);
        List obstructions = new ArrayList<>(Arrays.asList(wall, track));
        boolean isPassed;
        for (int i = 0; i < personsArray.size(); i++) {
            for (int j = 0; j < obstructions.size(); j++) {
                if (obstructions.get(j) instanceof Wall) {
                    isPassed = personsArray.get(i).jump((Wall) obstructions.get(j));
                    if (!isPassed) {
                        break;
                    }
                } else if (obstructions.get(j) instanceof Track) {
                    isPassed = personsArray.get(i).run((Track) obstructions.get(j));
                    if (!isPassed) {
                        break;
                    }

                }

            }
        }


    }
}
