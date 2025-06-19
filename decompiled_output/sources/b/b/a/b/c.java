package b.b.a.b;

import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class c {
    public abstract void a(@h0 Runnable runnable);

    public void b(@h0 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@h0 Runnable runnable);
}
