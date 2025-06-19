package b.i.p;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final View f1175a;

    /* renamed from: b, reason: collision with root package name */
    private final c f1176b;

    /* renamed from: c, reason: collision with root package name */
    private int f1177c;
    private int d;
    private boolean e;
    private final View.OnLongClickListener f = new a();
    private final View.OnTouchListener g = new b();

    class a implements View.OnLongClickListener {
        a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return f.this.d(view);
        }
    }

    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return f.this.e(view, motionEvent);
        }
    }

    public interface c {
        boolean a(View view, f fVar);
    }

    public f(View view, c cVar) {
        this.f1175a = view;
        this.f1176b = cVar;
    }

    public void a() {
        this.f1175a.setOnLongClickListener(this.f);
        this.f1175a.setOnTouchListener(this.g);
    }

    public void b() {
        this.f1175a.setOnLongClickListener(null);
        this.f1175a.setOnTouchListener(null);
    }

    public void c(Point point) {
        point.set(this.f1177c, this.d);
    }

    public boolean d(View view) {
        return this.f1176b.a(view, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = b.i.p.p.l(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f1177c
            if (r8 != r0) goto L39
            int r8 = r6.d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f1177c = r0
            r6.d = r1
            b.i.p.f$c r8 = r6.f1176b
            boolean r7 = r8.a(r7, r6)
            r6.e = r7
            return r7
        L46:
            r6.e = r3
            goto L4d
        L49:
            r6.f1177c = r0
            r6.d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.p.f.e(android.view.View, android.view.MotionEvent):boolean");
    }
}
