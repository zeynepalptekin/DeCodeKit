package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f7 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3380a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private final Map<String, h7> f3381b = new HashMap();

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        String strConcat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(str4);
            strConcat = strValueOf.length() != 0 ? "\n".concat(strValueOf) : new String("\n");
        }
        synchronized (this.f3380a) {
            h7 h7VarRemove = this.f3381b.remove(str);
            if (h7VarRemove == null) {
                String strValueOf2 = String.valueOf(str);
                tr.i(strValueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(strValueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String strValueOf3 = String.valueOf(str3);
                String strValueOf4 = String.valueOf(strConcat);
                h7VarRemove.S(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
            } else {
                if (str5 == null) {
                    h7VarRemove.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (oo.n()) {
                        String strValueOf5 = String.valueOf(jSONObject.toString(2));
                        oo.m(strValueOf5.length() != 0 ? "Result GMSG: ".concat(strValueOf5) : new String("Result GMSG: "));
                    }
                    h7VarRemove.a(jSONObject);
                } catch (JSONException e) {
                    h7VarRemove.S(e.getMessage());
                }
            }
        }
    }

    public final <EngineT extends ea> dy1<JSONObject> b(EngineT enginet, String str, JSONObject jSONObject) throws JSONException {
        ks ksVar = new ks();
        com.google.android.gms.ads.internal.p.c();
        String strQ0 = to.q0();
        c(strQ0, new e7(this, ksVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", strQ0);
            jSONObject2.put("args", jSONObject);
            enginet.q(str, jSONObject2);
        } catch (Exception e) {
            ksVar.b(e);
        }
        return ksVar;
    }

    public final void c(String str, h7 h7Var) {
        synchronized (this.f3380a) {
            this.f3381b.put(str, h7Var);
        }
    }
}
