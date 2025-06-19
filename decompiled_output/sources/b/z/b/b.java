package b.z.b;

import androidx.annotation.h0;
import androidx.annotation.k0;
import b.z.b.h;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h.j {

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final List<h.j> f1557a;

    b(int r2) {
        this.f1557a = new ArrayList(r2);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // b.z.b.h.j
    public void a(int r3) {
        try {
            Iterator<h.j> it = this.f1557a.iterator();
            while (it.hasNext()) {
                it.next().a(r3);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    @Override // b.z.b.h.j
    public void b(int r3, float f, @k0 int r5) {
        try {
            Iterator<h.j> it = this.f1557a.iterator();
            while (it.hasNext()) {
                it.next().b(r3, f, r5);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    @Override // b.z.b.h.j
    public void c(int r3) {
        try {
            Iterator<h.j> it = this.f1557a.iterator();
            while (it.hasNext()) {
                it.next().c(r3);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    void d(h.j jVar) {
        this.f1557a.add(jVar);
    }

    void e(h.j jVar) {
        this.f1557a.remove(jVar);
    }
}
