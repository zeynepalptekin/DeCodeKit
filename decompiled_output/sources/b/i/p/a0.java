package b.i.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f1162b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1163c = 1000;
    public static final int d = 1001;
    public static final int e = 1002;
    public static final int f = 1003;
    public static final int g = 1004;
    public static final int h = 1006;
    public static final int i = 1007;
    public static final int j = 1008;
    public static final int k = 1009;
    public static final int l = 1010;
    public static final int m = 1011;
    public static final int n = 1012;
    public static final int o = 1013;
    public static final int p = 1014;
    public static final int q = 1015;
    public static final int r = 1016;
    public static final int s = 1017;
    public static final int t = 1018;
    public static final int u = 1019;
    public static final int v = 1020;
    public static final int w = 1021;
    public static final int x = 1000;

    /* renamed from: a, reason: collision with root package name */
    private Object f1164a;

    private a0(Object obj) {
        this.f1164a = obj;
    }

    public static a0 a(Bitmap bitmap, float f2, float f3) {
        return Build.VERSION.SDK_INT >= 24 ? new a0(PointerIcon.create(bitmap, f2, f3)) : new a0(null);
    }

    public static a0 c(Context context, int r3) {
        return Build.VERSION.SDK_INT >= 24 ? new a0(PointerIcon.getSystemIcon(context, r3)) : new a0(null);
    }

    public static a0 d(Resources resources, int r3) {
        return Build.VERSION.SDK_INT >= 24 ? new a0(PointerIcon.load(resources, r3)) : new a0(null);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f1164a;
    }
}
