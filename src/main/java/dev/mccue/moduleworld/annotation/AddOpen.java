package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Marks that the given module wants to have open reflective access to a package
 * in some module via {@code --add-opens} at run-time.
 *
 * <p>
 *     Modules marked with this annotation are unpublishable.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@Repeatable(AddOpens.class)
@DoNotPublish
public @interface AddOpen {
    String inModule();

    String toPackage();

    String why() default "";
}
