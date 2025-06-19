package b.w;

import android.os.IBinder;

/* loaded from: classes.dex */
class h1 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f1451a;

    h1(IBinder iBinder) {
        this.f1451a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h1) && ((h1) obj).f1451a.equals(this.f1451a);
    }

    public int hashCode() {
        return this.f1451a.hashCode();
    }
}
