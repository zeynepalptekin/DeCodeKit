package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class lu1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private static ku1 f4306a;

    public lu1() {
    }

    public lu1(Looper looper) {
        super(looper);
    }

    @androidx.annotation.i
    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}
