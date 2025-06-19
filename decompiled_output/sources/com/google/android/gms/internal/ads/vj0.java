package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.cv2;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class vj0 implements bb0, tg0 {
    private final mm d;
    private final Context e;
    private final lm f;

    @androidx.annotation.i0
    private final View g;
    private String h;
    private final cv2.a.EnumC0172a i;

    public vj0(mm mmVar, Context context, lm lmVar, @androidx.annotation.i0 View view, cv2.a.EnumC0172a enumC0172a) {
        this.d = mmVar;
        this.e = context;
        this.f = lmVar;
        this.g = view;
        this.i = enumC0172a;
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void b() {
        String strM = this.f.m(this.e);
        this.h = strM;
        String strValueOf = String.valueOf(strM);
        String str = this.i == cv2.a.EnumC0172a.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.h = str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    @ParametersAreNonnullByDefault
    public final void f(qj qjVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f.k(this.e)) {
            try {
                this.f.g(this.e, this.f.p(this.e), this.d.e(), qjVar.q(), qjVar.R());
            } catch (RemoteException e) {
                tr.d("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void k0() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void l0() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void r() {
        this.d.i(false);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.g;
        if (view != null && this.h != null) {
            this.f.v(view.getContext(), this.h);
        }
        this.d.i(true);
    }
}
