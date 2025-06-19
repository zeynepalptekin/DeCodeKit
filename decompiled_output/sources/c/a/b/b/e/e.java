package c.a.b.b.e;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import c.a.b.b.e.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.y;
import java.lang.reflect.Field;

@y
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class e<T> extends c.a {
    private final T e;

    private e(T t) {
        this.e = t;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> T e2(@RecentlyNonNull c cVar) {
        if (cVar instanceof e) {
            return ((e) cVar).e;
        }
        IBinder iBinderAsBinder = cVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int r4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                r4++;
                field = field2;
            }
        }
        if (r4 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (((Field) r.k(field)).isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> c i2(@RecentlyNonNull T t) {
        return new e(t);
    }
}
