package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class xy {

    /* renamed from: a, reason: collision with root package name */
    public final String f6057a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f6058b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6059c;
    public final Map<String, String> d;

    @TargetApi(21)
    public xy(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public xy(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private xy(String str, Uri uri, @androidx.annotation.i0 String str2, @androidx.annotation.i0 Map<String, String> map) {
        this.f6057a = str;
        this.f6058b = uri;
        this.f6059c = str2 == null ? "GET" : str2;
        this.d = map == null ? Collections.emptyMap() : map;
    }
}
