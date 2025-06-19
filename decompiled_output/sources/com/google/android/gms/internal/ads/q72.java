package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.p72;
import com.google.android.gms.internal.ads.q72;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q72<MessageType extends q72<MessageType, BuilderType>, BuilderType extends p72<MessageType, BuilderType>> implements xa2 {
    protected int zziee = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        o92.a(iterable);
        if (iterable instanceof ha2) {
            List<?> listR = ((ha2) iterable).R();
            ha2 ha2Var = (ha2) list;
            int size = list.size();
            for (Object obj : listR) {
                if (obj == null) {
                    int size2 = ha2Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = ha2Var.size() - 1; size3 >= size; size3--) {
                        ha2Var.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof a82) {
                    ha2Var.M((a82) obj);
                } else {
                    ha2Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof jb2) {
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

    @Override // com.google.android.gms.internal.ads.xa2
    public final byte[] f() {
        try {
            byte[] bArr = new byte[b()];
            v82 v82VarE0 = v82.E0(bArr);
            d(v82VarE0);
            v82VarE0.D();
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

    @Override // com.google.android.gms.internal.ads.xa2
    public final a82 h() {
        try {
            i82 i82VarF = a82.F(b());
            d(i82VarF.b());
            return i82VarF.a();
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

    int i() {
        throw new UnsupportedOperationException();
    }

    void j(int r1) {
        throw new UnsupportedOperationException();
    }
}
