package b.w;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b.w.a0;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Context f1380a;

    /* renamed from: b, reason: collision with root package name */
    private int f1381b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f1382c;
    private View d;
    private Runnable e;
    private Runnable f;

    public c0(@androidx.annotation.h0 ViewGroup viewGroup) {
        this.f1381b = -1;
        this.f1382c = viewGroup;
    }

    private c0(ViewGroup viewGroup, int r3, Context context) {
        this.f1381b = -1;
        this.f1380a = context;
        this.f1382c = viewGroup;
        this.f1381b = r3;
    }

    public c0(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.h0 View view) {
        this.f1381b = -1;
        this.f1382c = viewGroup;
        this.d = view;
    }

    @androidx.annotation.i0
    public static c0 c(@androidx.annotation.h0 ViewGroup viewGroup) {
        return (c0) viewGroup.getTag(a0.e.transition_current_scene);
    }

    @androidx.annotation.h0
    public static c0 d(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.c0 int r3, @androidx.annotation.h0 Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(a0.e.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(a0.e.transition_scene_layoutid_cache, sparseArray);
        }
        c0 c0Var = (c0) sparseArray.get(r3);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(viewGroup, r3, context);
        sparseArray.put(r3, c0Var2);
        return c0Var2;
    }

    static void g(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 c0 c0Var) {
        viewGroup.setTag(a0.e.transition_current_scene, c0Var);
    }

    public void a() {
        if (this.f1381b > 0 || this.d != null) {
            e().removeAllViews();
            if (this.f1381b > 0) {
                LayoutInflater.from(this.f1380a).inflate(this.f1381b, this.f1382c);
            } else {
                this.f1382c.addView(this.d);
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f1382c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f1382c) != this || (runnable = this.f) == null) {
            return;
        }
        runnable.run();
    }

    @androidx.annotation.h0
    public ViewGroup e() {
        return this.f1382c;
    }

    boolean f() {
        return this.f1381b > 0;
    }

    public void h(@androidx.annotation.i0 Runnable runnable) {
        this.e = runnable;
    }

    public void i(@androidx.annotation.i0 Runnable runnable) {
        this.f = runnable;
    }
}
