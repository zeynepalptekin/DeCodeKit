package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import c.a.b.b.g.c.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class sa {

    /* renamed from: a, reason: collision with root package name */
    private g1.c f6511a;

    /* renamed from: b, reason: collision with root package name */
    private Long f6512b;

    /* renamed from: c, reason: collision with root package name */
    private long f6513c;
    private final /* synthetic */ na d;

    private sa(na naVar) {
        this.d = naVar;
    }

    /* synthetic */ sa(na naVar, qa qaVar) {
        this(naVar);
    }

    final g1.c a(String str, g1.c cVar) {
        y3 y3VarG;
        String str2;
        Object obj;
        String strW = cVar.W();
        List<g1.e> listD = cVar.D();
        this.d.k();
        Long l = (Long) da.X(cVar, "_eid");
        boolean z = l != null;
        if (z && strW.equals("_ep")) {
            this.d.k();
            strW = (String) da.X(cVar, "_en");
            if (TextUtils.isEmpty(strW)) {
                this.d.B().G().b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.f6511a == null || this.f6512b == null || l.longValue() != this.f6512b.longValue()) {
                Pair<g1.c, Long> pairC = this.d.n().C(str, l);
                if (pairC == null || (obj = pairC.first) == null) {
                    this.d.B().G().c("Extra parameter without existing main event. eventName, eventId", strW, l);
                    return null;
                }
                this.f6511a = (g1.c) obj;
                this.f6513c = ((Long) pairC.second).longValue();
                this.d.k();
                this.f6512b = (Long) da.X(this.f6511a, "_eid");
            }
            long j = this.f6513c - 1;
            this.f6513c = j;
            if (j <= 0) {
                d dVarN = this.d.n();
                dVarN.c();
                dVarN.B().N().b("Clearing complex main event info. appId", str);
                try {
                    dVarN.u().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    dVarN.B().E().b("Error clearing complex main event", e);
                }
            } else {
                this.d.n().b0(str, l, this.f6513c, this.f6511a);
            }
            ArrayList arrayList = new ArrayList();
            for (g1.e eVar : this.f6511a.D()) {
                this.d.k();
                if (da.y(cVar, eVar.P()) == null) {
                    arrayList.add(eVar);
                }
            }
            if (arrayList.isEmpty()) {
                y3VarG = this.d.B().G();
                str2 = "No unique parameters in main event. eventName";
                y3VarG.b(str2, strW);
            } else {
                arrayList.addAll(listD);
                listD = arrayList;
            }
        } else if (z) {
            this.f6512b = l;
            this.f6511a = cVar;
            this.d.k();
            Object objX = da.X(cVar, "_epc");
            long jLongValue = ((Long) (objX != null ? objX : 0L)).longValue();
            this.f6513c = jLongValue;
            if (jLongValue <= 0) {
                y3VarG = this.d.B().G();
                str2 = "Complex event with zero extra param count. eventName";
                y3VarG.b(str2, strW);
            } else {
                this.d.n().b0(str, l, this.f6513c, cVar);
            }
        }
        return (g1.c) ((c.a.b.b.g.c.h7) cVar.x().G(strW).O().F(listD).j());
    }
}
