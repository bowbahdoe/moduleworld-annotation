package dev.mccue.moduleworld.annotation.vm;

import dev.mccue.moduleworld.annotation.DoNotPublish;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@Repeatable(SystemProperties.class)
@DoNotPublish
public @interface SystemProperty {
    String key();

    String value();
}
