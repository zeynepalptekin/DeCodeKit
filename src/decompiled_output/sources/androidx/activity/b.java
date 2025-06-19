package androidx.activity;

import androidx.annotation.e0;
import androidx.annotation.h0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f15b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f14a = z;
    }

    void a(@h0 a aVar) {
        this.f15b.add(aVar);
    }

    @e0
    public abstract void b();

    @e0
    public final boolean c() {
        return this.f14a;
    }

    @e0
    public final void d() {
        Iterator<a> it = this.f15b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(@h0 a aVar) {
        this.f15b.remove(aVar);
    }

    @e0
    public final void f(boolean z) {
        this.f14a = z;
    }
}
