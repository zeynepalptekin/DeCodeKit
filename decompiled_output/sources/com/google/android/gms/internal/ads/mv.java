package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mv extends l20 {

    /* renamed from: c, reason: collision with root package name */
    static final mv f4456c = new mv();

    mv() {
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final o50 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new q70() : "mvhd".equals(str) ? new ta0() : new s90(str);
    }
}
