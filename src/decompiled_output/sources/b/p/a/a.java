package b.p.a;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.q;
import androidx.annotation.s0;
import androidx.drawerlayout.widget.DrawerLayout;
import b.i.p.f0;
import b.i.p.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public class a implements DrawerLayout.d {
    private static final String m = "ActionBarDrawerToggle";
    private static final int[] n = {R.attr.homeAsUpIndicator};
    private static final float o = 0.33333334f;
    private static final int p = 16908332;

    /* renamed from: a, reason: collision with root package name */
    final Activity f1312a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0085a f1313b;

    /* renamed from: c, reason: collision with root package name */
    private final DrawerLayout f1314c;
    private boolean d;
    private boolean e;
    private Drawable f;
    private Drawable g;
    private d h;
    private final int i;
    private final int j;
    private final int k;
    private c l;

    @Deprecated
    /* renamed from: b.p.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0085a {
        void a(Drawable drawable, @s0 int r2);

        @i0
        Drawable b();

        void c(@s0 int r1);
    }

    @Deprecated
    public interface b {
        @i0
        InterfaceC0085a a();
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        Method f1315a;

        /* renamed from: b, reason: collision with root package name */
        Method f1316b;

        /* renamed from: c, reason: collision with root package name */
        ImageView f1317c;

        c(Activity activity) {
            try {
                this.f1315a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f1316b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(16908332);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f1317c = (ImageView) childAt;
                }
            }
        }
    }

    private class d extends InsetDrawable implements Drawable.Callback {
        private final boolean d;
        private final Rect e;
        private float f;
        private float g;

        d(Drawable drawable) {
            super(drawable, 0);
            this.d = Build.VERSION.SDK_INT > 18;
            this.e = new Rect();
        }

        public float a() {
            return this.f;
        }

        public void b(float f) {
            this.g = f;
            invalidateSelf();
        }

        public void c(float f) {
            this.f = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@h0 Canvas canvas) {
            copyBounds(this.e);
            canvas.save();
            boolean z = f0.W(a.this.f1312a.getWindow().getDecorView()) == 1;
            int r1 = z ? -1 : 1;
            float fWidth = this.e.width();
            canvas.translate((-this.g) * fWidth * this.f * r1, 0.0f);
            if (z && !this.d) {
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @q int r11, @s0 int r12, @s0 int r13) {
        this(activity, drawerLayout, !e(activity), r11, r12, r13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, DrawerLayout drawerLayout, boolean z, @q int r5, @s0 int r6, @s0 int r7) {
        this.d = true;
        this.f1312a = activity;
        this.f1313b = activity instanceof b ? ((b) activity).a() : null;
        this.f1314c = drawerLayout;
        this.i = r5;
        this.j = r6;
        this.k = r7;
        this.f = f();
        this.g = b.i.c.c.h(activity, r5);
        d dVar = new d(this.g);
        this.h = dVar;
        dVar.b(z ? o : 0.0f);
    }

    private static boolean e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21 && Build.VERSION.SDK_INT >= 21;
    }

    private Drawable f() {
        TypedArray typedArrayObtainStyledAttributes;
        InterfaceC0085a interfaceC0085a = this.f1313b;
        if (interfaceC0085a != null) {
            return interfaceC0085a.b();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f1312a.getActionBar();
            typedArrayObtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f1312a).obtainStyledAttributes(null, n, R.attr.actionBarStyle, 0);
        } else {
            typedArrayObtainStyledAttributes = this.f1312a.obtainStyledAttributes(n);
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int r5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0085a interfaceC0085a = this.f1313b;
        if (interfaceC0085a != null) {
            interfaceC0085a.c(r5);
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f1312a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(r5);
                return;
            }
            return;
        }
        if (this.l == null) {
            this.l = new c(this.f1312a);
        }
        if (this.l.f1315a != null) {
            try {
                ActionBar actionBar2 = this.f1312a.getActionBar();
                this.l.f1316b.invoke(actionBar2, Integer.valueOf(r5));
                actionBar2.setSubtitle(actionBar2.getSubtitle());
            } catch (Exception e) {
                Log.w(m, "Couldn't set content description via JB-MR2 API", e);
            }
        }
    }

    private void k(Drawable drawable, int r8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0085a interfaceC0085a = this.f1313b;
        if (interfaceC0085a != null) {
            interfaceC0085a.a(drawable, r8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f1312a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(r8);
                return;
            }
            return;
        }
        if (this.l == null) {
            this.l = new c(this.f1312a);
        }
        c cVar = this.l;
        if (cVar.f1315a == null) {
            ImageView imageView = cVar.f1317c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            } else {
                Log.w(m, "Couldn't set home-as-up indicator");
                return;
            }
        }
        try {
            ActionBar actionBar2 = this.f1312a.getActionBar();
            this.l.f1315a.invoke(actionBar2, drawable);
            this.l.f1316b.invoke(actionBar2, Integer.valueOf(r8));
        } catch (Exception e) {
            Log.w(m, "Couldn't set home-as-up indicator via JB-MR2 API", e);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(int r1) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view, float f) {
        float fA = this.h.a();
        this.h.c(f > 0.5f ? Math.max(fA, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(fA, f * 2.0f));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h.c(1.0f);
        if (this.d) {
            j(this.k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h.c(0.0f);
        if (this.d) {
            j(this.j);
        }
    }

    public boolean g() {
        return this.d;
    }

    public void h(Configuration configuration) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!this.e) {
            this.f = f();
        }
        this.g = b.i.c.c.h(this.f1312a, this.i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.d) {
            return false;
        }
        if (this.f1314c.F(h.f1198b)) {
            this.f1314c.d(h.f1198b);
            return true;
        }
        this.f1314c.K(h.f1198b);
        return true;
    }

    public void l(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable;
        int r1;
        if (z != this.d) {
            if (z) {
                drawable = this.h;
                r1 = this.f1314c.C(h.f1198b) ? this.k : this.j;
            } else {
                drawable = this.f;
                r1 = 0;
            }
            k(drawable, r1);
            this.d = z;
        }
    }

    public void m(int r2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        n(r2 != 0 ? b.i.c.c.h(this.f1312a, r2) : null);
    }

    public void n(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null) {
            this.f = f();
            this.e = false;
        } else {
            this.f = drawable;
            this.e = true;
        }
        if (this.d) {
            return;
        }
        k(this.f, 0);
    }

    public void o() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        float f;
        if (this.f1314c.C(h.f1198b)) {
            dVar = this.h;
            f = 1.0f;
        } else {
            dVar = this.h;
            f = 0.0f;
        }
        dVar.c(f);
        if (this.d) {
            k(this.h, this.f1314c.C(h.f1198b) ? this.k : this.j);
        }
    }
}
