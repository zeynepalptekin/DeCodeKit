package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f4668a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final kb<JSONObject> f4669b = new qb();

    /* renamed from: c, reason: collision with root package name */
    public static final ib<InputStream> f4670c = mb.f4375a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f4668a));
    }
}
