package c.a.b.b.g.c;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public enum c7 {
    DOUBLE(0, e7.SCALAR, s7.DOUBLE),
    FLOAT(1, e7.SCALAR, s7.FLOAT),
    INT64(2, e7.SCALAR, s7.LONG),
    UINT64(3, e7.SCALAR, s7.LONG),
    INT32(4, e7.SCALAR, s7.INT),
    FIXED64(5, e7.SCALAR, s7.LONG),
    FIXED32(6, e7.SCALAR, s7.INT),
    BOOL(7, e7.SCALAR, s7.BOOLEAN),
    STRING(8, e7.SCALAR, s7.STRING),
    MESSAGE(9, e7.SCALAR, s7.MESSAGE),
    BYTES(10, e7.SCALAR, s7.BYTE_STRING),
    UINT32(11, e7.SCALAR, s7.INT),
    ENUM(12, e7.SCALAR, s7.ENUM),
    SFIXED32(13, e7.SCALAR, s7.INT),
    SFIXED64(14, e7.SCALAR, s7.LONG),
    SINT32(15, e7.SCALAR, s7.INT),
    SINT64(16, e7.SCALAR, s7.LONG),
    GROUP(17, e7.SCALAR, s7.MESSAGE),
    DOUBLE_LIST(18, e7.VECTOR, s7.DOUBLE),
    FLOAT_LIST(19, e7.VECTOR, s7.FLOAT),
    INT64_LIST(20, e7.VECTOR, s7.LONG),
    UINT64_LIST(21, e7.VECTOR, s7.LONG),
    INT32_LIST(22, e7.VECTOR, s7.INT),
    FIXED64_LIST(23, e7.VECTOR, s7.LONG),
    FIXED32_LIST(24, e7.VECTOR, s7.INT),
    BOOL_LIST(25, e7.VECTOR, s7.BOOLEAN),
    STRING_LIST(26, e7.VECTOR, s7.STRING),
    MESSAGE_LIST(27, e7.VECTOR, s7.MESSAGE),
    BYTES_LIST(28, e7.VECTOR, s7.BYTE_STRING),
    UINT32_LIST(29, e7.VECTOR, s7.INT),
    ENUM_LIST(30, e7.VECTOR, s7.ENUM),
    SFIXED32_LIST(31, e7.VECTOR, s7.INT),
    SFIXED64_LIST(32, e7.VECTOR, s7.LONG),
    SINT32_LIST(33, e7.VECTOR, s7.INT),
    SINT64_LIST(34, e7.VECTOR, s7.LONG),
    DOUBLE_LIST_PACKED(35, e7.PACKED_VECTOR, s7.DOUBLE),
    FLOAT_LIST_PACKED(36, e7.PACKED_VECTOR, s7.FLOAT),
    INT64_LIST_PACKED(37, e7.PACKED_VECTOR, s7.LONG),
    UINT64_LIST_PACKED(38, e7.PACKED_VECTOR, s7.LONG),
    INT32_LIST_PACKED(39, e7.PACKED_VECTOR, s7.INT),
    FIXED64_LIST_PACKED(40, e7.PACKED_VECTOR, s7.LONG),
    FIXED32_LIST_PACKED(41, e7.PACKED_VECTOR, s7.INT),
    BOOL_LIST_PACKED(42, e7.PACKED_VECTOR, s7.BOOLEAN),
    UINT32_LIST_PACKED(43, e7.PACKED_VECTOR, s7.INT),
    ENUM_LIST_PACKED(44, e7.PACKED_VECTOR, s7.ENUM),
    SFIXED32_LIST_PACKED(45, e7.PACKED_VECTOR, s7.INT),
    SFIXED64_LIST_PACKED(46, e7.PACKED_VECTOR, s7.LONG),
    SINT32_LIST_PACKED(47, e7.PACKED_VECTOR, s7.INT),
    SINT64_LIST_PACKED(48, e7.PACKED_VECTOR, s7.LONG),
    GROUP_LIST(49, e7.VECTOR, s7.MESSAGE),
    MAP(50, e7.MAP, s7.VOID);

    private static final c7[] h0;
    private static final Type[] i0 = new Type[0];
    private final s7 d;
    private final int e;
    private final e7 f;
    private final Class<?> g;
    private final boolean h;

    static {
        c7[] c7VarArrValues = values();
        h0 = new c7[c7VarArrValues.length];
        for (c7 c7Var : c7VarArrValues) {
            h0[c7Var.e] = c7Var;
        }
    }

    c7(int r4, e7 e7Var, s7 s7Var) {
        int r5;
        this.e = r4;
        this.f = e7Var;
        this.d = s7Var;
        int r2 = b7.f1660a[e7Var.ordinal()];
        this.g = (r2 == 1 || r2 == 2) ? s7Var.e() : null;
        this.h = (e7Var != e7.SCALAR || (r5 = b7.f1661b[s7Var.ordinal()]) == 1 || r5 == 2 || r5 == 3) ? false : true;
    }

    public final int a() {
        return this.e;
    }
}
