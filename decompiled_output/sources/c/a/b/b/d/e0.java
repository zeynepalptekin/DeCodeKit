package c.a.b.b.d;

import android.util.Log;
import com.google.android.gms.common.internal.r;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes.dex */
class e0 {
    private static final e0 d = new e0(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f1605a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f1606b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Throwable f1607c;

    e0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f1605a = z;
        this.f1606b = str;
        this.f1607c = th;
    }

    static e0 a() {
        return d;
    }

    static e0 b(@androidx.annotation.h0 String str) {
        return new e0(false, str, null);
    }

    static e0 c(@androidx.annotation.h0 String str, @androidx.annotation.h0 Throwable th) {
        return new e0(false, str, th);
    }

    static e0 d(Callable<String> callable) {
        return new g0(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(String str, w wVar, boolean z, boolean z2) {
        String str2 = z2 ? "debug cert rejected" : "not allowed";
        StringBuilder sb = new StringBuilder(14);
        sb.append("12451009.false");
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.n.a(((MessageDigest) r.k(com.google.android.gms.common.util.a.c("SHA-1"))).digest(wVar.e2())), Boolean.valueOf(z), sb.toString());
    }

    @Nullable
    String f() {
        return this.f1606b;
    }

    final void g() {
        if (this.f1605a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f1607c != null) {
            Log.d("GoogleCertificatesRslt", f(), this.f1607c);
        } else {
            Log.d("GoogleCertificatesRslt", f());
        }
    }
}
