package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
final class qs2 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private ByteArrayOutputStream f5059a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private Base64OutputStream f5060b = new Base64OutputStream(this.f5059a, 10);

    public final void a(byte[] bArr) throws IOException {
        this.f5060b.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() throws IOException {
        String string;
        try {
            this.f5060b.close();
        } catch (IOException e) {
            tr.c("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.f5059a.close();
                string = this.f5059a.toString();
            } catch (IOException e2) {
                tr.c("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.f5059a = null;
            this.f5060b = null;
        }
    }
}
