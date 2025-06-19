package b.w;

import android.view.View;
import android.view.WindowId;

@androidx.annotation.m0(18)
/* loaded from: classes.dex */
class i1 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f1463a;

    i1(@androidx.annotation.h0 View view) {
        this.f1463a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i1) && ((i1) obj).f1463a.equals(this.f1463a);
    }

    public int hashCode() {
        return this.f1463a.hashCode();
    }
}
