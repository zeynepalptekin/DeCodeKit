package androidx.annotation.a1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface a {

    /* renamed from: androidx.annotation.a1.a$a, reason: collision with other inner class name */
    public enum EnumC0010a {
        WARNING,
        ERROR
    }

    EnumC0010a level() default EnumC0010a.ERROR;
}
