package dev.mccue.moduleworld.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
@DoNotPublish
public @interface AddExports {
    AddExport[] value();
}
