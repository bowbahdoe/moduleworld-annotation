package dev.mccue.moduleworld.annotation;


import java.lang.annotation.*;

/**
 * Annotation to explicitly mark that a module should not be
 * published to a public registry.
 *
 * <p>
 *     Can be used on another annotation to give it the same effect.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.MODULE, ElementType.ANNOTATION_TYPE})
public @interface DoNotPublish {
}
