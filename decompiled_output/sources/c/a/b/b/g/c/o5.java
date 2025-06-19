package c.a.b.b.g.c;

import c.a.b.b.g.c.n5;
import c.a.b.b.g.c.o5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o5<MessageType extends o5<MessageType, BuilderType>, BuilderType extends n5<MessageType, BuilderType>> implements r8 {
    protected int zza = 0;

    protected static <T> void k(Iterable<T> iterable, List<? super T> list) {
        l7.d(iterable);
        if (iterable instanceof b8) {
            List<?> listD = ((b8) iterable).d();
            b8 b8Var = (b8) list;
            int size = list.size();
            for (Object obj : listD) {
                if (obj == null) {
                    int size2 = b8Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = b8Var.size() - 1; size3 >= size; size3--) {
                        b8Var.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof y5) {
                    b8Var.O((y5) obj);
                } else {
                    b8Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof d9) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(t);
        }
    }

    @Override // c.a.b.b.g.c.r8
    public final y5 e() {
        try {
            g6 g6VarA = y5.A(b());
            d(g6VarA.b());
            return g6VarA.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] l() {
        try {
            byte[] bArr = new byte[b()];
            o6 o6VarF = o6.f(bArr);
            d(o6VarF);
            o6VarF.N();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    int m() {
        throw new UnsupportedOperationException();
    }

    void n(int r1) {
        throw new UnsupportedOperationException();
    }
}
