package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.i0;
import b.a.a;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends a0 implements o.a, View.OnClickListener, ActionMenuView.a {
    private static final String s = "ActionMenuItemView";
    private static final int t = 32;
    j h;
    private CharSequence i;
    private Drawable j;
    g.b k;
    private i0 l;
    b m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;

    private class a extends i0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.i0
        public q b() {
            b bVar = ActionMenuItemView.this.m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.i0
        protected boolean c() {
            q qVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.k;
            return bVar != null && bVar.a(actionMenuItemView.h) && (qVarB = b()) != null && qVarB.z();
        }
    }

    public static abstract class b {
        public abstract q a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int r6) {
        super(context, attributeSet, r6);
        Resources resources = context.getResources();
        this.n = i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ActionMenuItemView, r6, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }

    private boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int r1 = configuration.screenWidthDp;
        return r1 >= 480 || (r1 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void j() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.i);
        if (this.j != null && (!this.h.E() || (!this.n && !this.o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.i : null);
        CharSequence contentDescription = this.h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.h.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            c1.a(this, z3 ? null : this.h.getTitle());
        } else {
            c1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return h();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return h() && this.h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void f(boolean z, char c2) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(j jVar, int r2) {
        this.h = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.l(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.l == null) {
            this.l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.h;
    }

    public boolean h() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.k;
        if (bVar != null) {
            bVar.a(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n = i();
        j();
    }

    @Override // androidx.appcompat.widget.a0, android.widget.TextView, android.view.View
    protected void onMeasure(int r6, int r7) {
        int r1;
        boolean zH = h();
        if (zH && (r1 = this.q) >= 0) {
            super.setPadding(r1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(r6, r7);
        int mode = View.MeasureSpec.getMode(r6);
        int size = View.MeasureSpec.getSize(r6);
        int measuredWidth = getMeasuredWidth();
        int r62 = mode == Integer.MIN_VALUE ? Math.min(size, this.p) : this.p;
        if (mode != 1073741824 && this.p > 0 && measuredWidth < r62) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(r62, 1073741824), r7);
        }
        if (zH || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var;
        if (this.h.hasSubMenu() && (i0Var = this.l) != null && i0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.o != z) {
            this.o = z;
            j jVar = this.h;
            if (jVar != null) {
                jVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int r2 = this.r;
            if (intrinsicWidth > r2) {
                intrinsicHeight = (int) (intrinsicHeight * (r2 / intrinsicWidth));
                intrinsicWidth = r2;
            }
            int r22 = this.r;
            if (intrinsicHeight > r22) {
                intrinsicWidth = (int) (intrinsicWidth * (r22 / intrinsicHeight));
                intrinsicHeight = r22;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    public void setItemInvoker(g.b bVar) {
        this.k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
        this.q = r1;
        super.setPadding(r1, r2, r3, r4);
    }

    public void setPopupCallback(b bVar) {
        this.m = bVar;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        j();
    }
}
