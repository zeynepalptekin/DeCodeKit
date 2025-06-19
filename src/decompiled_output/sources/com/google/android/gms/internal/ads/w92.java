package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class w92 extends IOException {
    private xa2 d;

    public w92(String str) {
        super(str);
        this.d = null;
    }

    static w92 a() {
        return new w92("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static w92 b() {
        return new w92("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static w92 c() {
        return new w92("CodedInputStream encountered a malformed varint.");
    }

    static w92 d() {
        return new w92("Protocol message contained an invalid tag (zero).");
    }

    static w92 e() {
        return new w92("Protocol message end-group tag did not match expected tag.");
    }

    static z92 f() {
        return new z92("Protocol message tag had invalid wire type.");
    }

    static w92 g() {
        return new w92("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static w92 h() {
        return new w92("Failed to parse the message.");
    }

    static w92 i() {
        return new w92("Protocol message had invalid UTF-8.");
    }

    public final w92 j(xa2 xa2Var) {
        this.d = xa2Var;
        return this;
    }
}
