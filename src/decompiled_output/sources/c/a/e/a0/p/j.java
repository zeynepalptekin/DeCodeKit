package c.a.e.a0.p;

import c.a.e.v;
import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class j extends x<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f2268b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f2269a = new SimpleDateFormat("MMM d, yyyy");

    static class a implements y {
        a() {
        }

        @Override // c.a.e.y
        public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.f() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // c.a.e.x
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized Date e(c.a.e.c0.a aVar) throws IOException {
        if (aVar.z() == c.a.e.c0.c.NULL) {
            aVar.v();
            return null;
        }
        try {
            return new Date(this.f2269a.parse(aVar.x()).getTime());
        } catch (ParseException e) {
            throw new v(e);
        }
    }

    @Override // c.a.e.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized void i(c.a.e.c0.d dVar, Date date) throws IOException {
        dVar.D(date == null ? null : this.f2269a.format((java.util.Date) date));
    }
}
