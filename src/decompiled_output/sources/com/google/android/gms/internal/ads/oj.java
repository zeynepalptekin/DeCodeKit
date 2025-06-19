package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oj extends tj {
    private final String e;
    private final int f;

    public oj(String str, int r2) {
        this.e = str;
        this.f = r2;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final int R() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof oj)) {
            oj ojVar = (oj) obj;
            if (com.google.android.gms.common.internal.q.b(this.e, ojVar.e) && com.google.android.gms.common.internal.q.b(Integer.valueOf(this.f), Integer.valueOf(ojVar.f))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final String q() {
        return this.e;
    }
}
