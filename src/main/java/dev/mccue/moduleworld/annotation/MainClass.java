package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Indicates that the specified class is the intended entrypoint
 * for the module.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface MainClass {
    Class<?> value();
}
