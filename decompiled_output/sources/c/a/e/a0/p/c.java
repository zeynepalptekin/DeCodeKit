package c.a.e.a0.p;

import c.a.e.v;
import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends x<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f2255b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f2256a;

    static class a implements y {
        a() {
        }

        @Override // c.a.e.y
        public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.f() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f2256a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2256a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (c.a.e.a0.f.e()) {
            this.f2256a.add(c.a.e.a0.l.e(2, 2));
        }
    }

    private synchronized Date j(String str) {
        Iterator<DateFormat> it = this.f2256a.iterator();
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

    @Override // c.a.e.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Date e(c.a.e.c0.a aVar) throws IOException {
        if (aVar.z() != c.a.e.c0.c.NULL) {
            return j(aVar.x());
        }
        aVar.v();
        return null;
    }

    @Override // c.a.e.x
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public synchronized void i(c.a.e.c0.d dVar, Date date) throws IOException {
        if (date == null) {
            dVar.p();
        } else {
            dVar.D(this.f2256a.get(0).format(date));
        }
    }
}
