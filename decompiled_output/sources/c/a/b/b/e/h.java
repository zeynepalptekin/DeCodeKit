package c.a.b.b.e;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import c.a.b.b.e.b;
import com.google.android.gms.common.internal.r;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class h extends b.a {
    private Fragment e;

    private h(Fragment fragment) {
        this.e = fragment;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static h e2(@i0 Fragment fragment) {
        if (fragment != null) {
            return new h(fragment);
        }
        return null;
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final c A0() {
        return e.i2(this.e.X());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean B() {
        return this.e.o0();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNullable
    public final String B0() {
        return this.e.S();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean F() {
        return this.e.g0();
    }

    @Override // c.a.b.b.e.b
    public final void F0(@RecentlyNonNull c cVar) {
        this.e.n2((View) r.k((View) e.e2(cVar)));
    }

    @Override // c.a.b.b.e.b
    public final void G0(@RecentlyNonNull Intent intent) {
        this.e.i2(intent);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean I() {
        return this.e.h0();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean O() {
        return this.e.k0();
    }

    @Override // c.a.b.b.e.b
    public final void Q7(@RecentlyNonNull Intent intent, @RecentlyNonNull int r3) {
        this.e.startActivityForResult(intent, r3);
    }

    @Override // c.a.b.b.e.b
    public final void T2(@RecentlyNonNull boolean z) {
        this.e.g2(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final c a() {
        return e.i2(this.e.n());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final Bundle b() {
        return this.e.s();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final int c() {
        return this.e.B();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNullable
    public final b d() {
        return e2(this.e.I());
    }

    @Override // c.a.b.b.e.b
    public final void d8(@RecentlyNonNull boolean z) {
        this.e.a2(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNullable
    public final b e0() {
        return e2(this.e.T());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final c f() {
        return e.i2(this.e.K());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final int n0() {
        return this.e.U();
    }

    @Override // c.a.b.b.e.b
    public final void o0(@RecentlyNonNull c cVar) {
        this.e.y1((View) r.k((View) e.e2(cVar)));
    }

    @Override // c.a.b.b.e.b
    public final void o1(@RecentlyNonNull boolean z) {
        this.e.V1(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean p0() {
        return this.e.q0();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean u0() {
        return this.e.W();
    }

    @Override // c.a.b.b.e.b
    public final void v4(@RecentlyNonNull boolean z) {
        this.e.S1(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean x() {
        return this.e.n0();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean y0() {
        return this.e.L();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean z() {
        return this.e.f0();
    }
}
