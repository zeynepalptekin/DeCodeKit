package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface x {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        String name();

        int value();
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    public enum c {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    c valueType() default c.INFERRED;
}
