package javaforce.jni;

/** Windows Native Code
 *
 * @author pquiring
 */

public class WinNative {
  static {
    JFNative.load();  //ensure native library is loaded
    winInit(System.getProperty("java.home") + "\\bin\\jawt.dll");
  }

  public static void load() {}  //ensure native library is loaded

  private static native boolean winInit(String jawt);

  //com port
  public static native long comOpen(String name, int baud);  //assumes 8 data bits, 1 stop bit, no parity, etc.
  public static native void comClose(long handle);
  public static native int comRead(long handle, byte buf[]);
  public static native int comWrite(long handle, byte buf[]);

  //WinPE resources
  public static native long peBegin(String file);  //returns handle
  public static native void peAddIcon(long handle, byte data[]);
  public static native void peAddString(long handle, int name, int idx, byte data[]);
  public static native void peEnd(long handle);
}
