package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class nc2 extends RuntimeException {
    private final List<String> d;

    public nc2(xa2 xa2Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.d = null;
    }
}
