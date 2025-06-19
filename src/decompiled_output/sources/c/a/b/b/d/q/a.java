package c.a.b.b.d.q;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ScheduledExecutorService;

@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0123a f1627a;

    /* renamed from: c.a.b.b.d.q.a$a, reason: collision with other inner class name */
    public interface InterfaceC0123a {
        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        @Deprecated
        ScheduledExecutorService a();
    }

    private a() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static synchronized InterfaceC0123a a() {
        if (f1627a == null) {
            f1627a = new b();
        }
        return f1627a;
    }
}
