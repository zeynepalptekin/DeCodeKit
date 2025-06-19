package c.a.e;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class a extends x<Date> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f2205c = "DefaultDateTypeAdapter";

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Date> f2206a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f2207b;

    public a(int r2, int r3) {
        this(Date.class, r2, r3);
    }

    a(Class<? extends Date> cls) {
        this.f2207b = new ArrayList();
        this.f2206a = l(cls);
        this.f2207b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2207b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (c.a.e.a0.f.e()) {
            this.f2207b.add(c.a.e.a0.l.e(2, 2));
        }
    }

    a(Class<? extends Date> cls, int r3) {
        this.f2207b = new ArrayList();
        this.f2206a = l(cls);
        this.f2207b.add(DateFormat.getDateInstance(r3, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2207b.add(DateFormat.getDateInstance(r3));
        }
        if (c.a.e.a0.f.e()) {
            this.f2207b.add(c.a.e.a0.l.d(r3));
        }
    }

    public a(Class<? extends Date> cls, int r3, int r4) {
        this.f2207b = new ArrayList();
        this.f2206a = l(cls);
        this.f2207b.add(DateFormat.getDateTimeInstance(r3, r4, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2207b.add(DateFormat.getDateTimeInstance(r3, r4));
        }
        if (c.a.e.a0.f.e()) {
            this.f2207b.add(c.a.e.a0.l.e(r3, r4));
        }
    }

    a(Class<? extends Date> cls, String str) {
        this.f2207b = new ArrayList();
        this.f2206a = l(cls);
        this.f2207b.add(new SimpleDateFormat(str, Locale.US));
        if (Locale.getDefault().equals(Locale.US)) {
            return;
        }
        this.f2207b.add(new SimpleDateFormat(str));
    }

    private Date j(String str) {
        synchronized (this.f2207b) {
            Iterator<DateFormat> it = this.f2207b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return c.a.e.a0.p.o.a.g(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new v(str, e);
            }
        }
    }

    private static Class<? extends Date> l(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // c.a.e.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Date e(c.a.e.c0.a aVar) throws IOException {
        if (aVar.z() == c.a.e.c0.c.NULL) {
            aVar.v();
            return null;
        }
        Date dateJ = j(aVar.x());
        Class<? extends Date> cls = this.f2206a;
        if (cls == Date.class) {
            return dateJ;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateJ.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateJ.getTime());
        }
        throw new AssertionError();
    }

    @Override // c.a.e.x
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(c.a.e.c0.d dVar, Date date) throws IOException {
        if (date == null) {
            dVar.p();
            return;
        }
        synchronized (this.f2207b) {
            dVar.D(this.f2207b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f2207b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
