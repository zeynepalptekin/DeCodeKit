package c.a.b.b.g.c;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class k5 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<j5, List<Throwable>> f1741a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f1742b = new ReferenceQueue<>();

    k5() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f1742b.poll();
            if (referencePoll == null) {
                break;
            }
            this.f1741a.remove(referencePoll);
        }
        List<Throwable> list = this.f1741a.get(new j5(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f1741a.putIfAbsent(new j5(th, this.f1742b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
