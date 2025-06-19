package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.p72;
import com.google.android.gms.internal.ads.q72;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class p72<MessageType extends q72<MessageType, BuilderType>, BuilderType extends p72<MessageType, BuilderType>> implements ab2 {
    @Override // com.google.android.gms.internal.ads.ab2
    public final /* synthetic */ ab2 V(xa2 xa2Var) {
        if (g().getClass().isInstance(xa2Var)) {
            return k((q72) xa2Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType k(MessageType messagetype);

    public abstract BuilderType l(m82 m82Var, y82 y82Var) throws IOException;

    public BuilderType m(byte[] bArr, int r4, int r5, y82 y82Var) throws w92 {
        try {
            m82 m82VarD = m82.d(bArr, 0, r5, false);
            l(m82VarD, y82Var);
            m82VarD.x(0);
            return this;
        } catch (w92 e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // 
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
