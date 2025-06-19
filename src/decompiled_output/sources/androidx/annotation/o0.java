package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0 {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface a {
        o0 value() default @o0;
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface b {
        o0 value() default @o0;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
