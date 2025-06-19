package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6429a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f6430b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6431c;
    private Bundle d;
    private final /* synthetic */ j4 e;

    public k4(j4 j4Var, String str, Bundle bundle) {
        this.e = j4Var;
        com.google.android.gms.common.internal.r.g(str);
        this.f6429a = str;
        this.f6430b = new Bundle();
    }

    private final String c(Bundle bundle) throws JSONException {
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        str = "s";
                    } else if (obj instanceof Long) {
                        str = "l";
                    } else if (obj instanceof Double) {
                        str = "d";
                    } else {
                        this.e.B().E().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONObject.put("t", str);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.e.B().E().b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }

    @androidx.annotation.y0
    public final Bundle a() {
        if (!this.f6431c) {
            this.f6431c = true;
            String string = this.e.D().getString(this.f6429a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int r4 = 0; r4 < jSONArray.length(); r4++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(r4);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            char c2 = 65535;
                            int r9 = string3.hashCode();
                            if (r9 != 100) {
                                if (r9 != 108) {
                                    if (r9 == 115 && string3.equals("s")) {
                                        c2 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    c2 = 2;
                                }
                            } else if (string3.equals("d")) {
                                c2 = 1;
                            }
                            if (c2 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c2 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c2 != 2) {
                                this.e.B().E().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.e.B().E().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.d = bundle;
                } catch (JSONException unused2) {
                    this.e.B().E().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.d == null) {
                this.d = this.f6430b;
            }
        }
        return this.d;
    }

    @androidx.annotation.y0
    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.e.D().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f6429a);
        } else {
            editorEdit.putString(this.f6429a, c(bundle));
        }
        editorEdit.apply();
        this.d = bundle;
    }
}
