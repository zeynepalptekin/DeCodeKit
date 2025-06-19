package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.n;
import b.a.a;
import b.i.p.f0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class m implements i {
    private static final int m = 48;

    /* renamed from: a, reason: collision with root package name */
    private final Context f100a;

    /* renamed from: b, reason: collision with root package name */
    private final g f101b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f102c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private n.a i;
    private l j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.g();
        }
    }

    public m(@h0 Context context, @h0 g gVar) {
        this(context, gVar, null, false, a.b.popupMenuStyle, 0);
    }

    public m(@h0 Context context, @h0 g gVar, @h0 View view) {
        this(context, gVar, view, false, a.b.popupMenuStyle, 0);
    }

    public m(@h0 Context context, @h0 g gVar, @h0 View view, boolean z, @androidx.annotation.f int r12) {
        this(context, gVar, view, z, r12, 0);
    }

    public m(@h0 Context context, @h0 g gVar, @h0 View view, boolean z, @androidx.annotation.f int r6, @t0 int r7) {
        this.g = b.i.p.h.f1198b;
        this.l = new a();
        this.f100a = context;
        this.f101b = gVar;
        this.f = view;
        this.f102c = z;
        this.d = r6;
        this.e = r7;
    }

    @h0
    private l b() {
        Display defaultDisplay = ((WindowManager) this.f100a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        l dVar = Math.min(point.x, point.y) >= this.f100a.getResources().getDimensionPixelSize(a.e.abc_cascading_menus_min_smallest_width) ? new d(this.f100a, this.f, this.d, this.e, this.f102c) : new r(this.f100a, this.f101b, this.f, this.d, this.e, this.f102c);
        dVar.b(this.f101b);
        dVar.k(this.l);
        dVar.f(this.f);
        dVar.T(this.i);
        dVar.h(this.h);
        dVar.i(this.g);
        return dVar;
    }

    private void n(int r4, int r5, boolean z, boolean z2) {
        l lVarE = e();
        lVarE.l(z2);
        if (z) {
            if ((b.i.p.h.d(this.g, f0.W(this.f)) & 7) == 5) {
                r4 -= this.f.getWidth();
            }
            lVarE.j(r4);
            lVarE.m(r5);
            int r6 = (int) ((this.f100a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarE.g(new Rect(r4 - r6, r5 - r6, r4 + r6, r5 + r6));
        }
        lVarE.y();
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(@i0 n.a aVar) {
        this.i = aVar;
        l lVar = this.j;
        if (lVar != null) {
            lVar.T(aVar);
        }
    }

    public int c() {
        return this.g;
    }

    public ListView d() {
        return e().A();
    }

    @Override // androidx.appcompat.view.menu.i
    public void dismiss() {
        if (f()) {
            this.j.dismiss();
        }
    }

    @h0
    public l e() {
        if (this.j == null) {
            this.j = b();
        }
        return this.j;
    }

    public boolean f() {
        l lVar = this.j;
        return lVar != null && lVar.z();
    }

    protected void g() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@h0 View view) {
        this.f = view;
    }

    public void i(boolean z) {
        this.h = z;
        l lVar = this.j;
        if (lVar != null) {
            lVar.h(z);
        }
    }

    public void j(int r1) {
        this.g = r1;
    }

    public void k(@i0 PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int r1, int r2) {
        if (!p(r1, r2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int r3, int r4) {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        n(r3, r4, true, true);
        return true;
    }
}
