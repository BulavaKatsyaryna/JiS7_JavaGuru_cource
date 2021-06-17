package Lecture_Annotation_Task1;

import java.lang.reflect.Field;
import java.util.Random;

public class GenerateIntValueAnnotationProcess {
    public void analyze(Object object) throws Exception {
        Class<?> objectClass = object.getClass();
        var declaredFields = objectClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Annotation.class)) {
                field.setAccessible(true);
                var generateValue = new Random().nextInt(50);
                field.set(object, generateValue);
                if (generateValue < 10) {
                    System.out.println(true);
                } else
                    System.out.println(false);
            }
        }
    }
}
