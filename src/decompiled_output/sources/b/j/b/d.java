package b.j.b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public class d extends c {

    @p0({p0.a.LIBRARY_GROUP})
    protected int[] r;

    @p0({p0.a.LIBRARY_GROUP})
    protected int[] s;
    private int t;
    private a u;
    private b v;
    String[] w;

    public interface a {
        CharSequence a(Cursor cursor);
    }

    public interface b {
        boolean a(View view, Cursor cursor, int r3);
    }

    @Deprecated
    public d(Context context, int r2, Cursor cursor, String[] strArr, int[] r5) {
        super(context, r2, cursor);
        this.t = -1;
        this.s = r5;
        this.w = strArr;
        q(cursor, strArr);
    }

    public d(Context context, int r2, Cursor cursor, String[] strArr, int[] r5, int r6) {
        super(context, r2, cursor, r6);
        this.t = -1;
        this.s = r5;
        this.w = strArr;
        q(cursor, strArr);
    }

    private void q(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.r = null;
            return;
        }
        int length = strArr.length;
        int[] r1 = this.r;
        if (r1 == null || r1.length != length) {
            this.r = new int[length];
        }
        for (int r12 = 0; r12 < length; r12++) {
            this.r[r12] = cursor.getColumnIndexOrThrow(strArr[r12]);
        }
    }

    @Override // b.j.b.a, b.j.b.b.a
    public CharSequence a(Cursor cursor) {
        a aVar = this.u;
        if (aVar != null) {
            return aVar.a(cursor);
        }
        int r0 = this.t;
        return r0 > -1 ? cursor.getString(r0) : super.a(cursor);
    }

    @Override // b.j.b.a
    public void e(View view, Context context, Cursor cursor) {
        b bVar = this.v;
        int[] r0 = this.s;
        int length = r0.length;
        int[] r2 = this.r;
        for (int r4 = 0; r4 < length; r4++) {
            View viewFindViewById = view.findViewById(r0[r4]);
            if (viewFindViewById != null) {
                if (bVar != null ? bVar.a(viewFindViewById, cursor, r2[r4]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(r2[r4]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        y((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        x((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // b.j.b.a
    public Cursor m(Cursor cursor) {
        q(cursor, this.w);
        return super.m(cursor);
    }

    public void p(Cursor cursor, String[] strArr, int[] r3) {
        this.w = strArr;
        this.s = r3;
        q(cursor, strArr);
        super.b(cursor);
    }

    public a r() {
        return this.u;
    }

    public int s() {
        return this.t;
    }

    public b t() {
        return this.v;
    }

    public void u(a aVar) {
        this.u = aVar;
    }

    public void v(int r1) {
        this.t = r1;
    }

    public void w(b bVar) {
        this.v = bVar;
    }

    public void x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void y(TextView textView, String str) {
        textView.setText(str);
    }
}
