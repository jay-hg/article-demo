## 抓取程序系统调用情况
strace -ff -o outpath java xxx
## 根据进程号查看所有线程
cd /proc/进程id  
看task目录和fd目录
### nc localhost 8090