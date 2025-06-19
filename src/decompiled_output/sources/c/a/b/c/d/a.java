package c.a.b.c.d;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.c1;
import androidx.core.widget.m;
import b.i.p.a0;
import b.i.p.f0;
import b.i.p.p0.d;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a extends FrameLayout implements o.a {
    public static final int s = -1;
    private static final int[] t = {R.attr.state_checked};
    private final int d;
    private float e;
    private float f;
    private float g;
    private int h;
    private boolean i;
    private ImageView j;
    private final TextView k;
    private final TextView l;
    private int m;

    @i0
    private j n;

    @i0
    private ColorStateList o;

    @i0
    private Drawable p;

    @i0
    private Drawable q;

    @i0
    private c.a.b.c.c.a r;

    /* renamed from: c.a.b.c.d.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0135a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0135a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            if (a.this.j.getVisibility() == 0) {
                a aVar = a.this;
                aVar.o(aVar.j);
            }
        }
    }

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4);
        this.m = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(a.k.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(a.g.design_bottom_navigation_item_background);
        this.d = resources.getDimensionPixelSize(a.f.design_bottom_navigation_margin);
        this.j = (ImageView) findViewById(a.h.icon);
        this.k = (TextView) findViewById(a.h.smallLabel);
        this.l = (TextView) findViewById(a.h.largeLabel);
        f0.K1(this.k, 2);
        f0.K1(this.l, 2);
        setFocusable(true);
        c(this.k.getTextSize(), this.l.getTextSize());
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0135a());
        }
    }

    private void c(float f, float f2) {
        this.e = f - f2;
        this.f = (f2 * 1.0f) / f;
        this.g = (f * 1.0f) / f2;
    }

    @i0
    private FrameLayout h(View view) {
        ImageView imageView = this.j;
        if (view == imageView && c.a.b.c.c.b.f1955a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean i() {
        return this.r != null;
    }

    private void k(@h0 View view, int r3, int r4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = r3;
        layoutParams.gravity = r4;
        view.setLayoutParams(layoutParams);
    }

    private void l(@h0 View view, float f, float f2, int r4) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(r4);
    }

    private void m(@i0 View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            c.a.b.c.c.b.a(this.r, view, h(view));
        }
    }

    private void n(@i0 View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                c.a.b.c.c.b.d(this.r, view, h(view));
            }
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(View view) {
        if (i()) {
            c.a.b.c.c.b.e(this.r, view, h(view));
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void f(boolean z, char c2) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(@h0 j jVar, int r2) {
        this.n = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        c1.a(this, !TextUtils.isEmpty(jVar.getTooltipText()) ? jVar.getTooltipText() : jVar.getTitle());
        setVisibility(jVar.isVisible() ? 0 : 8);
    }

    @i0
    c.a.b.c.c.a getBadge() {
        return this.r;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.n;
    }

    public int getItemPosition() {
        return this.m;
    }

    void j() {
        n(this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        j jVar = this.n;
        if (jVar != null && jVar.isCheckable() && this.n.isChecked()) {
            FrameLayout.mergeDrawableStates(r22, t);
        }
        return r22;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.a.b.c.c.a aVar = this.r;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.n.getTitle();
            if (!TextUtils.isEmpty(this.n.getContentDescription())) {
                title = this.n.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.r.m()));
        }
        b.i.p.p0.d dVarT1 = b.i.p.p0.d.T1(accessibilityNodeInfo);
        dVarT1.W0(d.c.h(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            dVarT1.U0(false);
            dVarT1.I0(d.a.j);
        }
        dVarT1.A1(getResources().getString(a.m.item_view_role_description));
    }

    void setBadge(@h0 c.a.b.c.c.a aVar) {
        this.r = aVar;
        ImageView imageView = this.j;
        if (imageView != null) {
            m(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[PHI: r0 r1
  0x008c: PHI (r0v10 android.widget.ImageView) = (r0v6 android.widget.ImageView), (r0v18 android.widget.ImageView) binds: [B:21:0x00ab, B:14:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r1v13 int) = (r1v11 int), (r1v21 int) binds: [B:21:0x00ab, B:14:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[PHI: r0 r1
  0x0095: PHI (r0v7 android.widget.ImageView) = (r0v6 android.widget.ImageView), (r0v18 android.widget.ImageView) binds: [B:21:0x00ab, B:14:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r1v12 int) = (r1v11 int), (r1v21 int) binds: [B:21:0x00ab, B:14:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.appcompat.view.menu.o.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.l
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.l
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.k
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.k
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.h
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto La3
            if (r0 == 0) goto L86
            r1 = 1
            if (r0 == r1) goto L57
            if (r0 == r2) goto L43
            goto Lb1
        L43:
            android.widget.ImageView r0 = r9.j
            int r1 = r9.d
            r9.k(r0, r1, r3)
            android.widget.TextView r0 = r9.l
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.k
            r0.setVisibility(r1)
            goto Lb1
        L57:
            if (r10 == 0) goto L72
        L59:
            android.widget.ImageView r0 = r9.j
            int r1 = r9.d
            float r1 = (float) r1
            float r2 = r9.e
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.k(r0, r1, r6)
            android.widget.TextView r0 = r9.l
            r9.l(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.k
            float r1 = r9.f
            r9.l(r0, r1, r1, r7)
            goto Lb1
        L72:
            android.widget.ImageView r0 = r9.j
            int r1 = r9.d
            r9.k(r0, r1, r6)
            android.widget.TextView r0 = r9.l
            float r1 = r9.g
            r9.l(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.k
            r9.l(r0, r8, r8, r5)
            goto Lb1
        L86:
            android.widget.ImageView r0 = r9.j
            int r1 = r9.d
            if (r10 == 0) goto L95
        L8c:
            r9.k(r0, r1, r6)
            android.widget.TextView r0 = r9.l
            r9.l(r0, r8, r8, r5)
            goto L9d
        L95:
            r9.k(r0, r1, r3)
            android.widget.TextView r0 = r9.l
            r9.l(r0, r4, r4, r7)
        L9d:
            android.widget.TextView r0 = r9.k
            r0.setVisibility(r7)
            goto Lb1
        La3:
            boolean r0 = r9.i
            if (r0 == 0) goto Lae
            android.widget.ImageView r0 = r9.j
            int r1 = r9.d
            if (r10 == 0) goto L95
            goto L8c
        Lae:
            if (r10 == 0) goto L72
            goto L59
        Lb1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.d.a.setChecked(boolean):void");
    }

    @Override // android.view.View, androidx.appcompat.view.menu.o.a
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.k.setEnabled(z);
        this.l.setEnabled(z);
        this.j.setEnabled(z);
        f0.Y1(this, z ? a0.c(getContext(), a0.e) : null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@i0 Drawable drawable) {
        if (drawable == this.p) {
            return;
        }
        this.p = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.q = drawable;
            ColorStateList colorStateList = this.o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
        }
        this.j.setImageDrawable(drawable);
    }

    public void setIconSize(int r2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.width = r2;
        layoutParams.height = r2;
        this.j.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.o = colorStateList;
        if (this.n == null || (drawable = this.q) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        this.q.invalidateSelf();
    }

    public void setItemBackground(int r2) {
        setItemBackground(r2 == 0 ? null : b.i.c.c.h(getContext(), r2));
    }

    public void setItemBackground(@i0 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        f0.B1(this, drawable);
    }

    public void setItemPosition(int r1) {
        this.m = r1;
    }

    public void setLabelVisibilityMode(int r2) {
        if (this.h != r2) {
            this.h = r2;
            if (this.n != null) {
                setChecked(this.n.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (this.n != null) {
                setChecked(this.n.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@t0 int r2) {
        m.E(this.l, r2);
        c(this.k.getTextSize(), this.l.getTextSize());
    }

    public void setTextAppearanceInactive(@t0 int r2) {
        m.E(this.k, r2);
        c(this.k.getTextSize(), this.l.getTextSize());
    }

    public void setTextColor(@i0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.k.setTextColor(colorStateList);
            this.l.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.k.setText(charSequence);
        this.l.setText(charSequence);
        j jVar = this.n;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.n;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.n.getTooltipText();
        }
        c1.a(this, charSequence);
    }
}
