package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class k extends g {
    private final WeakReference<j> d;

    /* renamed from: b, reason: collision with root package name */
    private b.b.a.c.a<i, b> f513b = new b.b.a.c.a<>();
    private int e = 0;
    private boolean f = false;
    private boolean g = false;
    private ArrayList<g.b> h = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private g.b f514c = g.b.INITIALIZED;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f515a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f516b;

        static {
            int[] r0 = new int[g.b.values().length];
            f516b = r0;
            try {
                r0[g.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f516b[g.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f516b[g.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f516b[g.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f516b[g.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] r5 = new int[g.a.values().length];
            f515a = r5;
            try {
                r5[g.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f515a[g.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f515a[g.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f515a[g.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f515a[g.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f515a[g.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f515a[g.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        g.b f517a;

        /* renamed from: b, reason: collision with root package name */
        h f518b;

        b(i iVar, g.b bVar) {
            this.f518b = Lifecycling.g(iVar);
            this.f517a = bVar;
        }

        void a(j jVar, g.a aVar) {
            g.b bVarI = k.i(aVar);
            this.f517a = k.m(this.f517a, bVarI);
            this.f518b.d(jVar, aVar);
            this.f517a = bVarI;
        }
    }

    public k(@h0 j jVar) {
        this.d = new WeakReference<>(jVar);
    }

    private void d(j jVar) {
        Iterator<Map.Entry<i, b>> itC = this.f513b.c();
        while (itC.hasNext() && !this.g) {
            Map.Entry<i, b> next = itC.next();
            b value = next.getValue();
            while (value.f517a.compareTo(this.f514c) > 0 && !this.g && this.f513b.contains(next.getKey())) {
                g.a aVarF = f(value.f517a);
                p(i(aVarF));
                value.a(jVar, aVarF);
                o();
            }
        }
    }

    private g.b e(i iVar) {
        Map.Entry<i, b> entryS = this.f513b.s(iVar);
        g.b bVar = null;
        g.b bVar2 = entryS != null ? entryS.getValue().f517a : null;
        if (!this.h.isEmpty()) {
            bVar = this.h.get(r0.size() - 1);
        }
        return m(m(this.f514c, bVar2), bVar);
    }

    private static g.a f(g.b bVar) {
        int r0 = a.f516b[bVar.ordinal()];
        if (r0 == 1) {
            throw new IllegalArgumentException();
        }
        if (r0 == 2) {
            return g.a.ON_DESTROY;
        }
        if (r0 == 3) {
            return g.a.ON_STOP;
        }
        if (r0 == 4) {
            return g.a.ON_PAUSE;
        }
        if (r0 == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(j jVar) {
        b.b.a.c.b<i, b>.d dVarJ = this.f513b.j();
        while (dVarJ.hasNext() && !this.g) {
            Map.Entry next = dVarJ.next();
            b bVar = (b) next.getValue();
            while (bVar.f517a.compareTo(this.f514c) < 0 && !this.g && this.f513b.contains(next.getKey())) {
                p(bVar.f517a);
                bVar.a(jVar, s(bVar.f517a));
                o();
            }
        }
    }

    static g.b i(g.a aVar) {
        switch (a.f515a[aVar.ordinal()]) {
            case 1:
            case 2:
                return g.b.CREATED;
            case 3:
            case 4:
                return g.b.STARTED;
            case 5:
                return g.b.RESUMED;
            case 6:
                return g.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean k() {
        if (this.f513b.size() == 0) {
            return true;
        }
        g.b bVar = this.f513b.h().getValue().f517a;
        g.b bVar2 = this.f513b.l().getValue().f517a;
        return bVar == bVar2 && this.f514c == bVar2;
    }

    static g.b m(@h0 g.b bVar, @i0 g.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void n(g.b bVar) {
        if (this.f514c == bVar) {
            return;
        }
        this.f514c = bVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        r();
        this.f = false;
    }

    private void o() {
        this.h.remove(r0.size() - 1);
    }

    private void p(g.b bVar) {
        this.h.add(bVar);
    }

    private void r() {
        j jVar = this.d.get();
        if (jVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zK = k();
            this.g = false;
            if (zK) {
                return;
            }
            if (this.f514c.compareTo(this.f513b.h().getValue().f517a) < 0) {
                d(jVar);
            }
            Map.Entry<i, b> entryL = this.f513b.l();
            if (!this.g && entryL != null && this.f514c.compareTo(entryL.getValue().f517a) > 0) {
                g(jVar);
            }
        }
    }

    private static g.a s(g.b bVar) {
        int r0 = a.f516b[bVar.ordinal()];
        if (r0 != 1) {
            if (r0 == 2) {
                return g.a.ON_START;
            }
            if (r0 == 3) {
                return g.a.ON_RESUME;
            }
            if (r0 == 4) {
                throw new IllegalArgumentException();
            }
            if (r0 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return g.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.g
    public void a(@h0 i iVar) {
        j jVar;
        g.b bVar = this.f514c;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        b bVar3 = new b(iVar, bVar2);
        if (this.f513b.o(iVar, bVar3) == null && (jVar = this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            g.b bVarE = e(iVar);
            this.e++;
            while (bVar3.f517a.compareTo(bVarE) < 0 && this.f513b.contains(iVar)) {
                p(bVar3.f517a);
                bVar3.a(jVar, s(bVar3.f517a));
                o();
                bVarE = e(iVar);
            }
            if (!z) {
                r();
            }
            this.e--;
        }
    }

    @Override // androidx.lifecycle.g
    @h0
    public g.b b() {
        return this.f514c;
    }

    @Override // androidx.lifecycle.g
    public void c(@h0 i iVar) {
        this.f513b.r(iVar);
    }

    public int h() {
        return this.f513b.size();
    }

    public void j(@h0 g.a aVar) {
        n(i(aVar));
    }

    @e0
    @Deprecated
    public void l(@h0 g.b bVar) {
        q(bVar);
    }

    @e0
    public void q(@h0 g.b bVar) {
        n(bVar);
    }
}
