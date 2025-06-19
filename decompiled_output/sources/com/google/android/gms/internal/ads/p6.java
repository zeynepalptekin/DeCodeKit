package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class p6 implements z6<rw> {
    p6() {
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) {
        rw rwVar2 = rwVar;
        if (rwVar2.a0() != null) {
            rwVar2.a0().o4();
        }
        com.google.android.gms.ads.internal.overlay.e eVarW0 = rwVar2.w0();
        if (eVarW0 != null) {
            eVarW0.z8();
            return;
        }
        com.google.android.gms.ads.internal.overlay.e eVarA = rwVar2.A();
        if (eVarA != null) {
            eVarA.z8();
        } else {
            tr.i("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
