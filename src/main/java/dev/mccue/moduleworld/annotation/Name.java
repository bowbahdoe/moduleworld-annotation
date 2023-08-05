package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface Name {
    String value();
}
