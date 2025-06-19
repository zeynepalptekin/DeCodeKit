package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class kq implements j7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f4135a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ pq f4136b;

    kq(iq iqVar, String str, pq pqVar) {
        this.f4135a = str;
        this.f4136b = pqVar;
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void a(pd pdVar) {
        String str = this.f4135a;
        String string = pdVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        tr.i(sb.toString());
        this.f4136b.c(null);
    }
}
