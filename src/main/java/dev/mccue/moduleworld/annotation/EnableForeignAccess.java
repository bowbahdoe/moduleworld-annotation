package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Indicates that the marked module will require foreign access
 * permissions from the JVM to be used.
 *
 * <p>
 *     This should only be placed on modules which require the {@code java.lang.foreign}
 *     API.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface EnableForeignAccess {
}
