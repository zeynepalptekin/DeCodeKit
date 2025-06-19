package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* loaded from: classes.dex */
final /* synthetic */ class ow {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f4750a;

    static {
        int[] r0 = new int[ConsoleMessage.MessageLevel.values().length];
        f4750a = r0;
        try {
            r0[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4750a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4750a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4750a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4750a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
