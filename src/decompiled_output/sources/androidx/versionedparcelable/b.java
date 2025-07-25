package androidx.versionedparcelable;

import androidx.annotation.p0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public @interface b {
    String defaultValue() default "";

    int value();
}
