#!/bin/bash
echo "拷贝jar包"
cp ../target/Blog-0.0.1-SNAPSHOT.jar .
echo "手动构建项目 docker bliud -t czyblog:1.0"
echo "启动项目---->  docker-compose up -d"
