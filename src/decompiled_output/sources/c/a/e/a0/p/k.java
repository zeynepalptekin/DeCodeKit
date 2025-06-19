package c.a.e.a0.p;

import c.a.e.v;
import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class k extends x<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f2270b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f2271a = new SimpleDateFormat("hh:mm:ss a");

    static class a implements y {
        a() {
        }

        @Override // c.a.e.y
        public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.f() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // c.a.e.x
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized Time e(c.a.e.c0.a aVar) throws IOException {
        if (aVar.z() == c.a.e.c0.c.NULL) {
            aVar.v();
            return null;
        }
        try {
            return new Time(this.f2271a.parse(aVar.x()).getTime());
        } catch (ParseException e) {
            throw new v(e);
        }
    }

    @Override // c.a.e.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized void i(c.a.e.c0.d dVar, Time time) throws IOException {
        dVar.D(time == null ? null : this.f2271a.format((Date) time));
    }
}
