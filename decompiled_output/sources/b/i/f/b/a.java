package b.i.f.b;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.o0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1040a;

    /* renamed from: b.i.f.b.a$a, reason: collision with other inner class name */
    class C0059a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1041a;

        C0059a(b bVar) {
            this.f1041a = bVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int r2, CharSequence charSequence) {
            this.f1041a.a(r2, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f1041a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int r2, CharSequence charSequence) {
            this.f1041a.c(r2, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f1041a.d(new c(a.f(authenticationResult.getCryptoObject())));
        }
    }

    public static abstract class b {
        public void a(int r1, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int r1, CharSequence charSequence) {
        }

        public void d(c cVar) {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f1042a;

        public c(d dVar) {
            this.f1042a = dVar;
        }

        public d a() {
            return this.f1042a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f1043a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f1044b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f1045c;

        public d(@h0 Signature signature) {
            this.f1043a = signature;
            this.f1044b = null;
            this.f1045c = null;
        }

        public d(@h0 Cipher cipher) {
            this.f1044b = cipher;
            this.f1043a = null;
            this.f1045c = null;
        }

        public d(@h0 Mac mac) {
            this.f1045c = mac;
            this.f1044b = null;
            this.f1043a = null;
        }

        @i0
        public Cipher a() {
            return this.f1044b;
        }

        @i0
        public Mac b() {
            return this.f1045c;
        }

        @i0
        public Signature c() {
            return this.f1043a;
        }
    }

    private a(Context context) {
        this.f1040a = context;
    }

    @h0
    public static a b(@h0 Context context) {
        return new a(context);
    }

    @i0
    @m0(23)
    private static FingerprintManager c(@h0 Context context) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 != 23 && (r0 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    @m0(23)
    static d f(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new d(cryptoObject.getMac());
        }
        return null;
    }

    @m0(23)
    private static FingerprintManager.AuthenticationCallback g(b bVar) {
        return new C0059a(bVar);
    }

    @m0(23)
    private static FingerprintManager.CryptoObject h(d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar.a() != null) {
            return new FingerprintManager.CryptoObject(dVar.a());
        }
        if (dVar.c() != null) {
            return new FingerprintManager.CryptoObject(dVar.c());
        }
        if (dVar.b() != null) {
            return new FingerprintManager.CryptoObject(dVar.b());
        }
        return null;
    }

    @o0("android.permission.USE_FINGERPRINT")
    public void a(@i0 d dVar, int r9, @i0 b.i.k.b bVar, @h0 b bVar2, @i0 Handler handler) {
        FingerprintManager fingerprintManagerC;
        if (Build.VERSION.SDK_INT < 23 || (fingerprintManagerC = c(this.f1040a)) == null) {
            return;
        }
        fingerprintManagerC.authenticate(h(dVar), bVar != null ? (CancellationSignal) bVar.b() : null, r9, g(bVar2), handler);
    }

    @o0("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager fingerprintManagerC;
        return Build.VERSION.SDK_INT >= 23 && (fingerprintManagerC = c(this.f1040a)) != null && fingerprintManagerC.hasEnrolledFingerprints();
    }

    @o0("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager fingerprintManagerC;
        return Build.VERSION.SDK_INT >= 23 && (fingerprintManagerC = c(this.f1040a)) != null && fingerprintManagerC.isHardwareDetected();
    }
}
