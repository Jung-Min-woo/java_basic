import java.util.*;
class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version : " + sysProp.getProperty("java.version"));
        System.out.println("user.language : "+sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
// java.version : 1.8.0_352
// user.language : en
// -- listing properties --
// java.runtime.name=OpenJDK Runtime Environment
// sun.boot.library.path=/usr/lib/jvm/java-8-openjdk-amd64/jre...
// java.vm.version=25.352-b08
// java.vm.vendor=Private Build
// java.vendor.url=http://java.oracle.com/
// path.separator=:
// java.vm.name=OpenJDK 64-Bit Server VM
// file.encoding.pkg=sun.io
// sun.java.launcher=SUN_STANDARD
// sun.os.patch.level=unknown
// java.vm.specification.name=Java Virtual Machine Specification
// user.dir=/mnt/d/OneDrive - 서울시립대학교/JAVA/ch11
// java.runtime.version=1.8.0_352-8u352-ga-1~20.04-b08
// java.awt.graphicsenv=sun.awt.X11GraphicsEnvironment
// java.endorsed.dirs=/usr/lib/jvm/java-8-openjdk-amd64/jre...
// os.arch=amd64
// java.io.tmpdir=/tmp
// line.separator=

// java.vm.specification.vendor=Oracle Corporation
// os.name=Linux
// sun.jnu.encoding=UTF-8
// java.library.path=/usr/java/packages/lib/amd64:/usr/lib...
// java.specification.name=Java Platform API Specification
// java.class.version=52.0
// sun.management.compiler=HotSpot 64-Bit Tiered Compilers
// os.version=5.15.74.2-microsoft-standard-WSL2
// user.home=/home/jungminwoo
// user.timezone=
// java.awt.printerjob=sun.print.PSPrinterJob
// file.encoding=UTF-8
// java.specification.version=1.8
// user.name=jungminwoo
// java.class.path=.
// java.vm.specification.version=1.8
// sun.arch.data.model=64
// java.home=/usr/lib/jvm/java-8-openjdk-amd64/jre
// sun.java.command=PropertiesEx4
// java.specification.vendor=Oracle Corporation
// user.language=en
// awt.toolkit=sun.awt.X11.XToolkit
// java.vm.info=mixed mode
// java.version=1.8.0_352
// java.ext.dirs=/usr/lib/jvm/java-8-openjdk-amd64/jre...
// sun.boot.class.path=/usr/lib/jvm/java-8-openjdk-amd64/jre...
// java.vendor=Private Build
// java.specification.maintenance.version=4
// file.separator=/
// java.vendor.url.bug=http://bugreport.sun.com/bugreport/
// sun.cpu.endian=little
// sun.io.unicode.encoding=UnicodeLittle
// sun.cpu.isalist=