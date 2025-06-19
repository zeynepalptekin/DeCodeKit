package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class et extends rg {

    /* renamed from: a, reason: collision with root package name */
    private final gv f3323a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f3324b;

    public et() {
        this(null);
    }

    private et(gv gvVar) {
        this(null, null);
    }

    private et(gv gvVar, SSLSocketFactory sSLSocketFactory) {
        this.f3323a = null;
        this.f3324b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    @androidx.annotation.x0
    private static List<bv2> c(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new bv2(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private final void d(HttpURLConnection httpURLConnection, b<?> bVar) throws sl2, IOException {
        byte[] bArrE = bVar.E();
        if (bArrE != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArrE);
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[Catch: all -> 0x0114, TryCatch #1 {all -> 0x0114, blocks: (B:14:0x0068, B:15:0x0070, B:17:0x0076, B:18:0x0086, B:19:0x008a, B:20:0x008d, B:55:0x010e, B:56:0x0113, B:21:0x0091, B:22:0x0096, B:24:0x009c, B:28:0x00a9, B:29:0x00af, B:31:0x00b8, B:33:0x00bf, B:46:0x00db, B:53:0x0106, B:54:0x010d), top: B:63:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106 A[Catch: all -> 0x0114, TRY_ENTER, TryCatch #1 {all -> 0x0114, blocks: (B:14:0x0068, B:15:0x0070, B:17:0x0076, B:18:0x0086, B:19:0x008a, B:20:0x008d, B:55:0x010e, B:56:0x0113, B:21:0x0091, B:22:0x0096, B:24:0x009c, B:28:0x00a9, B:29:0x00af, B:31:0x00b8, B:33:0x00bf, B:46:0x00db, B:53:0x0106, B:54:0x010d), top: B:63:0x0068 }] */
    @Override // com.google.android.gms.internal.ads.rg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.cr a(com.google.android.gms.internal.ads.b<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et.a(com.google.android.gms.internal.ads.b, java.util.Map):com.google.android.gms.internal.ads.cr");
    }
}
