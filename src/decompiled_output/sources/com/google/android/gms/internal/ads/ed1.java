package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ed1 implements ff1<fd1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f3257a;

    /* renamed from: b, reason: collision with root package name */
    private final an1 f3258b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f3259c;
    private final qo d;

    public ed1(cy1 cy1Var, an1 an1Var, @androidx.annotation.i0 PackageInfo packageInfo, qo qoVar) {
        this.f3257a = cy1Var;
        this.f3258b = an1Var;
        this.f3259c = packageInfo;
        this.d = qoVar;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<fd1> a() {
        return this.f3257a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.id1

            /* renamed from: a, reason: collision with root package name */
            private final ed1 f3809a;

            {
                this.f3809a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3809a.c();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed1.b(java.util.ArrayList, android.os.Bundle):void");
    }

    final /* synthetic */ fd1 c() throws Exception {
        final ArrayList<String> arrayList = this.f3258b.g;
        return arrayList == null ? hd1.f3662a : arrayList.isEmpty() ? kd1.f4077a : new fd1(this, arrayList) { // from class: com.google.android.gms.internal.ads.jd1

            /* renamed from: a, reason: collision with root package name */
            private final ed1 f3943a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList f3944b;

            {
                this.f3943a = this;
                this.f3944b = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Bundle bundle) {
                this.f3943a.b(this.f3944b, bundle);
            }
        };
    }
}
