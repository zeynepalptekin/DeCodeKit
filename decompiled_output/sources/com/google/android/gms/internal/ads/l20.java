package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class l20 implements n40 {

    /* renamed from: b, reason: collision with root package name */
    private static Logger f4182b = Logger.getLogger(l20.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private ThreadLocal<ByteBuffer> f4183a = new k10(this);

    @Override // com.google.android.gms.internal.ads.n40
    public final o50 a(be2 be2Var, r80 r80Var) throws IOException {
        int r4;
        long size;
        long jPosition = be2Var.position();
        this.f4183a.get().rewind().limit(8);
        do {
            r4 = be2Var.read(this.f4183a.get());
            if (r4 == 8) {
                this.f4183a.get().rewind();
                long jB = p60.b(this.f4183a.get());
                byte[] bArr = null;
                if (jB < 8 && jB > 1) {
                    Logger logger = f4182b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jB);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String strG = p60.g(this.f4183a.get());
                if (jB == 1) {
                    this.f4183a.get().limit(16);
                    be2Var.read(this.f4183a.get());
                    this.f4183a.get().position(8);
                    size = p60.d(this.f4183a.get()) - 16;
                } else {
                    size = jB == 0 ? be2Var.size() - be2Var.position() : jB - 8;
                }
                if ("uuid".equals(strG)) {
                    this.f4183a.get().limit(this.f4183a.get().limit() + 16);
                    be2Var.read(this.f4183a.get());
                    bArr = new byte[16];
                    for (int r5 = this.f4183a.get().position() - 16; r5 < this.f4183a.get().position(); r5++) {
                        bArr[r5 - (this.f4183a.get().position() - 16)] = this.f4183a.get().get(r5);
                    }
                    size -= 16;
                }
                long j = size;
                o50 o50VarB = b(strG, bArr, r80Var instanceof o50 ? ((o50) r80Var).q() : "");
                o50VarB.b(r80Var);
                this.f4183a.get().rewind();
                o50VarB.e(be2Var, this.f4183a.get(), j, this);
                return o50VarB;
            }
        } while (r4 >= 0);
        be2Var.c(jPosition);
        throw new EOFException();
    }

    public abstract o50 b(String str, byte[] bArr, String str2);
}
