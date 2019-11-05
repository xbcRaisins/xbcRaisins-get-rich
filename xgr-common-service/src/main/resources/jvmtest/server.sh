#!/bin/bash
# author: xujianhui

# jar包名称，必须修改
APP_NAME=jvm-1.0.jar
opt=$1
is_debug=$2

# 当前路径，无需修改
FILE_PATH=$(cd "$(dirname "$0")"; pwd)

# 虚拟机参数，按需修改
PARAM=(
	-Dspring.config.location=${FILE_PATH}/application.yml  # 指定配置文件
	-Dlogging.path=${FILE_PATH}/log  # 指定日志目录
	-DXmx128  # 指定最大堆内存
	)

# 使用说明，用来提示输入参数
usage() {
    echo "Usage: $0 [start|stop|stop_force|restart|status] [debug]"
    exit 1
}

# 检查程序是否在运行
is_exist(){
    pid=`ps -ef|grep ${APP_NAME}|grep -v grep|awk '{print $2}' `
    # 如果不存在返回1，存在返回0
    if [[ -z "${pid}" ]]; then
        return 1
    else
        return 0
    fi
}

# 启动方法
start(){
    is_exist
    if [[ $? -eq "0" ]]; then
        echo "${APP_NAME} is already running. pid=${pid}."
    else
        if [[ $is_debug == "debug" ]]; then
            nohup java ${PARAM[*]} -jar ${FILE_PATH}/${APP_NAME} > ${FILE_PATH}/debug.log 2>&1 &
            sleep 1s
            tailf ${FILE_PATH}/debug.log
            echo "1"
	    else
            nohup java ${PARAM[*]} -jar ${FILE_PATH}/${APP_NAME} > /dev/null 2>&1 &
            echo "${APP_NAME} start success."
        fi
    fi
}

# 停止方法
signal(){
    is_exist
    if [[ $? -eq "0" ]]; then
        kill $1 ${pid}
        echo "${APP_NAME} stop success."
    else
        echo "${APP_NAME} is not running"
    fi
}

# 停止方法
stop(){
    signal -15
}

# 强制停止方法
stop_force(){
    signal -9
}

# 输出运行状态
status(){
    is_exist
    if [[ $? -eq "0" ]]; then
        echo "${APP_NAME} is running. Pid is ${pid}"
    else
        echo "${APP_NAME} is NOT running."
    fi
}

# 重启
restart(){
    stop
    sleep 2s
    start
}

# 根据输入参数，选择执行对应方法，不输入则执行使用说明
case "$opt" in
    "start")
    start
    ;;
    "stop_force")
    stop_force
    ;;
    "stop")
    stop
    ;;
    "status")
    status
    ;;
    "restart")
    restart
    ;;
    *)
    usage
    ;;
esac
