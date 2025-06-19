package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class tp2 extends IOException {
    public tp2(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 13 + String.valueOf(message).length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(": ");
        sb.append(message);
        super(sb.toString(), th);
    }
}
