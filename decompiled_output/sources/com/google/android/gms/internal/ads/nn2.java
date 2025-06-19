package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class nn2 {

    /* renamed from: a, reason: collision with root package name */
    private final mk2[] f4575a;

    /* renamed from: b, reason: collision with root package name */
    private final ok2 f4576b;

    /* renamed from: c, reason: collision with root package name */
    private mk2 f4577c;

    public nn2(mk2[] mk2VarArr, ok2 ok2Var) {
        this.f4575a = mk2VarArr;
        this.f4576b = ok2Var;
    }

    public final void a() {
        mk2 mk2Var = this.f4577c;
        if (mk2Var != null) {
            mk2Var.a();
            this.f4577c = null;
        }
    }

    public final mk2 b(pk2 pk2Var, Uri uri) throws InterruptedException, IOException {
        mk2 mk2Var = this.f4577c;
        if (mk2Var != null) {
            return mk2Var;
        }
        mk2[] mk2VarArr = this.f4575a;
        int length = mk2VarArr.length;
        int r2 = 0;
        while (true) {
            if (r2 >= length) {
                break;
            }
            mk2 mk2Var2 = mk2VarArr[r2];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                pk2Var.c();
                throw th;
            }
            if (mk2Var2.d(pk2Var)) {
                this.f4577c = mk2Var2;
                pk2Var.c();
                break;
            }
            continue;
            pk2Var.c();
            r2++;
        }
        mk2 mk2Var3 = this.f4577c;
        if (mk2Var3 != null) {
            mk2Var3.f(this.f4576b);
            return this.f4577c;
        }
        String strD = nq2.d(this.f4575a);
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(strD);
        sb.append(") could read the stream.");
        throw new no2(sb.toString(), uri);
    }
}
