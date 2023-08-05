package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Indicates that the module makes use of preview features of the JDK
 * and should be used along with {@code --enable-preview} at compile and run-time.
 *
 * <p>
 *     Modules marked with this annotation are unpublishable.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@DoNotPublish
public @interface EnablePreview {
}
