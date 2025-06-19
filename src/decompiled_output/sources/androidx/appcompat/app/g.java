package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import b.a.f.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {
    static final boolean d = false;
    static final String e = "AppCompatDelegate";
    public static final int f = -1;

    @Deprecated
    public static final int g = 0;

    @Deprecated
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = -100;
    private static int m = -100;
    private static final b.f.b<WeakReference<g>> n = new b.f.b<>();
    private static final Object o = new Object();
    public static final int p = 108;
    public static final int q = 109;
    public static final int r = 10;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    g() {
    }

    static void G(@h0 g gVar) {
        synchronized (o) {
            H(gVar);
        }
    }

    private static void H(@h0 g gVar) {
        synchronized (o) {
            Iterator<WeakReference<g>> it = n.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void J(boolean z) {
        f1.b(z);
    }

    public static void N(int r1) {
        if (r1 != -1 && r1 != 0 && r1 != 1 && r1 != 2 && r1 != 3) {
            Log.d(e, "setDefaultNightMode() called with an unknown mode");
        } else if (m != r1) {
            m = r1;
            f();
        }
    }

    static void c(@h0 g gVar) {
        synchronized (o) {
            H(gVar);
            n.add(new WeakReference<>(gVar));
        }
    }

    private static void f() {
        synchronized (o) {
            Iterator<WeakReference<g>> it = n.iterator();
            while (it.hasNext()) {
                g gVar = it.next().get();
                if (gVar != null) {
                    gVar.e();
                }
            }
        }
    }

    @h0
    public static g i(@h0 Activity activity, @i0 f fVar) {
        return new h(activity, fVar);
    }

    @h0
    public static g j(@h0 Dialog dialog, @i0 f fVar) {
        return new h(dialog, fVar);
    }

    @h0
    public static g k(@h0 Context context, @h0 Activity activity, @i0 f fVar) {
        return new h(context, activity, fVar);
    }

    @h0
    public static g l(@h0 Context context, @h0 Window window, @i0 f fVar) {
        return new h(context, window, fVar);
    }

    public static int o() {
        return m;
    }

    public static boolean w() {
        return f1.a();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int r1);

    public abstract void K(@c0 int r1);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O(boolean z);

    @m0(17)
    public abstract void P(int r1);

    public abstract void Q(@i0 Toolbar toolbar);

    public void R(@t0 int r1) {
    }

    public abstract void S(@i0 CharSequence charSequence);

    @i0
    public abstract b.a.f.b T(@h0 b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    @androidx.annotation.i
    @h0
    public Context h(@h0 Context context) {
        g(context);
        return context;
    }

    public abstract View m(@i0 View view, String str, @h0 Context context, @h0 AttributeSet attributeSet);

    @i0
    public abstract <T extends View> T n(@w int r1);

    @i0
    public abstract b.InterfaceC0012b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater r();

    @i0
    public abstract androidx.appcompat.app.a s();

    public abstract boolean t(int r1);

    public abstract void u();

    public abstract void v();

    public abstract boolean x();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);
}
