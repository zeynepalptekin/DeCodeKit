package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements h {

    /* renamed from: a, reason: collision with root package name */
    private final d f485a;

    /* renamed from: b, reason: collision with root package name */
    private final h f486b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f487a;

        static {
            int[] r0 = new int[g.a.values().length];
            f487a = r0;
            try {
                r0[g.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f487a[g.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f487a[g.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f487a[g.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f487a[g.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f487a[g.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f487a[g.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(d dVar, h hVar) {
        this.f485a = dVar;
        this.f486b = hVar;
    }

    @Override // androidx.lifecycle.h
    public void d(j jVar, g.a aVar) {
        switch (a.f487a[aVar.ordinal()]) {
            case 1:
                this.f485a.c(jVar);
                break;
            case 2:
                this.f485a.f(jVar);
                break;
            case 3:
                this.f485a.a(jVar);
                break;
            case 4:
                this.f485a.e(jVar);
                break;
            case 5:
                this.f485a.g(jVar);
                break;
            case 6:
                this.f485a.b(jVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        h hVar = this.f486b;
        if (hVar != null) {
            hVar.d(jVar, aVar);
        }
    }
}
