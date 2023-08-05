package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * The version of the module.
 * Values should be parse-able with {@link Runtime.Version#parse(String)}.
 *
 * <p>
 *     This information is required to publish a module.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface Version {
    String value();
}
