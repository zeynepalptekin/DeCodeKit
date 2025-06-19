package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.p0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    @h0
    @p0({p0.a.LIBRARY_GROUP})
    AtomicReference<Object> f512a = new AtomicReference<>();

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean e(@h0 b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    @e0
    public abstract void a(@h0 i iVar);

    @e0
    @h0
    public abstract b b();

    @e0
    public abstract void c(@h0 i iVar);
}
