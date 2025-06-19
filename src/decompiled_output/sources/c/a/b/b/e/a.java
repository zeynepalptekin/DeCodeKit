package c.a.b.b.e;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import c.a.b.b.e.b;
import com.google.android.gms.common.internal.r;

@SuppressLint({"NewApi"})
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class a extends b.a {
    private Fragment e;

    private a(Fragment fragment) {
        this.e = fragment;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static a e2(@i0 Fragment fragment) {
        if (fragment != null) {
            return new a(fragment);
        }
        return null;
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final c A0() {
        return e.i2(this.e.getView());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean B() {
        return this.e.isResumed();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNullable
    public final String B0() {
        return this.e.getTag();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean F() {
        return this.e.isDetached();
    }

    @Override // c.a.b.b.e.b
    public final void F0(@RecentlyNonNull c cVar) {
        this.e.unregisterForContextMenu((View) r.k((View) e.e2(cVar)));
    }

    @Override // c.a.b.b.e.b
    public final void G0(@RecentlyNonNull Intent intent) {
        this.e.startActivity(intent);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean I() {
        return this.e.isHidden();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean O() {
        return this.e.isInLayout();
    }

    @Override // c.a.b.b.e.b
    public final void Q7(@RecentlyNonNull Intent intent, @RecentlyNonNull int r3) {
        this.e.startActivityForResult(intent, r3);
    }

    @Override // c.a.b.b.e.b
    public final void T2(@RecentlyNonNull boolean z) {
        this.e.setUserVisibleHint(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final c a() {
        return e.i2(this.e.getActivity());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final Bundle b() {
        return this.e.getArguments();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final int c() {
        return this.e.getId();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNullable
    public final b d() {
        return e2(this.e.getParentFragment());
    }

    @Override // c.a.b.b.e.b
    public final void d8(@RecentlyNonNull boolean z) {
        this.e.setRetainInstance(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNullable
    public final b e0() {
        return e2(this.e.getTargetFragment());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final c f() {
        return e.i2(this.e.getResources());
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final int n0() {
        return this.e.getTargetRequestCode();
    }

    @Override // c.a.b.b.e.b
    public final void o0(@RecentlyNonNull c cVar) {
        this.e.registerForContextMenu((View) r.k((View) e.e2(cVar)));
    }

    @Override // c.a.b.b.e.b
    public final void o1(@RecentlyNonNull boolean z) {
        this.e.setMenuVisibility(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean p0() {
        return this.e.isVisible();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean u0() {
        return this.e.getUserVisibleHint();
    }

    @Override // c.a.b.b.e.b
    public final void v4(@RecentlyNonNull boolean z) {
        this.e.setHasOptionsMenu(z);
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean x() {
        return this.e.isRemoving();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean y0() {
        return this.e.getRetainInstance();
    }

    @Override // c.a.b.b.e.b
    @RecentlyNonNull
    public final boolean z() {
        return this.e.isAdded();
    }
}
