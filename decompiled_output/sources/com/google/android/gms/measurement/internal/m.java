package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m extends y5 {

    /* renamed from: c, reason: collision with root package name */
    private long f6453c;
    private String d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    m(b5 b5Var) {
        super(b5Var);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
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

    @Override // com.google.android.gms.measurement.internal.y5
    protected final boolean o() {
        Calendar calendar = Calendar.getInstance();
        this.f6453c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }

    public final boolean q(Context context) throws PackageManager.NameNotFoundException {
        if (this.e == null) {
            this.e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final long r() {
        l();
        return this.f6453c;
    }

    public final String s() {
        l();
        return this.d;
    }

    @androidx.annotation.y0
    final long t() {
        c();
        return this.h;
    }

    @androidx.annotation.y0
    final void u() {
        c();
        this.g = null;
        this.h = 0L;
    }

    @androidx.annotation.y0
    final boolean v() throws OperationCanceledException, IOException, AuthenticatorException {
        c();
        long jA = z().a();
        if (jA - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (b.i.c.c.a(F(), "android.permission.GET_ACCOUNTS") != 0) {
            B().J().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f == null) {
                this.f = AccountManager.get(F());
            }
            try {
                Account[] result = this.f.getAccountsByTypeAndFeatures(com.google.android.gms.common.internal.b.f2507a, new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.g = Boolean.TRUE;
                    this.h = jA;
                    return true;
                }
                Account[] result2 = this.f.getAccountsByTypeAndFeatures(com.google.android.gms.common.internal.b.f2507a, new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.g = Boolean.TRUE;
                    this.h = jA;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                B().G().b("Exception checking account types", e);
            }
        }
        this.h = jA;
        this.g = Boolean.FALSE;
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
