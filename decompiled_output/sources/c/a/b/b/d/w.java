package c.a.b.b.d;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.r;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class w extends o0 {
    private int e;

    protected w(byte[] bArr) {
        r.a(bArr.length == 25);
        this.e = Arrays.hashCode(bArr);
    }

    protected static byte[] i2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.m0
    public final c.a.b.b.e.c b() {
        return c.a.b.b.e.e.i2(e2());
    }

    @Override // com.google.android.gms.common.internal.m0
    public final int c() {
        return hashCode();
    }

    abstract byte[] e2();

    public boolean equals(@i0 Object obj) {
        c.a.b.b.e.c cVarB;
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.c() == hashCode() && (cVarB = m0Var.b()) != null) {
                    return Arrays.equals(e2(), (byte[]) c.a.b.b.e.e.e2(cVarB));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.e;
    }
}
