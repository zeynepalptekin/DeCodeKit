package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.a.b.b.d.l;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f2552a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2553b;

    public w(@RecentlyNonNull Context context) {
        r.k(context);
        Resources resources = context.getResources();
        this.f2552a = resources;
        this.f2553b = resources.getResourcePackageName(l.b.common_google_play_services_unknown_issue);
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public String a(@RecentlyNonNull String str) {
        int identifier = this.f2552a.getIdentifier(str, "string", this.f2553b);
        if (identifier == 0) {
            return null;
        }
        return this.f2552a.getString(identifier);
    }
}
