## jvm深入理解

### 类加载
* 在java代码中,类型的加载,连接与初始化过程都是程序运行期间完成的.
	* 加载: 查找并将磁盘字节码class文件加载到内存中
	* 连接
		* 验证:确保被加载类的正确性
		* 准备:为类的静态变量分配内存,并将其初始化默认值
		* 解析:把类中的符号引用转换为直接引用 
	* 初始化: 为类的静态变量赋予正确的初始化值

### 类加载器
* 下面情况下,Java虚拟机将结束生命周期
	* 执行System.exit()方法
	* 程序正常结束
	* 程序在执行过程中遇到了异常或者错误而异常终止
	* 由于操作系统出现错误导致java虚拟机终止

### 类的使用和卸载
* 使用
* 卸载 
	从内存中销毁class

### 类的加载,连接与初始化
* java对类的使用方式分两种
	* 主动使用
		* 创建类的使用
		* 访问某个类或者接口的静态变量,或者对该静态变量赋值
		* 调用类的静态方法
		* 反射(如Class.forName("xxx"))
		* 初始化一个类的子类
		* Java虚拟机启动时被标记为启动类的类(java Test,main方法)
		* jdk1.7开始提供动态语言支持
	* 被动使用

### 加载class文件方式
	* 从本地系统中直接加载
	* 通过网络下载的.class文件
	* 从zip,jar等归档文件中加载.class文件
	* 从专用数据库中提取.class文件
	* 将java源文件动态编译成.class文件(动态代理)
 
