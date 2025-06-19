package c.a.b.b.g.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class g implements f {
    private g() {
    }

    @Override // c.a.b.b.g.b.f
    public final ScheduledExecutorService y(int r1, int r2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
