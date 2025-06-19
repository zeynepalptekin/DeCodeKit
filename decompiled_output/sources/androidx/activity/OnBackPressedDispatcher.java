package androidx.activity;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final Runnable f7a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f8b;

    private class LifecycleOnBackPressedCancellable implements h, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f9a;

        /* renamed from: b, reason: collision with root package name */
        private final b f10b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private androidx.activity.a f11c;

        LifecycleOnBackPressedCancellable(@h0 g gVar, @h0 b bVar) {
            this.f9a = gVar;
            this.f10b = bVar;
            gVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f9a.c(this);
            this.f10b.e(this);
            androidx.activity.a aVar = this.f11c;
            if (aVar != null) {
                aVar.cancel();
                this.f11c = null;
            }
        }

        @Override // androidx.lifecycle.h
        public void d(@h0 j jVar, @h0 g.a aVar) {
            if (aVar == g.a.ON_START) {
                this.f11c = OnBackPressedDispatcher.this.c(this.f10b);
                return;
            }
            if (aVar != g.a.ON_STOP) {
                if (aVar == g.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f11c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f12a;

        a(b bVar) {
            this.f12a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f8b.remove(this.f12a);
            this.f12a.e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(@i0 Runnable runnable) {
        this.f8b = new ArrayDeque<>();
        this.f7a = runnable;
    }

    @e0
    public void a(@h0 b bVar) {
        c(bVar);
    }

    @e0
    public void b(@h0 j jVar, @h0 b bVar) {
        g gVarB = jVar.b();
        if (gVarB.b() == g.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(gVarB, bVar));
    }

    @e0
    @h0
    androidx.activity.a c(@h0 b bVar) {
        this.f8b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    @e0
    public boolean d() {
        Iterator<b> itDescendingIterator = this.f8b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    @e0
    public void e() {
        Iterator<b> itDescendingIterator = this.f8b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f7a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
