package b.w;

import android.view.View;

/* loaded from: classes.dex */
public abstract class g1 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1445a = "android:visibilityPropagation:visibility";

    /* renamed from: b, reason: collision with root package name */
    private static final String f1446b = "android:visibilityPropagation:center";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1447c = {f1445a, f1446b};

    private static int d(n0 n0Var, int r3) {
        int[] r2;
        if (n0Var == null || (r2 = (int[]) n0Var.f1493a.get(f1446b)) == null) {
            return -1;
        }
        return r2[r3];
    }

    @Override // b.w.k0
    public void a(n0 n0Var) {
        View view = n0Var.f1494b;
        Integer numValueOf = (Integer) n0Var.f1493a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        n0Var.f1493a.put(f1445a, numValueOf);
        int[] r2 = new int[2];
        view.getLocationOnScreen(r2);
        r2[0] = r2[0] + Math.round(view.getTranslationX());
        r2[0] = r2[0] + (view.getWidth() / 2);
        r2[1] = r2[1] + Math.round(view.getTranslationY());
        r2[1] = r2[1] + (view.getHeight() / 2);
        n0Var.f1493a.put(f1446b, r2);
    }

    @Override // b.w.k0
    public String[] b() {
        return f1447c;
    }

    public int e(n0 n0Var) {
        Integer num;
        if (n0Var == null || (num = (Integer) n0Var.f1493a.get(f1445a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(n0 n0Var) {
        return d(n0Var, 0);
    }

    public int g(n0 n0Var) {
        return d(n0Var, 1);
    }
}
