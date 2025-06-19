package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.e03;

/* loaded from: classes.dex */
public final class AdView extends i {
    public AdView(Context context) {
        super(context, 0);
        com.google.android.gms.common.internal.r.l(context, "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4, 0);
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
        e03 e03Var = this.d;
        if (e03Var != null) {
            return e03Var.j();
        }
        return null;
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
}
