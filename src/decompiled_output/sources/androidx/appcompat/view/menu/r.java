package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.m0;
import b.a.a;
import b.i.p.f0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {
    private static final int y = a.j.abc_popup_menu_item_layout;
    private final Context e;
    private final g f;
    private final f g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    final m0 l;
    private PopupWindow.OnDismissListener o;
    private View p;
    View q;
    private n.a r;
    ViewTreeObserver s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean x;
    final ViewTreeObserver.OnGlobalLayoutListener m = new a();
    private final View.OnAttachStateChangeListener n = new b();
    private int w = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!r.this.z() || r.this.l.L()) {
                return;
            }
            View view = r.this.q;
            if (view == null || !view.isShown()) {
                r.this.dismiss();
            } else {
                r.this.l.y();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = r.this.s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.s = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.s.removeGlobalOnLayoutListener(rVar.m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, g gVar, View view, int r7, int r8, boolean z) {
        this.e = context;
        this.f = gVar;
        this.h = z;
        this.g = new f(gVar, LayoutInflater.from(context), this.h, y);
        this.j = r7;
        this.k = r8;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.abc_config_prefDialogWidth));
        this.p = view;
        this.l = new m0(this.e, null, this.j, this.k);
        gVar.c(this, context);
    }

    private boolean p() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (z()) {
            return true;
        }
        if (this.t || (view = this.p) == null) {
            return false;
        }
        this.q = view;
        this.l.e0(this);
        this.l.f0(this);
        this.l.d0(true);
        View view2 = this.q;
        boolean z = this.s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.m);
        }
        view2.addOnAttachStateChangeListener(this.n);
        this.l.S(view2);
        this.l.W(this.w);
        if (!this.u) {
            this.v = l.e(this.g, null, this.e, this.i);
            this.u = true;
        }
        this.l.U(this.v);
        this.l.a0(2);
        this.l.X(d());
        this.l.y();
        ListView listViewA = this.l.A();
        listViewA.setOnKeyListener(this);
        if (this.x && this.f.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(a.j.abc_popup_menu_header_item_layout, (ViewGroup) listViewA, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f.A());
            }
            frameLayout.setEnabled(false);
            listViewA.addHeaderView(frameLayout, null, false);
        }
        this.l.n(this.g);
        this.l.y();
        return true;
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView A() {
        return this.l.A();
    }

    @Override // androidx.appcompat.view.menu.n
    public void L(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean M(s sVar) {
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.e, sVar, this.q, this.h, this.j, this.k);
            mVar.a(this.r);
            mVar.i(l.n(sVar));
            mVar.k(this.o);
            this.o = null;
            this.f.f(false);
            int width = this.l.b();
            int r3 = this.l.k();
            if ((Gravity.getAbsoluteGravity(this.w, f0.W(this.p)) & 7) == 5) {
                width += this.p.getWidth();
            }
            if (mVar.p(width, r3)) {
                n.a aVar = this.r;
                if (aVar == null) {
                    return true;
                }
                aVar.b(sVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void N(boolean z) {
        this.u = false;
        f fVar = this.g;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean P() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable Q() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public void T(n.a aVar) {
        this.r = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        if (gVar != this.f) {
            return;
        }
        dismiss();
        n.a aVar = this.r;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (z()) {
            this.l.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void f(View view) {
        this.p = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public void h(boolean z) {
        this.g.e(z);
    }

    @Override // androidx.appcompat.view.menu.l
    public void i(int r1) {
        this.w = r1;
    }

    @Override // androidx.appcompat.view.menu.l
    public void j(int r2) {
        this.l.i(r2);
    }

    @Override // androidx.appcompat.view.menu.l
    public void k(PopupWindow.OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void l(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.l
    public void m(int r2) {
        this.l.g(r2);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.t = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.s = this.q.getViewTreeObserver();
            }
            this.s.removeGlobalOnLayoutListener(this.m);
            this.s = null;
        }
        this.q.removeOnAttachStateChangeListener(this.n);
        PopupWindow.OnDismissListener onDismissListener = this.o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int r2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || r2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.q
    public void y() {
        if (!p()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean z() {
        return !this.t && this.l.z();
    }
}
