package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class xh2 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ yh2 f5978a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xh2(yh2 yh2Var, Looper looper) {
        super(looper);
        this.f5978a = yh2Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f5978a.b(message);
    }
}
