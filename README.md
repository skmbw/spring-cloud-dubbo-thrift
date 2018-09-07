## thrift可以包含另外一个thrift文件。
include “Sample.thrift".
要使用Sample.thrift中的结构或者变量，一定要加Sample前缀，也就是文件名做为类型名的前缀。如：Sample.XXX。切记是文件名做为前缀，而不是命名空间做为前缀