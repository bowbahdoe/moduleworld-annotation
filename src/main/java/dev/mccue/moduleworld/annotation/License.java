package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

/**
 * Licensing information for a component of the module.
 *
 * <p>
 *     At least one license must be known for the entire module in order to publish.
 * </p>
 *
 * <p>
 *     Value must be an <a href="https://spdx.org/spdx-specification-21-web-version#h.jxpfx0ykyb60">SPDX 2.1 license expression</a>
 *     The name must be a known license from the <a href="https://github.com/spdx/license-list-data/tree/v3.11">SPDX license list 3.11</a>.
 * </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.MODULE, ElementType.PACKAGE, ElementType.TYPE})
public @interface License {
    String value();
}
