package b.i.p.p0;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static final int f1269b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1270c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;

    /* renamed from: a, reason: collision with root package name */
    private Object f1271a;

    private h(Object obj) {
        this.f1271a = obj;
    }

    public static h n() {
        if (Build.VERSION.SDK_INT >= 21) {
            return r(AccessibilityWindowInfo.obtain());
        }
        return null;
    }

    public static h o(h hVar) {
        if (Build.VERSION.SDK_INT < 21 || hVar == null) {
            return null;
        }
        return r(AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) hVar.f1271a));
    }

    private static String q(int r1) {
        return r1 != 1 ? r1 != 2 ? r1 != 3 ? r1 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    static h r(Object obj) {
        if (obj != null) {
            return new h(obj);
        }
        return null;
    }

    public d a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.U1(((AccessibilityWindowInfo) this.f1271a).getAnchor());
        }
        return null;
    }

    public void b(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo) this.f1271a).getBoundsInScreen(rect);
        }
    }

    public h c(int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return r(((AccessibilityWindowInfo) this.f1271a).getChild(r3));
        }
        return null;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).getChildCount();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).getId();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        Object obj2 = this.f1271a;
        Object obj3 = ((h) obj).f1271a;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (!obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).getLayer();
        }
        return -1;
    }

    public h g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return r(((AccessibilityWindowInfo) this.f1271a).getParent());
        }
        return null;
    }

    public d h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return d.U1(((AccessibilityWindowInfo) this.f1271a).getRoot());
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f1271a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public CharSequence i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((AccessibilityWindowInfo) this.f1271a).getTitle();
        }
        return null;
    }

    public int j() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).getType();
        }
        return -1;
    }

    public boolean k() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).isAccessibilityFocused();
        }
        return true;
    }

    public boolean l() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).isActive();
        }
        return true;
    }

    public boolean m() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f1271a).isFocused();
        }
        return true;
    }

    public void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo) this.f1271a).recycle();
        }
    }

    @h0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(e());
        sb.append(", type=");
        sb.append(q(j()));
        sb.append(", layer=");
        sb.append(f());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(m());
        sb.append(", active=");
        sb.append(l());
        sb.append(", hasParent=");
        sb.append(g() != null);
        sb.append(", hasChildren=");
        sb.append(d() > 0);
        sb.append(']');
        return sb.toString();
    }
}
