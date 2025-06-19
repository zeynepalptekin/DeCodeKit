package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.h0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    private e f6605a;

    /* renamed from: b, reason: collision with root package name */
    private int f6606b;

    /* renamed from: c, reason: collision with root package name */
    private int f6607c;

    public d() {
        this.f6606b = 0;
        this.f6607c = 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6606b = 0;
        this.f6607c = 0;
    }

    public int G() {
        e eVar = this.f6605a;
        if (eVar != null) {
            return eVar.d();
        }
        return 0;
    }

    public int H() {
        e eVar = this.f6605a;
        if (eVar != null) {
            return eVar.e();
        }
        return 0;
    }

    public boolean I() {
        e eVar = this.f6605a;
        return eVar != null && eVar.f();
    }

    public boolean J() {
        e eVar = this.f6605a;
        return eVar != null && eVar.g();
    }

    protected void K(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r3) {
        coordinatorLayout.N(v, r3);
    }

    public void L(boolean z) {
        e eVar = this.f6605a;
        if (eVar != null) {
            eVar.i(z);
        }
    }

    public boolean M(int r2) {
        e eVar = this.f6605a;
        if (eVar != null) {
            return eVar.j(r2);
        }
        this.f6607c = r2;
        return false;
    }

    public boolean N(int r2) {
        e eVar = this.f6605a;
        if (eVar != null) {
            return eVar.k(r2);
        }
        this.f6606b = r2;
        return false;
    }

    public void O(boolean z) {
        e eVar = this.f6605a;
        if (eVar != null) {
            eVar.l(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r3) {
        K(coordinatorLayout, v, r3);
        if (this.f6605a == null) {
            this.f6605a = new e(v);
        }
        this.f6605a.h();
        this.f6605a.a();
        int r1 = this.f6606b;
        if (r1 != 0) {
            this.f6605a.k(r1);
            this.f6606b = 0;
        }
        int r12 = this.f6607c;
        if (r12 == 0) {
            return true;
        }
        this.f6605a.j(r12);
        this.f6607c = 0;
        return true;
    }
}
