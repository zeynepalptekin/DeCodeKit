package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class t extends i {
    public t(Context context) {
        super(context, 1);
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
    }

    public t(Context context, AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4, 1);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    @Override // com.google.android.gms.ads.i
    @androidx.annotation.o0("android.permission.INTERNET")
    public final /* bridge */ /* synthetic */ void c(e eVar) {
        super.c(eVar);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ c getAdListener() {
        return super.getAdListener();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ f getAdSize() {
        return super.getAdSize();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Override // com.google.android.gms.ads.i
    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.ads.i
    @i0
    public final /* bridge */ /* synthetic */ y getResponseInfo() {
        return super.getResponseInfo();
    }

    public final z getVideoController() {
        return this.d.j();
    }

    public final a0 getVideoOptions() {
        return this.d.k();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setAdListener(c cVar) {
        super.setAdListener(cVar);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setAdSize(f fVar) {
        super.setAdSize(fVar);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(@i0 u uVar) {
        super.setOnPaidEventListener(uVar);
    }

    public final void setVideoOptions(a0 a0Var) {
        this.d.w(a0Var);
    }
}
