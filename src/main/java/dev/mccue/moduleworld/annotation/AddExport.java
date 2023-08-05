package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@Repeatable(AddExports.class)
@DoNotPublish
public @interface AddExport {
    String inModule();

    String toPackage();


    String why() default "";
}
