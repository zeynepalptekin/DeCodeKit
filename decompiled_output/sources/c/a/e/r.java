package c.a.e;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class r extends l {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f2317b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a, reason: collision with root package name */
    private Object f2318a;

    public r(Boolean bool) {
        T(bool);
    }

    public r(Character ch) {
        T(ch);
    }

    public r(Number number) {
        T(number);
    }

    r(Object obj) {
        T(obj);
    }

    public r(String str) {
        T(str);
    }

    private static boolean L(r rVar) {
        Object obj = rVar.f2318a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    private static boolean Q(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f2317b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.a.e.l
    public long A() {
        return P() ? B().longValue() : Long.parseLong(D());
    }

    @Override // c.a.e.l
    public Number B() {
        Object obj = this.f2318a;
        return obj instanceof String ? new c.a.e.a0.h((String) this.f2318a) : (Number) obj;
    }

    @Override // c.a.e.l
    public short C() {
        return P() ? B().shortValue() : Short.parseShort(D());
    }

    @Override // c.a.e.l
    public String D() {
        return P() ? B().toString() : K() ? l().toString() : (String) this.f2318a;
    }

    @Override // c.a.e.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public r c() {
        return this;
    }

    public boolean K() {
        return this.f2318a instanceof Boolean;
    }

    public boolean P() {
        return this.f2318a instanceof Number;
    }

    public boolean S() {
        return this.f2318a instanceof String;
    }

    void T(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            c.a.e.a0.a.a((obj instanceof Number) || Q(obj));
        }
        this.f2318a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f2318a == null) {
            return rVar.f2318a == null;
        }
        if (L(this) && L(rVar)) {
            return B().longValue() == rVar.B().longValue();
        }
        if (!(this.f2318a instanceof Number) || !(rVar.f2318a instanceof Number)) {
            return this.f2318a.equals(rVar.f2318a);
        }
        double dDoubleValue = B().doubleValue();
        double dDoubleValue2 = rVar.B().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // c.a.e.l
    public BigDecimal h() {
        Object obj = this.f2318a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f2318a.toString());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f2318a == null) {
            return 31;
        }
        if (L(this)) {
            jDoubleToLongBits = B().longValue();
        } else {
            Object obj = this.f2318a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(B().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // c.a.e.l
    public BigInteger i() {
        Object obj = this.f2318a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.f2318a.toString());
    }

    @Override // c.a.e.l
    public boolean j() {
        return K() ? l().booleanValue() : Boolean.parseBoolean(D());
    }

    @Override // c.a.e.l
    Boolean l() {
        return (Boolean) this.f2318a;
    }

    @Override // c.a.e.l
    public byte n() {
        return P() ? B().byteValue() : Byte.parseByte(D());
    }

    @Override // c.a.e.l
    public char o() {
        return D().charAt(0);
    }

    @Override // c.a.e.l
    public double r() {
        return P() ? B().doubleValue() : Double.parseDouble(D());
    }

    @Override // c.a.e.l
    public float s() {
        return P() ? B().floatValue() : Float.parseFloat(D());
    }

    @Override // c.a.e.l
    public int t() {
        return P() ? B().intValue() : Integer.parseInt(D());
    }
}
