package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import b.a.a;
import b.i.p.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.b implements b.a {
    private static final String H = "ActionMenuPresenter";
    private final SparseBooleanArray A;
    e B;
    a C;
    RunnableC0017c D;
    private b E;
    final f F;
    int G;
    d n;
    private Drawable o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    private class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view) {
            super(context, sVar, view, false, a.b.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.j) sVar.getItem()).o()) {
                View view2 = c.this.n;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).l : view2);
            }
            a(c.this.F);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void g() {
            c cVar = c.this;
            cVar.C = null;
            cVar.G = 0;
            super.g();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.q a() {
            a aVar = c.this.C;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0017c implements Runnable {
        private e d;

        public RunnableC0017c(e eVar) {
            this.d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f != null) {
                ((androidx.appcompat.view.menu.b) c.this).f.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).l;
            if (view != null && view.getWindowToken() != null && this.d.o()) {
                c.this.B = this.d;
            }
            c.this.D = null;
        }
    }

    private class d extends p implements ActionMenuView.a {

        class a extends i0 {
            final /* synthetic */ c m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.m = cVar;
            }

            @Override // androidx.appcompat.widget.i0
            public androidx.appcompat.view.menu.q b() {
                e eVar = c.this.B;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // androidx.appcompat.widget.i0
            public boolean c() {
                c.this.G();
                return true;
            }

            @Override // androidx.appcompat.widget.i0
            public boolean d() {
                c cVar = c.this;
                if (cVar.D != null) {
                    return false;
                }
                cVar.u();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.b.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.G();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int r5, int r6, int r7, int r8) {
            boolean frame = super.setFrame(r5, r6, r7, r8);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int r0 = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - r0, paddingTop - r0, paddingLeft + r0, paddingTop + r0);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, a.b.actionOverflowMenuStyle);
            j(b.i.p.h.f1199c);
            a(c.this.F);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void g() {
            if (((androidx.appcompat.view.menu.b) c.this).f != null) {
                ((androidx.appcompat.view.menu.b) c.this).f.close();
            }
            c.this.B = null;
            super.g();
        }
    }

    private class f implements n.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof androidx.appcompat.view.menu.s) {
                gVar.G().f(false);
            }
            n.a aVarG = c.this.g();
            if (aVarG != null) {
                aVarG.a(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f) {
                return false;
            }
            c.this.G = ((androidx.appcompat.view.menu.s) gVar).getItem().getItemId();
            n.a aVarG = c.this.g();
            if (aVarG != null) {
                return aVarG.b(gVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int d;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int r1) {
                return new g[r1];
            }
        }

        g() {
        }

        g(Parcel parcel) {
            this.d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            parcel.writeInt(this.d);
        }
    }

    public c(Context context) {
        super(context, a.j.abc_action_menu_layout, a.j.abc_action_menu_item_layout);
        this.A = new SparseBooleanArray();
        this.F = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View s(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt = viewGroup.getChildAt(r3);
            if ((childAt instanceof o.a) && ((o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public void A(boolean z) {
        this.y = z;
    }

    public void B(int r1) {
        this.u = r1;
        this.v = true;
    }

    public void C(ActionMenuView actionMenuView) {
        this.l = actionMenuView;
        actionMenuView.c(this.f);
    }

    public void D(Drawable drawable) {
        d dVar = this.n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.p = true;
            this.o = drawable;
        }
    }

    public void E(boolean z) {
        this.q = z;
        this.r = true;
    }

    public void F(int r1, boolean z) {
        this.s = r1;
        this.w = z;
        this.x = true;
    }

    public boolean G() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.q || x() || (gVar = this.f) == null || this.l == null || this.D != null || gVar.C().isEmpty()) {
            return false;
        }
        RunnableC0017c runnableC0017c = new RunnableC0017c(new e(this.e, this.f, this.n, true));
        this.D = runnableC0017c;
        ((View) this.l).post(runnableC0017c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void K(@androidx.annotation.h0 Context context, @androidx.annotation.i0 androidx.appcompat.view.menu.g gVar) {
        super.K(context, gVar);
        Resources resources = context.getResources();
        b.a.f.a aVarB = b.a.f.a.b(context);
        if (!this.r) {
            this.q = aVarB.h();
        }
        if (!this.x) {
            this.s = aVarB.c();
        }
        if (!this.v) {
            this.u = aVarB.d();
        }
        int measuredWidth = this.s;
        if (this.q) {
            if (this.n == null) {
                d dVar = new d(this.d);
                this.n = dVar;
                if (this.p) {
                    dVar.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int r0 = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(r0, r0);
            }
            measuredWidth -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = measuredWidth;
        this.z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.n
    public void L(Parcelable parcelable) {
        int r2;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (r2 = ((g) parcelable).d) > 0 && (menuItemFindItem = this.f.findItem(r2)) != null) {
            M((androidx.appcompat.view.menu.s) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean M(androidx.appcompat.view.menu.s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.s sVar2 = sVar;
        while (sVar2.n0() != this.f) {
            sVar2 = (androidx.appcompat.view.menu.s) sVar2.n0();
        }
        View viewS = s(sVar2.getItem());
        if (viewS == null) {
            return false;
        }
        this.G = sVar.getItem().getItemId();
        int size = sVar.size();
        int r3 = 0;
        while (true) {
            if (r3 >= size) {
                break;
            }
            MenuItem item = sVar.getItem(r3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            r3++;
        }
        a aVar = new a(this.e, sVar, viewS);
        this.C = aVar;
        aVar.i(z);
        this.C.l();
        super.M(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void N(boolean z) {
        super.N(z);
        ((View) this.l).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> arrayListV = gVar.v();
            int size = arrayListV.size();
            for (int r2 = 0; r2 < size; r2++) {
                b.i.p.b bVarB = arrayListV.get(r2).b();
                if (bVarB != null) {
                    bVarB.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f;
        ArrayList<androidx.appcompat.view.menu.j> arrayListC = gVar2 != null ? gVar2.C() : null;
        if (this.q && arrayListC != null) {
            int size2 = arrayListC.size();
            if (size2 == 1) {
                z2 = !arrayListC.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        d dVar = this.n;
        if (z2) {
            if (dVar == null) {
                this.n = new d(this.d);
            }
            ViewGroup viewGroup = (ViewGroup) this.n.getParent();
            if (viewGroup != this.l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.l;
                actionMenuView.addView(this.n, actionMenuView.J());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.l;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.l).setOverflowReserved(this.q);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o O(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o oVar = this.l;
        androidx.appcompat.view.menu.o oVarO = super.O(viewGroup);
        if (oVar != oVarO) {
            ((ActionMenuView) oVarO).setPresenter(this);
        }
        return oVarO;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean P() {
        ArrayList<androidx.appcompat.view.menu.j> arrayListH;
        int size;
        int r10;
        int r11;
        int r17;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f;
        View view = null;
        int r3 = 0;
        if (gVar != null) {
            arrayListH = gVar.H();
            size = arrayListH.size();
        } else {
            arrayListH = null;
            size = 0;
        }
        int r5 = cVar.u;
        int r6 = cVar.t;
        int r7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.l;
        boolean z = false;
        int r112 = 0;
        int r12 = 0;
        for (int r9 = 0; r9 < size; r9++) {
            androidx.appcompat.view.menu.j jVar = arrayListH.get(r9);
            if (jVar.d()) {
                r112++;
            } else if (jVar.q()) {
                r12++;
            } else {
                z = true;
            }
            if (cVar.y && jVar.isActionViewExpanded()) {
                r5 = 0;
            }
        }
        if (cVar.q && (z || r12 + r112 > r5)) {
            r5--;
        }
        int r52 = r5 - r112;
        SparseBooleanArray sparseBooleanArray = cVar.A;
        sparseBooleanArray.clear();
        if (cVar.w) {
            int r102 = cVar.z;
            r11 = r6 / r102;
            r10 = r102 + ((r6 % r102) / r11);
        } else {
            r10 = 0;
            r11 = 0;
        }
        int r122 = 0;
        int r14 = 0;
        while (r122 < size) {
            androidx.appcompat.view.menu.j jVar2 = arrayListH.get(r122);
            if (jVar2.d()) {
                View viewH = cVar.h(jVar2, view, viewGroup);
                if (cVar.w) {
                    r11 -= ActionMenuView.P(viewH, r10, r11, r7, r3);
                } else {
                    viewH.measure(r7, r7);
                }
                int measuredWidth = viewH.getMeasuredWidth();
                r6 -= measuredWidth;
                if (r14 == 0) {
                    r14 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.x(true);
                r17 = size;
            } else if (jVar2.q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (r52 > 0 || z2) && r6 > 0 && (!cVar.w || r11 > 0);
                boolean z4 = z3;
                r17 = size;
                if (z3) {
                    View viewH2 = cVar.h(jVar2, null, viewGroup);
                    if (cVar.w) {
                        int r19 = ActionMenuView.P(viewH2, r10, r11, r7, 0);
                        r11 -= r19;
                        if (r19 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewH2.measure(r7, r7);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewH2.getMeasuredWidth();
                    r6 -= measuredWidth2;
                    if (r14 == 0) {
                        r14 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.w ? r6 + r14 <= 0 : r6 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int r4 = 0; r4 < r122; r4++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayListH.get(r4);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.o()) {
                                r52++;
                            }
                            jVar3.x(false);
                        }
                    }
                }
                if (z3) {
                    r52--;
                }
                jVar2.x(z3);
            } else {
                r17 = size;
                jVar2.x(false);
                r122++;
                view = null;
                cVar = this;
                size = r17;
                r3 = 0;
            }
            r122++;
            view = null;
            cVar = this;
            size = r17;
            r3 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable Q() {
        g gVar = new g();
        gVar.d = this.G;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        r();
        super.a(gVar, z);
    }

    @Override // b.i.p.b.a
    public void b(boolean z) {
        if (z) {
            super.M(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f;
        if (gVar != null) {
            gVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public void d(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        aVar.g(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.l);
        if (this.E == null) {
            this.E = new b();
        }
        actionMenuItemView.setPopupCallback(this.E);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean f(ViewGroup viewGroup, int r4) {
        if (viewGroup.getChildAt(r4) == this.n) {
            return false;
        }
        return super.f(viewGroup, r4);
    }

    @Override // androidx.appcompat.view.menu.b
    public View h(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.m()) {
            actionView = super.h(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean j(int r1, androidx.appcompat.view.menu.j jVar) {
        return jVar.o();
    }

    public boolean r() {
        return u() | v();
    }

    public Drawable t() {
        d dVar = this.n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.p) {
            return this.o;
        }
        return null;
    }

    public boolean u() {
        Object obj;
        RunnableC0017c runnableC0017c = this.D;
        if (runnableC0017c != null && (obj = this.l) != null) {
            ((View) obj).removeCallbacks(runnableC0017c);
            this.D = null;
            return true;
        }
        e eVar = this.B;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    public boolean v() {
        a aVar = this.C;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    public boolean w() {
        return this.D != null || x();
    }

    public boolean x() {
        e eVar = this.B;
        return eVar != null && eVar.f();
    }

    public boolean y() {
        return this.q;
    }

    public void z(Configuration configuration) {
        if (!this.v) {
            this.u = b.a.f.a.b(this.e).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f;
        if (gVar != null) {
            gVar.N(true);
        }
    }
}
