package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Indicates the level to use for the {@code --release} flag passed to {@code javac}.
 *
 * <p>
 *     Values less than {@code 9} are invalid. This setting can be overridden for
 *     some sources by placing code in an explicitly versioned source folder like
 *     {@code src/java11/...}. The default release is simply the newest at the
 *     time of compilation.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface Release {
    int value();
}
