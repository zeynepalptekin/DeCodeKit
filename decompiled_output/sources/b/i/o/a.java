package b.i.o;

import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final File f1145a;

    /* renamed from: b, reason: collision with root package name */
    private final File f1146b;

    public a(@h0 File file) {
        this.f1145a = file;
        this.f1146b = new File(file.getPath() + ".bak");
    }

    private static boolean h(@h0 FileOutputStream fileOutputStream) throws SyncFailedException {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f1145a.delete();
        this.f1146b.delete();
    }

    public void b(@i0 FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream != null) {
            h(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f1145a.delete();
                this.f1146b.renameTo(this.f1145a);
            } catch (IOException e) {
                Log.w("AtomicFile", "failWrite: Got exception:", e);
            }
        }
    }

    public void c(@i0 FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream != null) {
            h(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f1146b.delete();
            } catch (IOException e) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    @h0
    public File d() {
        return this.f1145a;
    }

    @h0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f1146b.exists()) {
            this.f1145a.delete();
            this.f1146b.renameTo(this.f1145a);
        }
        return new FileInputStream(this.f1145a);
    }

    @h0
    public byte[] f() throws IOException {
        FileInputStream fileInputStreamE = e();
        try {
            byte[] bArr = new byte[fileInputStreamE.available()];
            int r3 = 0;
            while (true) {
                int r4 = fileInputStreamE.read(bArr, r3, bArr.length - r3);
                if (r4 <= 0) {
                    return bArr;
                }
                r3 += r4;
                int r42 = fileInputStreamE.available();
                if (r42 > bArr.length - r3) {
                    byte[] bArr2 = new byte[r42 + r3];
                    System.arraycopy(bArr, 0, bArr2, 0, r3);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamE.close();
        }
    }

    @h0
    public FileOutputStream g() throws IOException {
        if (this.f1145a.exists()) {
            if (this.f1146b.exists()) {
                this.f1145a.delete();
            } else if (!this.f1145a.renameTo(this.f1146b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f1145a + " to backup file " + this.f1146b);
            }
        }
        try {
            return new FileOutputStream(this.f1145a);
        } catch (FileNotFoundException unused) {
            if (!this.f1145a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f1145a);
            }
            try {
                return new FileOutputStream(this.f1145a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f1145a);
            }
        }
    }
}
