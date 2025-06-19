package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f754a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f755b = new SavedStateRegistry();

    private b(c cVar) {
        this.f754a = cVar;
    }

    @h0
    public static b a(@h0 c cVar) {
        return new b(cVar);
    }

    @h0
    public SavedStateRegistry b() {
        return this.f755b;
    }

    @e0
    public void c(@i0 Bundle bundle) {
        g gVarB = this.f754a.b();
        if (gVarB.b() != g.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        gVarB.a(new Recreator(this.f754a));
        this.f755b.c(gVarB, bundle);
    }

    @e0
    public void d(@h0 Bundle bundle) {
        this.f755b.d(bundle);
    }
}
