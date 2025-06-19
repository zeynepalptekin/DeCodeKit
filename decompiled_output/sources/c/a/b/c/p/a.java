package c.a.b.c.p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.w;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.a1;
import b.a.a;
import b.i.p.f0;
import b.i.p.o0;
import c.a.b.c.a;
import c.a.b.c.u.j;
import c.a.b.c.u.k;
import c.a.b.c.u.o;
import com.google.android.material.internal.h;
import com.google.android.material.internal.i;
import com.google.android.material.internal.n;
import com.google.android.material.internal.s;

/* loaded from: classes.dex */
public class a extends n {
    private static final int[] p = {R.attr.state_checked};
    private static final int[] q = {-16842910};
    private static final int r = a.n.Widget_Design_NavigationView;
    private static final int s = 1;

    @h0
    private final h i;
    private final i j;
    c k;
    private final int l;
    private final int[] m;
    private MenuInflater n;
    private ViewTreeObserver.OnGlobalLayoutListener o;

    /* renamed from: c.a.b.c.p.a$a, reason: collision with other inner class name */
    class C0141a implements g.a {
        C0141a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            c cVar = a.this.k;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            a aVar = a.this;
            aVar.getLocationOnScreen(aVar.m);
            boolean z = a.this.m[1] == 0;
            a.this.j.q(z);
            a.this.setDrawTopInsetForeground(z);
            Activity activityA = com.google.android.material.internal.b.a(a.this.getContext());
            if (activityA == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            a.this.setDrawBottomInsetForeground((activityA.findViewById(R.id.content).getHeight() == a.this.getHeight()) && (Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0));
        }
    }

    public interface c {
        boolean a(@h0 MenuItem menuItem);
    }

    public static class d extends b.k.b.a {
        public static final Parcelable.Creator<d> CREATOR = new C0142a();

        @i0
        public Bundle f;

        /* renamed from: c.a.b.c.p.a$d$a, reason: collision with other inner class name */
        static class C0142a implements Parcelable.ClassLoaderCreator<d> {
            C0142a() {
            }

            @Override // android.os.Parcelable.Creator
            @i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@h0 Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int r1) {
                return new d[r1];
            }
        }

        public d(@h0 Parcel parcel, @i0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readBundle(classLoader);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeBundle(this.f);
        }
    }

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.navigationViewStyle);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r12) throws Resources.NotFoundException {
        int r0;
        boolean z;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r12, r), attributeSet, r12);
        this.j = new i();
        this.m = new int[2];
        Context context2 = getContext();
        this.i = new h(context2);
        a1 a1VarK = s.k(context2, attributeSet, a.o.NavigationView, r12, r, new int[0]);
        if (a1VarK.C(a.o.NavigationView_android_background)) {
            f0.B1(this, a1VarK.h(a.o.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            j jVar = new j();
            if (background instanceof ColorDrawable) {
                jVar.n0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            jVar.Y(context2);
            f0.B1(this, jVar);
        }
        if (a1VarK.C(a.o.NavigationView_elevation)) {
            setElevation(a1VarK.g(a.o.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(a1VarK.a(a.o.NavigationView_android_fitsSystemWindows, false));
        this.l = a1VarK.g(a.o.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListD = a1VarK.C(a.o.NavigationView_itemIconTint) ? a1VarK.d(a.o.NavigationView_itemIconTint) : e(R.attr.textColorSecondary);
        if (a1VarK.C(a.o.NavigationView_itemTextAppearance)) {
            r0 = a1VarK.u(a.o.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            r0 = 0;
            z = false;
        }
        if (a1VarK.C(a.o.NavigationView_itemIconSize)) {
            setItemIconSize(a1VarK.g(a.o.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListD2 = a1VarK.C(a.o.NavigationView_itemTextColor) ? a1VarK.d(a.o.NavigationView_itemTextColor) : null;
        if (!z && colorStateListD2 == null) {
            colorStateListD2 = e(R.attr.textColorPrimary);
        }
        Drawable drawableH = a1VarK.h(a.o.NavigationView_itemBackground);
        if (drawableH == null && h(a1VarK)) {
            drawableH = f(a1VarK);
        }
        if (a1VarK.C(a.o.NavigationView_itemHorizontalPadding)) {
            this.j.u(a1VarK.g(a.o.NavigationView_itemHorizontalPadding, 0));
        }
        int r5 = a1VarK.g(a.o.NavigationView_itemIconPadding, 0);
        setItemMaxLines(a1VarK.o(a.o.NavigationView_itemMaxLines, 1));
        this.i.X(new C0141a());
        this.j.s(1);
        this.j.K(context2, this.i);
        this.j.x(colorStateListD);
        this.j.B(getOverScrollMode());
        if (z) {
            this.j.z(r0);
        }
        this.j.A(colorStateListD2);
        this.j.t(drawableH);
        this.j.v(r5);
        this.i.b(this.j);
        addView((View) this.j.O(this));
        if (a1VarK.C(a.o.NavigationView_menu)) {
            j(a1VarK.u(a.o.NavigationView_menu, 0));
        }
        if (a1VarK.C(a.o.NavigationView_headerLayout)) {
            i(a1VarK.u(a.o.NavigationView_headerLayout, 0));
        }
        a1VarK.I();
        l();
    }

    @i0
    private ColorStateList e(int r10) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(r10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = b.a.b.a.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.b.colorPrimary, typedValue, true)) {
            return null;
        }
        int r0 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        return new ColorStateList(new int[][]{q, p, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(q, defaultColor), r0, defaultColor});
    }

    @h0
    private final Drawable f(@h0 a1 a1Var) {
        j jVar = new j(o.b(getContext(), a1Var.u(a.o.NavigationView_itemShapeAppearance, 0), a1Var.u(a.o.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        jVar.n0(c.a.b.c.r.c.b(getContext(), a1Var, a.o.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) jVar, a1Var.g(a.o.NavigationView_itemShapeInsetStart, 0), a1Var.g(a.o.NavigationView_itemShapeInsetTop, 0), a1Var.g(a.o.NavigationView_itemShapeInsetEnd, 0), a1Var.g(a.o.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.n == null) {
            this.n = new b.a.f.g(getContext());
        }
        return this.n;
    }

    private boolean h(@h0 a1 a1Var) {
        return a1Var.C(a.o.NavigationView_itemShapeAppearance) || a1Var.C(a.o.NavigationView_itemShapeAppearanceOverlay);
    }

    private void l() {
        this.o = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.o);
    }

    @Override // com.google.android.material.internal.n
    @p0({p0.a.LIBRARY_GROUP})
    protected void a(@h0 o0 o0Var) {
        this.j.d(o0Var);
    }

    public void d(@h0 View view) {
        this.j.c(view);
    }

    public View g(int r2) {
        return this.j.g(r2);
    }

    @i0
    public MenuItem getCheckedItem() {
        return this.j.e();
    }

    public int getHeaderCount() {
        return this.j.f();
    }

    @i0
    public Drawable getItemBackground() {
        return this.j.h();
    }

    @p
    public int getItemHorizontalPadding() {
        return this.j.i();
    }

    @p
    public int getItemIconPadding() {
        return this.j.j();
    }

    @i0
    public ColorStateList getItemIconTintList() {
        return this.j.m();
    }

    public int getItemMaxLines() {
        return this.j.k();
    }

    @i0
    public ColorStateList getItemTextColor() {
        return this.j.l();
    }

    @h0
    public Menu getMenu() {
        return this.i;
    }

    public View i(@c0 int r2) {
        return this.j.n(r2);
    }

    public void j(int r3) {
        this.j.C(true);
        getMenuInflater().inflate(r3, this.i);
        this.j.C(false);
        this.j.N(false);
    }

    public void k(@h0 View view) {
        this.j.p(view);
    }

    @Override // com.google.android.material.internal.n, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // com.google.android.material.internal.n, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.o);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.o);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
        int r42;
        int mode = View.MeasureSpec.getMode(r4);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                r42 = this.l;
            }
            super.onMeasure(r4, r5);
        }
        r42 = Math.min(View.MeasureSpec.getSize(r4), this.l);
        r4 = View.MeasureSpec.makeMeasureSpec(r42, 1073741824);
        super.onMeasure(r4, r5);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.i.U(dVar.f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f = bundle;
        this.i.W(bundle);
        return dVar;
    }

    public void setCheckedItem(@w int r2) {
        MenuItem menuItemFindItem = this.i.findItem(r2);
        if (menuItemFindItem != null) {
            this.j.r((androidx.appcompat.view.menu.j) menuItemFindItem);
        }
    }

    public void setCheckedItem(@h0 MenuItem menuItem) {
        MenuItem menuItemFindItem = this.i.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.j.r((androidx.appcompat.view.menu.j) menuItemFindItem);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        k.d(this, f);
    }

    public void setItemBackground(@i0 Drawable drawable) {
        this.j.t(drawable);
    }

    public void setItemBackgroundResource(@q int r2) {
        setItemBackground(b.i.c.c.h(getContext(), r2));
    }

    public void setItemHorizontalPadding(@p int r2) {
        this.j.u(r2);
    }

    public void setItemHorizontalPaddingResource(@androidx.annotation.o int r3) {
        this.j.u(getResources().getDimensionPixelSize(r3));
    }

    public void setItemIconPadding(@p int r2) {
        this.j.v(r2);
    }

    public void setItemIconPaddingResource(int r3) {
        this.j.v(getResources().getDimensionPixelSize(r3));
    }

    public void setItemIconSize(@p int r2) {
        this.j.w(r2);
    }

    public void setItemIconTintList(@i0 ColorStateList colorStateList) {
        this.j.x(colorStateList);
    }

    public void setItemMaxLines(int r2) {
        this.j.y(r2);
    }

    public void setItemTextAppearance(@t0 int r2) {
        this.j.z(r2);
    }

    public void setItemTextColor(@i0 ColorStateList colorStateList) {
        this.j.A(colorStateList);
    }

    public void setNavigationItemSelectedListener(@i0 c cVar) {
        this.k = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int r2) {
        super.setOverScrollMode(r2);
        i iVar = this.j;
        if (iVar != null) {
            iVar.B(r2);
        }
    }
}
