import Lesson_2.Square;
import Lesson_2.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ObjectList {
    Object[] objects;

    public Object[] getObjects() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class <User> userClass = User.class;
        Constructor constructor = userClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        User user = (User) constructor.newInstance();

        Class <Square> squareClass = Square.class;
        Constructor constructor1 = squareClass.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Square square = (Square) constructor1.newInstance();

        Object[] objects = new Object[]{user, square};

        for (Object o: objects) {
            RandomIntProsessor.prosessor(o);
        }
        return objects;
    }

    @Override
    public String toString() {
        return "ObjectList{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
