package c.a.b.b.g.c;

import c.a.b.b.g.c.n5;
import c.a.b.b.g.c.o5;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class n5<MessageType extends o5<MessageType, BuilderType>, BuilderType extends n5<MessageType, BuilderType>> implements u8 {
    private final String o(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // c.a.b.b.g.c.u8
    public final /* synthetic */ u8 H(byte[] bArr, u6 u6Var) throws q7 {
        return n(bArr, 0, bArr.length, u6Var);
    }

    @Override // c.a.b.b.g.c.u8
    public final /* synthetic */ u8 I(byte[] bArr) throws q7 {
        return m(bArr, 0, bArr.length);
    }

    protected abstract BuilderType k(MessageType messagetype);

    public abstract BuilderType l(l6 l6Var, u6 u6Var) throws IOException;

    public BuilderType m(byte[] bArr, int r2, int r3) throws q7 {
        try {
            l6 l6VarC = l6.c(bArr, 0, r3, false);
            l(l6VarC, u6.a());
            l6VarC.d(0);
            return this;
        } catch (q7 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(o("byte array"), e2);
        }
    }

    public BuilderType n(byte[] bArr, int r2, int r3, u6 u6Var) throws q7 {
        try {
            l6 l6VarC = l6.c(bArr, 0, r3, false);
            l(l6VarC, u6Var);
            l6VarC.d(0);
            return this;
        } catch (q7 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(o("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    @Override // c.a.b.b.g.c.u8
    public final /* synthetic */ u8 y(r8 r8Var) {
        if (g().getClass().isInstance(r8Var)) {
            return k((o5) r8Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
