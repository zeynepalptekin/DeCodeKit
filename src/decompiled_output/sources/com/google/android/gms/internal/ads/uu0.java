package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class uu0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f5602a;

    public uu0(com.google.android.gms.common.util.g gVar) {
        this.f5602a = gVar;
    }

    public final void a(List<Object> list, String str, String str2, Object... objArr) throws IOException {
        if (z1.f6208a.a().booleanValue()) {
            long jA = this.f5602a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jA);
                jsonWriter.name(FirebaseAnalytics.b.O).value(str);
                jsonWriter.name(androidx.core.app.p.i0).value(str2);
                jsonWriter.name("components").beginArray();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int r7 = 0; r7 < length; r7++) {
                    Object obj = objArr[r7];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                tr.c("unable to log", e);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            tr.h(strValueOf.length() != 0 ? "AD-DBG ".concat(strValueOf) : new String("AD-DBG "));
        }
    }
}
