package androidx.core.app;

import android.app.Service;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int f370a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f371b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f372c = 2;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    private x() {
    }

    public static void a(@h0 Service service, int r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            service.stopForeground(r3);
        } else {
            service.stopForeground((r3 & 1) != 0);
        }
    }
}
