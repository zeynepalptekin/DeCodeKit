package c.a.b.b.g.c;

import java.io.IOException;

/* loaded from: classes.dex */
public class q7 extends IOException {
    private r8 d;

    public q7(String str) {
        super(str);
        this.d = null;
    }

    static q7 a() {
        return new q7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static q7 b() {
        return new q7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static q7 c() {
        return new q7("CodedInputStream encountered a malformed varint.");
    }

    static q7 d() {
        return new q7("Protocol message contained an invalid tag (zero).");
    }

    static q7 e() {
        return new q7("Protocol message end-group tag did not match expected tag.");
    }

    static t7 f() {
        return new t7("Protocol message tag had invalid wire type.");
    }

    static q7 g() {
        return new q7("Failed to parse the message.");
    }

    static q7 h() {
        return new q7("Protocol message had invalid UTF-8.");
    }
}
