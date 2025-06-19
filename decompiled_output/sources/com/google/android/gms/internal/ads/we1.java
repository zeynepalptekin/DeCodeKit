package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class we1 implements ff1<cf1<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f5823a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5824b;

    we1(cy1 cy1Var, Context context) {
        this.f5823a = cy1Var;
        this.f5824b = context;
    }

    public static Bundle b(Context context, JSONArray jSONArray) {
        Object obj;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int r2 = 0; r2 < jSONArray.length(); r2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(r2);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int r3 = jSONObjectOptJSONObject.optInt("type", -1);
            int r32 = r3 != 0 ? r3 != 1 ? r3 != 2 ? 0 : af1.f2675c : af1.f2674b : af1.f2673a;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && r32 != 0) {
                String[] strArrSplit = strOptString2.split("/");
                if (strArrSplit.length > 2 || strArrSplit.length == 0) {
                    obj = null;
                } else {
                    if (strArrSplit.length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = strArrSplit[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(strArrSplit[0], 0);
                        str = strArrSplit[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int r33 = bf1.f2829a[r32 - 1];
                    if (r33 != 1) {
                        if (r33 != 2) {
                            if (r33 == 3 && (obj instanceof Boolean)) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<Bundle>> a() {
        return this.f5823a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.ze1

            /* renamed from: a, reason: collision with root package name */
            private final we1 f6253a;

            {
                this.f6253a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6253a.c();
            }
        });
    }

    final /* synthetic */ cf1 c() throws Exception {
        String str = (String) qx2.e().c(e0.o4);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle bundleB = b(this.f5824b, new JSONArray(str));
            return new cf1(bundleB) { // from class: com.google.android.gms.internal.ads.ye1

                /* renamed from: a, reason: collision with root package name */
                private final Bundle f6126a;

                {
                    this.f6126a = bundleB;
                }

                @Override // com.google.android.gms.internal.ads.cf1
                public final void b(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", this.f6126a);
                }
            };
        } catch (JSONException e) {
            tr.b("JSON parsing error", e);
            return null;
        }
    }
}
