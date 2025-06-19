package c.a.b.c.m;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.h0;
import androidx.annotation.w;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final View f1979a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1980b = false;

    /* renamed from: c, reason: collision with root package name */
    @w
    private int f1981c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f1979a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f1979a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).j(this.f1979a);
        }
    }

    @w
    public int b() {
        return this.f1981c;
    }

    public boolean c() {
        return this.f1980b;
    }

    public void d(@h0 Bundle bundle) {
        this.f1980b = bundle.getBoolean("expanded", false);
        this.f1981c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f1980b) {
            a();
        }
    }

    @h0
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f1980b);
        bundle.putInt("expandedComponentIdHint", this.f1981c);
        return bundle;
    }

    public boolean f(boolean z) {
        if (this.f1980b == z) {
            return false;
        }
        this.f1980b = z;
        a();
        return true;
    }

    public void g(@w int r1) {
        this.f1981c = r1;
    }
}
