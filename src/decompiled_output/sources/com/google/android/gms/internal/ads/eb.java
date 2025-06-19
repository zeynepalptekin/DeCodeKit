package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eb implements k9, fb {
    private final cb d;
    private final HashSet<AbstractMap.SimpleEntry<String, z6<? super cb>>> e = new HashSet<>();

    public eb(cb cbVar) {
        this.d = cbVar;
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void M(String str, Map map) {
        o9.b(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.fb
    public final void S() {
        Iterator<AbstractMap.SimpleEntry<String, z6<? super cb>>> it = this.e.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, z6<? super cb>> next = it.next();
            String strValueOf = String.valueOf(next.getValue().toString());
            oo.m(strValueOf.length() != 0 ? "Unregistering eventhandler: ".concat(strValueOf) : new String("Unregistering eventhandler: "));
            this.d.j(next.getKey(), next.getValue());
        }
        this.e.clear();
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.c9
    public final void e(String str, JSONObject jSONObject) {
        o9.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.ea
    public final void i(String str) {
        this.d.i(str);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void j(String str, z6<? super cb> z6Var) {
        this.d.j(str, z6Var);
        this.e.remove(new AbstractMap.SimpleEntry(str, z6Var));
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void o(String str, z6<? super cb> z6Var) {
        this.d.o(str, z6Var);
        this.e.add(new AbstractMap.SimpleEntry<>(str, z6Var));
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void q(String str, JSONObject jSONObject) {
        o9.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void s(String str, String str2) {
        o9.a(this, str, str2);
    }
}
