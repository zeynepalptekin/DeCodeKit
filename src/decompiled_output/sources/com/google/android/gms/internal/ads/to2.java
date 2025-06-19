package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserView;

/* loaded from: classes.dex */
public final class to2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5434b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5435c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final boolean l;

    public to2() {
        this(null, null, false, true, ActivityChooserView.f.j, ActivityChooserView.f.j, ActivityChooserView.f.j, true, true, ActivityChooserView.f.j, ActivityChooserView.f.j, true);
    }

    private to2(String str, String str2, boolean z, boolean z2, int r5, int r6, int r7, boolean z3, boolean z4, int r10, int r11, boolean z5) {
        this.f5433a = null;
        this.f5434b = null;
        this.f5435c = false;
        this.d = true;
        this.e = ActivityChooserView.f.j;
        this.f = ActivityChooserView.f.j;
        this.g = ActivityChooserView.f.j;
        this.h = true;
        this.i = true;
        this.j = ActivityChooserView.f.j;
        this.k = ActivityChooserView.f.j;
        this.l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && to2.class == obj.getClass()) {
            to2 to2Var = (to2) obj;
            if (this.d == to2Var.d && this.e == to2Var.e && this.f == to2Var.f && this.h == to2Var.h && this.i == to2Var.i && this.l == to2Var.l && this.j == to2Var.j && this.k == to2Var.k && this.g == to2Var.g && TextUtils.equals(null, null) && TextUtils.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k;
    }
}
