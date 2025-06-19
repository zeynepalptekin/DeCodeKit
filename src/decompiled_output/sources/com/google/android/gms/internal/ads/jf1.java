package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jf1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3955a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3956b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3957c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final ArrayList<String> h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final String m;
    private final long n;

    public jf1(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.f3955a = z;
        this.f3956b = z2;
        this.f3957c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.f3955a);
        bundle2.putBoolean("coh", this.f3956b);
        bundle2.putString("gl", this.f3957c);
        bundle2.putBoolean("simulator", this.d);
        bundle2.putBoolean("is_latchsky", this.e);
        bundle2.putBoolean("is_sidewinder", this.f);
        bundle2.putString("hl", this.g);
        if (!this.h.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.h);
        }
        bundle2.putString("mv", this.i);
        bundle2.putString("submodel", this.m);
        Bundle bundleA = jn1.a(bundle2, "device");
        bundle2.putBundle("device", bundleA);
        bundleA.putString("build", this.k);
        if (((Boolean) qx2.e().c(e0.Y1)).booleanValue()) {
            bundleA.putLong("remaining_data_partition_space", this.n);
        }
        Bundle bundleA2 = jn1.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        Bundle bundleA3 = jn1.a(bundleA, "play_store");
        bundleA.putBundle("play_store", bundleA3);
        bundleA3.putString("package_version", this.j);
    }
}
