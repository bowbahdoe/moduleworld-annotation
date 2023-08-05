package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@Repeatable(Developers.class)
public @interface Developer {
    String name();

    String email();

    String organization();

    String organizationUrl();
}
