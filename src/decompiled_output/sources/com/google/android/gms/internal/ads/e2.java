package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class e2 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ long e;
    private final /* synthetic */ b f;

    e2(b bVar, String str, long j) {
        this.f = bVar;
        this.d = str;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.d.a(this.d, this.e);
        this.f.d.b(this.f.toString());
    }
}
