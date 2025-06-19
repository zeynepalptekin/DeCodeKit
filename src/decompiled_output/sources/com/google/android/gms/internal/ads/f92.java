package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public enum f92 {
    DOUBLE(0, h92.SCALAR, y92.DOUBLE),
    FLOAT(1, h92.SCALAR, y92.FLOAT),
    INT64(2, h92.SCALAR, y92.LONG),
    UINT64(3, h92.SCALAR, y92.LONG),
    INT32(4, h92.SCALAR, y92.INT),
    FIXED64(5, h92.SCALAR, y92.LONG),
    FIXED32(6, h92.SCALAR, y92.INT),
    BOOL(7, h92.SCALAR, y92.BOOLEAN),
    STRING(8, h92.SCALAR, y92.STRING),
    MESSAGE(9, h92.SCALAR, y92.MESSAGE),
    BYTES(10, h92.SCALAR, y92.BYTE_STRING),
    UINT32(11, h92.SCALAR, y92.INT),
    ENUM(12, h92.SCALAR, y92.ENUM),
    SFIXED32(13, h92.SCALAR, y92.INT),
    SFIXED64(14, h92.SCALAR, y92.LONG),
    SINT32(15, h92.SCALAR, y92.INT),
    SINT64(16, h92.SCALAR, y92.LONG),
    GROUP(17, h92.SCALAR, y92.MESSAGE),
    DOUBLE_LIST(18, h92.VECTOR, y92.DOUBLE),
    FLOAT_LIST(19, h92.VECTOR, y92.FLOAT),
    INT64_LIST(20, h92.VECTOR, y92.LONG),
    UINT64_LIST(21, h92.VECTOR, y92.LONG),
    INT32_LIST(22, h92.VECTOR, y92.INT),
    FIXED64_LIST(23, h92.VECTOR, y92.LONG),
    FIXED32_LIST(24, h92.VECTOR, y92.INT),
    BOOL_LIST(25, h92.VECTOR, y92.BOOLEAN),
    STRING_LIST(26, h92.VECTOR, y92.STRING),
    MESSAGE_LIST(27, h92.VECTOR, y92.MESSAGE),
    BYTES_LIST(28, h92.VECTOR, y92.BYTE_STRING),
    UINT32_LIST(29, h92.VECTOR, y92.INT),
    ENUM_LIST(30, h92.VECTOR, y92.ENUM),
    SFIXED32_LIST(31, h92.VECTOR, y92.INT),
    SFIXED64_LIST(32, h92.VECTOR, y92.LONG),
    SINT32_LIST(33, h92.VECTOR, y92.INT),
    SINT64_LIST(34, h92.VECTOR, y92.LONG),
    DOUBLE_LIST_PACKED(35, h92.PACKED_VECTOR, y92.DOUBLE),
    FLOAT_LIST_PACKED(36, h92.PACKED_VECTOR, y92.FLOAT),
    INT64_LIST_PACKED(37, h92.PACKED_VECTOR, y92.LONG),
    UINT64_LIST_PACKED(38, h92.PACKED_VECTOR, y92.LONG),
    INT32_LIST_PACKED(39, h92.PACKED_VECTOR, y92.INT),
    FIXED64_LIST_PACKED(40, h92.PACKED_VECTOR, y92.LONG),
    FIXED32_LIST_PACKED(41, h92.PACKED_VECTOR, y92.INT),
    BOOL_LIST_PACKED(42, h92.PACKED_VECTOR, y92.BOOLEAN),
    UINT32_LIST_PACKED(43, h92.PACKED_VECTOR, y92.INT),
    ENUM_LIST_PACKED(44, h92.PACKED_VECTOR, y92.ENUM),
    SFIXED32_LIST_PACKED(45, h92.PACKED_VECTOR, y92.INT),
    SFIXED64_LIST_PACKED(46, h92.PACKED_VECTOR, y92.LONG),
    SINT32_LIST_PACKED(47, h92.PACKED_VECTOR, y92.INT),
    SINT64_LIST_PACKED(48, h92.PACKED_VECTOR, y92.LONG),
    GROUP_LIST(49, h92.VECTOR, y92.MESSAGE),
    MAP(50, h92.MAP, y92.VOID);

    private static final f92[] h0;
    private static final Type[] i0 = new Type[0];
    private final y92 d;
    private final int e;
    private final h92 f;
    private final Class<?> g;
    private final boolean h;

    static {
        f92[] f92VarArrValues = values();
        h0 = new f92[f92VarArrValues.length];
        for (f92 f92Var : f92VarArrValues) {
            h0[f92Var.e] = f92Var;
        }
    }

    f92(int r4, h92 h92Var, y92 y92Var) {
        int r5;
        this.e = r4;
        this.f = h92Var;
        this.d = y92Var;
        int r2 = i92.f3792a[h92Var.ordinal()];
        this.g = (r2 == 1 || r2 == 2) ? y92Var.e() : null;
        this.h = (h92Var != h92.SCALAR || (r5 = i92.f3793b[y92Var.ordinal()]) == 1 || r5 == 2 || r5 == 3) ? false : true;
    }

    public final int e() {
        return this.e;
    }
}
