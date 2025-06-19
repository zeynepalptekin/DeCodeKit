package c.a.b.b.k;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f1912a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final Executor f1913b = new k0();

    private static final class a implements Executor {
        private final Handler d = new c.a.b.b.g.d.b(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@androidx.annotation.h0 Runnable runnable) {
            this.d.post(runnable);
        }
    }

    private o() {
    }
}
