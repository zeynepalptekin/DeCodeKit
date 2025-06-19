package c.a.b.b.e;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import c.a.b.b.d.i;
import com.google.android.gms.common.internal.r;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f1639a;

    /* renamed from: b, reason: collision with root package name */
    private T f1640b;

    @com.google.android.gms.common.annotation.a
    public static class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }

        public a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    @com.google.android.gms.common.annotation.a
    protected g(@RecentlyNonNull String str) {
        this.f1639a = str;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected abstract T a(@RecentlyNonNull IBinder iBinder);

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected final T b(@RecentlyNonNull Context context) throws a {
        if (this.f1640b == null) {
            r.k(context);
            Context contextI = i.i(context);
            if (contextI == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f1640b = a((IBinder) contextI.getClassLoader().loadClass(this.f1639a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new a("Could not instantiate creator.", e3);
            }
        }
        return this.f1640b;
    }
}
