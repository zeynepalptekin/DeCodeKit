package com.google.android.material.appbar;

import android.view.View;
import b.i.p.f0;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f6608a;

    /* renamed from: b, reason: collision with root package name */
    private int f6609b;

    /* renamed from: c, reason: collision with root package name */
    private int f6610c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public e(View view) {
        this.f6608a = view;
    }

    void a() {
        View view = this.f6608a;
        f0.Z0(view, this.d - (view.getTop() - this.f6609b));
        View view2 = this.f6608a;
        f0.Y0(view2, this.e - (view2.getLeft() - this.f6610c));
    }

    public int b() {
        return this.f6610c;
    }

    public int c() {
        return this.f6609b;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.f;
    }

    void h() {
        this.f6609b = this.f6608a.getTop();
        this.f6610c = this.f6608a.getLeft();
    }

    public void i(boolean z) {
        this.g = z;
    }

    public boolean j(int r2) {
        if (!this.g || this.e == r2) {
            return false;
        }
        this.e = r2;
        a();
        return true;
    }

    public boolean k(int r2) {
        if (!this.f || this.d == r2) {
            return false;
        }
        this.d = r2;
        a();
        return true;
    }

    public void l(boolean z) {
        this.f = z;
    }
}
