package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * The {@code homepage} field should be a URL to a site that is the home page for your module.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface HomePage {
    String value();
}
