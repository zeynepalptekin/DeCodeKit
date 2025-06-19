package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w;
import androidx.annotation.x0;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.h0;
import androidx.lifecycle.g;
import b.a.a;
import b.a.f.b;
import b.a.f.f;
import b.i.c.j.g;
import b.i.p.a0;
import b.i.p.f0;
import b.i.p.j;
import b.i.p.j0;
import b.i.p.l0;
import b.i.p.o0;
import b.i.p.y;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {
    private static final b.f.i<String, Integer> p0 = new b.f.i<>();
    private static final boolean q0;
    private static final int[] r0;
    private static final boolean s0;
    private static final boolean t0;
    private static boolean u0 = false;
    static final String v0 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private d0 A;
    private i B;
    private u C;
    b.a.f.b D;
    ActionBarContextView E;
    PopupWindow F;
    Runnable G;
    j0 H;
    private boolean I;
    private boolean J;
    ViewGroup K;
    private TextView L;
    private View M;
    private boolean N;
    private boolean O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    private boolean U;
    private t[] V;
    private t W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    boolean b0;
    private int c0;
    private int d0;
    private boolean e0;
    private boolean f0;
    private m g0;
    private m h0;
    boolean i0;
    int j0;
    private final Runnable k0;
    private boolean l0;
    private Rect m0;
    private Rect n0;
    private androidx.appcompat.app.k o0;
    final Object s;
    final Context t;
    Window u;
    private k v;
    final androidx.appcompat.app.f w;
    androidx.appcompat.app.a x;
    MenuInflater y;
    private CharSequence z;

    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f53a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f53a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@h0 Thread thread, @h0 Throwable th) {
            if (!a(th)) {
                this.f53a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + h.v0);
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f53a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.j0 & 1) != 0) {
                hVar.h0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.j0 & 4096) != 0) {
                hVar2.h0(108);
            }
            h hVar3 = h.this;
            hVar3.i0 = false;
            hVar3.j0 = 0;
        }
    }

    class c implements y {
        c() {
        }

        @Override // b.i.p.y
        public o0 a(View view, o0 o0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int r0 = o0Var.o();
            int r1 = h.this.Y0(o0Var, null);
            if (r0 != r1) {
                o0Var = o0Var.z(o0Var.m(), r1, o0Var.n(), o0Var.l());
            }
            return f0.a1(view, o0Var);
        }
    }

    class d implements h0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.h0.a
        public void a(Rect rect) {
            rect.top = h.this.Y0(null, rect);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.f0();
        }
    }

    class f implements Runnable {

        class a extends l0 {
            a() {
            }

            @Override // b.i.p.l0, b.i.p.k0
            public void b(View view) {
                h.this.E.setAlpha(1.0f);
                h.this.H.s(null);
                h.this.H = null;
            }

            @Override // b.i.p.l0, b.i.p.k0
            public void c(View view) {
                h.this.E.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.F.showAtLocation(hVar.E, 55, 0, 0);
            h.this.i0();
            if (!h.this.R0()) {
                h.this.E.setAlpha(1.0f);
                h.this.E.setVisibility(0);
            } else {
                h.this.E.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.H = f0.f(hVar2.E).a(1.0f);
                h.this.H.s(new a());
            }
        }
    }

    class g extends l0 {
        g() {
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void b(View view) {
            h.this.E.setAlpha(1.0f);
            h.this.H.s(null);
            h.this.H = null;
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void c(View view) {
            h.this.E.setVisibility(0);
            h.this.E.sendAccessibilityEvent(32);
            if (h.this.E.getParent() instanceof View) {
                f0.o1((View) h.this.E.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    private class C0013h implements b.InterfaceC0012b {
        C0013h() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public void a(Drawable drawable, int r3) {
            androidx.appcompat.app.a aVarS = h.this.s();
            if (aVarS != null) {
                aVarS.k0(drawable);
                aVarS.h0(r3);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public Drawable b() {
            a1 a1VarF = a1.F(e(), null, new int[]{a.b.homeAsUpIndicator});
            Drawable drawableH = a1VarF.h(0);
            a1VarF.I();
            return drawableH;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public void c(int r2) {
            androidx.appcompat.app.a aVarS = h.this.s();
            if (aVarS != null) {
                aVarS.h0(r2);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public boolean d() {
            androidx.appcompat.app.a aVarS = h.this.s();
            return (aVarS == null || (aVarS.o() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public Context e() {
            return h.this.n0();
        }
    }

    private final class i implements n.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, boolean z) {
            h.this.Z(gVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackU0 = h.this.u0();
            if (callbackU0 == null) {
                return true;
            }
            callbackU0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class j implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f60a;

        class a extends l0 {
            a() {
            }

            @Override // b.i.p.l0, b.i.p.k0
            public void b(View view) {
                h.this.E.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.E.getParent() instanceof View) {
                    f0.o1((View) h.this.E.getParent());
                }
                h.this.E.removeAllViews();
                h.this.H.s(null);
                h hVar2 = h.this;
                hVar2.H = null;
                f0.o1(hVar2.K);
            }
        }

        public j(b.a aVar) {
            this.f60a = aVar;
        }

        @Override // b.a.f.b.a
        public boolean a(b.a.f.b bVar, Menu menu) {
            f0.o1(h.this.K);
            return this.f60a.a(bVar, menu);
        }

        @Override // b.a.f.b.a
        public void b(b.a.f.b bVar) {
            this.f60a.b(bVar);
            h hVar = h.this;
            if (hVar.F != null) {
                hVar.u.getDecorView().removeCallbacks(h.this.G);
            }
            h hVar2 = h.this;
            if (hVar2.E != null) {
                hVar2.i0();
                h hVar3 = h.this;
                hVar3.H = f0.f(hVar3.E).a(0.0f);
                h.this.H.s(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.f fVar = hVar4.w;
            if (fVar != null) {
                fVar.h(hVar4.D);
            }
            h hVar5 = h.this;
            hVar5.D = null;
            f0.o1(hVar5.K);
        }

        @Override // b.a.f.b.a
        public boolean c(b.a.f.b bVar, MenuItem menuItem) {
            return this.f60a.c(bVar, menuItem);
        }

        @Override // b.a.f.b.a
        public boolean d(b.a.f.b bVar, Menu menu) {
            return this.f60a.d(bVar, menu);
        }
    }

    class k extends b.a.f.i {
        k(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.t, callback);
            b.a.f.b bVarT = h.this.T(aVar);
            if (bVarT != null) {
                return aVar.e(bVarT);
            }
            return null;
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int r2, Menu menu) {
            if (r2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(r2, menu);
            }
            return false;
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public boolean onMenuOpened(int r1, Menu menu) {
            super.onMenuOpened(r1, menu);
            h.this.I0(r1);
            return true;
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public void onPanelClosed(int r1, Menu menu) {
            super.onPanelClosed(r1, menu);
            h.this.J0(r1);
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public boolean onPreparePanel(int r4, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (r4 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.i0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(r4, view, menu);
            if (gVar != null) {
                gVar.i0(false);
            }
            return zOnPreparePanel;
        }

        @Override // b.a.f.i, android.view.Window.Callback
        @m0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int r6) {
            androidx.appcompat.view.menu.g gVar;
            t tVarR0 = h.this.r0(0, true);
            if (tVarR0 == null || (gVar = tVarR0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, r6);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, r6);
            }
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return h.this.x() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // b.a.f.i, android.view.Window.Callback
        @m0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int r3) {
            return (h.this.x() && r3 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, r3);
        }
    }

    private class l extends m {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f63c;

        l(@androidx.annotation.h0 Context context) {
            super();
            this.f63c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.m
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.m
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f63c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.h.m
        public void e() {
            h.this.e();
        }
    }

    @p0({p0.a.LIBRARY})
    @x0
    abstract class m {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f64a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                m.this.e();
            }
        }

        m() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f64a;
            if (broadcastReceiver != null) {
                try {
                    h.this.t.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f64a = null;
            }
        }

        @i0
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            return this.f64a != null;
        }

        abstract void e();

        void f() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f64a == null) {
                this.f64a = new a();
            }
            h.this.t.registerReceiver(this.f64a, intentFilterB);
        }
    }

    private class n extends m {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.p f67c;

        n(@androidx.annotation.h0 androidx.appcompat.app.p pVar) {
            super();
            this.f67c = pVar;
        }

        @Override // androidx.appcompat.app.h.m
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.m
        public int c() {
            return this.f67c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.m
        public void e() {
            h.this.e();
        }
    }

    @m0(17)
    static class o {
        private o() {
        }

        static void a(@androidx.annotation.h0 Configuration configuration, @androidx.annotation.h0 Configuration configuration2, @androidx.annotation.h0 Configuration configuration3) {
            int r0 = configuration.densityDpi;
            int r1 = configuration2.densityDpi;
            if (r0 != r1) {
                configuration3.densityDpi = r1;
            }
        }
    }

    @m0(24)
    static class p {
        private p() {
        }

        static void a(@androidx.annotation.h0 Configuration configuration, @androidx.annotation.h0 Configuration configuration2, @androidx.annotation.h0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    @m0(26)
    static class q {
        private q() {
        }

        static void a(@androidx.annotation.h0 Configuration configuration, @androidx.annotation.h0 Configuration configuration2, @androidx.annotation.h0 Configuration configuration3) {
            int r0 = configuration.colorMode & 3;
            int r1 = configuration2.colorMode;
            if (r0 != (r1 & 3)) {
                configuration3.colorMode |= r1 & 3;
            }
            int r3 = configuration.colorMode & 12;
            int r4 = configuration2.colorMode;
            if (r3 != (r4 & 12)) {
                configuration3.colorMode |= r4 & 12;
            }
        }
    }

    @m0(17)
    private static class r {
        private r() {
        }

        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean c(int r2, int r3) {
            return r2 < -5 || r3 < -5 || r2 > getWidth() + 5 || r3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int r2) {
            setBackgroundDrawable(b.a.b.a.a.d(getContext(), r2));
        }
    }

    protected static final class t {

        /* renamed from: a, reason: collision with root package name */
        int f68a;

        /* renamed from: b, reason: collision with root package name */
        int f69b;

        /* renamed from: c, reason: collision with root package name */
        int f70c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        boolean s;
        Bundle t;
        Bundle u;

        @SuppressLint({"BanParcelableUsage"})
        private static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0014a();
            int d;
            boolean e;
            Bundle f;

            /* renamed from: androidx.appcompat.app.h$t$a$a, reason: collision with other inner class name */
            class C0014a implements Parcelable.ClassLoaderCreator<a> {
                C0014a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return a.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return a.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int r1) {
                    return new a[r1];
                }
            }

            a() {
            }

            static a a(Parcel parcel, ClassLoader classLoader) {
                a aVar = new a();
                aVar.d = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                aVar.e = z;
                if (z) {
                    aVar.f = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int r2) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e ? 1 : 0);
                if (this.e) {
                    parcel.writeBundle(this.f);
                }
            }
        }

        t(int r1) {
            this.f68a = r1;
        }

        void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.g gVar = this.j;
            if (gVar == null || (bundle = this.t) == null) {
                return;
            }
            gVar.U(bundle);
            this.t = null;
        }

        public void b() {
            androidx.appcompat.view.menu.g gVar = this.j;
            if (gVar != null) {
                gVar.S(this.k);
            }
            this.k = null;
        }

        androidx.appcompat.view.menu.o c(n.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, a.j.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.T(aVar);
                this.j.b(this.k);
            }
            return this.k.O(this.g);
        }

        public boolean d() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }

        void e(Parcelable parcelable) {
            a aVar = (a) parcelable;
            this.f68a = aVar.d;
            this.s = aVar.e;
            this.t = aVar.f;
            this.h = null;
            this.g = null;
        }

        Parcelable f() {
            a aVar = new a();
            aVar.d = this.f68a;
            aVar.e = this.o;
            if (this.j != null) {
                Bundle bundle = new Bundle();
                aVar.f = bundle;
                this.j.W(bundle);
            }
            return aVar;
        }

        void g(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.S(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(a.b.actionBarPopupTheme, typedValue, true);
            int r2 = typedValue.resourceId;
            if (r2 != 0) {
                themeNewTheme.applyStyle(r2, true);
            }
            themeNewTheme.resolveAttribute(a.b.panelMenuListTheme, typedValue, true);
            int r0 = typedValue.resourceId;
            if (r0 == 0) {
                r0 = a.l.Theme_AppCompat_CompactMenu;
            }
            themeNewTheme.applyStyle(r0, true);
            b.a.f.d dVar = new b.a.f.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(a.m.AppCompatTheme);
            this.f69b = typedArrayObtainStyledAttributes.getResourceId(a.m.AppCompatTheme_panelBackground, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(a.m.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class u implements n.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g gVarG = gVar.G();
            boolean z2 = gVarG != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = gVarG;
            }
            t tVarL0 = hVar.l0(gVar);
            if (tVarL0 != null) {
                if (!z2) {
                    h.this.c0(tVarL0, z);
                } else {
                    h.this.Y(tVarL0.f68a, tVarL0, gVarG);
                    h.this.c0(tVarL0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackU0;
            if (gVar != gVar.G()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.P || (callbackU0 = hVar.u0()) == null || h.this.b0) {
                return true;
            }
            callbackU0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        q0 = Build.VERSION.SDK_INT < 21;
        r0 = new int[]{R.attr.windowBackground};
        s0 = !"robolectric".equals(Build.FINGERPRINT);
        t0 = Build.VERSION.SDK_INT >= 17;
        if (!q0 || u0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        u0 = true;
    }

    h(Activity activity, androidx.appcompat.app.f fVar) {
        this(activity, null, fVar, activity);
    }

    h(Dialog dialog, androidx.appcompat.app.f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    h(Context context, Activity activity, androidx.appcompat.app.f fVar) {
        this(context, null, fVar, activity);
    }

    h(Context context, Window window, androidx.appcompat.app.f fVar) {
        this(context, window, fVar, context);
    }

    private h(Context context, Window window, androidx.appcompat.app.f fVar, Object obj) {
        Integer num;
        androidx.appcompat.app.e eVarV0;
        this.H = null;
        this.I = true;
        this.c0 = -100;
        this.k0 = new b();
        this.t = context;
        this.w = fVar;
        this.s = obj;
        if (this.c0 == -100 && (obj instanceof Dialog) && (eVarV0 = V0()) != null) {
            this.c0 = eVarV0.K().q();
        }
        if (this.c0 == -100 && (num = p0.get(this.s.getClass().getName())) != null) {
            this.c0 = num.intValue();
            p0.remove(this.s.getClass().getName());
        }
        if (window != null) {
            W(window);
        }
        androidx.appcompat.widget.k.i();
    }

    private boolean A0() throws PackageManager.NameNotFoundException {
        if (!this.f0 && (this.s instanceof Activity)) {
            PackageManager packageManager = this.t.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.t, this.s.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : Build.VERSION.SDK_INT >= 24 ? 786432 : 0);
                this.e0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.e0 = false;
            }
        }
        this.f0 = true;
        return this.e0;
    }

    private boolean E0(int r2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarR0 = r0(r2, true);
        if (tVarR0.o) {
            return false;
        }
        return O0(tVarR0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean H0(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            b.a.f.b r0 = r3.D
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$t r2 = r3.r0(r4, r0)
            if (r4 != 0) goto L43
            androidx.appcompat.widget.d0 r4 = r3.A
            if (r4 == 0) goto L43
            boolean r4 = r4.j()
            if (r4 == 0) goto L43
            android.content.Context r4 = r3.t
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L43
            androidx.appcompat.widget.d0 r4 = r3.A
            boolean r4 = r4.c()
            if (r4 != 0) goto L3c
            boolean r4 = r3.b0
            if (r4 != 0) goto L62
            boolean r4 = r3.O0(r2, r5)
            if (r4 == 0) goto L62
            androidx.appcompat.widget.d0 r4 = r3.A
            boolean r0 = r4.h()
            goto L6a
        L3c:
            androidx.appcompat.widget.d0 r4 = r3.A
            boolean r0 = r4.g()
            goto L6a
        L43:
            boolean r4 = r2.o
            if (r4 != 0) goto L64
            boolean r4 = r2.n
            if (r4 == 0) goto L4c
            goto L64
        L4c:
            boolean r4 = r2.m
            if (r4 == 0) goto L62
            boolean r4 = r2.r
            if (r4 == 0) goto L5b
            r2.m = r1
            boolean r4 = r3.O0(r2, r5)
            goto L5c
        L5b:
            r4 = 1
        L5c:
            if (r4 == 0) goto L62
            r3.L0(r2, r5)
            goto L6a
        L62:
            r0 = 0
            goto L6a
        L64:
            boolean r4 = r2.o
            r3.c0(r2, r0)
            r0 = r4
        L6a:
            if (r0 == 0) goto L87
            android.content.Context r4 = r3.t
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L80
            r4.playSoundEffect(r1)
            goto L87
        L80:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.H0(int, android.view.KeyEvent):boolean");
    }

    private void L0(t tVar, KeyEvent keyEvent) {
        int r6;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.o || this.b0) {
            return;
        }
        if (tVar.f68a == 0) {
            if ((this.t.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !callbackU0.onMenuOpened(tVar.f68a, tVar.j)) {
            c0(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.t.getSystemService("window");
        if (windowManager != null && O0(tVar, keyEvent)) {
            if (tVar.g != null && !tVar.q) {
                View view = tVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    r6 = -1;
                }
                tVar.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(r6, -2, tVar.d, tVar.e, a0.e, 8519680, -3);
                layoutParams2.gravity = tVar.f70c;
                layoutParams2.windowAnimations = tVar.f;
                windowManager.addView(tVar.g, layoutParams2);
                tVar.o = true;
            }
            ViewGroup viewGroup = tVar.g;
            if (viewGroup == null) {
                if (!x0(tVar) || tVar.g == null) {
                    return;
                }
            } else if (tVar.q && viewGroup.getChildCount() > 0) {
                tVar.g.removeAllViews();
            }
            if (!w0(tVar) || !tVar.d()) {
                tVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = tVar.h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            tVar.g.setBackgroundResource(tVar.f69b);
            ViewParent parent = tVar.h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(tVar.h);
            }
            tVar.g.addView(tVar.h, layoutParams3);
            if (!tVar.h.hasFocus()) {
                tVar.h.requestFocus();
            }
            r6 = -2;
            tVar.n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(r6, -2, tVar.d, tVar.e, a0.e, 8519680, -3);
            layoutParams22.gravity = tVar.f70c;
            layoutParams22.windowAnimations = tVar.f;
            windowManager.addView(tVar.g, layoutParams22);
            tVar.o = true;
        }
    }

    private boolean N0(t tVar, int r4, KeyEvent keyEvent, int r6) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.m || O0(tVar, keyEvent)) && (gVar = tVar.j) != null) {
            zPerformShortcut = gVar.performShortcut(r4, keyEvent, r6);
        }
        if (zPerformShortcut && (r6 & 1) == 0 && this.A == null) {
            c0(tVar, true);
        }
        return zPerformShortcut;
    }

    private boolean O0(t tVar, KeyEvent keyEvent) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        if (this.b0) {
            return false;
        }
        if (tVar.m) {
            return true;
        }
        t tVar2 = this.W;
        if (tVar2 != null && tVar2 != tVar) {
            c0(tVar2, false);
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null) {
            tVar.i = callbackU0.onCreatePanelView(tVar.f68a);
        }
        int r3 = tVar.f68a;
        boolean z = r3 == 0 || r3 == 108;
        if (z && (d0Var3 = this.A) != null) {
            d0Var3.d();
        }
        if (tVar.i == null && (!z || !(M0() instanceof androidx.appcompat.app.n))) {
            if (tVar.j == null || tVar.r) {
                if (tVar.j == null && (!y0(tVar) || tVar.j == null)) {
                    return false;
                }
                if (z && this.A != null) {
                    if (this.B == null) {
                        this.B = new i();
                    }
                    this.A.b(tVar.j, this.B);
                }
                tVar.j.m0();
                if (!callbackU0.onCreatePanelMenu(tVar.f68a, tVar.j)) {
                    tVar.g(null);
                    if (z && (d0Var = this.A) != null) {
                        d0Var.b(null, this.B);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.j.m0();
            Bundle bundle = tVar.u;
            if (bundle != null) {
                tVar.j.T(bundle);
                tVar.u = null;
            }
            if (!callbackU0.onPreparePanel(0, tVar.i, tVar.j)) {
                if (z && (d0Var2 = this.A) != null) {
                    d0Var2.b(null, this.B);
                }
                tVar.j.l0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.p = z2;
            tVar.j.setQwertyMode(z2);
            tVar.j.l0();
        }
        tVar.m = true;
        tVar.n = false;
        this.W = tVar;
        return true;
    }

    private void P0(boolean z) {
        d0 d0Var = this.A;
        if (d0Var == null || !d0Var.j() || (ViewConfiguration.get(this.t).hasPermanentMenuKey() && !this.A.f())) {
            t tVarR0 = r0(0, true);
            tVarR0.q = true;
            c0(tVarR0, false);
            L0(tVarR0, null);
            return;
        }
        Window.Callback callbackU0 = u0();
        if (this.A.c() && z) {
            this.A.g();
            if (this.b0) {
                return;
            }
            callbackU0.onPanelClosed(108, r0(0, true).j);
            return;
        }
        if (callbackU0 == null || this.b0) {
            return;
        }
        if (this.i0 && (this.j0 & 1) != 0) {
            this.u.getDecorView().removeCallbacks(this.k0);
            this.k0.run();
        }
        t tVarR02 = r0(0, true);
        androidx.appcompat.view.menu.g gVar = tVarR02.j;
        if (gVar == null || tVarR02.r || !callbackU0.onPreparePanel(0, tVarR02.i, gVar)) {
            return;
        }
        callbackU0.onMenuOpened(108, tVarR02.j);
        this.A.h();
    }

    private int Q0(int r3) {
        if (r3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (r3 != 9) {
            return r3;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.u.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || f0.J0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean U(boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.b0) {
            return false;
        }
        int r02 = X();
        boolean zW0 = W0(B0(this.t, r02), z);
        if (r02 == 0) {
            q0(this.t).f();
        } else {
            m mVar = this.g0;
            if (mVar != null) {
                mVar.a();
            }
        }
        if (r02 == 3) {
            o0(this.t).f();
        } else {
            m mVar2 = this.h0;
            if (mVar2 != null) {
                mVar2.a();
            }
        }
        return zW0;
    }

    private void U0() {
        if (this.J) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.K.findViewById(R.id.content);
        View decorView = this.u.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.t.obtainStyledAttributes(a.m.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(a.m.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(a.m.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(a.m.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(a.m.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(a.m.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(a.m.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @i0
    private androidx.appcompat.app.e V0() {
        for (Context baseContext = this.t; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.e) {
                return (androidx.appcompat.app.e) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void W(@androidx.annotation.h0 Window window) {
        if (this.u != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof k) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        k kVar = new k(callback);
        this.v = kVar;
        window.setCallback(kVar);
        a1 a1VarF = a1.F(this.t, null, r0);
        Drawable drawableI = a1VarF.i(0);
        if (drawableI != null) {
            window.setBackgroundDrawable(drawableI);
        }
        a1VarF.I();
        this.u = window;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean W0(int r7, boolean r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            android.content.Context r0 = r6.t
            r1 = 0
            android.content.res.Configuration r0 = r6.d0(r0, r7, r1)
            boolean r2 = r6.A0()
            android.content.Context r3 = r6.t
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.Y
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.h.s0
            if (r8 != 0) goto L30
            boolean r8 = r6.Z
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.s
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.s
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.A(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.X0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.s
            boolean r0 = r8 instanceof androidx.appcompat.app.e
            if (r0 == 0) goto L5e
            androidx.appcompat.app.e r8 = (androidx.appcompat.app.e) r8
            r8.N(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.W0(int, boolean):boolean");
    }

    private int X() {
        int r02 = this.c0;
        return r02 != -100 ? r02 : androidx.appcompat.app.g.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X0(int r4, boolean z, @i0 Configuration configuration) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.t.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = r4 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.m.a(resources);
        }
        int r42 = this.d0;
        if (r42 != 0) {
            this.t.setTheme(r42);
            if (Build.VERSION.SDK_INT >= 23) {
                this.t.getTheme().applyStyle(this.d0, true);
            }
        }
        if (z) {
            Object obj = this.s;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.j) {
                    if (!((androidx.lifecycle.j) activity).b().b().e(g.b.STARTED)) {
                        return;
                    }
                } else if (!this.a0) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void Z0(View view) {
        Context context;
        int r1;
        if ((f0.x0(view) & 8192) != 0) {
            context = this.t;
            r1 = a.d.abc_decor_view_status_guard_light;
        } else {
            context = this.t;
            r1 = a.d.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(b.i.c.c.e(context, r1));
    }

    private void a0() {
        m mVar = this.g0;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.h0;
        if (mVar2 != null) {
            mVar2.a();
        }
    }

    @androidx.annotation.h0
    private Configuration d0(@androidx.annotation.h0 Context context, int r3, @i0 Configuration configuration) {
        int r2 = r3 != 1 ? r3 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = r2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup e0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.t.obtainStyledAttributes(a.m.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.m.AppCompatTheme_windowNoTitle, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(a.m.AppCompatTheme_windowActionBar, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.m.AppCompatTheme_windowActionBarOverlay, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.m.AppCompatTheme_windowActionModeOverlay, false)) {
            I(10);
        }
        this.S = typedArrayObtainStyledAttributes.getBoolean(a.m.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        k0();
        this.u.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.t);
        if (this.T) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.R ? a.j.abc_screen_simple_overlay_action_mode : a.j.abc_screen_simple, (ViewGroup) null);
        } else if (this.S) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(a.j.abc_dialog_title_material, (ViewGroup) null);
            this.Q = false;
            this.P = false;
        } else if (this.P) {
            TypedValue typedValue = new TypedValue();
            this.t.getTheme().resolveAttribute(a.b.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b.a.f.d(this.t, typedValue.resourceId) : this.t).inflate(a.j.abc_screen_toolbar, (ViewGroup) null);
            d0 d0Var = (d0) viewGroup.findViewById(a.g.decor_content_parent);
            this.A = d0Var;
            d0Var.setWindowCallback(u0());
            if (this.Q) {
                this.A.o(109);
            }
            if (this.N) {
                this.A.o(2);
            }
            if (this.O) {
                this.A.o(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.P + ", windowActionBarOverlay: " + this.Q + ", android:windowIsFloating: " + this.S + ", windowActionModeOverlay: " + this.R + ", windowNoTitle: " + this.T + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            f0.T1(viewGroup, new c());
        } else if (viewGroup instanceof androidx.appcompat.widget.h0) {
            ((androidx.appcompat.widget.h0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.A == null) {
            this.L = (TextView) viewGroup.findViewById(a.g.title);
        }
        g1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.g.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.u.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.u.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void j0() {
        if (this.J) {
            return;
        }
        this.K = e0();
        CharSequence charSequenceT0 = t0();
        if (!TextUtils.isEmpty(charSequenceT0)) {
            d0 d0Var = this.A;
            if (d0Var != null) {
                d0Var.setWindowTitle(charSequenceT0);
            } else if (M0() != null) {
                M0().A0(charSequenceT0);
            } else {
                TextView textView = this.L;
                if (textView != null) {
                    textView.setText(charSequenceT0);
                }
            }
        }
        V();
        K0(this.K);
        this.J = true;
        t tVarR0 = r0(0, false);
        if (this.b0) {
            return;
        }
        if (tVarR0 == null || tVarR0.j == null) {
            z0(108);
        }
    }

    private void k0() {
        if (this.u == null) {
            Object obj = this.s;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.u == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @androidx.annotation.h0
    private static Configuration m0(@androidx.annotation.h0 Configuration configuration, @i0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int r1 = configuration.mcc;
            int r2 = configuration2.mcc;
            if (r1 != r2) {
                configuration3.mcc = r2;
            }
            int r12 = configuration.mnc;
            int r22 = configuration2.mnc;
            if (r12 != r22) {
                configuration3.mnc = r22;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                p.a(configuration, configuration2, configuration3);
            } else if (!b.i.o.e.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int r13 = configuration.touchscreen;
            int r23 = configuration2.touchscreen;
            if (r13 != r23) {
                configuration3.touchscreen = r23;
            }
            int r14 = configuration.keyboard;
            int r24 = configuration2.keyboard;
            if (r14 != r24) {
                configuration3.keyboard = r24;
            }
            int r15 = configuration.keyboardHidden;
            int r25 = configuration2.keyboardHidden;
            if (r15 != r25) {
                configuration3.keyboardHidden = r25;
            }
            int r16 = configuration.navigation;
            int r26 = configuration2.navigation;
            if (r16 != r26) {
                configuration3.navigation = r26;
            }
            int r17 = configuration.navigationHidden;
            int r27 = configuration2.navigationHidden;
            if (r17 != r27) {
                configuration3.navigationHidden = r27;
            }
            int r18 = configuration.orientation;
            int r28 = configuration2.orientation;
            if (r18 != r28) {
                configuration3.orientation = r28;
            }
            int r19 = configuration.screenLayout & 15;
            int r29 = configuration2.screenLayout;
            if (r19 != (r29 & 15)) {
                configuration3.screenLayout |= r29 & 15;
            }
            int r110 = configuration.screenLayout & 192;
            int r210 = configuration2.screenLayout;
            if (r110 != (r210 & 192)) {
                configuration3.screenLayout |= r210 & 192;
            }
            int r111 = configuration.screenLayout & 48;
            int r211 = configuration2.screenLayout;
            if (r111 != (r211 & 48)) {
                configuration3.screenLayout |= r211 & 48;
            }
            int r112 = configuration.screenLayout & 768;
            int r212 = configuration2.screenLayout;
            if (r112 != (r212 & 768)) {
                configuration3.screenLayout |= r212 & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                q.a(configuration, configuration2, configuration3);
            }
            int r113 = configuration.uiMode & 15;
            int r213 = configuration2.uiMode;
            if (r113 != (r213 & 15)) {
                configuration3.uiMode |= r213 & 15;
            }
            int r114 = configuration.uiMode & 48;
            int r214 = configuration2.uiMode;
            if (r114 != (r214 & 48)) {
                configuration3.uiMode |= r214 & 48;
            }
            int r115 = configuration.screenWidthDp;
            int r215 = configuration2.screenWidthDp;
            if (r115 != r215) {
                configuration3.screenWidthDp = r215;
            }
            int r116 = configuration.screenHeightDp;
            int r216 = configuration2.screenHeightDp;
            if (r116 != r216) {
                configuration3.screenHeightDp = r216;
            }
            int r117 = configuration.smallestScreenWidthDp;
            int r217 = configuration2.smallestScreenWidthDp;
            if (r117 != r217) {
                configuration3.smallestScreenWidthDp = r217;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                o.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private m o0(@androidx.annotation.h0 Context context) {
        if (this.h0 == null) {
            this.h0 = new l(context);
        }
        return this.h0;
    }

    private m q0(@androidx.annotation.h0 Context context) {
        if (this.g0 == null) {
            this.g0 = new n(androidx.appcompat.app.p.a(context));
        }
        return this.g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0() {
        /*
            r3 = this;
            r3.j0()
            boolean r0 = r3.P
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.x
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.q r0 = new androidx.appcompat.app.q
            java.lang.Object r1 = r3.s
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.Q
            r0.<init>(r1, r2)
        L1d:
            r3.x = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.q r0 = new androidx.appcompat.app.q
            java.lang.Object r1 = r3.s
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.x
            if (r0 == 0) goto L37
            boolean r1 = r3.l0
            r0.W(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.v0():void");
    }

    private boolean w0(t tVar) {
        View view = tVar.i;
        if (view != null) {
            tVar.h = view;
            return true;
        }
        if (tVar.j == null) {
            return false;
        }
        if (this.C == null) {
            this.C = new u();
        }
        View view2 = (View) tVar.c(this.C);
        tVar.h = view2;
        return view2 != null;
    }

    private boolean x0(t tVar) {
        tVar.h(n0());
        tVar.g = new s(tVar.l);
        tVar.f70c = 81;
        return true;
    }

    private boolean y0(t tVar) {
        Context context = this.t;
        int r1 = tVar.f68a;
        if ((r1 == 0 || r1 == 108) && this.A != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.b.actionBarTheme, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(a.b.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(a.b.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                b.a.f.d dVar = new b.a.f.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.X(this);
        tVar.g(gVar);
        return true;
    }

    private void z0(int r3) {
        this.j0 = (1 << r3) | this.j0;
        if (this.i0) {
            return;
        }
        f0.i1(this.u.getDecorView(), this.k0);
        this.i0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.s
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.G(r3)
        L9:
            boolean r0 = r3.i0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.u
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.k0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.a0 = r0
            r0 = 1
            r3.b0 = r0
            int r0 = r3.c0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            b.f.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.p0
            java.lang.Object r1 = r3.s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.c0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            b.f.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.p0
            java.lang.Object r1 = r3.s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.x
            if (r0 == 0) goto L5e
            r0.I()
        L5e:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.A():void");
    }

    @Override // androidx.appcompat.app.g
    public void B(Bundle bundle) {
        j0();
    }

    int B0(@androidx.annotation.h0 Context context, int r4) {
        m mVarQ0;
        if (r4 == -100) {
            return -1;
        }
        if (r4 != -1) {
            if (r4 != 0) {
                if (r4 != 1 && r4 != 2) {
                    if (r4 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    mVarQ0 = o0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                mVarQ0 = q0(context);
            }
            return mVarQ0.c();
        }
        return r4;
    }

    @Override // androidx.appcompat.app.g
    public void C() {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            aVarS.t0(true);
        }
    }

    boolean C0() {
        b.a.f.b bVar = this.D;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarS = s();
        return aVarS != null && aVarS.l();
    }

    @Override // androidx.appcompat.app.g
    public void D(Bundle bundle) {
    }

    boolean D0(int r4, KeyEvent keyEvent) {
        if (r4 == 4) {
            this.X = (keyEvent.getFlags() & 128) != 0;
        } else if (r4 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void E() {
        this.a0 = true;
        e();
    }

    @Override // androidx.appcompat.app.g
    public void F() {
        this.a0 = false;
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            aVarS.t0(false);
        }
    }

    boolean F0(int r4, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null && aVarS.J(r4, keyEvent)) {
            return true;
        }
        t tVar = this.W;
        if (tVar != null && N0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.W;
            if (tVar2 != null) {
                tVar2.n = true;
            }
            return true;
        }
        if (this.W == null) {
            t tVarR0 = r0(0, true);
            O0(tVarR0, keyEvent);
            boolean zN0 = N0(tVarR0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarR0.m = false;
            if (zN0) {
                return true;
            }
        }
        return false;
    }

    boolean G0(int r4, KeyEvent keyEvent) {
        if (r4 == 4) {
            boolean z = this.X;
            this.X = false;
            t tVarR0 = r0(0, false);
            if (tVarR0 != null && tVarR0.o) {
                if (!z) {
                    c0(tVarR0, true);
                }
                return true;
            }
            if (C0()) {
                return true;
            }
        } else if (r4 == 82) {
            H0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean I(int r5) {
        int r52 = Q0(r5);
        if (this.T && r52 == 108) {
            return false;
        }
        if (this.P && r52 == 1) {
            this.P = false;
        }
        if (r52 == 1) {
            U0();
            this.T = true;
            return true;
        }
        if (r52 == 2) {
            U0();
            this.N = true;
            return true;
        }
        if (r52 == 5) {
            U0();
            this.O = true;
            return true;
        }
        if (r52 == 10) {
            U0();
            this.R = true;
            return true;
        }
        if (r52 == 108) {
            U0();
            this.P = true;
            return true;
        }
        if (r52 != 109) {
            return this.u.requestFeature(r52);
        }
        U0();
        this.Q = true;
        return true;
    }

    void I0(int r2) {
        androidx.appcompat.app.a aVarS;
        if (r2 != 108 || (aVarS = s()) == null) {
            return;
        }
        aVarS.m(true);
    }

    void J0(int r3) {
        if (r3 == 108) {
            androidx.appcompat.app.a aVarS = s();
            if (aVarS != null) {
                aVarS.m(false);
                return;
            }
            return;
        }
        if (r3 == 0) {
            t tVarR0 = r0(r3, true);
            if (tVarR0.o) {
                c0(tVarR0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void K(int r3) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.t).inflate(r3, viewGroup);
        this.v.a().onContentChanged();
    }

    void K0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    public void L(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.v.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.v.a().onContentChanged();
    }

    final androidx.appcompat.app.a M0() {
        return this.x;
    }

    @Override // androidx.appcompat.app.g
    public void O(boolean z) {
        this.I = z;
    }

    @Override // androidx.appcompat.app.g
    @m0(17)
    public void P(int r2) {
        if (this.c0 != r2) {
            this.c0 = r2;
            if (this.Y) {
                e();
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void Q(Toolbar toolbar) {
        Window window;
        Window.Callback callbackE0;
        if (this.s instanceof Activity) {
            androidx.appcompat.app.a aVarS = s();
            if (aVarS instanceof androidx.appcompat.app.q) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.y = null;
            if (aVarS != null) {
                aVarS.I();
            }
            if (toolbar != null) {
                androidx.appcompat.app.n nVar = new androidx.appcompat.app.n(toolbar, t0(), this.v);
                this.x = nVar;
                window = this.u;
                callbackE0 = nVar.E0();
            } else {
                this.x = null;
                window = this.u;
                callbackE0 = this.v;
            }
            window.setCallback(callbackE0);
            v();
        }
    }

    @Override // androidx.appcompat.app.g
    public void R(@t0 int r1) {
        this.d0 = r1;
    }

    final boolean R0() {
        ViewGroup viewGroup;
        return this.J && (viewGroup = this.K) != null && f0.P0(viewGroup);
    }

    @Override // androidx.appcompat.app.g
    public final void S(CharSequence charSequence) {
        this.z = charSequence;
        d0 d0Var = this.A;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
            return;
        }
        if (M0() != null) {
            M0().A0(charSequence);
            return;
        }
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    public b.a.f.b T(@androidx.annotation.h0 b.a aVar) {
        androidx.appcompat.app.f fVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        b.a.f.b bVar = this.D;
        if (bVar != null) {
            bVar.c();
        }
        j jVar = new j(aVar);
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            b.a.f.b bVarC0 = aVarS.C0(jVar);
            this.D = bVarC0;
            if (bVarC0 != null && (fVar = this.w) != null) {
                fVar.g(bVarC0);
            }
        }
        if (this.D == null) {
            this.D = T0(jVar);
        }
        return this.D;
    }

    b.a.f.b T0(@androidx.annotation.h0 b.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b.a.f.b bVarK;
        Context dVar;
        androidx.appcompat.app.f fVar;
        i0();
        b.a.f.b bVar = this.D;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof j)) {
            aVar = new j(aVar);
        }
        androidx.appcompat.app.f fVar2 = this.w;
        if (fVar2 == null || this.b0) {
            bVarK = null;
        } else {
            try {
                bVarK = fVar2.k(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarK != null) {
            this.D = bVarK;
        } else {
            if (this.E == null) {
                if (this.S) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.t.getTheme();
                    theme.resolveAttribute(a.b.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.t.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new b.a.f.d(this.t, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.t;
                    }
                    this.E = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, a.b.actionModePopupWindowStyle);
                    this.F = popupWindow;
                    androidx.core.widget.k.d(popupWindow, 2);
                    this.F.setContentView(this.E);
                    this.F.setWidth(-1);
                    dVar.getTheme().resolveAttribute(a.b.actionBarSize, typedValue, true);
                    this.E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.F.setHeight(-2);
                    this.G = new f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.K.findViewById(a.g.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(n0()));
                        this.E = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.E != null) {
                i0();
                this.E.t();
                b.a.f.e eVar = new b.a.f.e(this.E.getContext(), this.E, aVar, this.F == null);
                if (aVar.d(eVar, eVar.e())) {
                    eVar.k();
                    this.E.q(eVar);
                    this.D = eVar;
                    if (R0()) {
                        this.E.setAlpha(0.0f);
                        j0 j0VarA = f0.f(this.E).a(1.0f);
                        this.H = j0VarA;
                        j0VarA.s(new g());
                    } else {
                        this.E.setAlpha(1.0f);
                        this.E.setVisibility(0);
                        this.E.sendAccessibilityEvent(32);
                        if (this.E.getParent() instanceof View) {
                            f0.o1((View) this.E.getParent());
                        }
                    }
                    if (this.F != null) {
                        this.u.getDecorView().post(this.G);
                    }
                } else {
                    this.D = null;
                }
            }
        }
        b.a.f.b bVar2 = this.D;
        if (bVar2 != null && (fVar = this.w) != null) {
            fVar.g(bVar2);
        }
        return this.D;
    }

    void Y(int r3, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && r3 >= 0) {
                t[] tVarArr = this.V;
                if (r3 < tVarArr.length) {
                    tVar = tVarArr[r3];
                }
            }
            if (tVar != null) {
                menu = tVar.j;
            }
        }
        if ((tVar == null || tVar.o) && !this.b0) {
            this.v.a().onPanelClosed(r3, menu);
        }
    }

    final int Y0(@i0 o0 o0Var, @i0 Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        int r1 = o0Var != null ? o0Var.o() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.E;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            if (this.E.isShown()) {
                if (this.m0 == null) {
                    this.m0 = new Rect();
                    this.n0 = new Rect();
                }
                Rect rect2 = this.m0;
                Rect rect3 = this.n0;
                if (o0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o0Var.m(), o0Var.o(), o0Var.n(), o0Var.l());
                }
                g1.a(this.K, rect2, rect3);
                int r11 = rect2.top;
                int r12 = rect2.left;
                int r4 = rect2.right;
                o0 o0VarL0 = f0.l0(this.K);
                int r7 = o0VarL0 == null ? 0 : o0VarL0.m();
                int r6 = o0VarL0 == null ? 0 : o0VarL0.n();
                if (marginLayoutParams.topMargin == r11 && marginLayoutParams.leftMargin == r12 && marginLayoutParams.rightMargin == r4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = r11;
                    marginLayoutParams.leftMargin = r12;
                    marginLayoutParams.rightMargin = r4;
                    z2 = true;
                }
                if (r11 <= 0 || this.M != null) {
                    View view = this.M;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != r7 || marginLayoutParams2.rightMargin != r6) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = r7;
                            marginLayoutParams2.rightMargin = r6;
                            this.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.t);
                    this.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = r7;
                    layoutParams.rightMargin = r6;
                    this.K.addView(this.M, -1, layoutParams);
                }
                z = this.M != null;
                if (z && this.M.getVisibility() != 0) {
                    Z0(this.M);
                }
                if (!this.R && z) {
                    r1 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.E.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.M;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return r1;
    }

    void Z(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
        if (this.U) {
            return;
        }
        this.U = true;
        this.A.p();
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !this.b0) {
            callbackU0.onPanelClosed(108, gVar);
        }
        this.U = false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.h0 MenuItem menuItem) {
        t tVarL0;
        Window.Callback callbackU0 = u0();
        if (callbackU0 == null || this.b0 || (tVarL0 = l0(gVar.G())) == null) {
            return false;
        }
        return callbackU0.onMenuItemSelected(tVarL0.f68a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
        P0(true);
    }

    void b0(int r2) {
        c0(r0(r2, true), true);
    }

    void c0(t tVar, boolean z) {
        ViewGroup viewGroup;
        d0 d0Var;
        if (z && tVar.f68a == 0 && (d0Var = this.A) != null && d0Var.c()) {
            Z(tVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.t.getSystemService("window");
        if (windowManager != null && tVar.o && (viewGroup = tVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                Y(tVar.f68a, tVar, null);
            }
        }
        tVar.m = false;
        tVar.n = false;
        tVar.o = false;
        tVar.h = null;
        tVar.q = true;
        if (this.W == tVar) {
            this.W = null;
        }
    }

    @Override // androidx.appcompat.app.g
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.K.findViewById(R.id.content)).addView(view, layoutParams);
        this.v.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public boolean e() {
        return U(true);
    }

    void f0() {
        androidx.appcompat.view.menu.g gVar;
        d0 d0Var = this.A;
        if (d0Var != null) {
            d0Var.p();
        }
        if (this.F != null) {
            this.u.getDecorView().removeCallbacks(this.G);
            if (this.F.isShowing()) {
                try {
                    this.F.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.F = null;
        }
        i0();
        t tVarR0 = r0(0, false);
        if (tVarR0 == null || (gVar = tVarR0.j) == null) {
            return;
        }
        gVar.close();
    }

    boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.s;
        if (((obj instanceof j.a) || (obj instanceof androidx.appcompat.app.i)) && (decorView = this.u.getDecorView()) != null && b.i.p.j.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.v.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.g
    @androidx.annotation.i
    @androidx.annotation.h0
    public Context h(@androidx.annotation.h0 Context context) {
        this.Y = true;
        int r1 = B0(context, X());
        if (t0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, d0(context, r1, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof b.a.f.d) {
            try {
                ((b.a.f.d) context).a(d0(context, r1, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!s0) {
            return super.h(context);
        }
        try {
            Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration2 = context.getResources().getConfiguration();
            Configuration configurationD0 = d0(context, r1, configuration.equals(configuration2) ? null : m0(configuration, configuration2));
            b.a.f.d dVar = new b.a.f.d(context, a.l.Theme_AppCompat_Empty);
            dVar.a(configurationD0);
            boolean z = false;
            try {
                z = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z) {
                g.b.a(dVar.getTheme());
            }
            return super.h(dVar);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Application failed to obtain resources from itself", e2);
        }
    }

    void h0(int r5) {
        t tVarR0;
        t tVarR02 = r0(r5, true);
        if (tVarR02.j != null) {
            Bundle bundle = new Bundle();
            tVarR02.j.V(bundle);
            if (bundle.size() > 0) {
                tVarR02.u = bundle;
            }
            tVarR02.j.m0();
            tVarR02.j.clear();
        }
        tVarR02.r = true;
        tVarR02.q = true;
        if ((r5 != 108 && r5 != 0) || this.A == null || (tVarR0 = r0(0, false)) == null) {
            return;
        }
        tVarR0.m = false;
        O0(tVarR0, null);
    }

    void i0() {
        j0 j0Var = this.H;
        if (j0Var != null) {
            j0Var.c();
        }
    }

    t l0(Menu menu) {
        t[] tVarArr = this.V;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int r1 = 0; r1 < length; r1++) {
            t tVar = tVarArr[r1];
            if (tVar != null && tVar.j == menu) {
                return tVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.g
    public View m(View view, String str, @androidx.annotation.h0 Context context, @androidx.annotation.h0 AttributeSet attributeSet) {
        boolean z;
        androidx.appcompat.app.k kVar;
        boolean zS0 = false;
        if (this.o0 == null) {
            String string = this.t.obtainStyledAttributes(a.m.AppCompatTheme).getString(a.m.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                kVar = new androidx.appcompat.app.k();
            } else {
                try {
                    this.o0 = (androidx.appcompat.app.k) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    kVar = new androidx.appcompat.app.k();
                }
            }
            this.o0 = kVar;
        }
        if (q0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zS0 = S0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zS0 = true;
            }
            z = zS0;
        } else {
            z = false;
        }
        return this.o0.q(view, str, context, attributeSet, z, q0, true, f1.c());
    }

    @Override // androidx.appcompat.app.g
    @i0
    public <T extends View> T n(@w int r2) {
        j0();
        return (T) this.u.findViewById(r2);
    }

    final Context n0() {
        androidx.appcompat.app.a aVarS = s();
        Context contextZ = aVarS != null ? aVarS.z() : null;
        return contextZ == null ? this.t : contextZ;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public final b.InterfaceC0012b p() {
        return new C0013h();
    }

    @androidx.annotation.h0
    @p0({p0.a.LIBRARY})
    @x0
    final m p0() {
        return q0(this.t);
    }

    @Override // androidx.appcompat.app.g
    public int q() {
        return this.c0;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater r() {
        if (this.y == null) {
            v0();
            androidx.appcompat.app.a aVar = this.x;
            this.y = new b.a.f.g(aVar != null ? aVar.z() : this.t);
        }
        return this.y;
    }

    protected t r0(int r4, boolean z) {
        t[] tVarArr = this.V;
        if (tVarArr == null || tVarArr.length <= r4) {
            t[] tVarArr2 = new t[r4 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.V = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[r4];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(r4);
        tVarArr[r4] = tVar2;
        return tVar2;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a s() {
        v0();
        return this.x;
    }

    ViewGroup s0() {
        return this.K;
    }

    @Override // androidx.appcompat.app.g
    public boolean t(int r5) {
        int r02 = Q0(r5);
        return (r02 != 1 ? r02 != 2 ? r02 != 5 ? r02 != 10 ? r02 != 108 ? r02 != 109 ? false : this.Q : this.P : this.R : this.O : this.N : this.T) || this.u.hasFeature(r5);
    }

    final CharSequence t0() {
        Object obj = this.s;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.z;
    }

    @Override // androidx.appcompat.app.g
    public void u() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.t);
        if (layoutInflaterFrom.getFactory() == null) {
            b.i.p.k.d(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final Window.Callback u0() {
        return this.u.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void v() {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS == null || !aVarS.C()) {
            z0(0);
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean x() {
        return this.I;
    }

    @Override // androidx.appcompat.app.g
    public void y(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        androidx.appcompat.app.a aVarS;
        if (this.P && this.J && (aVarS = s()) != null) {
            aVarS.H(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.t);
        U(false);
    }

    @Override // androidx.appcompat.app.g
    public void z(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.Y = true;
        U(false);
        k0();
        Object obj = this.s;
        if (obj instanceof Activity) {
            String strD = null;
            try {
                strD = androidx.core.app.n.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strD != null) {
                androidx.appcompat.app.a aVarM0 = M0();
                if (aVarM0 == null) {
                    this.l0 = true;
                } else {
                    aVarM0.W(true);
                }
            }
            androidx.appcompat.app.g.c(this);
        }
        this.Z = true;
    }
}
