package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<s<?>> f6064a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Collection<s<String>> f6065b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Collection<s<String>> f6066c = new ArrayList();

    public final void a(SharedPreferences.Editor editor, int r5, JSONObject jSONObject) {
        for (s<?> sVar : this.f6064a) {
            if (sVar.b() == 1) {
                sVar.i(editor, sVar.l(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            tr.g("Flag Json is null.");
        }
    }

    public final void b(s sVar) {
        this.f6064a.add(sVar);
    }

    public final void c(s<String> sVar) {
        this.f6065b.add(sVar);
    }

    public final void d(s<String> sVar) {
        this.f6066c.add(sVar);
    }

    public final List<String> e() {
        ArrayList arrayList = new ArrayList();
        Iterator<s<String>> it = this.f6065b.iterator();
        while (it.hasNext()) {
            String str = (String) qx2.e().c(it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(j0.b());
        return arrayList;
    }

    public final List<String> f() {
        List<String> listE = e();
        Iterator<s<String>> it = this.f6066c.iterator();
        while (it.hasNext()) {
            String str = (String) qx2.e().c(it.next());
            if (!TextUtils.isEmpty(str)) {
                listE.add(str);
            }
        }
        listE.addAll(j0.c());
        return listE;
    }
}
