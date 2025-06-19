package b.i.p;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Object f1174a;

    private e(Object obj) {
        this.f1174a = obj;
    }

    @androidx.annotation.i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static e b(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsRequestDragAndDropPermissions;
        if (Build.VERSION.SDK_INT < 24 || (dragAndDropPermissionsRequestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new e(dragAndDropPermissionsRequestDragAndDropPermissions);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            ((DragAndDropPermissions) this.f1174a).release();
        }
    }
}
