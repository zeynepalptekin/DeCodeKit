package c.a.b.c.d;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.o;
import androidx.annotation.p;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.w;
import androidx.annotation.x0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.a1;
import b.i.p.f0;
import b.i.p.o0;
import c.a.b.c.a;
import c.a.b.c.u.j;
import c.a.b.c.u.k;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;

/* loaded from: classes.dex */
public class e extends FrameLayout {
    private static final int k = a.n.Widget_Design_BottomNavigationView;
    private static final int l = 1;

    @h0
    private final g d;

    @h0
    @x0
    final c.a.b.c.d.c e;
    private final c.a.b.c.d.d f;

    @i0
    private ColorStateList g;
    private MenuInflater h;
    private d i;
    private c j;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, @h0 MenuItem menuItem) {
            if (e.this.j == null || menuItem.getItemId() != e.this.getSelectedItemId()) {
                return (e.this.i == null || e.this.i.a(menuItem)) ? false : true;
            }
            e.this.j.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    class b implements z.e {
        b() {
        }

        @Override // com.google.android.material.internal.z.e
        @h0
        public o0 a(View view, @h0 o0 o0Var, @h0 z.f fVar) {
            fVar.d += o0Var.l();
            fVar.a(view);
            return o0Var;
        }
    }

    public interface c {
        void a(@h0 MenuItem menuItem);
    }

    public interface d {
        boolean a(@h0 MenuItem menuItem);
    }

    /* renamed from: c.a.b.c.d.e$e, reason: collision with other inner class name */
    static class C0137e extends b.k.b.a {
        public static final Parcelable.Creator<C0137e> CREATOR = new a();

        @i0
        Bundle f;

        /* renamed from: c.a.b.c.d.e$e$a */
        static class a implements Parcelable.ClassLoaderCreator<C0137e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0137e createFromParcel(@h0 Parcel parcel) {
                return new C0137e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0137e createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new C0137e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0137e[] newArray(int r1) {
                return new C0137e[r1];
            }
        }

        public C0137e(@h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? C0137e.class.getClassLoader() : classLoader);
        }

        public C0137e(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@h0 Parcel parcel, ClassLoader classLoader) {
            this.f = parcel.readBundle(classLoader);
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeBundle(this.f);
        }
    }

    public e(@h0 Context context) {
        this(context, null);
    }

    public e(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.bottomNavigationStyle);
    }

    public e(@h0 Context context, @i0 AttributeSet attributeSet, int r12) throws Resources.NotFoundException {
        c.a.b.c.d.c cVar;
        ColorStateList colorStateListE;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r12, k), attributeSet, r12);
        this.f = new c.a.b.c.d.d();
        Context context2 = getContext();
        this.d = new c.a.b.c.d.b(context2);
        this.e = new c.a.b.c.d.c(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.e.setLayoutParams(layoutParams);
        this.f.b(this.e);
        this.f.c(1);
        this.e.setPresenter(this.f);
        this.d.b(this.f);
        this.f.K(getContext(), this.d);
        a1 a1VarK = s.k(context2, attributeSet, a.o.BottomNavigationView, r12, a.n.Widget_Design_BottomNavigationView, a.o.BottomNavigationView_itemTextAppearanceInactive, a.o.BottomNavigationView_itemTextAppearanceActive);
        if (a1VarK.C(a.o.BottomNavigationView_itemIconTint)) {
            cVar = this.e;
            colorStateListE = a1VarK.d(a.o.BottomNavigationView_itemIconTint);
        } else {
            cVar = this.e;
            colorStateListE = cVar.e(R.attr.textColorSecondary);
        }
        cVar.setIconTintList(colorStateListE);
        setItemIconSize(a1VarK.g(a.o.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(a.f.design_bottom_navigation_icon_size)));
        if (a1VarK.C(a.o.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(a1VarK.u(a.o.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (a1VarK.C(a.o.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(a1VarK.u(a.o.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (a1VarK.C(a.o.BottomNavigationView_itemTextColor)) {
            setItemTextColor(a1VarK.d(a.o.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            f0.B1(this, e(context2));
        }
        if (a1VarK.C(a.o.BottomNavigationView_elevation)) {
            f0.G1(this, a1VarK.g(a.o.BottomNavigationView_elevation, 0));
        }
        androidx.core.graphics.drawable.a.o(getBackground().mutate(), c.a.b.c.r.c.b(context2, a1VarK, a.o.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(a1VarK.p(a.o.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(a1VarK.a(a.o.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int r122 = a1VarK.u(a.o.BottomNavigationView_itemBackground, 0);
        if (r122 != 0) {
            this.e.setItemBackgroundRes(r122);
        } else {
            setItemRippleColor(c.a.b.c.r.c.b(context2, a1VarK, a.o.BottomNavigationView_itemRippleColor));
        }
        if (a1VarK.C(a.o.BottomNavigationView_menu)) {
            h(a1VarK.u(a.o.BottomNavigationView_menu, 0));
        }
        a1VarK.I();
        addView(this.e, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            c(context2);
        }
        this.d.X(new a());
        d();
    }

    private void c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(b.i.c.c.e(context, a.e.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(a.f.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void d() {
        z.c(this, new b());
    }

    @h0
    private j e(Context context) {
        j jVar = new j();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            jVar.n0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        jVar.Y(context);
        return jVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.h == null) {
            this.h = new b.a.f.g(getContext());
        }
        return this.h;
    }

    @i0
    public c.a.b.c.c.a f(int r2) {
        return this.e.g(r2);
    }

    public c.a.b.c.c.a g(int r2) {
        return this.e.h(r2);
    }

    @i0
    public Drawable getItemBackground() {
        return this.e.getItemBackground();
    }

    @q
    @Deprecated
    public int getItemBackgroundResource() {
        return this.e.getItemBackgroundRes();
    }

    @p
    public int getItemIconSize() {
        return this.e.getItemIconSize();
    }

    @i0
    public ColorStateList getItemIconTintList() {
        return this.e.getIconTintList();
    }

    @i0
    public ColorStateList getItemRippleColor() {
        return this.g;
    }

    @t0
    public int getItemTextAppearanceActive() {
        return this.e.getItemTextAppearanceActive();
    }

    @t0
    public int getItemTextAppearanceInactive() {
        return this.e.getItemTextAppearanceInactive();
    }

    @i0
    public ColorStateList getItemTextColor() {
        return this.e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.e.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @h0
    public Menu getMenu() {
        return this.d;
    }

    @w
    public int getSelectedItemId() {
        return this.e.getSelectedItemId();
    }

    public void h(int r4) {
        this.f.d(true);
        getMenuInflater().inflate(r4, this.d);
        this.f.d(false);
        this.f.N(true);
    }

    public boolean i() {
        return this.e.i();
    }

    public void j(int r2) {
        this.e.l(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0137e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0137e c0137e = (C0137e) parcelable;
        super.onRestoreInstanceState(c0137e.a());
        this.d.U(c0137e.f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0137e c0137e = new C0137e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c0137e.f = bundle;
        this.d.W(bundle);
        return c0137e;
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        k.d(this, f);
    }

    public void setItemBackground(@i0 Drawable drawable) {
        this.e.setItemBackground(drawable);
        this.g = null;
    }

    public void setItemBackgroundResource(@q int r2) {
        this.e.setItemBackgroundRes(r2);
        this.g = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.e.i() != z) {
            this.e.setItemHorizontalTranslationEnabled(z);
            this.f.N(false);
        }
    }

    public void setItemIconSize(@p int r2) {
        this.e.setItemIconSize(r2);
    }

    public void setItemIconSizeRes(@o int r2) {
        setItemIconSize(getResources().getDimensionPixelSize(r2));
    }

    public void setItemIconTintList(@i0 ColorStateList colorStateList) {
        this.e.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(@i0 ColorStateList colorStateList) {
        if (this.g == colorStateList) {
            if (colorStateList != null || this.e.getItemBackground() == null) {
                return;
            }
            this.e.setItemBackground(null);
            return;
        }
        this.g = colorStateList;
        if (colorStateList == null) {
            this.e.setItemBackground(null);
            return;
        }
        ColorStateList colorStateListA = c.a.b.c.s.b.a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.e.setItemBackground(new RippleDrawable(colorStateListA, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable drawableR = androidx.core.graphics.drawable.a.r(gradientDrawable);
        androidx.core.graphics.drawable.a.o(drawableR, colorStateListA);
        this.e.setItemBackground(drawableR);
    }

    public void setItemTextAppearanceActive(@t0 int r2) {
        this.e.setItemTextAppearanceActive(r2);
    }

    public void setItemTextAppearanceInactive(@t0 int r2) {
        this.e.setItemTextAppearanceInactive(r2);
    }

    public void setItemTextColor(@i0 ColorStateList colorStateList) {
        this.e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int r2) {
        if (this.e.getLabelVisibilityMode() != r2) {
            this.e.setLabelVisibilityMode(r2);
            this.f.N(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@i0 c cVar) {
        this.j = cVar;
    }

    public void setOnNavigationItemSelectedListener(@i0 d dVar) {
        this.i = dVar;
    }

    public void setSelectedItemId(@w int r4) {
        MenuItem menuItemFindItem = this.d.findItem(r4);
        if (menuItemFindItem == null || this.d.P(menuItemFindItem, this.f, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
