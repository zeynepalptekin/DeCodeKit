package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.a;

/* loaded from: classes.dex */
abstract class a extends ViewGroup {
    private static final int l = 200;
    protected final b d;
    protected final Context e;
    protected ActionMenuView f;
    protected c g;
    protected int h;
    protected b.i.p.j0 i;
    private boolean j;
    private boolean k;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    class RunnableC0016a implements Runnable {
        RunnableC0016a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o();
        }
    }

    protected class b implements b.i.p.k0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f119a = false;

        /* renamed from: b, reason: collision with root package name */
        int f120b;

        protected b() {
        }

        @Override // b.i.p.k0
        public void a(View view) {
            this.f119a = true;
        }

        @Override // b.i.p.k0
        public void b(View view) {
            if (this.f119a) {
                return;
            }
            a aVar = a.this;
            aVar.i = null;
            a.super.setVisibility(this.f120b);
        }

        @Override // b.i.p.k0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f119a = false;
        }

        public b d(b.i.p.j0 j0Var, int r3) {
            a.this.i = j0Var;
            this.f120b = r3;
            return this;
        }
    }

    a(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    a(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r5) {
        super(context, attributeSet, r5);
        this.d = new b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.b.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.e = context;
        } else {
            this.e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int k(int r0, int r1, boolean z) {
        return z ? r0 - r1 : r0 + r1;
    }

    public void c(int r3) {
        n(r3, 200L).w();
    }

    public boolean d() {
        return i() && getVisibility() == 0;
    }

    public void e() {
        c cVar = this.g;
        if (cVar != null) {
            cVar.r();
        }
    }

    public boolean f() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.u();
        }
        return false;
    }

    public boolean g() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.w();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.i != null ? this.d.f120b : getVisibility();
    }

    public int getContentHeight() {
        return this.h;
    }

    public boolean h() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.x();
        }
        return false;
    }

    public boolean i() {
        c cVar = this.g;
        return cVar != null && cVar.y();
    }

    protected int j(View view, int r3, int r4, int r5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE), r4);
        return Math.max(0, (r3 - view.getMeasuredWidth()) - r5);
    }

    protected int l(View view, int r4, int r5, int r6, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int r52 = r5 + ((r6 - measuredHeight) / 2);
        if (z) {
            view.layout(r4 - measuredWidth, r52, r4, measuredHeight + r52);
        } else {
            view.layout(r4, r52, r4 + measuredWidth, measuredHeight + r52);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public void m() {
        post(new RunnableC0016a());
    }

    public b.i.p.j0 n(int r3, long j) {
        b.i.p.j0 j0VarA;
        b.i.p.j0 j0Var = this.i;
        if (j0Var != null) {
            j0Var.c();
        }
        if (r3 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            j0VarA = b.i.p.f0.f(this).a(1.0f);
        } else {
            j0VarA = b.i.p.f0.f(this).a(0.0f);
        }
        j0VarA.q(j);
        j0VarA.s(this.d.d(j0VarA, r3));
        return j0VarA;
    }

    public boolean o() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.G();
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.m.ActionBar, a.b.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(a.m.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.g;
        if (cVar != null) {
            cVar.z(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.k = false;
        }
        if (!this.k) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.k = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.k = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = false;
        }
        if (!this.j) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.j = false;
        }
        return true;
    }

    public void setContentHeight(int r1) {
        this.h = r1;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        if (r2 != getVisibility()) {
            b.i.p.j0 j0Var = this.i;
            if (j0Var != null) {
                j0Var.c();
            }
            super.setVisibility(r2);
        }
    }
}
