package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.core.app.a;
import androidx.core.app.z;
import androidx.lifecycle.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class d extends ComponentActivity implements a.b, a.d {
    private static final String u = "FragmentActivity";
    static final String v = "android:support:fragments";
    static final String w = "android:support:next_request_index";
    static final String x = "android:support:request_indicies";
    static final String y = "android:support:request_fragment_who";
    static final int z = 65534;
    final f k;
    final androidx.lifecycle.k l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    b.f.j<String> t;

    class a extends h<d> implements androidx.lifecycle.x, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.j
        @h0
        public androidx.lifecycle.g b() {
            return d.this.l;
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        @i0
        public View c(int r2) {
            return d.this.findViewById(r2);
        }

        @Override // androidx.activity.c
        @h0
        public OnBackPressedDispatcher d() {
            return d.this.d();
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean f() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.x
        @h0
        public androidx.lifecycle.w j() {
            return d.this.j();
        }

        @Override // androidx.fragment.app.h
        public void k(@h0 Fragment fragment) {
            d.this.x(fragment);
        }

        @Override // androidx.fragment.app.h
        public void l(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        @h0
        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean p() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public void q(@h0 Fragment fragment, @h0 String[] strArr, int r4) {
            d.this.A(fragment, strArr, r4);
        }

        @Override // androidx.fragment.app.h
        public boolean r(@h0 Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public boolean s(@h0 String str) {
            return androidx.core.app.a.H(d.this, str);
        }

        @Override // androidx.fragment.app.h
        public void t(@h0 Fragment fragment, Intent intent, int r4) {
            d.this.D(fragment, intent, r4);
        }

        @Override // androidx.fragment.app.h
        public void u(@h0 Fragment fragment, Intent intent, int r4, @i0 Bundle bundle) {
            d.this.E(fragment, intent, r4, bundle);
        }

        @Override // androidx.fragment.app.h
        public void v(@h0 Fragment fragment, IntentSender intentSender, int r13, @i0 Intent intent, int r15, int r16, int r17, Bundle bundle) throws IntentSender.SendIntentException {
            d.this.F(fragment, intentSender, r13, intent, r15, r16, r17, bundle);
        }

        @Override // androidx.fragment.app.h
        public void w() {
            d.this.H();
        }

        @Override // androidx.fragment.app.h
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public d m() {
            return d.this;
        }
    }

    public d() {
        this.k = f.b(new a());
        this.l = new androidx.lifecycle.k(this);
        this.o = true;
    }

    @androidx.annotation.n
    public d(@c0 int r1) {
        super(r1);
        this.k = f.b(new a());
        this.l = new androidx.lifecycle.k(this);
        this.o = true;
    }

    private int q(@h0 Fragment fragment) {
        if (this.t.C() >= z) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.t.m(this.s) >= 0) {
            this.s = (this.s + 1) % z;
        }
        int r0 = this.s;
        this.t.q(r0, fragment.h);
        this.s = (this.s + 1) % z;
        return r0;
    }

    static void r(int r1) {
        if ((r1 & b.i.g.b.a.f1048c) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void v() {
        while (w(t(), g.b.CREATED)) {
        }
    }

    private static boolean w(i iVar, g.b bVar) {
        boolean zW = false;
        for (Fragment fragment : iVar.l()) {
            if (fragment != null) {
                if (fragment.b().b().e(g.b.STARTED)) {
                    fragment.V.q(bVar);
                    zW = true;
                }
                if (fragment.A() != null) {
                    zW |= w(fragment.t(), bVar);
                }
            }
        }
        return zW;
    }

    void A(@h0 Fragment fragment, @h0 String[] strArr, int r5) {
        if (r5 == -1) {
            androidx.core.app.a.C(this, strArr, r5);
            return;
        }
        r(r5);
        try {
            this.p = true;
            androidx.core.app.a.C(this, strArr, ((q(fragment) + 1) << 16) + (r5 & b.i.g.b.a.f1046a));
        } finally {
            this.p = false;
        }
    }

    public void B(@i0 z zVar) {
        androidx.core.app.a.E(this, zVar);
    }

    public void C(@i0 z zVar) {
        androidx.core.app.a.F(this, zVar);
    }

    public void D(@h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int r4) {
        E(fragment, intent, r4, null);
    }

    public void E(@h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int r6, @i0 Bundle bundle) {
        this.r = true;
        try {
            if (r6 == -1) {
                androidx.core.app.a.I(this, intent, -1, bundle);
            } else {
                r(r6);
                androidx.core.app.a.I(this, intent, ((q(fragment) + 1) << 16) + (r6 & b.i.g.b.a.f1046a), bundle);
            }
        } finally {
            this.r = false;
        }
    }

    public void F(@h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int r14, @i0 Intent intent, int r16, int r17, int r18, @i0 Bundle bundle) throws IntentSender.SendIntentException {
        this.q = true;
        try {
            if (r14 == -1) {
                androidx.core.app.a.J(this, intentSender, r14, intent, r16, r17, r18, bundle);
            } else {
                r(r14);
                androidx.core.app.a.J(this, intentSender, ((q(fragment) + 1) << 16) + (r14 & b.i.g.b.a.f1046a), intent, r16, r17, r18, bundle);
            }
        } finally {
            this.q = false;
        }
    }

    public void G() {
        androidx.core.app.a.v(this);
    }

    @Deprecated
    public void H() {
        invalidateOptionsMenu();
    }

    public void I() {
        androidx.core.app.a.z(this);
    }

    public void J() {
        androidx.core.app.a.K(this);
    }

    @Override // androidx.core.app.a.d
    public final void c(int r2) {
        if (this.p || r2 == -1) {
            return;
        }
        r(r2);
    }

    @Override // android.app.Activity
    public void dump(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.n);
        printWriter.print(" mStopped=");
        printWriter.print(this.o);
        if (getApplication() != null) {
            b.q.b.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.k.D().c(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onActivityResult(int r4, int r5, @i0 Intent intent) {
        this.k.F();
        int r0 = r4 >> 16;
        if (r0 == 0) {
            a.c cVarW = androidx.core.app.a.w();
            if (cVarW == null || !cVarW.a(this, r4, r5, intent)) {
                super.onActivityResult(r4, r5, intent);
                return;
            }
            return;
        }
        int r02 = r0 - 1;
        String strK = this.t.k(r02);
        this.t.t(r02);
        if (strK == null) {
            Log.w(u, "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentA = this.k.A(strK);
        if (fragmentA != null) {
            fragmentA.t0(r4 & b.i.g.b.a.f1046a, r5, intent);
            return;
        }
        Log.w(u, "Activity result no fragment exists for who: " + strK);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@h0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.F();
        this.k.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    protected void onCreate(@i0 Bundle bundle) {
        this.k.a(null);
        if (bundle != null) {
            this.k.L(bundle.getParcelable(v));
            if (bundle.containsKey(w)) {
                this.s = bundle.getInt(w);
                int[] intArray = bundle.getIntArray(x);
                String[] stringArray = bundle.getStringArray(y);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(u, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.t = new b.f.j<>(intArray.length);
                    for (int r3 = 0; r3 < intArray.length; r3++) {
                        this.t.q(intArray[r3], stringArray[r3]);
                    }
                }
            }
        }
        if (this.t == null) {
            this.t = new b.f.j<>();
            this.s = 0;
        }
        super.onCreate(bundle);
        this.l.j(g.a.ON_CREATE);
        this.k.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r3, @h0 Menu menu) {
        return r3 == 0 ? super.onCreatePanelMenu(r3, menu) | this.k.g(menu, getMenuInflater()) : super.onCreatePanelMenu(r3, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @i0
    public View onCreateView(@i0 View view, @h0 String str, @h0 Context context, @h0 AttributeSet attributeSet) {
        View viewS = s(view, str, context, attributeSet);
        return viewS == null ? super.onCreateView(view, str, context, attributeSet) : viewS;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @i0
    public View onCreateView(@h0 String str, @h0 Context context, @h0 AttributeSet attributeSet) {
        View viewS = s(null, str, context, attributeSet);
        return viewS == null ? super.onCreateView(str, context, attributeSet) : viewS;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.k.h();
        this.l.j(g.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.k.j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, @h0 MenuItem menuItem) {
        if (super.onMenuItemSelected(r2, menuItem)) {
            return true;
        }
        if (r2 == 0) {
            return this.k.l(menuItem);
        }
        if (r2 != 6) {
            return false;
        }
        return this.k.e(menuItem);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    public void onMultiWindowModeChanged(boolean z2) {
        this.k.k(z2);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.k.F();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, @h0 Menu menu) {
        if (r2 == 0) {
            this.k.m(menu);
        }
        super.onPanelClosed(r2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.n = false;
        this.k.n();
        this.l.j(g.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    public void onPictureInPictureModeChanged(boolean z2) {
        this.k.o(z2);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        z();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, @i0 View view, @h0 Menu menu) {
        return r1 == 0 ? y(view, menu) | this.k.p(menu) : super.onPreparePanel(r1, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int r5, @h0 String[] strArr, @h0 int[] r7) {
        this.k.F();
        int r0 = (r5 >> 16) & b.i.g.b.a.f1046a;
        if (r0 != 0) {
            int r02 = r0 - 1;
            String strK = this.t.k(r02);
            this.t.t(r02);
            if (strK == null) {
                Log.w(u, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentA = this.k.A(strK);
            if (fragmentA != null) {
                fragmentA.S0(r5 & b.i.g.b.a.f1046a, strArr, r7);
                return;
            }
            Log.w(u, "Activity result no fragment exists for who: " + strK);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.n = true;
        this.k.F();
        this.k.z();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    protected void onSaveInstanceState(@h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        v();
        this.l.j(g.a.ON_STOP);
        Parcelable parcelableP = this.k.P();
        if (parcelableP != null) {
            bundle.putParcelable(v, parcelableP);
        }
        if (this.t.C() > 0) {
            bundle.putInt(w, this.s);
            int[] r0 = new int[this.t.C()];
            String[] strArr = new String[this.t.C()];
            for (int r2 = 0; r2 < this.t.C(); r2++) {
                r0[r2] = this.t.p(r2);
                strArr[r2] = this.t.D(r2);
            }
            bundle.putIntArray(x, r0);
            bundle.putStringArray(y, strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.o = false;
        if (!this.m) {
            this.m = true;
            this.k.c();
        }
        this.k.F();
        this.k.z();
        this.l.j(g.a.ON_START);
        this.k.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.k.F();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.o = true;
        v();
        this.k.t();
        this.l.j(g.a.ON_STOP);
    }

    @i0
    final View s(@i0 View view, @h0 String str, @h0 Context context, @h0 AttributeSet attributeSet) {
        return this.k.G(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int r3) {
        if (!this.r && r3 != -1) {
            r(r3);
        }
        super.startActivityForResult(intent, r3);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int r3, @i0 Bundle bundle) {
        if (!this.r && r3 != -1) {
            r(r3);
        }
        super.startActivityForResult(intent, r3, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int r3, @i0 Intent intent, int r5, int r6, int r7) throws IntentSender.SendIntentException {
        if (!this.q && r3 != -1) {
            r(r3);
        }
        super.startIntentSenderForResult(intentSender, r3, intent, r5, r6, r7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int r3, @i0 Intent intent, int r5, int r6, int r7, @i0 Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.q && r3 != -1) {
            r(r3);
        }
        super.startIntentSenderForResult(intentSender, r3, intent, r5, r6, r7, bundle);
    }

    @h0
    public i t() {
        return this.k.D();
    }

    @h0
    @Deprecated
    public b.q.b.a u() {
        return b.q.b.a.d(this);
    }

    public void x(@h0 Fragment fragment) {
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    protected boolean y(@i0 View view, @h0 Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void z() {
        this.l.j(g.a.ON_RESUME);
        this.k.r();
    }
}
