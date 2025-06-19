package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public interface d {
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    boolean a();

    @com.google.android.gms.common.annotation.a
    void c(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    boolean f();

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    <T extends LifecycleCallback> T g(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    Activity h();

    @com.google.android.gms.common.annotation.a
    void startActivityForResult(@RecentlyNonNull Intent intent, @RecentlyNonNull int r2);
}
