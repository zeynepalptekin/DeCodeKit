package b.i.p.p0;

import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.h0;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f1267a;

    @Deprecated
    public f(Object obj) {
        this.f1267a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static f A(f fVar) {
        return new f(AccessibilityRecord.obtain(fVar.f1267a));
    }

    public static void N(AccessibilityRecord accessibilityRecord, int r3) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(r3);
        }
    }

    public static void P(AccessibilityRecord accessibilityRecord, int r3) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(r3);
        }
    }

    public static void Y(@h0 AccessibilityRecord accessibilityRecord, View view, int r4) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, r4);
        }
    }

    public static int j(AccessibilityRecord accessibilityRecord) {
        if (Build.VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollX();
        }
        return 0;
    }

    public static int l(AccessibilityRecord accessibilityRecord) {
        if (Build.VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollY();
        }
        return 0;
    }

    @Deprecated
    public static f z() {
        return new f(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f1267a.recycle();
    }

    @Deprecated
    public void C(int r2) {
        this.f1267a.setAddedCount(r2);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f1267a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z) {
        this.f1267a.setChecked(z);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f1267a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f1267a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int r2) {
        this.f1267a.setCurrentItemIndex(r2);
    }

    @Deprecated
    public void I(boolean z) {
        this.f1267a.setEnabled(z);
    }

    @Deprecated
    public void J(int r2) {
        this.f1267a.setFromIndex(r2);
    }

    @Deprecated
    public void K(boolean z) {
        this.f1267a.setFullScreen(z);
    }

    @Deprecated
    public void L(int r2) {
        this.f1267a.setItemCount(r2);
    }

    @Deprecated
    public void M(int r2) {
        N(this.f1267a, r2);
    }

    @Deprecated
    public void O(int r2) {
        P(this.f1267a, r2);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f1267a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z) {
        this.f1267a.setPassword(z);
    }

    @Deprecated
    public void S(int r2) {
        this.f1267a.setRemovedCount(r2);
    }

    @Deprecated
    public void T(int r2) {
        this.f1267a.setScrollX(r2);
    }

    @Deprecated
    public void U(int r2) {
        this.f1267a.setScrollY(r2);
    }

    @Deprecated
    public void V(boolean z) {
        this.f1267a.setScrollable(z);
    }

    @Deprecated
    public void W(View view) {
        this.f1267a.setSource(view);
    }

    @Deprecated
    public void X(View view, int r3) {
        Y(this.f1267a, view, r3);
    }

    @Deprecated
    public void Z(int r2) {
        this.f1267a.setToIndex(r2);
    }

    @Deprecated
    public int a() {
        return this.f1267a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f1267a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f1267a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f1267a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f1267a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = this.f1267a;
        AccessibilityRecord accessibilityRecord2 = ((f) obj).f1267a;
        if (accessibilityRecord == null) {
            if (accessibilityRecord2 != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(accessibilityRecord2)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int f() {
        return this.f1267a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f1267a;
    }

    @Deprecated
    public int h() {
        return this.f1267a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f1267a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f1267a);
    }

    @Deprecated
    public int k() {
        return l(this.f1267a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f1267a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f1267a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f1267a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f1267a.getScrollY();
    }

    @Deprecated
    public d q() {
        return d.U1(this.f1267a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f1267a.getText();
    }

    @Deprecated
    public int s() {
        return this.f1267a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f1267a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f1267a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f1267a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f1267a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f1267a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f1267a.isScrollable();
    }
}
