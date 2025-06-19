package c.a.e.a0;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class h extends Number {
    private final String d;

    public h(String str) {
        this.d = str;
    }

    private Object a() throws ObjectStreamException {
        return new BigDecimal(this.d);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        String str = this.d;
        String str2 = ((h) obj).d;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.d);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.d);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.d).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.d);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.d).longValue();
        }
    }

    public String toString() {
        return this.d;
    }
}
