package sfri.mhmd.utils.cdi.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Provider {
    String clazz() default "";
}
