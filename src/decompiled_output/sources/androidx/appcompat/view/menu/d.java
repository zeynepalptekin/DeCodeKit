package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.m0;
import b.a.a;
import b.i.p.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int E = a.j.abc_cascading_menu_item_layout;
    static final int F = 0;
    static final int G = 1;
    static final int H = 200;
    private n.a A;
    ViewTreeObserver B;
    private PopupWindow.OnDismissListener C;
    boolean D;
    private final Context e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    final Handler j;
    private View r;
    View s;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean z;
    private final List<g> k = new ArrayList();
    final List<C0015d> l = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener m = new a();
    private final View.OnAttachStateChangeListener n = new b();
    private final l0 o = new c();
    private int p = 0;
    private int q = 0;
    private boolean y = false;
    private int t = t();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!d.this.z() || d.this.l.size() <= 0 || d.this.l.get(0).f92a.L()) {
                return;
            }
            View view = d.this.s;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0015d> it = d.this.l.iterator();
            while (it.hasNext()) {
                it.next().f92a.y();
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
            ViewTreeObserver viewTreeObserver = d.this.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.B = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.B.removeGlobalOnLayoutListener(dVar.m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements l0 {

        class a implements Runnable {
            final /* synthetic */ C0015d d;
            final /* synthetic */ MenuItem e;
            final /* synthetic */ g f;

            a(C0015d c0015d, MenuItem menuItem, g gVar) {
                this.d = c0015d;
                this.e = menuItem;
                this.f = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0015d c0015d = this.d;
                if (c0015d != null) {
                    d.this.D = true;
                    c0015d.f93b.f(false);
                    d.this.D = false;
                }
                if (this.e.isEnabled() && this.e.hasSubMenu()) {
                    this.f.O(this.e, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.l0
        public void c(@h0 g gVar, @h0 MenuItem menuItem) {
            d.this.j.removeCallbacksAndMessages(null);
            int size = d.this.l.size();
            int r2 = 0;
            while (true) {
                if (r2 >= size) {
                    r2 = -1;
                    break;
                } else if (gVar == d.this.l.get(r2).f93b) {
                    break;
                } else {
                    r2++;
                }
            }
            if (r2 == -1) {
                return;
            }
            int r22 = r2 + 1;
            d.this.j.postAtTime(new a(r22 < d.this.l.size() ? d.this.l.get(r22) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.l0
        public void d(@h0 g gVar, @h0 MenuItem menuItem) {
            d.this.j.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0015d {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f92a;

        /* renamed from: b, reason: collision with root package name */
        public final g f93b;

        /* renamed from: c, reason: collision with root package name */
        public final int f94c;

        public C0015d(@h0 m0 m0Var, @h0 g gVar, int r3) {
            this.f92a = m0Var;
            this.f93b = gVar;
            this.f94c = r3;
        }

        public ListView a() {
            return this.f92a.A();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public d(@h0 Context context, @h0 View view, @androidx.annotation.f int r4, @t0 int r5, boolean z) {
        this.e = context;
        this.r = view;
        this.g = r4;
        this.h = r5;
        this.i = z;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.abc_config_prefDialogWidth));
        this.j = new Handler();
    }

    private m0 p() {
        m0 m0Var = new m0(this.e, null, this.g, this.h);
        m0Var.r0(this.o);
        m0Var.f0(this);
        m0Var.e0(this);
        m0Var.S(this.r);
        m0Var.W(this.q);
        m0Var.d0(true);
        m0Var.a0(2);
        return m0Var;
    }

    private int q(@h0 g gVar) {
        int size = this.l.size();
        for (int r1 = 0; r1 < size; r1++) {
            if (gVar == this.l.get(r1).f93b) {
                return r1;
            }
        }
        return -1;
    }

    private MenuItem r(@h0 g gVar, @h0 g gVar2) {
        int size = gVar.size();
        for (int r1 = 0; r1 < size; r1++) {
            MenuItem item = gVar.getItem(r1);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @i0
    private View s(@h0 C0015d c0015d, @h0 g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemR = r(c0015d.f93b, gVar);
        if (menuItemR == null) {
            return null;
        }
        ListView listViewA = c0015d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int r3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (r3 >= count) {
                r3 = -1;
                break;
            }
            if (menuItemR == fVar.getItem(r3)) {
                break;
            }
            r3++;
        }
        if (r3 != -1 && (firstVisiblePosition = (r3 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int t() {
        return f0.W(this.r) == 1 ? 0 : 1;
    }

    private int u(int r7) {
        List<C0015d> list = this.l;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] r1 = new int[2];
        listViewA.getLocationOnScreen(r1);
        Rect rect = new Rect();
        this.s.getWindowVisibleDisplayFrame(rect);
        return this.t == 1 ? (r1[0] + listViewA.getWidth()) + r7 > rect.right ? 0 : 1 : r1[0] - r7 < 0 ? 1 : 0;
    }

    private void v(@h0 g gVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0015d c0015d;
        View viewS;
        int r12;
        int r8;
        int r122;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.e);
        f fVar = new f(gVar, layoutInflaterFrom, this.i, E);
        if (!z() && this.y) {
            fVar.e(true);
        } else if (z()) {
            fVar.e(l.n(gVar));
        }
        int width = l.e(fVar, null, this.e, this.f);
        m0 m0VarP = p();
        m0VarP.n(fVar);
        m0VarP.U(width);
        m0VarP.W(this.q);
        if (this.l.size() > 0) {
            List<C0015d> list = this.l;
            c0015d = list.get(list.size() - 1);
            viewS = s(c0015d, gVar);
        } else {
            c0015d = null;
            viewS = null;
        }
        if (viewS != null) {
            m0VarP.s0(false);
            m0VarP.p0(null);
            int r82 = u(width);
            boolean z = r82 == 1;
            this.t = r82;
            if (Build.VERSION.SDK_INT >= 26) {
                m0VarP.S(viewS);
                r8 = 0;
                r12 = 0;
            } else {
                int[] r10 = new int[2];
                this.r.getLocationOnScreen(r10);
                int[] r83 = new int[2];
                viewS.getLocationOnScreen(r83);
                if ((this.q & 7) == 5) {
                    r10[0] = r10[0] + this.r.getWidth();
                    r83[0] = r83[0] + viewS.getWidth();
                }
                r12 = r83[0] - r10[0];
                r8 = r83[1] - r10[1];
            }
            if ((this.q & 5) == 5) {
                if (!z) {
                    width = viewS.getWidth();
                    r122 = r12 - width;
                }
                r122 = r12 + width;
            } else {
                if (z) {
                    width = viewS.getWidth();
                    r122 = r12 + width;
                }
                r122 = r12 - width;
            }
            m0VarP.i(r122);
            m0VarP.h0(true);
            m0VarP.g(r8);
        } else {
            if (this.u) {
                m0VarP.i(this.w);
            }
            if (this.v) {
                m0VarP.g(this.x);
            }
            m0VarP.X(d());
        }
        this.l.add(new C0015d(m0VarP, gVar, this.t));
        m0VarP.y();
        ListView listViewA = m0VarP.A();
        listViewA.setOnKeyListener(this);
        if (c0015d == null && this.z && gVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(a.j.abc_popup_menu_header_item_layout, (ViewGroup) listViewA, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.A());
            listViewA.addHeaderView(frameLayout, null, false);
            m0VarP.y();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView A() {
        if (this.l.isEmpty()) {
            return null;
        }
        return this.l.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.n
    public void L(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean M(s sVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (C0015d c0015d : this.l) {
            if (sVar == c0015d.f93b) {
                c0015d.a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        b(sVar);
        n.a aVar = this.A;
        if (aVar != null) {
            aVar.b(sVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void N(boolean z) {
        Iterator<C0015d> it = this.l.iterator();
        while (it.hasNext()) {
            l.o(it.next().a().getAdapter()).notifyDataSetChanged();
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
        this.A = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        int r0 = q(gVar);
        if (r0 < 0) {
            return;
        }
        int r1 = r0 + 1;
        if (r1 < this.l.size()) {
            this.l.get(r1).f93b.f(false);
        }
        C0015d c0015dRemove = this.l.remove(r0);
        c0015dRemove.f93b.S(this);
        if (this.D) {
            c0015dRemove.f92a.q0(null);
            c0015dRemove.f92a.T(0);
        }
        c0015dRemove.f92a.dismiss();
        int size = this.l.size();
        this.t = size > 0 ? this.l.get(size - 1).f94c : t();
        if (size != 0) {
            if (z) {
                this.l.get(0).f93b.f(false);
                return;
            }
            return;
        }
        dismiss();
        n.a aVar = this.A;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.B.removeGlobalOnLayoutListener(this.m);
            }
            this.B = null;
        }
        this.s.removeOnAttachStateChangeListener(this.n);
        this.C.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(g gVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gVar.c(this, this.e);
        if (z()) {
            v(gVar);
        } else {
            this.k.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    protected boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.l.size();
        if (size > 0) {
            C0015d[] c0015dArr = (C0015d[]) this.l.toArray(new C0015d[size]);
            for (int r0 = size - 1; r0 >= 0; r0--) {
                C0015d c0015d = c0015dArr[r0];
                if (c0015d.f92a.z()) {
                    c0015d.f92a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void f(@h0 View view) {
        if (this.r != view) {
            this.r = view;
            this.q = b.i.p.h.d(this.p, f0.W(view));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void h(boolean z) {
        this.y = z;
    }

    @Override // androidx.appcompat.view.menu.l
    public void i(int r2) {
        if (this.p != r2) {
            this.p = r2;
            this.q = b.i.p.h.d(r2, f0.W(this.r));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void j(int r2) {
        this.u = true;
        this.w = r2;
    }

    @Override // androidx.appcompat.view.menu.l
    public void k(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void l(boolean z) {
        this.z = z;
    }

    @Override // androidx.appcompat.view.menu.l
    public void m(int r2) {
        this.v = true;
        this.x = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0015d c0015d;
        int size = this.l.size();
        int r2 = 0;
        while (true) {
            if (r2 >= size) {
                c0015d = null;
                break;
            }
            c0015d = this.l.get(r2);
            if (!c0015d.f92a.z()) {
                break;
            } else {
                r2++;
            }
        }
        if (c0015d != null) {
            c0015d.f93b.f(false);
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
    public void y() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z()) {
            return;
        }
        Iterator<g> it = this.k.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        this.k.clear();
        View view = this.r;
        this.s = view;
        if (view != null) {
            boolean z = this.B == null;
            ViewTreeObserver viewTreeObserver = this.s.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.m);
            }
            this.s.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean z() {
        return this.l.size() > 0 && this.l.get(0).f92a.z();
    }
}
