package androidx.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface x0 {
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;

    int otherwise() default 2;
}
