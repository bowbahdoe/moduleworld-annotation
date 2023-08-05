package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Indicates that the module should be compiled with the given annotation processor
 * on the module-path.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface AnnotationProcessor {
    String value();
}
