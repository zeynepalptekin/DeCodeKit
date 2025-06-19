package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e30 implements lb<i30> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3210a;

    /* renamed from: b, reason: collision with root package name */
    private final mr2 f3211b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f3212c;

    public e30(Context context, mr2 mr2Var) {
        this.f3210a = context;
        this.f3211b = mr2Var;
        this.f3212c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.lb
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(i30 i30Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        pr2 pr2Var = i30Var.f;
        if (pr2Var == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f3211b.e() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = pr2Var.f4881c;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f3211b.d()).put("activeViewJSON", this.f3211b.e()).put("timestamp", i30Var.d).put("adFormat", this.f3211b.c()).put("hashCode", this.f3211b.a()).put("isMraid", false).put("isStopped", false).put("isPaused", i30Var.f3758b).put("isNative", this.f3211b.b()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f3212c.isInteractive() : this.f3212c.isScreenOn()).put("appMuted", com.google.android.gms.ads.internal.p.h().e()).put("appVolume", com.google.android.gms.ads.internal.p.h().d()).put("deviceVolume", mp.c(this.f3210a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f3210a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", pr2Var.d).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", pr2Var.e.top).put("bottom", pr2Var.e.bottom).put("left", pr2Var.e.left).put("right", pr2Var.e.right)).put("adBox", new JSONObject().put("top", pr2Var.f.top).put("bottom", pr2Var.f.bottom).put("left", pr2Var.f.left).put("right", pr2Var.f.right)).put("globalVisibleBox", new JSONObject().put("top", pr2Var.g.top).put("bottom", pr2Var.g.bottom).put("left", pr2Var.g.left).put("right", pr2Var.g.right)).put("globalVisibleBoxVisible", pr2Var.h).put("localVisibleBox", new JSONObject().put("top", pr2Var.i.top).put("bottom", pr2Var.i.bottom).put("left", pr2Var.i.left).put("right", pr2Var.i.right)).put("localVisibleBoxVisible", pr2Var.j).put("hitBox", new JSONObject().put("top", pr2Var.k.top).put("bottom", pr2Var.k.bottom).put("left", pr2Var.k.left).put("right", pr2Var.k.right)).put("screenDensity", this.f3210a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", i30Var.f3757a);
            if (((Boolean) qx2.e().c(e0.f1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = pr2Var.n;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(i30Var.e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
