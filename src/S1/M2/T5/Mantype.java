package S1.M2.T5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface Mantype {

        String value() default "";
}
