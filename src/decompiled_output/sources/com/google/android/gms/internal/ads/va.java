package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class va extends rs<cb> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f5653c = new Object();
    private final za d;
    private boolean e;

    public va(za zaVar) {
        this.d = zaVar;
    }

    public final void f() {
        synchronized (this.f5653c) {
            if (this.e) {
                return;
            }
            this.e = true;
            d(new ua(this), new ps());
            d(new xa(this), new wa(this));
        }
    }
}
