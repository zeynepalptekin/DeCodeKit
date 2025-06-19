package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;

@TargetApi(17)
/* loaded from: classes.dex */
public class ep extends dp {
    public ep() {
        super();
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final String a(Context context) {
        er erVarA = er.a();
        if (TextUtils.isEmpty(erVarA.f3315a)) {
            erVarA.f3315a = (String) (com.google.android.gms.common.util.e.b() ? ar.a(context, new dr(erVarA, context)) : ar.a(context, new gr(erVarA, c.a.b.b.d.i.i(context), context)));
        }
        return erVarA.f3315a;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final int c(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final Drawable d(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final boolean i(Context context, WebSettings webSettings) {
        super.i(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final int k(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void m(Context context) {
        er erVarA = er.a();
        oo.m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(erVarA.f3315a)) {
            Context contextI = c.a.b.b.d.i.i(context);
            if (com.google.android.gms.common.util.e.b() || contextI == null) {
                SharedPreferences.Editor editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (contextI == null) {
                    editorPutString.apply();
                } else {
                    com.google.android.gms.common.util.a0.a(context, editorPutString, "admob_user_agent");
                }
            }
            erVarA.f3315a = defaultUserAgent;
        }
        oo.m("User agent is updated.");
    }
}
