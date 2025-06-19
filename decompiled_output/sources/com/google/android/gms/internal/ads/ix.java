package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public class ix extends b<String> {
    private final Object s;

    @androidx.annotation.i0
    @androidx.annotation.u("mLock")
    private ma<String> t;

    public ix(int r1, String str, ma<String> maVar, @androidx.annotation.i0 j7 j7Var) {
        super(r1, str, j7Var);
        this.s = new Object();
        this.t = maVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.b
    /* renamed from: O */
    public void q(String str) {
        ma<String> maVar;
        synchronized (this.s) {
            maVar = this.t;
        }
        if (maVar != null) {
            maVar.c(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.b
    protected final k8<String> n(fz2 fz2Var) {
        String str;
        String str2;
        try {
            byte[] bArr = fz2Var.f3478b;
            Map<String, String> map = fz2Var.f3479c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int r6 = 1;
                while (true) {
                    if (r6 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[r6].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    r6++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(fz2Var.f3478b);
        }
        return k8.b(str, ds.a(fz2Var));
    }
}
