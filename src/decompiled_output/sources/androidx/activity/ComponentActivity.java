package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.annotation.c0;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i;
import androidx.annotation.i0;
import androidx.annotation.n;
import androidx.core.app.j;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class ComponentActivity extends j implements androidx.lifecycle.j, x, androidx.savedstate.c, c {
    private final k f;
    private final androidx.savedstate.b g;
    private w h;
    private final OnBackPressedDispatcher i;

    @c0
    private int j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        Object f2a;

        /* renamed from: b, reason: collision with root package name */
        w f3b;

        b() {
        }
    }

    public ComponentActivity() {
        this.f = new k(this);
        this.g = androidx.savedstate.b.a(this);
        this.i = new OnBackPressedDispatcher(new a());
        if (b() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            b().a(new h() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.h
                public void d(@h0 androidx.lifecycle.j jVar, @h0 g.a aVar) {
                    if (aVar == g.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        b().a(new h() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.h
            public void d(@h0 androidx.lifecycle.j jVar, @h0 g.a aVar) {
                if (aVar != g.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.j().a();
            }
        });
        int r0 = Build.VERSION.SDK_INT;
        if (19 > r0 || r0 > 23) {
            return;
        }
        b().a(new ImmLeaksCleaner(this));
    }

    @n
    public ComponentActivity(@c0 int r1) {
        this();
        this.j = r1;
    }

    @Override // androidx.core.app.j, androidx.lifecycle.j
    @h0
    public g b() {
        return this.f;
    }

    @Override // androidx.activity.c
    @h0
    public final OnBackPressedDispatcher d() {
        return this.i;
    }

    @Override // androidx.savedstate.c
    @h0
    public final SavedStateRegistry e() {
        return this.g.b();
    }

    @Override // androidx.lifecycle.x
    @h0
    public w j() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.h == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.h = bVar.f3b;
            }
            if (this.h == null) {
                this.h = new w();
            }
        }
        return this.h;
    }

    @i0
    @Deprecated
    public Object o() {
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f2a;
        }
        return null;
    }

    @Override // android.app.Activity
    @e0
    public void onBackPressed() {
        this.i.e();
    }

    @Override // androidx.core.app.j, android.app.Activity
    protected void onCreate(@i0 Bundle bundle) {
        super.onCreate(bundle);
        this.g.c(bundle);
        s.f(this);
        int r2 = this.j;
        if (r2 != 0) {
            setContentView(r2);
        }
    }

    @Override // android.app.Activity
    @i0
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object objP = p();
        w wVar = this.h;
        if (wVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            wVar = bVar.f3b;
        }
        if (wVar == null && objP == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f2a = objP;
        bVar2.f3b = wVar;
        return bVar2;
    }

    @Override // androidx.core.app.j, android.app.Activity
    @i
    protected void onSaveInstanceState(@h0 Bundle bundle) {
        g gVarB = b();
        if (gVarB instanceof k) {
            ((k) gVarB).q(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.g.d(bundle);
    }

    @i0
    @Deprecated
    public Object p() {
        return null;
    }
}
