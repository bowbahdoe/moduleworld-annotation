package dev.mccue.moduleworld.annotation.vm.hotspot;

import dev.mccue.moduleworld.annotation.DoNotPublish;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@DoNotPublish
public @interface Xmx {
    String value();

    String why() default "";
}
