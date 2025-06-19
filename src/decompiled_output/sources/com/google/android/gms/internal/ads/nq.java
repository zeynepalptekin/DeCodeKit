package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class nq extends ix {
    private final /* synthetic */ byte[] u;
    private final /* synthetic */ Map v;
    private final /* synthetic */ nr w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nq(iq iqVar, int r2, String str, ma maVar, j7 j7Var, byte[] bArr, Map map, nr nrVar) {
        super(r2, str, maVar, j7Var);
        this.u = bArr;
        this.v = map;
        this.w = nrVar;
    }

    @Override // com.google.android.gms.internal.ads.b
    public final byte[] E() throws sl2 {
        byte[] bArr = this.u;
        return bArr == null ? super.E() : bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ix, com.google.android.gms.internal.ads.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void q(String str) throws IOException {
        this.w.p(str);
        super.q(str);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final Map<String, String> e() throws sl2 {
        Map<String, String> map = this.v;
        return map == null ? super.e() : map;
    }
}
