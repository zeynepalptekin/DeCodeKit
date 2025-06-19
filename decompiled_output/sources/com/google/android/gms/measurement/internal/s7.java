package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.c.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class s7 extends g5 {

    /* renamed from: c, reason: collision with root package name */
    private volatile p7 f6510c;
    private p7 d;

    @com.google.android.gms.common.util.d0
    protected p7 e;
    private final Map<Activity, p7> f;
    private Activity g;
    private volatile boolean h;
    private volatile p7 i;
    private p7 j;
    private boolean k;
    private final Object l;
    private p7 m;
    private String n;

    public s7(b5 b5Var) {
        super(b5Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    static /* synthetic */ p7 A(s7 s7Var, p7 p7Var) {
        s7Var.j = null;
        return null;
    }

    @com.google.android.gms.common.util.d0
    private static String D(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    @androidx.annotation.e0
    private final void H(Activity activity, p7 p7Var, boolean z) throws IllegalStateException {
        p7 p7Var2;
        p7 p7Var3 = this.f6510c == null ? this.d : this.f6510c;
        if (p7Var.f6487b == null) {
            p7Var2 = new p7(p7Var.f6486a, activity != null ? D(activity.getClass().getCanonicalName()) : null, p7Var.f6488c, p7Var.e, p7Var.f);
        } else {
            p7Var2 = p7Var;
        }
        this.d = this.f6510c;
        this.f6510c = p7Var2;
        x().v(new u7(this, p7Var2, p7Var3, z().c(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void K(Bundle bundle, @androidx.annotation.h0 p7 p7Var, p7 p7Var2, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.b.q0);
            bundle.remove(FirebaseAnalytics.b.p0);
        }
        M(p7Var, p7Var2, j, true, h().C(null, FirebaseAnalytics.a.D, bundle, null, true, true));
    }

    public static void L(p7 p7Var, Bundle bundle, boolean z) {
        if (bundle == null || p7Var == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && p7Var == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = p7Var.f6486a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = p7Var.f6487b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", p7Var.f6488c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(com.google.android.gms.measurement.internal.p7 r10, com.google.android.gms.measurement.internal.p7 r11, long r12, boolean r14, android.os.Bundle r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.s7.M(com.google.android.gms.measurement.internal.p7, com.google.android.gms.measurement.internal.p7, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void N(p7 p7Var, boolean z, long j) {
        k().r(z().c());
        if (!q().D(p7Var != null && p7Var.d, z, j) || p7Var == null) {
            return;
        }
        p7Var.d = false;
    }

    @androidx.annotation.e0
    private final p7 W(@androidx.annotation.h0 Activity activity) {
        com.google.android.gms.common.internal.r.k(activity);
        p7 p7Var = this.f.get(activity);
        if (p7Var == null) {
            p7 p7Var2 = new p7(null, D(activity.getClass().getCanonicalName()), h().E0());
            this.f.put(activity, p7Var2);
            p7Var = p7Var2;
        }
        return (j().p(u.w0) && this.i != null) ? this.i : p7Var;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @androidx.annotation.y0
    public final p7 C(boolean z) {
        s();
        c();
        if (!j().p(u.w0) || !z) {
            return this.e;
        }
        p7 p7Var = this.e;
        return p7Var != null ? p7Var : this.j;
    }

    @androidx.annotation.e0
    public final void E(Activity activity) throws IllegalStateException {
        if (j().p(u.w0)) {
            synchronized (this.l) {
                this.k = true;
                if (activity != this.g) {
                    synchronized (this.l) {
                        this.g = activity;
                        this.h = false;
                    }
                    if (j().p(u.v0) && j().I().booleanValue()) {
                        this.i = null;
                        x().v(new y7(this));
                    }
                }
            }
        }
        if (j().p(u.v0) && !j().I().booleanValue()) {
            this.f6510c = this.i;
            x().v(new t7(this));
        } else {
            H(activity, W(activity), false);
            a aVarK = k();
            aVarK.x().v(new e3(aVarK, aVarK.z().c()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @androidx.annotation.e0
    public final void G(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!j().I().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new p7(bundle2.getString(a.C0190a.f6334b), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @androidx.annotation.e0
    @Deprecated
    public final void I(@androidx.annotation.h0 Activity activity, @androidx.annotation.i0 @androidx.annotation.q0(max = 36, min = 1) String str, @androidx.annotation.i0 @androidx.annotation.q0(max = 36, min = 1) String str2) throws IllegalStateException {
        if (!j().I().booleanValue()) {
            B().K().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        if (this.f6510c == null) {
            B().K().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            B().K().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass().getCanonicalName());
        }
        boolean zB0 = ha.B0(this.f6510c.f6487b, str2);
        boolean zB02 = ha.B0(this.f6510c.f6486a, str);
        if (zB0 && zB02) {
            B().K().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            B().K().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            B().K().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        B().N().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        p7 p7Var = new p7(str, str2, h().E0());
        this.f.put(activity, p7Var);
        H(activity, p7Var, true);
    }

    public final void J(Bundle bundle, long j) {
        String str;
        if (!j().p(u.w0)) {
            B().K().a("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.l) {
            if (!this.k) {
                B().K().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String strD = null;
            if (bundle != null) {
                String string = bundle.getString(FirebaseAnalytics.b.q0);
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    B().K().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.b.p0);
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    B().K().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    strD = string2;
                }
            } else {
                str = null;
            }
            if (strD == null) {
                strD = this.g != null ? D(this.g.getClass().getCanonicalName()) : "Activity";
            }
            String str2 = strD;
            if (this.h && this.f6510c != null) {
                this.h = false;
                boolean zB0 = ha.B0(this.f6510c.f6487b, str2);
                boolean zB02 = ha.B0(this.f6510c.f6486a, str);
                if (zB0 && zB02) {
                    B().K().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            B().N().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
            p7 p7Var = this.f6510c == null ? this.d : this.f6510c;
            p7 p7Var2 = new p7(str, str2, h().E0(), true, j);
            this.f6510c = p7Var2;
            this.d = p7Var;
            this.i = p7Var2;
            x().v(new r7(this, bundle, p7Var2, p7Var, z().c()));
        }
    }

    @androidx.annotation.y0
    public final void R(String str, p7 p7Var) {
        c();
        synchronized (this) {
            if (this.n == null || this.n.equals(str) || p7Var != null) {
                this.n = str;
                this.m = p7Var;
            }
        }
    }

    public final p7 S() {
        return this.f6510c;
    }

    @androidx.annotation.e0
    public final void T(Activity activity) throws IllegalStateException {
        if (j().p(u.w0)) {
            synchronized (this.l) {
                this.k = false;
                this.h = true;
            }
        }
        long jC = z().c();
        if (j().p(u.v0) && !j().I().booleanValue()) {
            this.f6510c = null;
            x().v(new w7(this, jC));
        } else {
            p7 p7VarW = W(activity);
            this.d = this.f6510c;
            this.f6510c = null;
            x().v(new v7(this, p7VarW, jC));
        }
    }

    @androidx.annotation.e0
    public final void U(Activity activity, Bundle bundle) {
        p7 p7Var;
        if (!j().I().booleanValue() || bundle == null || (p7Var = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", p7Var.f6488c);
        bundle2.putString(a.C0190a.f6334b, p7Var.f6486a);
        bundle2.putString("referrer_name", p7Var.f6487b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @androidx.annotation.e0
    public final void V(Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
        }
        if (j().I().booleanValue()) {
            this.f.remove(activity);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ f6 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p3 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ x7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s7 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.g5
    protected final boolean v() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
