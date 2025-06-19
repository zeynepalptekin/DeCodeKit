package c.a.b.b.d.r;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a extends CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor d;

    @com.google.android.gms.common.annotation.a
    public a(@RecentlyNonNull Cursor cursor) {
        super(cursor);
        for (int r0 = 0; r0 < 10 && (cursor instanceof CursorWrapper); r0++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            String strValueOf = String.valueOf(cursor.getClass().getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown type: ".concat(strValueOf) : new String("Unknown type: "));
        }
        this.d = (AbstractWindowedCursor) cursor;
    }

    @com.google.android.gms.common.annotation.a
    public void a(@i0 CursorWindow cursorWindow) {
        this.d.setWindow(cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @com.google.android.gms.common.annotation.a
    public void fillWindow(@RecentlyNonNull int r2, @RecentlyNonNull CursorWindow cursorWindow) {
        this.d.fillWindow(r2, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public CursorWindow getWindow() {
        return this.d.getWindow();
    }

    @Override // android.database.CursorWrapper
    @RecentlyNonNull
    public /* synthetic */ Cursor getWrappedCursor() {
        return this.d;
    }

    @Override // android.database.CrossProcessCursor
    @RecentlyNonNull
    public boolean onMove(@RecentlyNonNull int r2, @RecentlyNonNull int r3) {
        return this.d.onMove(r2, r3);
    }
}
