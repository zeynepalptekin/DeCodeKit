package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import b.a.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private static final String S = "Toolbar";
    private CharSequence A;
    private CharSequence B;
    private ColorStateList C;
    private ColorStateList D;
    private boolean E;
    private boolean F;
    private final ArrayList<View> G;
    private final ArrayList<View> H;
    private final int[] I;
    f J;
    private final ActionMenuView.e K;
    private b1 L;
    private androidx.appcompat.widget.c M;
    private d N;
    private n.a O;
    private g.a P;
    private boolean Q;
    private final Runnable R;
    private ActionMenuView d;
    private TextView e;
    private TextView f;
    private ImageButton g;
    private ImageView h;
    private Drawable i;
    private CharSequence j;
    ImageButton k;
    View l;
    private Context m;
    private int n;
    private int o;
    private int p;
    int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private q0 w;
    private int x;
    private int y;
    private int z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.J;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.n {
        androidx.appcompat.view.menu.g d;
        androidx.appcompat.view.menu.j e;

        d() {
        }

        @Override // androidx.appcompat.view.menu.n
        public int J() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public void K(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.d;
            if (gVar2 != null && (jVar = this.e) != null) {
                gVar2.g(jVar);
            }
            this.d = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void L(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean M(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public void N(boolean z) {
            if (this.e != null) {
                androidx.appcompat.view.menu.g gVar = this.d;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int r1 = 0;
                    while (true) {
                        if (r1 >= size) {
                            break;
                        }
                        if (this.d.getItem(r1) == this.e) {
                            z2 = true;
                            break;
                        }
                        r1++;
                    }
                }
                if (z2) {
                    return;
                }
                R(this.d, this.e);
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public androidx.appcompat.view.menu.o O(ViewGroup viewGroup) {
            return null;
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
        public boolean R(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            KeyEvent.Callback callback = Toolbar.this.l;
            if (callback instanceof b.a.f.c) {
                ((b.a.f.c) callback).h();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.l);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.k);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.l = null;
            toolbar3.a();
            this.e = null;
            Toolbar.this.requestLayout();
            jVar.t(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean S(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.k.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.k);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.k);
            }
            Toolbar.this.l = jVar.getActionView();
            this.e = jVar;
            ViewParent parent2 = Toolbar.this.l.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.l);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f36a = 8388611 | (toolbar4.q & 112);
                eVarGenerateDefaultLayoutParams.f118b = 2;
                toolbar4.l.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.l);
            }
            Toolbar.this.H();
            Toolbar.this.requestLayout();
            jVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.l;
            if (callback instanceof b.a.f.c) {
                ((b.a.f.c) callback).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public void T(n.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }
    }

    public static class e extends a.b {

        /* renamed from: c, reason: collision with root package name */
        static final int f117c = 0;
        static final int d = 1;
        static final int e = 2;

        /* renamed from: b, reason: collision with root package name */
        int f118b;

        public e(int r3) {
            this(-2, -1, r3);
        }

        public e(int r1, int r2) {
            super(r1, r2);
            this.f118b = 0;
            this.f36a = 8388627;
        }

        public e(int r1, int r2, int r3) {
            super(r1, r2);
            this.f118b = 0;
            this.f36a = r3;
        }

        public e(@androidx.annotation.h0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f118b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f118b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f118b = 0;
            a(marginLayoutParams);
        }

        public e(a.b bVar) {
            super(bVar);
            this.f118b = 0;
        }

        public e(e eVar) {
            super((a.b) eVar);
            this.f118b = 0;
            this.f118b = eVar.f118b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends b.k.b.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        int f;
        boolean g;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int r1) {
                return new g[r1];
            }
        }

        public g(Parcel parcel) {
            this(parcel, null);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public Toolbar(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public Toolbar(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.toolbarStyle);
    }

    public Toolbar(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r13) {
        super(context, attributeSet, r13);
        this.z = 8388627;
        this.G = new ArrayList<>();
        this.H = new ArrayList<>();
        this.I = new int[2];
        this.K = new a();
        this.R = new b();
        a1 a1VarG = a1.G(getContext(), attributeSet, a.m.Toolbar, r13, 0);
        b.i.p.f0.s1(this, context, a.m.Toolbar, attributeSet, a1VarG.B(), r13, 0);
        this.o = a1VarG.u(a.m.Toolbar_titleTextAppearance, 0);
        this.p = a1VarG.u(a.m.Toolbar_subtitleTextAppearance, 0);
        this.z = a1VarG.p(a.m.Toolbar_android_gravity, this.z);
        this.q = a1VarG.p(a.m.Toolbar_buttonGravity, 48);
        int r11 = a1VarG.f(a.m.Toolbar_titleMargin, 0);
        r11 = a1VarG.C(a.m.Toolbar_titleMargins) ? a1VarG.f(a.m.Toolbar_titleMargins, r11) : r11;
        this.v = r11;
        this.u = r11;
        this.t = r11;
        this.s = r11;
        int r112 = a1VarG.f(a.m.Toolbar_titleMarginStart, -1);
        if (r112 >= 0) {
            this.s = r112;
        }
        int r113 = a1VarG.f(a.m.Toolbar_titleMarginEnd, -1);
        if (r113 >= 0) {
            this.t = r113;
        }
        int r114 = a1VarG.f(a.m.Toolbar_titleMarginTop, -1);
        if (r114 >= 0) {
            this.u = r114;
        }
        int r115 = a1VarG.f(a.m.Toolbar_titleMarginBottom, -1);
        if (r115 >= 0) {
            this.v = r115;
        }
        this.r = a1VarG.g(a.m.Toolbar_maxButtonHeight, -1);
        int r116 = a1VarG.f(a.m.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int r132 = a1VarG.f(a.m.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int r1 = a1VarG.g(a.m.Toolbar_contentInsetLeft, 0);
        int r3 = a1VarG.g(a.m.Toolbar_contentInsetRight, 0);
        h();
        this.w.e(r1, r3);
        if (r116 != Integer.MIN_VALUE || r132 != Integer.MIN_VALUE) {
            this.w.g(r116, r132);
        }
        this.x = a1VarG.f(a.m.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.y = a1VarG.f(a.m.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.i = a1VarG.h(a.m.Toolbar_collapseIcon);
        this.j = a1VarG.x(a.m.Toolbar_collapseContentDescription);
        CharSequence charSequenceX = a1VarG.x(a.m.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceX)) {
            setTitle(charSequenceX);
        }
        CharSequence charSequenceX2 = a1VarG.x(a.m.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceX2)) {
            setSubtitle(charSequenceX2);
        }
        this.m = getContext();
        setPopupTheme(a1VarG.u(a.m.Toolbar_popupTheme, 0));
        Drawable drawableH = a1VarG.h(a.m.Toolbar_navigationIcon);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence charSequenceX3 = a1VarG.x(a.m.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceX3)) {
            setNavigationContentDescription(charSequenceX3);
        }
        Drawable drawableH2 = a1VarG.h(a.m.Toolbar_logo);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence charSequenceX4 = a1VarG.x(a.m.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceX4)) {
            setLogoDescription(charSequenceX4);
        }
        if (a1VarG.C(a.m.Toolbar_titleTextColor)) {
            setTitleTextColor(a1VarG.d(a.m.Toolbar_titleTextColor));
        }
        if (a1VarG.C(a.m.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a1VarG.d(a.m.Toolbar_subtitleTextColor));
        }
        if (a1VarG.C(a.m.Toolbar_menu)) {
            x(a1VarG.u(a.m.Toolbar_menu, 0));
        }
        a1VarG.I();
    }

    private int C(View view, int r6, int[] r7, int r8) {
        e eVar = (e) view.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - r7[0];
        int r62 = r6 + Math.max(0, r1);
        r7[0] = Math.max(0, -r1);
        int r72 = q(view, r8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(r62, r72, r62 + measuredWidth, view.getMeasuredHeight() + r72);
        return r62 + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int D(View view, int r7, int[] r8, int r9) {
        e eVar = (e) view.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - r8[1];
        int r72 = r7 - Math.max(0, r1);
        r8[1] = Math.max(0, -r1);
        int r82 = q(view, r9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(r72 - measuredWidth, r82, r72, view.getMeasuredHeight() + r82);
        return r72 - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int E(View view, int r9, int r10, int r11, int r12, int[] r13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int r1 = marginLayoutParams.leftMargin - r13[0];
        int r3 = marginLayoutParams.rightMargin - r13[1];
        int r5 = Math.max(0, r1) + Math.max(0, r3);
        r13[0] = Math.max(0, -r1);
        r13[1] = Math.max(0, -r3);
        view.measure(ViewGroup.getChildMeasureSpec(r9, getPaddingLeft() + getPaddingRight() + r5 + r10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(r11, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + r12, marginLayoutParams.height));
        return view.getMeasuredWidth() + r5;
    }

    private void F(View view, int r5, int r6, int r7, int r8, int r9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r5, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r7, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + r8, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && r9 >= 0) {
            if (mode != 0) {
                r9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), r9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(r9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        removeCallbacks(this.R);
        post(this.R);
    }

    private boolean P() {
        if (!this.Q) {
            return false;
        }
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int r7) {
        boolean z = b.i.p.f0.W(this) == 1;
        int childCount = getChildCount();
        int r72 = b.i.p.h.d(r7, b.i.p.f0.W(this));
        list.clear();
        if (!z) {
            for (int r1 = 0; r1 < childCount; r1++) {
                View childAt = getChildAt(r1);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f118b == 0 && Q(childAt) && p(eVar.f36a) == r72) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int r3 = childCount - 1; r3 >= 0; r3--) {
            View childAt2 = getChildAt(r3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f118b == 0 && Q(childAt2) && p(eVar2.f36a) == r72) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f118b = 1;
        if (!z || this.l == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.H.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new b.a.f.g(getContext());
    }

    private void h() {
        if (this.w == null) {
            this.w = new q0();
        }
    }

    private void i() {
        if (this.h == null) {
            this.h = new p(getContext());
        }
    }

    private void j() {
        k();
        if (this.d.R() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.d.getMenu();
            if (this.N == null) {
                this.N = new d();
            }
            this.d.setExpandedActionViewsExclusive(true);
            gVar.c(this.N, this.m);
        }
    }

    private void k() {
        if (this.d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.d = actionMenuView;
            actionMenuView.setPopupTheme(this.n);
            this.d.setOnMenuItemClickListener(this.K);
            this.d.S(this.O, this.P);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f36a = 8388613 | (this.q & 112);
            this.d.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.d, false);
        }
    }

    private void l() {
        if (this.g == null) {
            this.g = new n(getContext(), null, a.b.toolbarNavigationButtonStyle);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f36a = 8388611 | (this.q & 112);
            this.g.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int r5) {
        int r0 = b.i.p.f0.W(this);
        int r52 = b.i.p.h.d(r5, r0) & 7;
        return (r52 == 1 || r52 == 3 || r52 == 5) ? r52 : r0 == 1 ? 5 : 3;
    }

    private int q(View view, int r8) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int r82 = r8 > 0 ? (measuredHeight - r8) / 2 : 0;
        int r2 = r(eVar.f36a);
        if (r2 == 48) {
            return getPaddingTop() - r82;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - r82;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int r4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int r5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (r4 < r5) {
            r4 = r5;
        } else {
            int r3 = (((height - paddingBottom) - measuredHeight) - r4) - paddingTop;
            int r7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (r3 < r7) {
                r4 = Math.max(0, r4 - (r7 - r3));
            }
        }
        return paddingTop + r4;
    }

    private int r(int r2) {
        int r22 = r2 & 112;
        return (r22 == 16 || r22 == 48 || r22 == 80) ? r22 : this.z & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return b.i.p.m.c(marginLayoutParams) + b.i.p.m.b(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] r10) {
        int r1 = r10[0];
        int r102 = r10[1];
        int size = list.size();
        int r3 = 0;
        int measuredWidth = 0;
        while (r3 < size) {
            View view = list.get(r3);
            e eVar = (e) view.getLayoutParams();
            int r7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - r1;
            int r12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - r102;
            int r103 = Math.max(0, r7);
            int r6 = Math.max(0, r12);
            int r72 = Math.max(0, -r7);
            int r13 = Math.max(0, -r12);
            measuredWidth += r103 + view.getMeasuredWidth() + r6;
            r3++;
            r102 = r13;
            r1 = r72;
        }
        return measuredWidth;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.H.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.d;
        return actionMenuView != null && actionMenuView.N();
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean B() {
        Layout layout;
        TextView textView = this.e;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int r3 = 0; r3 < lineCount; r3++) {
            if (layout.getEllipsisCount(r3) > 0) {
                return true;
            }
        }
        return false;
    }

    void H() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f118b != 2 && childAt != this.d) {
                removeViewAt(childCount);
                this.H.add(childAt);
            }
        }
    }

    public void I(int r2, int r3) {
        h();
        this.w.e(r2, r3);
    }

    public void J(int r2, int r3) {
        h();
        this.w.g(r2, r3);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void K(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.d == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g gVarR = this.d.R();
        if (gVarR == gVar) {
            return;
        }
        if (gVarR != null) {
            gVarR.S(this.M);
            gVarR.S(this.N);
        }
        if (this.N == null) {
            this.N = new d();
        }
        cVar.A(true);
        if (gVar != null) {
            gVar.c(cVar, this.m);
            gVar.c(this.N, this.m);
        } else {
            cVar.K(this.m, null);
            this.N.K(this.m, null);
            cVar.N(true);
            this.N.N(true);
        }
        this.d.setPopupTheme(this.n);
        this.d.setPresenter(cVar);
        this.M = cVar;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void L(n.a aVar, g.a aVar2) {
        this.O = aVar;
        this.P = aVar2;
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null) {
            actionMenuView.S(aVar, aVar2);
        }
    }

    public void M(Context context, @androidx.annotation.t0 int r3) {
        this.p = r3;
        TextView textView = this.f;
        if (textView != null) {
            textView.setTextAppearance(context, r3);
        }
    }

    public void N(int r1, int r2, int r3, int r4) {
        this.s = r1;
        this.u = r2;
        this.t = r3;
        this.v = r4;
        requestLayout();
    }

    public void O(Context context, @androidx.annotation.t0 int r3) {
        this.o = r3;
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextAppearance(context, r3);
        }
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.d;
        return actionMenuView != null && actionMenuView.T();
    }

    void a() {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            addView(this.H.get(size));
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.d) != null && actionMenuView.O();
    }

    public void e() {
        d dVar = this.N;
        androidx.appcompat.view.menu.j jVar = dVar == null ? null : dVar.e;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null) {
            actionMenuView.F();
        }
    }

    void g() {
        if (this.k == null) {
            n nVar = new n(getContext(), null, a.b.toolbarNavigationButtonStyle);
            this.k = nVar;
            nVar.setImageDrawable(this.i);
            this.k.setContentDescription(this.j);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f36a = 8388611 | (this.q & 112);
            eVarGenerateDefaultLayoutParams.f118b = 2;
            this.k.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.k.setOnClickListener(new c());
        }
    }

    @androidx.annotation.i0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.k;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.i0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.k;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        q0 q0Var = this.w;
        if (q0Var != null) {
            return q0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int r0 = this.y;
        return r0 != Integer.MIN_VALUE ? r0 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        q0 q0Var = this.w;
        if (q0Var != null) {
            return q0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        q0 q0Var = this.w;
        if (q0Var != null) {
            return q0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        q0 q0Var = this.w;
        if (q0Var != null) {
            return q0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int r0 = this.x;
        return r0 != Integer.MIN_VALUE ? r0 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarR;
        ActionMenuView actionMenuView = this.d;
        return actionMenuView != null && (gVarR = actionMenuView.R()) != null && gVarR.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.y, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return b.i.p.f0.W(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return b.i.p.f0.W(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.h;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.h;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.d.getMenu();
    }

    @androidx.annotation.i0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.i0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.M;
    }

    @androidx.annotation.i0
    public Drawable getOverflowIcon() {
        j();
        return this.d.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.m;
    }

    public int getPopupTheme() {
        return this.n;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.TESTS})
    final TextView getSubtitleTextView() {
        return this.f;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public int getTitleMarginBottom() {
        return this.v;
    }

    public int getTitleMarginEnd() {
        return this.t;
    }

    public int getTitleMarginStart() {
        return this.s;
    }

    public int getTitleMarginTop() {
        return this.u;
    }

    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.TESTS})
    final TextView getTitleTextView() {
        return this.e;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public e0 getWrapper() {
        if (this.L == null) {
            this.L = new b1(this, true);
        }
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.b ? new e((a.b) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0299 A[LOOP:0: B:109:0x0297->B:110:0x0299, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bb A[LOOP:1: B:112:0x02b9->B:113:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f4 A[LOOP:2: B:121:0x02f2->B:122:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) throws java.lang.NoSuchFieldException {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int r17, int r18) {
        char c2;
        char c3;
        int measuredWidth;
        int r12;
        int r13;
        int measuredWidth2;
        int r6;
        int r132;
        int measuredHeight;
        int[] r8 = this.I;
        if (g1.b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (Q(this.g)) {
            F(this.g, r17, 0, r18, 0, this.r);
            measuredWidth = this.g.getMeasuredWidth() + s(this.g);
            r12 = Math.max(0, this.g.getMeasuredHeight() + t(this.g));
            r13 = View.combineMeasuredStates(0, this.g.getMeasuredState());
        } else {
            measuredWidth = 0;
            r12 = 0;
            r13 = 0;
        }
        if (Q(this.k)) {
            F(this.k, r17, 0, r18, 0, this.r);
            measuredWidth = this.k.getMeasuredWidth() + s(this.k);
            r12 = Math.max(r12, this.k.getMeasuredHeight() + t(this.k));
            r13 = View.combineMeasuredStates(r13, this.k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int r14 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        r8[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.d)) {
            F(this.d, r17, r14, r18, 0, this.r);
            measuredWidth2 = this.d.getMeasuredWidth() + s(this.d);
            r12 = Math.max(r12, this.d.getMeasuredHeight() + t(this.d));
            r13 = View.combineMeasuredStates(r13, this.d.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int r142 = r14 + Math.max(currentContentInsetEnd, measuredWidth2);
        r8[c3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.l)) {
            r142 += E(this.l, r17, r142, r18, 0, r8);
            r12 = Math.max(r12, this.l.getMeasuredHeight() + t(this.l));
            r13 = View.combineMeasuredStates(r13, this.l.getMeasuredState());
        }
        if (Q(this.h)) {
            r142 += E(this.h, r17, r142, r18, 0, r8);
            r12 = Math.max(r12, this.h.getMeasuredHeight() + t(this.h));
            r13 = View.combineMeasuredStates(r13, this.h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int r11 = 0; r11 < childCount; r11++) {
            View childAt = getChildAt(r11);
            if (((e) childAt.getLayoutParams()).f118b == 0 && Q(childAt)) {
                r142 += E(childAt, r17, r142, r18, 0, r8);
                r12 = Math.max(r12, childAt.getMeasuredHeight() + t(childAt));
                r13 = View.combineMeasuredStates(r13, childAt.getMeasuredState());
            }
        }
        int r10 = this.u + this.v;
        int r112 = this.s + this.t;
        if (Q(this.e)) {
            E(this.e, r17, r142 + r112, r18, r10, r8);
            int measuredWidth3 = this.e.getMeasuredWidth() + s(this.e);
            measuredHeight = this.e.getMeasuredHeight() + t(this.e);
            r6 = View.combineMeasuredStates(r13, this.e.getMeasuredState());
            r132 = measuredWidth3;
        } else {
            r6 = r13;
            r132 = 0;
            measuredHeight = 0;
        }
        if (Q(this.f)) {
            r132 = Math.max(r132, E(this.f, r17, r142 + r112, r18, measuredHeight + r10, r8));
            measuredHeight += this.f.getMeasuredHeight() + t(this.f);
            r6 = View.combineMeasuredStates(r6, this.f.getMeasuredState());
        }
        int r0 = Math.max(r12, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(r142 + r132 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), r17, (-16777216) & r6), P() ? 0 : View.resolveSizeAndState(Math.max(r0 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), r18, r6 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.d;
        androidx.appcompat.view.menu.g gVarR = actionMenuView != null ? actionMenuView.R() : null;
        int r1 = gVar.f;
        if (r1 != 0 && this.N != null && gVarR != null && (menuItemFindItem = gVarR.findItem(r1)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.g) {
            G();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(r3);
        }
        h();
        this.w.f(r3 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.N;
        if (dVar != null && (jVar = dVar.e) != null) {
            gVar.f = jVar.getItemId();
        }
        gVar.g = A();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    public void setCollapseContentDescription(@androidx.annotation.s0 int r2) {
        setCollapseContentDescription(r2 != 0 ? getContext().getText(r2) : null);
    }

    public void setCollapseContentDescription(@androidx.annotation.i0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.k;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@androidx.annotation.q int r2) {
        setCollapseIcon(b.a.b.a.a.d(getContext(), r2));
    }

    public void setCollapseIcon(@androidx.annotation.i0 Drawable drawable) {
        if (drawable != null) {
            g();
            this.k.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.k;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.i);
            }
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.Q = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int r2) {
        if (r2 < 0) {
            r2 = Integer.MIN_VALUE;
        }
        if (r2 != this.y) {
            this.y = r2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int r2) {
        if (r2 < 0) {
            r2 = Integer.MIN_VALUE;
        }
        if (r2 != this.x) {
            this.x = r2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@androidx.annotation.q int r2) {
        setLogo(b.a.b.a.a.d(getContext(), r2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.h)) {
                c(this.h, true);
            }
        } else {
            ImageView imageView = this.h;
            if (imageView != null && y(imageView)) {
                removeView(this.h);
                this.H.remove(this.h);
            }
        }
        ImageView imageView2 = this.h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@androidx.annotation.s0 int r2) {
        setLogoDescription(getContext().getText(r2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@androidx.annotation.s0 int r2) {
        setNavigationContentDescription(r2 != 0 ? getContext().getText(r2) : null);
    }

    public void setNavigationContentDescription(@androidx.annotation.i0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@androidx.annotation.q int r2) {
        setNavigationIcon(b.a.b.a.a.d(getContext(), r2));
    }

    public void setNavigationIcon(@androidx.annotation.i0 Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.g)) {
                c(this.g, true);
            }
        } else {
            ImageButton imageButton = this.g;
            if (imageButton != null && y(imageButton)) {
                removeView(this.g);
                this.H.remove(this.g);
            }
        }
        ImageButton imageButton2 = this.g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.J = fVar;
    }

    public void setOverflowIcon(@androidx.annotation.i0 Drawable drawable) {
        j();
        this.d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@androidx.annotation.t0 int r3) {
        if (this.n != r3) {
            this.n = r3;
            if (r3 == 0) {
                this.m = getContext();
            } else {
                this.m = new ContextThemeWrapper(getContext(), r3);
            }
        }
    }

    public void setSubtitle(@androidx.annotation.s0 int r2) {
        setSubtitle(getContext().getText(r2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f;
            if (textView != null && y(textView)) {
                removeView(this.f);
                this.H.remove(this.f);
            }
        } else {
            if (this.f == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f = a0Var;
                a0Var.setSingleLine();
                this.f.setEllipsize(TextUtils.TruncateAt.END);
                int r1 = this.p;
                if (r1 != 0) {
                    this.f.setTextAppearance(context, r1);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f.setTextColor(colorStateList);
                }
            }
            if (!y(this.f)) {
                c(this.f, true);
            }
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setSubtitleTextColor(@androidx.annotation.k int r1) {
        setSubtitleTextColor(ColorStateList.valueOf(r1));
    }

    public void setSubtitleTextColor(@androidx.annotation.h0 ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(@androidx.annotation.s0 int r2) {
        setTitle(getContext().getText(r2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.e;
            if (textView != null && y(textView)) {
                removeView(this.e);
                this.H.remove(this.e);
            }
        } else {
            if (this.e == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.e = a0Var;
                a0Var.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int r1 = this.o;
                if (r1 != 0) {
                    this.e.setTextAppearance(context, r1);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!y(this.e)) {
                c(this.e, true);
            }
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setTitleMarginBottom(int r1) {
        this.v = r1;
        requestLayout();
    }

    public void setTitleMarginEnd(int r1) {
        this.t = r1;
        requestLayout();
    }

    public void setTitleMarginStart(int r1) {
        this.s = r1;
        requestLayout();
    }

    public void setTitleMarginTop(int r1) {
        this.u = r1;
        requestLayout();
    }

    public void setTitleTextColor(@androidx.annotation.k int r1) {
        setTitleTextColor(ColorStateList.valueOf(r1));
    }

    public void setTitleTextColor(@androidx.annotation.h0 ColorStateList colorStateList) {
        this.C = colorStateList;
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.N;
        return (dVar == null || dVar.e == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.d;
        return actionMenuView != null && actionMenuView.L();
    }

    public void x(@androidx.annotation.f0 int r3) {
        getMenuInflater().inflate(r3, getMenu());
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean z() {
        ActionMenuView actionMenuView = this.d;
        return actionMenuView != null && actionMenuView.M();
    }
}
