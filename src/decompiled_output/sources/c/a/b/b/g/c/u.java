package c.a.b.b.g.c;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class u implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private ThreadFactory f1828a = Executors.defaultThreadFactory();

    u(h hVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f1828a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
