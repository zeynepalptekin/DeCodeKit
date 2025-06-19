package b.i.p;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1173a;

    public d(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? new DisplayCutout(rect, list) : null);
    }

    private d(Object obj) {
        this.f1173a = obj;
    }

    static d g(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(obj);
    }

    public List<Rect> a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f1173a).getBoundingRects();
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f1173a).getSafeInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f1173a).getSafeInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f1173a).getSafeInsetRight();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f1173a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1173a;
        Object obj3 = ((d) obj).f1173a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    @androidx.annotation.m0(api = 28)
    DisplayCutout f() {
        return (DisplayCutout) this.f1173a;
    }

    public int hashCode() {
        Object obj = this.f1173a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1173a + "}";
    }
}
