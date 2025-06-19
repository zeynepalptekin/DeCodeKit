package com.google.android.gms.measurement.internal;

import android.content.Context;
import c.a.b.b.g.c.hd;
import c.a.b.b.g.c.wb;
import c.a.b.b.g.c.ye;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public final class p3 extends g5 {

    /* renamed from: c, reason: collision with root package name */
    private String f6482c;
    private String d;
    private int e;
    private String f;
    private String g;
    private long h;
    private long i;
    private List<String> j;
    private int k;
    private String l;
    private String m;
    private String n;

    p3(b5 b5Var, long j) {
        super(b5Var);
        this.i = j;
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final String J() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        y3 y3VarJ;
        String str;
        if (ye.b() && j().p(u.m0)) {
            y3VarJ = B().N();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> clsLoadClass = F().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    return null;
                }
                try {
                    Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, F());
                    if (objInvoke == null) {
                        return null;
                    }
                    try {
                        return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                    } catch (Exception unused) {
                        y3VarJ = B().K();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    y3VarJ = B().J();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        y3VarJ.a(str);
        return null;
    }

    final String A() {
        s();
        return this.f6482c;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    final String C() {
        s();
        return this.l;
    }

    final String D() {
        s();
        return this.m;
    }

    final String E() {
        s();
        return this.n;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    final int G() {
        s();
        return this.e;
    }

    final int H() {
        s();
        return this.k;
    }

    @androidx.annotation.i0
    final List<String> I() {
        return this.j;
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
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(1:4)(28:125|6|(1:10)(2:11|(1:13))|123|14|(4:16|(1:18)(1:20)|127|21)|26|(1:31)(1:30)|32|(1:37)(1:36)|38|(1:(1:41)(1:42))|(4:44|45|56|(1:58)(1:59))(0)|60|(1:62)|129|63|(1:68)(1:67)|69|(1:71)(1:72)|73|74|(3:88|(2:90|87)|(3:92|(1:94)(1:95)|96))(5:78|(1:80)(1:81)|82|(2:86|87)|(0))|100|(3:102|(1:104)(3:106|(3:109|(1:132)(1:133)|107)|131)|105)|(1:113)|114|(1:(2:117|118)(2:119|120))(2:121|122))|5|26|(2:28|31)(0)|32|(2:34|37)(0)|38|(0)|(0)(0)|60|(0)|129|63|(7:65|68|69|(0)(0)|73|74|(4:76|88|(0)|(0))(0))(0)|100|(0)|(0)|114|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0211, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0212, code lost:
    
        B().E().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.w3.t(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178 A[Catch: IllegalStateException -> 0x0211, TryCatch #3 {IllegalStateException -> 0x0211, blocks: (B:63:0x0172, B:65:0x0178, B:67:0x0184, B:69:0x0193, B:73:0x019c, B:76:0x01a6, B:78:0x01b2, B:82:0x01c9, B:84:0x01d1, B:92:0x01f4, B:94:0x0208, B:96:0x020d, B:95:0x020b, B:86:0x01d7, B:87:0x01db, B:88:0x01de, B:90:0x01e4, B:68:0x018f), top: B:129:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f A[Catch: IllegalStateException -> 0x0211, TryCatch #3 {IllegalStateException -> 0x0211, blocks: (B:63:0x0172, B:65:0x0178, B:67:0x0184, B:69:0x0193, B:73:0x019c, B:76:0x01a6, B:78:0x01b2, B:82:0x01c9, B:84:0x01d1, B:92:0x01f4, B:94:0x0208, B:96:0x020d, B:95:0x020b, B:86:0x01d7, B:87:0x01db, B:88:0x01de, B:90:0x01e4, B:68:0x018f), top: B:129:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de A[Catch: IllegalStateException -> 0x0211, TryCatch #3 {IllegalStateException -> 0x0211, blocks: (B:63:0x0172, B:65:0x0178, B:67:0x0184, B:69:0x0193, B:73:0x019c, B:76:0x01a6, B:78:0x01b2, B:82:0x01c9, B:84:0x01d1, B:92:0x01f4, B:94:0x0208, B:96:0x020d, B:95:0x020b, B:86:0x01d7, B:87:0x01db, B:88:0x01de, B:90:0x01e4, B:68:0x018f), top: B:129:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e4 A[Catch: IllegalStateException -> 0x0211, TryCatch #3 {IllegalStateException -> 0x0211, blocks: (B:63:0x0172, B:65:0x0178, B:67:0x0184, B:69:0x0193, B:73:0x019c, B:76:0x01a6, B:78:0x01b2, B:82:0x01c9, B:84:0x01d1, B:92:0x01f4, B:94:0x0208, B:96:0x020d, B:95:0x020b, B:86:0x01d7, B:87:0x01db, B:88:0x01de, B:90:0x01e4, B:68:0x018f), top: B:129:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4 A[Catch: IllegalStateException -> 0x0211, TryCatch #3 {IllegalStateException -> 0x0211, blocks: (B:63:0x0172, B:65:0x0178, B:67:0x0184, B:69:0x0193, B:73:0x019c, B:76:0x01a6, B:78:0x01b2, B:82:0x01c9, B:84:0x01d1, B:92:0x01f4, B:94:0x0208, B:96:0x020d, B:95:0x020b, B:86:0x01d7, B:87:0x01db, B:88:0x01de, B:90:0x01e4, B:68:0x018f), top: B:129:0x0172 }] */
    @Override // com.google.android.gms.measurement.internal.g5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void w() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p3.w():void");
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @androidx.annotation.y0
    final ma y(String str) {
        c();
        String strA = A();
        String strC = C();
        s();
        String str2 = this.d;
        long jG = G();
        s();
        String str3 = this.f;
        s();
        c();
        if (this.h == 0) {
            this.h = this.f6543a.G().u(F(), F().getPackageName());
        }
        long j = this.h;
        boolean zL = this.f6543a.l();
        boolean z = !i().v;
        c();
        String strJ = !this.f6543a.l() ? null : J();
        b5 b5Var = this.f6543a;
        Long lValueOf = Long.valueOf(b5Var.t().j.a());
        long jMin = lValueOf.longValue() == 0 ? b5Var.G : Math.min(b5Var.G, lValueOf.longValue());
        int r22 = H();
        boolean zBooleanValue = j().G().booleanValue();
        Boolean boolD = j().D("google_analytics_ssaid_collection_enabled");
        boolean zBooleanValue2 = Boolean.valueOf(boolD == null || boolD.booleanValue()).booleanValue();
        j4 j4VarI = i();
        j4VarI.c();
        boolean z2 = j4VarI.D().getBoolean("deferred_analytics_collection", false);
        String strD = D();
        Boolean boolD2 = j().D("google_analytics_default_allow_ad_personalization_signals");
        return new ma(strA, strC, str2, jG, str3, 32053L, j, str, zL, z, strJ, 0L, jMin, r22, zBooleanValue, zBooleanValue2, z2, strD, boolD2 == null ? null : Boolean.valueOf(true ^ boolD2.booleanValue()), this.i, this.j, (hd.b() && j().p(u.k0)) ? E() : null, (wb.b() && j().p(u.J0)) ? i().L().e() : "");
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
