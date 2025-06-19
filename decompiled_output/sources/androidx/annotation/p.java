package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18c = 2;

    int unit() default 1;
}
