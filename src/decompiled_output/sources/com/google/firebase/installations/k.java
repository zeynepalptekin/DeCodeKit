package com.google.firebase.installations;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public class k extends c.a.d.h {

    @h0
    private final a d;

    public enum a {
        BAD_CONFIG
    }

    public k(@h0 a aVar) {
        this.d = aVar;
    }

    public k(@h0 String str, @h0 a aVar) {
        super(str);
        this.d = aVar;
    }

    public k(@h0 String str, @h0 a aVar, @h0 Throwable th) {
        super(str, th);
        this.d = aVar;
    }

    @h0
    public a a() {
        return this.d;
    }
}
